package com.stepchange.atf.controls;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;

public class AutoComplete extends TextField {

	public  AutoComplete(By selector) { super(selector); }

	/**
	 * calls Pega Browser method to select main value from autocomplete
	 * 
	 * @param text
	 *            - text from autocomplete to select
	 */
	public void selectFromAutoComplete(String text) {
		selectFromAutoComplete(text, this.getSelector());
	}

	/**
	 * Return a String object representing the currently selected item in the drop
	 * down
	 */
	public String getCurrentValue() {
		return (new Select(this.getElement())).getFirstSelectedOption().getText();
	}

	/**
	 * Enter text then searches for text in autocomplete
	 * @param text- text to enter and search for
	 */

	public void enterTextThenSelectFromAutoComplete(String text) {
		getBrowser().waitForElementToBeClickable(this.getSelector());
		scrollElementIntoView();
		getBrowser().sleep(1000);
		this.enterCharByChar(text);
//		selectFromAutoComplete(text, this.getSelector());
		List<WebElement> options = getDriver().findElements(this.getSelector());
		for(WebElement option: options){
			if (option.getText().contains(text))
				option.click();
			break;
		}

	}
	public void enterTextThenSelectFromAutoCompleteAsText(String text) {
		getBrowser().waitForElementToBeClickable(this.getSelector());
		scrollElementIntoView();
		getBrowser().sleep(500);
		verifyOverLayDisplayed();
		this.enterCharByChar(text);
		verifyOverLayDisplayed();
//		selectFromAutoComplete(text, this.getSelector());
		List<WebElement> options = getDriver().findElements(this.getSelector());
		for(WebElement option: options){
			if (option.getText().contains(text))
				option.click();
			break;
		}

	}
	public void verifyOverLayDisplayed() {

		try {
			WebElement pega_ui_load = (new WebDriverWait(getDriver(), 0, 200)).until(ExpectedConditions.visibilityOfElementLocated(By.id("pega_ui_load")));
			if(pega_ui_load!=null) {
				(new WebDriverWait(getDriver(), 20)).until(ExpectedConditions.invisibilityOfElementLocated(By.id("pega_ui_load")));
			}
		} catch (Exception e)
		{

		}
	}

	/**
	 * Enter Text 1 character at a time
	 * @param text
	 */
	public void enterCharByChar(String text){
		int iterationCounter = 0;
		while (iterationCounter < getBrowser().getMaxAttempts()) {
			try {

				this.getElement().clear();
				for(int i = 0; i < text.length(); i++){
					String letter = String.valueOf(text.charAt(i));
					this.getElement().sendKeys(letter);
					getBrowser().sleep(200);
				}
//							verifyOverLayDisplayed();
				break;
			} catch ( StaleElementReferenceException e) {
				iterationCounter++;
				getBrowser().getLogWriter().log ("Caught StaleElementReferenceException in enterCharByChar method");
			}catch (ElementNotVisibleException exception)
			{
				iterationCounter++;
				getBrowser().getLogWriter().log ("Caught ElementNotVisibleException in enterCharByChar method");
			}
			catch (WebDriverException e)
			{
				iterationCounter++;
				getBrowser().getLogWriter().log ("Caught WebDriverException in enterCharByChar method");
			}

		}


	}


	/**
	 * Enter Text 1 character at a time Using KeyBoard
	 * @param text
	 */
	public void enterCharByCharByKeyBoard(String text){
		this.getElement().clear();
		int length = text.length();
		for (int i = 0; i < length; i++) {
			char character = text.charAt(i);
			type(character);
		}
	}
	public void type(CharSequence characters) {
		int length = characters.length();
		for (int i = 0; i < length; i++) {
			char character = characters.charAt(i);
			type(character);
		}
	}

