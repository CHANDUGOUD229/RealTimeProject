package com.stepchange.atf.controls;


import java.util.List;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

/**
 * TabelRow control class - Implements when you have a table row which need to be checked , or a child element of a table row need to be found
 */
public class TableRow extends Container {

    public TableRow(By selector) {
        this.setSelector(selector);
    }

    public void verifyRowContains(String expectedText) { verifyContainerContains(expectedText, "Row"); }

    public void verifyRowNotContains(String doesNotContain) { verifyContainerNotContains(doesNotContain, "Row"); }

    public void verifyChildContains(Control controlObject, String expectedText) { verifyChildContains(controlObject, expectedText, "Row"); }

    public void click() {
        int iterationCounter = 0;
        while (iterationCounter < getBrowser().getMaxAttempts()) {
            try {
                this.getElement().click();
                break;
            } catch (StaleElementReferenceException e) {
                getBrowser().getLogWriter().log("Caught StaleElementReferenceException in click method");
                iterationCounter++;
            }
        }
    }

    public int getColumnNumber(String heading) {
        List<WebElement> cells = null;
        boolean found = false;
        int curCol = 0;
        try {
            cells = this.findChildElements(By.tagName("th"));
        } catch (Exception e) {
            // keep going until end
        }
        curCol = 0;
        for (WebElement cell : cells) {
            curCol++;
            if ((cell.getText().trim().equalsIgnoreCase(heading))) {
                getBrowser().getLogWriter().log("Heading'" + heading + "' found in column'" + curCol + "'.", Level.INFO);
                return curCol;
            }
        }
        getBrowser().getLogWriter().log("Heading'" + heading + "'not found in row", Level.SEVERE);
        return curCol;
    }

}
