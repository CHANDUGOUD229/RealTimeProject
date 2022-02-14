package com.stepchange.atf.controls;

import java.util.logging.Level;

import org.openqa.selenium.*;

import com.stepchange.atf.drivers.DriverType;
import com.stepchange.atf.utilities.AAssert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Class for defining text fields for use in screen objects
 */
public class TextField extends Container {

    public String placeHolderText;

    public void setPlaceHolderText(String placeHolderText) {
        this.placeHolderText = placeHolderText;
    }

    public String getPlaceHolderText() {
        return this.placeHolderText;
    }

    public TextField(By selector) {
        this.setSelector(selector);
    }

    public TextField(By selector, By labelSelector, String labelText) {
        this(selector);
        this.setLabelSelector(labelSelector);
        this.setLabelText(labelText);
    }

    public TextField(By selector, By labelSelector, String labelText, String textErrorMessage) {
        this(selector);
        this.setLabelSelector(labelSelector);
        this.setLabelText(labelText);
        this.setErrorText(textErrorMessage);
    }

    public TextField(By selector, By labelSelector, String labelText, String textErrorMessage, String ghostText) {

        this(selector);
        this.setLabelSelector(labelSelector);
        this.setLabelText(labelText);
        this.setErrorText(textErrorMessage);
        this.setGhostText(ghostText);
    }

    /**
     * enter Text error handling
     * @param text - text to enter
     */
    public void enterText(String text) {

        getBrowser().waitForElementToBeClickable(this.getSelector());
        int iterationCounter = 0;
        while (iterationCounter < getBrowser().getMaxAttempts()) {
            try {
                getBrowser().getElementWhenReady(getSelector()).clear();
                break;
            } catch (StaleElementReferenceException e) {
                getBrowser().getLogWriter().log("caught StaleElementReferenceException in enterText method", Level.FINE);

            } catch (InvalidElementStateException e) {
                getBrowser().getLogWriter().log("caught invalidElementStateException in enterText method", Level.FINE);

            }
            getBrowser().sleep(getBrowser().getTimeout() / 10);
        }
		scrollElementIntoView();
        enterText(getSelector(), text);
		if (getBrowser().getDriverType().equals(DriverType.WINIE)) { getElement().sendKeys(Keys.TAB);}
    }


    /**
     * Tries to enter into a webElement
     *
     * @param by   slector for the element to have the text entered
     * @param text text to be entered
     */

    public void enterText(By by, String text) {
        if (text != null) {
            getBrowser().waitForElementToBeClickable(by);
            int iterationCounter = 0;
            while (iterationCounter < getBrowser().getMaxAttempts()) {
                try {
                    getBrowser().getElementWhenReady(by).clear();
                    getBrowser().getElementWhenReady(by).sendKeys(text);
                    return;

                } catch (Exception e) {
                    getBrowser().getLogWriter().log(e.getMessage(), Level.FINE);
                    iterationCounter++;
                    getBrowser().sleep(20);
                }

            }
            throw new RuntimeException("Failed to enter text for selector" + by);
        }
    }

    public void clear() {
        int iterationCounter = 0;
        while (iterationCounter < getBrowser().getMaxAttempts()+5) {
            try {
                this.getElement().clear();
                break;
            } catch (StaleElementReferenceException e) {
                getBrowser().getLogWriter().log("Caught StaleElementReferenceException in enterText method", Level.FINE);
                getBrowser().sleep(getBrowser().getTimeout() / 10);

            }

        }

    }

    /**
     * Method that is used to verify the palceholder text
     * The method has a separate check fot chrome and IE as the attribute differ between the two browsers
     *
     * @param expectedPlaceholderText = String of the expected placeholder text that will be compared
     */

    public void textPlaceholder(String expectedPlaceholderText) {

        String failMsg = "FAIL : Placeholder is not correct for element with selector: '";
        String passMsg = "Placeholder test for element with selector: '";
        String unsupportedBrowser = " Browser is unsupported";

        if (getBrowser().getDriverType().equals(DriverType.CHROME) || getBrowser().getDriverType().equals(DriverType.CHROMEGRID)) {
			AAssert.assertEquals(this.getElement().getAttribute("placeholder"), expectedPlaceholderText, failMsg + this.getSelector() + "'",
					passMsg + this.getSelector() + "'");
        } else if (getBrowser().getDriverType().equals(DriverType.WINIE)) {
            String placeholder = this.getElement().getAttribute("ph");
            if (placeholder == null) {
                placeholder = this.getElement().getAttribute("placeholder");

            }
			AAssert.assertEquals(placeholder, expectedPlaceholderText, failMsg + this.getSelector() + "'",
					passMsg + this.getSelector() + "'");

        } else {
            // Throw error unsupported browser type for method
            throw new RuntimeException(unsupportedBrowser);

        }
    }