	public void type(char character) {
		switch (character) {
			case 'a': doType(KeyEvent.VK_A); break;
			case 'b': doType(KeyEvent.VK_B); break;
			case 'c': doType(KeyEvent.VK_C); break;
			case 'd': doType(KeyEvent.VK_D); break;
			case 'e': doType(KeyEvent.VK_E); break;
			case 'f': doType(KeyEvent.VK_F); break;
			case 'g': doType(KeyEvent.VK_G); break;
			case 'h': doType(KeyEvent.VK_H); break;
			case 'i': doType(KeyEvent.VK_I); break;
			case 'j': doType(KeyEvent.VK_J); break;
			case 'k': doType(KeyEvent.VK_K); break;
			case 'l': doType(KeyEvent.VK_L); break;
			case 'm': doType(KeyEvent.VK_M); break;
			case 'n': doType(KeyEvent.VK_N); break;
			case 'o': doType(KeyEvent.VK_O); break;
			case 'p': doType(KeyEvent.VK_P); break;
			case 'q': doType(KeyEvent.VK_Q); break;
			case 'r': doType(KeyEvent.VK_R); break;
			case 's': doType(KeyEvent.VK_S); break;
			case 't': doType(KeyEvent.VK_T); break;
			case 'u': doType(KeyEvent.VK_U); break;
			case 'v': doType(KeyEvent.VK_V); break;
			case 'w': doType(KeyEvent.VK_W); break;
			case 'x': doType(KeyEvent.VK_X); break;
			case 'y': doType(KeyEvent.VK_Y); break;
			case 'z': doType(KeyEvent.VK_Z); break;
			case 'A': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_A); break;
			case 'B': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_B); break;
			case 'C': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_C); break;
			case 'D': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_D); break;
			case 'E': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_E); break;
			case 'F': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_F); break;
			case 'G': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_G); break;
			case 'H': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_H); break;
			case 'I': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_I); break;
			case 'J': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_J); break;
			case 'K': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_K); break;
			case 'L': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_L); break;
			case 'M': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_M); break;
			case 'N': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_N); break;
			case 'O': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_O); break;
			case 'P': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_P); break;
			case 'Q': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Q); break;
			case 'R': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_R); break;
			case 'S': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_S); break;
			case 'T': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_T); break;
			case 'U': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_U); break;
			case 'V': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_V); break;
			case 'W': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_W); break;
			case 'X': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_X); break;
			case 'Y': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Y); break;
			case 'Z': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Z); break;
			case '`': doType(KeyEvent.VK_BACK_QUOTE); break;
			case '0': doType(KeyEvent.VK_0); break;
			case '1': doType(KeyEvent.VK_1); break;
			case '2': doType(KeyEvent.VK_2); break;
			case '3': doType(KeyEvent.VK_3); break;
			case '4': doType(KeyEvent.VK_4); break;
			case '5': doType(KeyEvent.VK_5); break;
			case '6': doType(KeyEvent.VK_6); break;
			case '7': doType(KeyEvent.VK_7); break;
			case '8': doType(KeyEvent.VK_8); break;
			case '9': doType(KeyEvent.VK_9); break;
			case '-': doType(KeyEvent.VK_MINUS); break;
			case '=': doType(KeyEvent.VK_EQUALS); break;
			case '~': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_QUOTE); break;
			case '!': doType(KeyEvent.VK_EXCLAMATION_MARK); break;
			case '@': doType(KeyEvent.VK_AT); break;
			case '#': doType(KeyEvent.VK_NUMBER_SIGN); break;
			case '$': doType(KeyEvent.VK_DOLLAR); break;
			case '%': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_5); break;
			case '^': doType(KeyEvent.VK_CIRCUMFLEX); break;
			case '&': doType(KeyEvent.VK_AMPERSAND); break;
			case '*': doType(KeyEvent.VK_ASTERISK); break;
			case '(': doType(KeyEvent.VK_LEFT_PARENTHESIS); break;
			case ')': doType(KeyEvent.VK_RIGHT_PARENTHESIS); break;
			case '_': doType(KeyEvent.VK_UNDERSCORE); break;
			case '+': doType(KeyEvent.VK_PLUS); break;
			case '\t': doType(KeyEvent.VK_TAB); break;
			case '\n': doType(KeyEvent.VK_ENTER); break;
			case '[': doType(KeyEvent.VK_OPEN_BRACKET); break;
			case ']': doType(KeyEvent.VK_CLOSE_BRACKET); break;
			case '\\': doType(KeyEvent.VK_BACK_SLASH); break;
			case '{': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_OPEN_BRACKET); break;
			case '}': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_CLOSE_BRACKET); break;
			case '|': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_SLASH); break;
			case ';': doType(KeyEvent.VK_SEMICOLON); break;
			case ':': doType(KeyEvent.VK_COLON); break;
			case '\'': doType(KeyEvent.VK_QUOTE); break;
			case '"': doType(KeyEvent.VK_QUOTEDBL); break;
			case ',': doType(KeyEvent.VK_COMMA); break;
			case '<': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_COMMA); break;
			case '.': doType(KeyEvent.VK_PERIOD); break;
			case '>': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_PERIOD); break;
			case '/': doType(KeyEvent.VK_SLASH); break;
			case '?': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH); break;
			case ' ': doType(KeyEvent.VK_SPACE); break;
			default:
				throw new IllegalArgumentException("Cannot type character " + character);
		}
	}

	private void doType(int... keyCodes) {
		doType(keyCodes, 0, keyCodes.length);
	}

	private void doType(int[] keyCodes, int offset, int length) {
		if (length == 0) {
			return;
		}
		try {
			Robot robot = new Robot();
			robot.keyPress(keyCodes[offset]);
			doType(keyCodes, offset + 1, length - 1);
			robot.keyRelease(keyCodes[offset]);
		}catch (Exception e)
		{}

	}
	/**
	 * calls Generic method, to select main and sub value from autocomplete
	 * @param text - text from autocomplete to select
	 * @param id - other text to select
	 */
	public void selectFromAutoComplete( String text, String id) {
		String attribute = "data-gargs";
		selectFromAutoComplete(text, this.getSelector(), attribute, id);
		
	}

	/**
	 * Used for selecting from an autocomplete. This is the more complicated version, which checks a second attributes from the HTML 
	 to ensure the right option is clicked
	 * The autocomplete generates a table, this is where the option are seen .The selector parameter is used
	 * @param sText The text to search for in the row
	 * @param by The selector for the rows in the table containing the autocomplete options
	 * @param cAtt A second attribute to check in the row, to further narrow down the results
	 * @param cText The text to search for in the second attribute
	 */
	
	public void selectFromAutoComplete(String sText, By by, String cAtt, String cText) {
		int iterationCounter = 0;
		outerloop:
			while (iterationCounter < 4 * this.getBrowser().getMaxAttempts()) {
				try {
					getBrowser().waitForElementToBeClickable(by);
					
					if(!this.getBrowser().getDriver().findElements(by).isEmpty()) {
						for(WebElement it:getBrowser().getDriver().findElements(by)) {
							if (it.getAttribute(cAtt).contains(cText)) {
								if(it.getText().contains(sText)) {
									it.click();
									break outerloop;
								}
							}
							else {
								iterationCounter++;
								getBrowser().sleep(50);
							}
						}
					}
				}catch (Exception e) {
							iterationCounter++;
							getBrowser().sleep(50);
							
								}
			}	
			}

	/**
	 * used for selecting from an autocomplete. This will simplyu select the first available option.
	 * @param by The selector for the rows in the table containing the autocomplete option
	 */
	public void selectFirstAvailableOptionFromAutoComplete(By by) {
		getBrowser().waitForElementToBeClickable(by);
		
		List<WebElement>campainIdAutocompleteValues = getBrowser().getDriver().findElements(by);
		if(campainIdAutocompleteValues.size() > 0) {
			WebElement firstCampaignIdOption = campainIdAutocompleteValues.get(0);
			clickScreenElement(firstCampaignIdOption);
		}
	}
	/**
	 * used for selecting from an autocomplete. This is the less complicated version , which only searches  for text in a row
	 * The autocomplete generates a table , this is where the option are seen. The selector parameter is used to identity  the rows i this table
	 * @param sText The text to search for in the row
	 * @param by The selector for the rows in the table containing the autocomplete options
	 */
	public void selectFromAutoComplete(String sText, By by) {
		int iterationCounter = 0;
		by = By.cssSelector("tr[data-gargs*='" + sText + "']");
		outerloop:
			while (iterationCounter <getBrowser().getMaxAttempts()) {
				try {
					getBrowser().waitForElementToBeClickable(By.cssSelector("tr[data-gargs*='" + sText + "']"));
					if (!getBrowser().getDriver().findElements(by).isEmpty()) {
						for(WebElement it:getBrowser().getDriver().findElements(by)) {
							
								if(it.getText().contains(sText)) {
									it.click();
									break outerloop;
								}
							else {
								iterationCounter++;
								getBrowser().sleep(50);
							}
						}
						
					}
					
				}catch (Exception e) {
							getBrowser().getLogWriter().log(e.getMessage(), Level.FINE);
							iterationCounter++;
							getBrowser().sleep(20);
							}
										
						}
					
					}
	/**
	 * Method to verify the Expected Value of a field
	 *
	 * @param expectedValue - pass the expected default value
	 */
	public boolean checkValue(String expectedValue) {
		if (this.getElement().getAttribute("value").equals(expectedValue)) {
			getBrowser().getLogWriter().log("Value matches expected " + expectedValue);
			return true;
		} else
			getBrowser().getLogWriter().log("Value does not match expected " + expectedValue);
		return false;
	}
	/**
	 * Enters text then searches for exact matching text in autocomplete
	 *
	 * @param text - text to enter and search for
	 */
	public void enterTextThenSelectFromAutoCompleteExactMatch(String text) {
		getBrowser().waitForElementToBeClickable(this.getSelector());
		scrollElementIntoView();
		this.enterText(text);

		selectFromAutoCompleteExactMatch(text);
	}
	/**
	 * Used for selecting from an autocomplete. This is the less complicated version, which only searches for text in a row
	 * The autocomplete generates a table, this is where the options are seen. The selector parameter is used to identify the rows in this table.
	 *
	 * @param sText  the exact text
	 */
	public void selectFromAutoCompleteExactMatch(String sText) {
		int iterationCounter = 0;
		By by = By.cssSelector("tr[data-gargs*='" + sText + "']");
		outerloop:

		while (iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				getBrowser().waitForElementToBeClickable(By.cssSelector("tr[data-gargs*='" + sText + "']"));
				if (!getBrowser().getDriver().findElements(by).isEmpty()) {
					for (WebElement it : getBrowser().getDriver().findElements(by)) {
						getBrowser().sleep(500);
						if (it.getText().equals(sText)) {
							it.click();
							break outerloop;
						}
					}
				} else {
					iterationCounter++;
					getBrowser().sleep(200);
				}
			} catch (Exception e) {
				getBrowser().getLogWriter().log(e.getMessage(), Level.FINE);
				iterationCounter++;
				getBrowser().sleep(200);
			}

		}

	}

	/**
	 * Return the value attribute of the Text Field
	 * @return
	 */
	public String getValue(){
		return this.getElement().getAttribute("value");
	}
}

