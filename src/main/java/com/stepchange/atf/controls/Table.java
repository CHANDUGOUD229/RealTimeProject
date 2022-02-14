
/**
 * Table control class - Implement when you a tablw which needs to be checked , or a child element of table need to be found
 */
package com.stepchange.atf.controls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.stepchange.atf.utilities.AAssert;

public class Table extends Container {
    public Table(By selector) {
        this.setSelector(selector);
    }

    public void verifyTableContains(String expectedText) {
        verifyContainerContains(expectedText, "Table");
    }

    public void verifyTableNotContains(String doesNotContain) {
        verifyContainerNotContains(doesNotContain, "Table");
    }

    /**
     * Return the text value of a cell
     *
     * @return - Text value of the cell
     * @Param rowNumber - Row Number
     * @Param column - Column Number
     */

    public String getCellValue(int rowNumber, int column) {
        String cellValue = "";
        By row = By.cssSelector("tr[p1_index='" + rowNumber + "']");
        By cell = By.cssSelector("td[headers='a" + column + "']");
        // If cell is null and number is

        try {
            cellValue = this.getElement().findElement(row).findElement(cell).getText();
        } catch (Exception e) {
            getBrowser().getLogWriter().log("No cell found in row" + rowNumber + "/column" + column);
            cellValue = null;
        }
        return cellValue;
    }

    /**
     * In an editable table , delete a row
     *
     * @param colRow
     */
    public void deleteRow(int colRow) {
        int iterationCounter = 0;
        By row = By.cssSelector("tr[p1_index='" + colRow + "']");
        By propRow = By.cssSelector("button[data-click*='DELETE'");
        while (iterationCounter < getBrowser().getMaxAttempts()) {
            try {
                this.getElement().findElement(row).findElement(propRow).click();
            } catch (NoSuchElementException e) {
                getBrowser().getLogWriter().log("Caught StaleElementException in findChildColumn for column" + "Delete", Level.FINE);
                getBrowser().sleep(getBrowser().getTimeout() / 100);
            } catch (StaleElementReferenceException e) {
                getBrowser().getLogWriter().log(" Caught StateElementException in findChildColumn for column" + "Delete", Level.FINE);
                getBrowser().sleep(getBrowser().getTimeout() / 100);

            }
            iterationCounter++;
        }
    }

    /**
     * Verfiy the number of rows in a table (including the Header)
     *
     * @param numberOfRows - expected  number if rows
     */

    public void verifyTableRowCount(int numberOfRows) {
        List<WebElement> allRows = readRows(this.getSelector());
        // Verfiy Number of Rows
        AAssert.assertEquals(allRows.size(), numberOfRows, "Number of rows in Table '" + this.getSelector() + "'  was" + allRows.size() + "' when'" + numberOfRows + "' was  expected", " Number of rows in Table'" + this.getSelector() + "' was'" + allRows.size() + "' as expected.");
        getBrowser().getLogWriter().logScreenshot();
    }

    /**
     * Get the row number of an item within a table
     */
    public int getTableRowNumber(String item) {
        List<WebElement> allRows = readRows(this.getSelector());
        int curRow = 0;
        List<WebElement> cells = null;
        boolean found = false;
        AAssert.assertTrue(allRows != null, "No Rows retruned from table'" + this.getSelector() + "'.");
        for (WebElement row : allRows) {
            if (found) {
                break;
            }
            curRow++;
            try {
                cells = row.findElements(By.cssSelector("td[class*= 'cell']"));
                // If only one cell in row the ignore this row
                if (cells.size() == 1) {
                    curRow--;
                    continue;
                }

            } catch (Exception e) {
                // keep going until end
            }
            for (WebElement cell : cells) {
                if ((cell.getText().trim().equals(item))) {
                    getBrowser().getLogWriter().log(" Item'" + item + "' found in row '" + curRow + "'.", Level.INFO);
                    return curRow;
                }
            }
        }
        AAssert.assertTrue(found, "No cells found containing data'" + item + "'");
        return 0;
    }