    /**
     * Method to verify the Maxium Field Lenght
     *
     * @param expectedFieldLength - pass the expected field length
     */

    public void testMaxLength(String expectedFieldLength) {
        String failMsg = " FAIL: Maximum length  is not as expected with selector: '";
        String passMsg = "PASS : Maximum length is as expected with selector '";

        AAssert.assertEquals(this.getElement().getAttribute("maxLength"), expectedFieldLength, failMsg + this.getSelector() + "'", passMsg + this.getSelector() + "'");

    }

    /**
     * Method to verify the Expected value of a field
     *
     * @param expectedValue - pass the expected default value
     */
    public void testExpectedValue(String expectedValue) {
        String failMsg = "FAIL : Default value is not '" + expectedValue + "' as expected with selector : '";
        String passMsg = "PASS : Default value is '" + expectedValue + "' as expected with selector '";
		AAssert.assertEquals(this.getElement().getAttribute("value"), expectedValue, failMsg + this.getSelector() + "'",
				passMsg + this.getSelector() + "'");

    }


    /**
     * Method to verify if TextField is mandatory
     */
    public void testMandatoryField() {

        String failMsg = "FAIL : Field is not marked as required : '";
        String passMsg = " Maximum length is as expected with selector: '";
        //IAssert.assertTrue(this.getElement().getAttribute ("validationtype").contains ("required"), failMsg + this.getSelector()+ "'", passMsg +this.getSelector() +"'");

    }

    public void isFieldOptional() {
        String failMsg = "FAIL : Field is marked as required: '";
        String passMsg = "PASS : Validation type was not marked as optional";
        //IAssert.assertEuals(this.getElement().getAttribute("validationtype") == "required" ,failMsg + this.getSelector() + "'" , passMsg +this.getSelector()+"");
    }

    public void testDefaultText(String defaultText) {
        String failMsg = "FAIL : Field Value is" + this.getElement().getAttribute("value") + " when the vlaue expected should be" + defaultText;
        String passMsg = "PASS : Maximum length is as expected with selector: '";
		AAssert.assertEquals(this.getElement().getAttribute("value"),defaultText, failMsg + this.getSelector() + "'", passMsg + this.getSelector());

    }

    /**
     * Method that verified that the expected text is contained within the checked element.
     *
     * @param expectedText Text to be checked
     */

    public void testTextContains(String expectedText) {
        int iterationCounter = 0;
        while (iterationCounter < getBrowser().getMaxAttempts()) {

            try {
				getBrowser().getLogWriter().log(this.getElement().getText());
                AAssert.assertContains(this.getElement().getText(), expectedText, "FAIL : Text did not match for control with selector " + this.getSelector(), " Text test passed");
                break;
            } catch (StaleElementReferenceException e) {
                getBrowser().getLogWriter().log("Caught StaleElementReferenceException in testText method", Level.FINE);
            }
        }

    }

	/**
	 * Method for entering text in a Text Field
	 * @param text Text to be entered
	 */
	public void enterTextField(String text){
		if (text != null) {

			this.waitForElementToBeClickable();
			int iterationCounter = 0;
			while (iterationCounter < getBrowser().getMaxAttempts()) {
				try {
					this.getElement().clear();
					getBrowser().sleep(100);
					this.getElement().click();
					this.getElement().sendKeys(text);
					getBrowser().sleep(100);
//					waitUntilElementValueIsChanged(this.getSelector(),text);
					return;
				} catch (Exception e) {
					getBrowser().getLogWriter().log(e.getMessage(), Level.INFO);
					iterationCounter++;
					getBrowser().sleep(20);
				}
			}
			log("Failed to enter text for selector " + this.getSelector(), Level.SEVERE);
			throw new RuntimeException("Failed to enter text for selector " + this.getSelector());
		}

	}
	private void waitUntilElementValueIsChanged(final By element,final String expectedValue)
    {
        verifyOverLayDisplayed();
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        getBrowser().sleep(100);
        try {
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {

                    WebElement button = driver.findElement(element);
                    String enabled = button.getAttribute("value");
                    System.out.println("Sahodara Value:: "+enabled);
                    if (enabled.contains("£"+expectedValue))
                        return true;
                    else
                        return false;
                }
            });
        }catch (Exception e){}
    }

	/**
	 * Return the value attribute of the Text Field
	 * @return
	 */
	public String getValue(){
		return this.getElement().getAttribute("value");
	}

    public void enterCharByChar(String text) {
        this.getElement().clear();
        for (int i = 0; i < text.length(); i++) {
            String letter = String.valueOf(text.charAt(i));
            this.getElement().sendKeys(letter);
            getBrowser().sleep(175);
        }
    }
}