    /**
     * Get the row number of two items within a table
     */
    public int getTableRowNumber(String item, String item2) {
        List<WebElement> allRows = readRows(this.getSelector());
        int curRow = 0;
        List<WebElement> cells = null;
        boolean found = false;
        boolean found2 = false;
        AAssert.assertTrue(allRows != null, " No rows retruned from table'" + this.getSelector() + "'.");
        for (WebElement row : allRows) {
            found = false;
            curRow++;
            try {
                cells = row.findElements(By.cssSelector("td[class*=cell']"));
            } catch (Exception e) {
                // keep going until end
            }

            for (WebElement cell : cells) {
                if (!found) {
                    if (cell.getText().trim().equals(item)) {
                        getBrowser().getLogWriter().log("Item'" + item + "' found in row '" + curRow + "'.", Level.INFO);
                        // First Tem found
                        found = true;
                    } else {
                        // Look for second item
                        if (cell.getText().trim().equals(item)) {
                            getBrowser().getLogWriter().log("Item'" + item + "' and '" + item2 + "' found in row'" + curRow + "'.", Level.INFO);
                            return curRow;
                        }
                    }
                }
            }
        }

        AAssert.assertTrue(found2, "No rows found containing data'" + item + "' and '" + item2 + "'");
        return 0;
    }

	/**
	 * Get the row number of an item within a table
	 */
	public int getTableRowNumber(List<WebElement> allRows,String item) {
		int curRow = 0;
		List<WebElement> cells = null;
		boolean found = false;
		AAssert.assertTrue(allRows != null, "No rows returned from table '" + this.getSelector() + "'.");

		for (WebElement row : allRows) {
			if (found) {
				break;
			}
			curRow++;
			try {
				if(row.findElements(By.cssSelector("td[class*='Cell']")).size() > 0) {
					cells = row.findElements(By.cssSelector("td[class*='Cell']"));
				}else{
					cells = row.findElements(By.cssSelector("td[class*='tdLeftStyle']"));
				}

			} catch (Exception e) {
				// keep going until end
			}
			for (WebElement cell : cells) {
				//String qq = cell.getText().trim();
				if ((cell.getText().trim().equals(item))) {
					getBrowser().getLogWriter().log("Item '" + item + "' found in row '" + curRow + "'.", Level.INFO);
					return curRow;
				}
			}

		}

		AAssert.assertTrue(found, "No cells found containing data '" + item + "'");
		return 0;
	}


    /**
     * Verify the number of columns in a table
     */
    public void verifyTableColCount(int numberOfCols) {

        // Get all the columns from the table

        List<WebElement> allCols = readColumns(this.getSelector());

        // verify Number of columns
        AAssert.assertEquals(allCols.size(), numberOfCols, " Number of Coloums in Table'" + this.getSelector() + "' was" + allCols.size() + "'when'" + numberOfCols + "' was expected", " Number of columns in  Table '" + this.getSelector() + "' was " + allCols.size() + "' as expected.");
        getBrowser().getLogWriter().logScreenshot();
    }

    /**
     * Get the column number of a heading
     */

    public int getTableHeading(String heading) {
        List<WebElement> allRows = readRows(this.getSelector());
        int curCol = 0;
        List<WebElement> cells = null;
        boolean found = false;
        AAssert.assertTrue(allRows != null, " No rows returned from table'" + this.getSelector() + "'.'");

        for (WebElement row : allRows) {
            if (found) {
                break;
            }
            try {
                cells = row.findElements(By.tagName("th"));
            } catch (Exception e) {

            }
            curCol = 0;
            for (WebElement cell : cells) {
                curCol++;
                if ((cell.getText().trim().equalsIgnoreCase(heading))) {
                    getBrowser().getLogWriter().log("Heading '" + heading + "' found in column'" + curCol + "'.", Level.INFO);
                    return curCol;

                }
            }
        }
        AAssert.assertTrue(found, " No Heading found called'" + heading + "'");
        return 0;

    }

	/**
	 * Get the column number of a heading
	 */
	public int getTableHeading(List<WebElement> allRows,String heading) {
		int curCol;
		List<WebElement> cells = null;
		boolean found = false;

		AAssert.assertTrue(allRows != null, "No rows returned from table '" + this.getSelector() + "'.");

		for (WebElement row : allRows) {
			if (found) {
				break;
			}
			try {
				cells = row.findElements(By.tagName("th"));
			} catch (Exception e) {
				// keep going until end
			}
			curCol = 0;
			for (WebElement cell : cells) {
				curCol++;
				if ((cell.getText().trim().equalsIgnoreCase(heading))) {
					getBrowser().getLogWriter().log("Heading '" + heading + "' found in column '" + curCol + "'.", Level.INFO);
					return curCol;
				}
			}
		}
		AAssert.assertTrue(found, "No Heading found called '" + heading + "'");
		return 0;
	}


	/**
     * Get the column number of a heading
     */

    public int getTableHeading(String heading, TableRow headingRow) {
        int curCol = 0;
        List<WebElement> cells = null;
        boolean found = false;
        try {
            cells = headingRow.findChildElements(By.tagName("th"));
        } catch (Exception e) {
            // keep going until end
        }

        curCol = 0;
        for (WebElement cell : cells) {
            curCol++;
            if ((cell.getText().trim().equalsIgnoreCase(heading))) {
                getBrowser().getLogWriter().log("Heading'" + heading + "' found in column '" + curCol + "'.", Level.INFO);
                return curCol;
            }
        }

        AAssert.assertTrue(found, "No Heading found called'" + heading + "'");
        return 0;


    }

    /**
     * Return a list of the table headers strings
     */

    public List<String> getTableHeading() {

        WebElement headerRow = getBrowser().getElementWhenReady(this.getSelector()).findElement(By.cssSelector("tr[class*='cellCont']"));
        List<WebElement> headerCell = headerRow.findElements(By.tagName("th"));
        List<String> headerTextList = new ArrayList<>();
        String headerText;

        for (WebElement cell : headerCell) {
            headerText = cell.getText().trim();
            if (!headerText.isEmpty() && !headerText.equals("")) {
                headerTextList.add(headerText);
            }
        }
        return headerTextList;
    }

    /**
     * Retrun a list of the table headers strings
     */
    public List<String> getTableHeadings(TableRow headerRow) {
        List<WebElement> headerCell = headerRow.findChildElements(By.tagName("th"));
        List<String> headerTextList = new ArrayList<>();
        String headerText;

        for (WebElement cell : headerCell) {
            headerText = cell.getText().trim();
            if (!headerText.isEmpty() && !headerText.equals("")) {
                headerTextList.add(headerText);

            }
        }
        return headerTextList;
    }

    /**
     * Verify Value  of Cell in a Table
     *
     * @param rowNum        - row number
     * @param colNum        - column number
     * @param expectedValue - expected value of cell
     */

    public void verifyTableCell(int rowNum, int colNum, String expectedValue) {
        List<WebElement> allRows = readRows(this.getSelector());
        int curRow = 0;
        int curCol = 0;
        List<WebElement> cells = null;
        boolean found = false;

        if (allRows == null) {
            getBrowser().getLogWriter().log("No rows returned for table'" + this.getSelector() + "'.", Level.SEVERE);
        }
        for (WebElement row : allRows) {
            curRow++;
            try {
                cells = row.findElements(By.cssSelector("td[class*='gridCell']"));
            } catch (Exception e) {
                // Keep going until end
            }
            curCol = 0;

            for (WebElement cell : cells) {
                curCol++;
                if ((curRow == rowNum && (curCol == colNum))) {
                    String cellValue = cell.getText();
                    // Replace /n with space
                    cellValue = cellValue.replaceAll("\n", "");
                    if (cellValue == null) {
                        expectedValue = "";
                    }

                    AAssert.assertEquals(cellValue.trim(), expectedValue.trim(), "Cellvalue was '" + cellValue + "' when '" + expectedValue + "' was expected '", "Cell Value was '" + cellValue + "' as expected");
                    found = true;
                    break;


                }
            }
        }

        AAssert.assertTrue(found, "Cell'" + rowNum + "/" + colNum + "' not found in table'" + this.getSelector() + "'.", "Cell found");
    }

    /**
     * Verify value of cell in a table is less than or equal to the expected value
     *
     * @param rowNum - row number
     * @param colNum - column number
     */
    public void verifyTableCellLessOrEqualTo(int rowNum, int colNum, int expectedValue) {
        List<WebElement> allRows = readRows(this.getSelector());
        int curRow = 0;
        int curCol = 0;
        List<WebElement> cells = null;
        boolean found = false;

        if (allRows == null) {
            getBrowser().getLogWriter().log(" No rows retruned for table'" + this.getSelector() + "'.", Level.SEVERE);
        }

        for (WebElement row : allRows) {
            curRow++;
            try {
                cells = row.findElements(By.cssSelector("td[class*='gridCell']"));
            } catch (Exception e) {
                // keep going until end
            }

            curCol = 0;
            for (WebElement cell : cells) {
                curCol++;
                if ((curRow == rowNum && (curCol == colNum))) {
                    String cellValue = cell.getText();
                    // Replace /N With space
                    cellValue = cellValue.replaceAll("\n", "");
                    AAssert.assertTrue(Integer.parseInt(cellValue.trim()) <= expectedValue, "Cell value was'" + cellValue + "' when '" + expectedValue + "' or less was expected", " Cell value was '" + cellValue + "' as expecgted");
                }
            }
        }

    }


	/**
	 * Verify Value of Cell in a Table without asserting
	 * @param rowNum
	 * @param colNum
	 * @param expectedValue
	 * @return  1 for fail, 0 for success
	 */
	public int verifyTableCellNoAssert( int rowNum, int colNum, String expectedValue) {
		List<WebElement> allRows = readRows(this.getSelector());
		int curRow = 0;
		int curCol = 0;
		List<WebElement> cells = null;
		int found = 1;
		String cellValue = "";

		if(allRows == null){
			getBrowser().getLogWriter().log("No rows returned for table '" + this.getSelector() + "'.", Level.SEVERE);
		}

		for (WebElement row : allRows) {
			curRow++;

			try {
				cells = row.findElements(By.cssSelector("td[class*='gridCell']"));
			} catch (Exception e) {
				// keep going until end
			}

			curCol = 0;
			for (WebElement cell : cells) {
				curCol++;
				if ((curRow == rowNum && (curCol == colNum))) {
					cellValue = cell.getText();

					cellValue = cellValue.replaceAll("\n", " ");  // Replace /n with space

					if (cellValue == null)      { cellValue = " "; }
					if (expectedValue == null)  { expectedValue = " "; }
					if (cellValue.equals("") && expectedValue.equals("0")){ cellValue = "0"; }

					if (cellValue.equals(expectedValue) ){
						log("Cell Value was '" + cellValue + "' as expected", Level.INFO);
						found = 0;
						break;
					}
				}
			}
		}

		if (found == 1){
			log ("Cell value was '" + cellValue + "' when '" + expectedValue + "' was expected", Level.SEVERE);
		}
		return found;
	}

    /**
     * In a editable table, delete a row where delete icon is an TMG rather than a Button
     *
     * @param colRow
     */

    public void deleteRowIMG(int colRow) {
        int iterationCounter = 0;
        By row = By.cssSelector("tr[p1_index='" + colRow + "']");
        By propRow = By.cssSelector("img[title* = 'Delete row item'");
        while (iterationCounter < getBrowser().getMaxAttempts()) {
            try {
                this.getElement().findElement(row).findElement(propRow).click();
                getBrowser().sleep(2000);
                break;
            } catch (NoSuchElementException e) {
                getBrowser().getLogWriter().log(" Caught NoSuchElementException in findChildColumn for column" + "Delete", Level.FINE);
                getBrowser().sleep(getBrowser().getTimeout() / 100);
            } catch (StaleElementReferenceException e) {
                getBrowser().getLogWriter().log("Caught StaleElementException in  findChildColumn for column" + "Delete", Level.FINE);
                getBrowser().sleep(getBrowser().getTimeout() / 100);

            }

            iterationCounter++;
        }
    }

    /**
     * Read and returns all the rows of a table
     *
     * @param by - identifier of table
     */

    public List<WebElement> readRows(By by) {
        List<WebElement> allRows = null;
        try {
			if(getBrowser().getElementWhenReady(by).findElements(By.cssSelector("tr[class*='cellCont']")).size() > 0) {
				allRows = getBrowser().getElementWhenReady(by).findElements(By.cssSelector("tr[class*='cellCont']"));
			}else if(getBrowser().getElementWhenReady(by).findElements(By.cssSelector("tr[class*='listTableRow']")).size() > 0) {
				allRows = getBrowser().getElementWhenReady(by).findElements(By.cssSelector("tr[class*='listTableRow']"));
			} else{
				allRows = getBrowser().getElementWhenReady(by).findElements(By.cssSelector("tr"));
			}
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return allRows;
    }


    // @ TODO Might not work
    public List<WebElement> readColumns(By by) {

        List<WebElement> allColumns = null;
        try {

            allColumns = getBrowser().getElementWhenReady(by).findElements(By.cssSelector("th[class*=' cellCont']"));
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
        return allColumns;


    }


    public int getNumberOfRowsInMenuTable() {

        List<WebElement> allRows = null;
        try {
            allRows = this.getElement().findElements(By.cssSelector("tr[class*='menuItem']"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return allRows.size();

    }

    /**
     * Verify  that the expected heading  are on a table( but not necessarily in correct order )
     *
     * @param expectedHeadings Enables the list of expected heading to be passes in via the test method
     */

    public void verifyHeadings(List<String> expectedHeadings) {
        // sort Lists of Heading
        Collections.sort(expectedHeadings);
        List<String> actualHeadings = this.getTableHeading();
        Collections.sort(actualHeadings);

        // verify all Headings are there
        AAssert.assertTrue(expectedHeadings.toString().contentEquals(actualHeadings.toString()), "ERROR: Actual Headings'" + actualHeadings + "' do not match Expected Headings '" + expectedHeadings + "'", "PASS: Actual headings were'" + actualHeadings + "' as expected");
    }

    /**
     * Verify that only the expected headings are on a table (but not necessarily in correct order)
     *
     * @param expectedHeadings
     */

    public void verifyHeadings(List<String> expectedHeadings, TableRow headingRow) {
        // sort Lists of Headings
        Collections.sort(expectedHeadings);

        List<String> actualHeadings = this.getTableHeadings(headingRow);
        Collections.sort(actualHeadings);
        // verfiy all Headings are there
        AAssert.assertTrue(expectedHeadings.toString().contentEquals(actualHeadings.toString()), "ERROR : Actual Heading'" + actualHeadings + "' do not match Expected Headings '" + expectedHeadings + "'", "PASS: Actual headings were '" + actualHeadings + "' as expected");

    }

    /**
     * Get the row number of an item within a table when there are more than one instance of item
     */

    public int getNthRowNumber(String item, int instance) {
        List<WebElement> allRows = readRows(this.getSelector());
        int curRow = 0;
        List<WebElement> cells = null;
        boolean found = false;
        int numberFound = 0;
        AAssert.assertTrue(allRows != null, " No rows retruned from table'" + this.getSelector() + "'.");
        for (WebElement row : allRows) {
            if (found) {
                break;
            }
            curRow++;
            try {
                cells = row.findElements(By.cssSelector("td[class*='cell]"));
                //}

                //cells = row.findElements(BY.cssSelector("td[class*='cell']"));
            } catch (Exception e) {

                // keep going until end
            }

            for (WebElement cell : cells) {
                if ((cell.getText().equals(item))) {
                    // Add one to number found
                    numberFound++;
                    // Is this the correct instance?

                    if (numberFound == instance) {
                        getBrowser().getLogWriter().log("Item '" + item + "' found in row'" + curRow + "'.", Level.INFO);
                        return curRow;
                    }
                }
            }
        }
        AAssert.assertTrue(found, " No cells found containing data'" + item + "' and istance'" + instance + "'");
        return 0;

    }

    /**
     * Get the number of rows in a table (including the Header)
     */


    public int getTableRowCount() {
        // Get all the rows from the table
        List<WebElement> allRows = readRows(this.getSelector());
        // Return Numbers of Rows
        return allRows.size();
    }


	/**
	 * Click specified cell in a table
	 *
	 * @param rowNum
	 * @param colNum
	 */
	public void clickTableCell(int rowNum, int colNum) {
		List<WebElement> allRows = readRows(this.getSelector());
		int curRow = 0, curCol = 0;
		List<WebElement> cells = null;
		boolean error = true;

		AAssert.assertTrue(allRows != null, "Unable to get data from table '" + this.getSelector() + "'", "Data fetched from table");

		for (WebElement row : allRows) {
			curRow++;
			try {
				cells = row.findElements(By.tagName("td"));
			} catch (Exception e) {
				// keep going until end
			}
			curCol = 0;
			for (WebElement cell : cells) {
				curCol++;
				if ((curRow == rowNum && (curCol == colNum))) {
					try {
						cell.click();
						log("Click Table Cell -  Row [" + rowNum + "] column [" + colNum + "] clicked in table [" + this.getSelector() + "].", Level.INFO);
						error = false;
					} catch (Exception e) {
						AAssert.assertFalse(error, "Click Table Cell -  Error clicking row [" + rowNum + "] column [" + colNum + "] in table [" + this.getSelector() + "].", "No Error '" + error + "'");
					}
				}
			}
		}
	}


	/**
	 * Sort the column based upon the passed column header
	 * @param heading
	 */
	public void sortTable(String heading) {

		int column = (getTableHeading(heading) + 1 );  // the sort is located immediately to the right of the heading

		List<WebElement> allRows = readRows(this.getSelector());
		int curCol = 0;
		List<WebElement> cells = null;
		boolean found = false;

		AAssert.assertTrue(allRows != null, "No rows returned from table '" + this.getSelector() + "'.");
		outerloop:
		for (WebElement row : allRows) {
			if (found) {
				break;
			}
			try {
				cells = row.findElements(By.tagName("span"));
			} catch (Exception e) {
				// keep going until end
			}
			curCol = 0;
			for (WebElement cell : cells) {
				curCol++;
				String text = cell.getText();
				if ( (cell.getText().equals(" ")) ) {
					if (column == curCol) {
						cell.click();
						getBrowser().getLogWriter().log("Column sort performed on column heading '" + heading + "'.", Level.INFO);
						found = true;
						break outerloop;
					}
				}
			}
		}
		AAssert.assertTrue(found, "No sort was performed on column heading '" + heading + "'");
	}

	/**
	 * Click specified header cell in a table
	 *
	 * @param rowNum
	 * @param colNum
	 */
	public void clickTableHeaderCell(int rowNum, int colNum) {
		List<WebElement> allRows = readRows(this.getSelector());
		int curRow = 0, curCol = 0;
		List<WebElement> cells = null;
		boolean error = true;

		AAssert.assertTrue(allRows != null, "Unable to get data from table '" + this.getSelector() + "'", "Data fetched from table");

		for (WebElement row : allRows) {
			curRow++;
			try {
				cells = row.findElements(By.tagName("th"));
			} catch (Exception e) {
				// keep going until end
			}
			curCol = 0;
			for (WebElement cell : cells) {
				curCol++;
				if ((curRow == rowNum && (curCol == colNum))) {
					try {
						cell.click();
						log("Click Table Header Cell -  Row [" + rowNum + "] column [" + colNum + "] clicked in table [" + this.getSelector() + "].", Level.INFO);
						error = false;
					} catch (Exception e) {
						AAssert.assertFalse(error, "Click Table Header Cell -  Error clicking row [" + rowNum + "] column [" + colNum + "] in table [" + this.getSelector() + "].", "No Error '" + error + "'");
					}
				}
			}
		}
	}

	/**
	 * Verify the number of rows in a table with or without the header row
	 * @param numOfRows
	 * @param includeHeaderRow
	 */
	public void verifyTableRowCount(int numOfRows, boolean includeHeaderRow) {

		int actRows = getTableRowCount();

		if (!includeHeaderRow) {
			AAssert.assertTrue(actRows -1 == numOfRows, "Fail: Number of actual rows (NOT inc. header row) is " + (actRows - 1) + ".  Expected rows was " + numOfRows, "Pass: Number of Actual rows [" + numOfRows + "] was the same as the number Expected. ");
		}

		if (includeHeaderRow) {
		AAssert.assertTrue(actRows ==  numOfRows, "Fail: Number of actual rows (inc. header row) is " + actRows + ".  Expected rows was " + numOfRows, "Pass: Number of Actual rows [" + numOfRows + "] was the same as the number Expected. ");
		}
	}
	/**
	 * Get the row index of an item within a table
	 */
	public int getTableIndex( String item) {
		List<WebElement> allRows = readRows(this.getSelector());
		int curRow = 0;
		List<WebElement> cells = null;
		boolean found = false;
		int index = 0;

		AAssert.assertTrue(allRows != null, "No rows returned from table '" + this.getSelector() + "'.");

		for (WebElement row : allRows) {
			if (found) {
				break;
			}
			curRow++;
			try {
				cells = row.findElements(By.cssSelector("td[class*='Cell']"));
				// If only one cell in row the ignore this row
				if (cells.size() == 1) {
					curRow--;
					continue;
				}
			} catch (Exception e) {
				// keep going until end
			}
			for (WebElement cell : cells) {
				if ((cell.getText().equals(item))) {
					index = Integer.parseInt(row.getAttribute("pl_index"));
					log("Item '" + item + "' found in row '" + curRow + "' with index '" + index +".", Level.INFO);
					return index;
				}
			}
		}

		AAssert.assertTrue(found, "No cells found containing data '" + item + "'");
		return 0;
	}

	/**
	 * Verify Value of Cell in a Table
	 * @param allRows       - all rows of the table
	 * @param rowNum        - row number
	 * @param colNum        - column number
	 * @param expectedValue - expected value of cell
	 */
	public void verifyTableCell( List<WebElement> allRows, int rowNum, int colNum, String expectedValue) {
		int curRow = 0;
		int curCol;
		List<WebElement> cells = null;
		boolean found = false;

		if(allRows == null){
			getBrowser().getLogWriter().log("No rows returned for table", Level.SEVERE);
		}

		for (WebElement row : allRows) {
			curRow++;

			try {
				cells = row.findElements(By.cssSelector("td[class*='gridCell']"));
			} catch (Exception e) {
				// keep going until end
			}

			curCol = 0;
			for (WebElement cell : cells) {
				curCol++;
				if ((curRow == rowNum && (curCol == colNum))) {
					String cellValue = cell.getText();
					// Replace /n with space
					cellValue = cellValue.replaceAll("\n", " ");
					if (cellValue == null) {
						cellValue = " ";
					}
					if(expectedValue == null) {
						expectedValue = " ";
					}
					if (cellValue.equals("") && expectedValue.equals("0")){ cellValue = "0"; }
					AAssert.assertEquals(cellValue.trim(), expectedValue.trim(), "Cell value was '" + cellValue + "' when '" + expectedValue + "' was expected", "Cell Value was '" + cellValue + "' as expected");
					found = true;
					break;
				}

			}
			if (found){
				break;
			}

		}
		AAssert.assertTrue(found, "Cell '" + rowNum + "/" + colNum + "' not found in table '" + this.getSelector() + "'.", "Cell found");
	}

	/**
	 * Method to wait for a Table to contain the expected text
	 *
	 * @param expectedText Enables the expected text to be passed in via the test method
	 */
	public void waitForTableToContainExpectedText(String expectedText) {
		boolean found = false;
		getBrowser().sleep(1000);
		for (int i = 0; i < 60; i++) {
			try {
				if (this.getElement().getText().contains(expectedText)) {
					found = true;
					break;
				} else {
					getBrowser().sleep(500);
				}
			}catch (Exception e){
				// try again
			}
		}

		AAssert.assertTrue(found, "FAIL: Text " + expectedText + " not found in table " + this.getSelector(), "PASS: Text " + expectedText + " found in table " + this.getSelector());
	}

	/**
	 * Read and returns all the rows of a table
	 */
	public List<WebElement> readRows() {
		List<WebElement> allRows = null;
		try {
			if(getBrowser().getElementWhenReady(getSelector()).findElements(By.cssSelector("tr[class*='cellCont']")).size() > 0) {
				allRows = getBrowser().getElementWhenReady(getSelector()).findElements(By.cssSelector("tr[class*='cellCont']"));
			}else if(getBrowser().getElementWhenReady(getSelector()).findElements(By.cssSelector("tr[class*='listTableRow']")).size() > 0) {
				allRows = getBrowser().getElementWhenReady(getSelector()).findElements(By.cssSelector("tr[class*='listTableRow']"));
			} else{
				allRows = getBrowser().getElementWhenReady(getSelector()).findElements(By.cssSelector("tr"));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return allRows;
	}
}
