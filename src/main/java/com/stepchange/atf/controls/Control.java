package com.stepchange.atf.controls;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.stepchange.atf.core.Browser;
import com.stepchange.atf.core.GenericMethods;
import com.stepchange.atf.core.WebDriverException;
import com.stepchange.atf.drivers.DriverType;
import com.stepchange.atf.drivers.SupportedDriver;
import com.stepchange.atf.utilities.AAssert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public  abstract class Control  extends GenericMethods {

	//Attributes
	private By selector;
	private By labelSelector;
	private String labelText;
	private String selectorString;
	private String ghostText;
	private By ghostSelector;
	private By errorSelector;
	private String errorText = "";
	private final String MANDATORY_MESSAGE = "You must enter a value";
	private final String maxLimitErrorMessage = " Please Enter at most 13 digits (including 2 decimal places";
	private final String invalidCountryCodeErrorMessage = "The country code entered is invalid";
	private final String cannotBeFutureDateErrorMessage = " You cannot enter a future date";
	private final String placeHolder = "Select...";
	private final String mustBeFutureDateErrorMessage = " Please enter a future date";
	protected String propertyName;

	// No Constructor as class is abstract

	/**
	 * supplies the Browser object
	 *
	 * @return the browser object ve're currently using
	 */

	public Browser getBrowser() {
		return SupportedDriver.getBrowsers().get(Thread.currentThread().getId());
	}

	//Method
	/*
	 * Check the label of the control
	 */
	public void testLabel() {
		int iterationCounter = 0;
		while (iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				if (getBrowser().getElementWhenReady(getLabelSelector()).getText().contains("Required")) {
					AAssert.assertEquals(getBrowser().getElementWhenReady(getLabelSelector()).getText(), getLabelText() + "Requried", "FAIL: Label is not correct for label" + getLabelText(), getLabelText() + "Label test");
					break;
				} else {
					AAssert.assertEquals(getBrowser().getElementWhenReady(getLabelSelector()).getText(), getLabelText(), "FAIL: Label is not correct for label" + getLabelText(), getLabelText() + "Label test");
					break;
				}
			} catch (StaleElementReferenceException e) {
				getBrowser().getLogWriter().log("caught StaleElementReferenceException in testLable", Level.FINE);
				iterationCounter++;
			}

		}
	}




	/**
	 * Check the validation message of the control
	 */

	public void testValidationMessage() {
		try {
			AAssert.assertEquals(getBrowser().getElementWhenReady(getErrorSelector()).getText(), getErrorText().trim(), " FAIL : Error Message is not correct for peoperty" + getErrorText(), getErrorText() + "error test");
		} catch (NoSuchElementException e) {

			getBrowser().getLogWriter().log("could not find error message for validation will try submitted again");
		/*PegaBrowserTest pbTest = new PegaBrowserTest();
		pbTest.clickSubmitButton();
		pbTest.closeNativeModelDailog();*/
		}
	}


	/**
	 * Return webelement of object
	 *
	 * @retrun -webelement
	 */

	public WebElement getElement() {
		return getBrowser().getElementWhenReady(getSelector());
	}

	public String getErrorText() {
		if (errorText.isEmpty()) {
			errorText = getMandatoryMessage();
		}
		return errorText;

	}

	/**
	 * sets the selector for your control label by passing in a prop name
	 *
	 * @param propname -name of the property for the control
	 */

	public void setLabelSelectorFromPropName(String propname) {
		selectorString = "div[id*='" + propname + "Error']";
		errorSelector = (By.cssSelector(selectorString));

	}

	/**
	 * Method to verify the text field is mandatory
	 */

	public void isControlMandatory() {
		String failMsg = "FAIL: Filed is not marked as required";
		String passMsg = "PASS: Validation type was not marked as optional";
		try {
			AAssert.assertTrue(this.getElement().getAttribute("validationtype").contains("required"), failMsg + this.getSelector() + "'", passMsg + this.getSelector() + "'");
		} catch (NullPointerException npe){
			// If null pointer then no validation type on object so must be optional
			AAssert.assertTrue(false, failMsg + this.getSelector() + "'");
		}

	}
	public void switchtoActiveIframe(String frameName){
		getBrowser().sleep(getBrowser().getTimeout() / 5);
		leaveIFrame();
		getDriver().switchTo().frame(frameName);

	}

	/**
	 * Method to verify if text filed is optional
	 */

	public void isControlOptional() {

		String failMsg = "FAIL: Filed is not marked as required";
		String PassMsg = "PASS: Validation type was not marked as optional";

		try {
			AAssert.assertFalse(this.getElement().getAttribute("validationtype").contains("required"), failMsg + this.getSelector() + "'", PassMsg + this.getSelector() + "'");
		} catch (NullPointerException npe){
			// If null pointer then no validation type on object so must be optional
			AAssert.assertTrue(true, failMsg + this.getSelector() + "'", PassMsg + this.getSelector() + "'");
		}
	}

	public By getSelector() {
		return selector;
	}

	public void setSelector(By selector) {
		this.selector = selector;
	}

	public By getLabelSelector() {
		return labelSelector;
	}

	public void setLabelSelector(By labelSelector) {
		this.labelSelector = labelSelector;
	}

	public String getGhostText() {
		return ghostText;
	}

	public void setGhostText(String ghostText) {
		this.ghostText = ghostText;
	}

	public String getLabelText() {
		return labelText;
	}

	public void setLabelText(String labelText) {
		this.labelText = labelText;
	}

	public String getMandatoryMessage() {
		return MANDATORY_MESSAGE;
	}

	public String getMaxLimitErrorMessage() {
		return maxLimitErrorMessage;
	}

	public String getInvalidCountryCodeErrorMessage() {
		return invalidCountryCodeErrorMessage;
	}

	public By getErrorSelector() {
		return errorSelector;
	}

	public void setErrorSelector(By errorSelector) {
		this.errorSelector = errorSelector;
	}

	public By getGhostSelector() {
		return ghostSelector;
	}

	public void setGhostSelector(By gostSelecctor) {
		this.ghostSelector = ghostSelector;
	}

	public void setErrorText(String errortext) {
		this.errorText = errorText;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * @return Error Message cannot be Future Date
	 */


	public String getMustBeFutureDateMessage() {
		return mustBeFutureDateErrorMessage;
	}

	/**
	 * @return Place holder select...
	 */


	public String getPlaceHolder() {
		return placeHolder;
	}

	public void testText(String expectedText) {
		int iterationCounter = 0;
		while (iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				// IAssert.assertEquals(this.getElement().getText(), expectedText , message : "FAIL: Text did not match for control with selector" +this.getSelector(), testID: "Text test passed");
				break;
			} catch (StaleElementReferenceException e) {
				getBrowser().getLogWriter().log("caught StaleElementReferenceException in testText method", Level.FINE);

			}
		}
	}

	public void testTextContains(String expectedText) {
		int iterationCounter = 0;
		while (iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				AAssert.assertContains(this.getElement().getText(), expectedText, "FAIL: Text did not match for control with selector " + this.getSelector(), "Text test passed");
				break;
			} catch (StaleElementReferenceException e) {
				getBrowser().getLogWriter().log("caught StaleElementReferenceException in testText method", Level.FINE);


			}
		}

	}


	/**
	 * Verify that this elements Element Exists
	 *
	 * @param expected - if element should exist or not
	 */

	public void verifyElementExists(boolean expected) {
		boolean exists = false;

		try {
			getBrowser().getDriver().findElement(this.getSelector());
			exists = true;

		} catch (Exception e) {
			exists = false;
		}


		if (expected) {
			AAssert.assertFalse(exists, "FAIL: Element '" + this.getSelector() + "' does not exist", "PASS : Element '" + this.getSelector() + "' exists");
		} else {
			AAssert.assertFalse(exists, "FAIL: Element '" + this.getSelector() + "' exist when it should not", "PASS : Element '" + this.getSelector() + "' does not exist");
		}
		getBrowser().getLogWriter().logScreenshot();

	}


	/*
	 * verify that this element is not Clickable
	 */
	public void verifyElementNotClickable() {
		boolean exists = false;

		try {
			getBrowser().getDriver().findElement(this.getSelector()).click();
			exists = true;

		} catch (Exception e) {
			exists = false;
		}

		AAssert.assertFalse(exists, "FAIL: Element '" + this.getSelector() + "' was clickable", "PASS : Element '" + this.getSelector() + "'is not clickable");
		getBrowser().getLogWriter().logScreenshot();

	}

	public void scrollDown() {
		// scroll down persistently because IE is a load of crap
		JavascriptExecutor jse = (JavascriptExecutor) getBrowser().getDriver();
		jse.executeScript("window.scrollTo( 0,document.body.scrollHeight) ", " ");
	}

	public void scrollUp() {
		// scroll up persistently because IE is a load of crap
		JavascriptExecutor jse = (JavascriptExecutor) getBrowser().getDriver();
		jse.executeScript("window.scrollBy(0, -500) ", " ");

	}

	public void scroll(int scrollAmount) {
		// But provide another means to scroll by a set height - as not all browsers are so crap!
		JavascriptExecutor jse = (JavascriptExecutor) getBrowser().getDriver();
		String scrollString = "window.scrollBy(0," + String.valueOf(scrollAmount) + ")";
		jse.executeScript(scrollString, "");
	}


	/*
	 * Verify that this element is displayed
	 *
	 * @param expected - if element should be displayed or not
	 */

	public void verifyElementDisplayed(boolean expected) {
		boolean exists = false;
		try {
			exists = getBrowser().getDriver().findElement(this.getSelector()).isDisplayed();
		} catch (Exception e) {
			exists = false;
		}

		if (expected) {

			AAssert.assertTrue(exists, "FAIL Element'" + this.getSelector() + "' is not displayed", "PASS Element'" + this.getSelector() + "' is displayed");
		} else {
			AAssert.assertTrue(exists, "FAIL Element'" + this.getSelector() + "' is  displayed when it should not", "PASS Element'" + this.getSelector() + "' is not displayed");

		}
		getBrowser().getLogWriter().logScreenshot();
	}
	protected synchronized void waitForElementVisibility(){
		Wait<WebDriver> wait = null;
		try {
			System.out.println("Waiting started :: "+System.currentTimeMillis());
			wait = new FluentWait<WebDriver>((WebDriver) getDriver()).withTimeout(0, TimeUnit.MILLISECONDS).pollingEvery(1,
					TimeUnit.SECONDS);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pega_ui_load")));
			System.out.println("Waiting Ended :: "+System.currentTimeMillis());
		}catch(Exception e) {
		}

	}
	protected synchronized void waitForElementInVisibility(){
		Wait<WebDriver> wait = null;
		try {
			System.out.println("Waiting started Invicibility :: "+System.currentTimeMillis());
			wait = new FluentWait<WebDriver>((WebDriver) getDriver()).withTimeout(0, TimeUnit.MILLISECONDS).pollingEvery(1,
					TimeUnit.SECONDS);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("pega_ui_load")));
			System.out.println("Waiting Ended Invisibilty :: "+System.currentTimeMillis());
		}catch(Exception e) {
		}
	}

	/*
	 * Sends the tab key to the current control , thus leaving the element
	 */
	public void leaveElement() {
		int iterationCounter = 0;
		while (iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				this.getElement().sendKeys(Keys.TAB);
				break;
			} catch (StaleElementReferenceException e) {
				getBrowser().sleep(getBrowser().getTimeout() / 10);
			}
		}

	}
	/**
	 * Sends the escape key press to the current control
	 */
	public void performEscape(){
		int iterationCounter = 0;
		while(iterationCounter < getBrowser().getMaxAttempts()){
			try{
				this.getElement().sendKeys(Keys.ESCAPE);
				break;
			} catch (StaleElementReferenceException e){
				getBrowser().sleep(getBrowser().getTimeout()/10);
			}
		}
	}

	public String getText(){
		int iterationCounter = 0;
		while(iterationCounter < getBrowser().getMaxAttempts()){
			try{
				if(this.getElement().getText() != null){
					return this.getElement().getText();
				} else {
					throw new RuntimeException("Text is null for element " + this.getSelector());
				}
			} catch (StaleElementReferenceException e){
				log("Caught StaleElementReferenceException for " + this.getSelector());
				iterationCounter++;
			}
		}
		throw new RuntimeException("Reached max attempts while trying to get text for " + this.getSelector());
	}
	public void verifyElementEnabled(boolean expected) {
		boolean enabled = false;

		try {
			enabled = getBrowser().getDriver().findElement(this.getSelector()).isEnabled();
		} catch (Exception e) {
			enabled = false;
		}

		if (expected) {
			AAssert.assertTrue(enabled, "FAIL: Element '" + this.getSelector() + "' is not enabled", "PASS: Element '" + this.getSelector() + "' is enabled");
		} else {
			AAssert.assertFalse(enabled, "FAIL: Element '" + this.getSelector() + "' is enabled when it should not be", "PASS: Element '" + this.getSelector() + "' is disabled");
		}

		getBrowser().getLogWriter().logScreenshot();
	}
	/**
	 * Method to test is validation type is set on an element
	 * @param validationType - Expected validation type
	 */
	public void verifyValidationType(String validationType){
		String validationTypes = getBrowser().getDriver().findElement(this.getSelector()).getAttribute("validationtype");

		AAssert.assertContains(validationTypes,validationType, "FAIL: Validation Type '" + validationType + "' not set on element '" + this.getSelector(), "PASS: Validation Type '" + validationType + "' set on element " + this.getSelector());
	}

	/**
	 * Method to test if the element is decimal
	 */
	public void isControlDecimal(){
		String validationTypes = getBrowser().getDriver().findElement(this.getSelector()).getAttribute("validationtype");

		AAssert.assertContains(validationTypes,"decimal", "FAIL: Validation Type 'decimal' not set on element '" + this.getSelector(), "PASS: Validation Type 'decimal' set on element " + this.getSelector());
	}
	/**
	 * Method to test if the element is an integer
	 */
	public void isControlInteger(){
		String validationTypes = getBrowser().getDriver().findElement(this.getSelector()).getAttribute("validationtype");

		AAssert.assertContains(validationTypes,"integer", "FAIL: Validation Type 'integer' not set on element '" + this.getSelector(), "PASS: Validation Type 'integer' set on element " + this.getSelector());
	}
	/**
	 * Method to test if the element is date field
	 */
	public void isControlDate(){
		String validationTypes = getBrowser().getDriver().findElement(this.getSelector()).getAttribute("validationtype");

		AAssert.assertContains(validationTypes,"date", "FAIL: Validation Type 'date' not set on element '" + this.getSelector(), "PASS: Validation Type 'date' set on element " + this.getSelector());
	}
	/**
	 * Method to test if the element is date field
	 */
	public void isControlTelephone(){
		String validationTypes = getBrowser().getDriver().findElement(this.getSelector()).getAttribute("validationtype");

		AAssert.assertContains(validationTypes,"validphonenumber", "FAIL: Validation Type 'validphonenumber' not set on element '" + this.getSelector(), "PASS: Validation Type 'validphonenumber' set on element " + this.getSelector());
	}

	/**
	 * Waits for the current control to become clickable for number of seconds
	 */
	public void waitForElementToBeClickable(int seconds){

		try {
			//(new WebDriverWait(getDriver(), seconds)).until(ExpectedConditions.elementToBeClickable(this.getSelector()));
			getBrowser().waitForElementToBeClickable(this.getSelector(),seconds);
		}

		catch (TimeoutException e) {
			log("Caught timeout exception in wait " + seconds + " seconds for element to be clickable", Level.SEVERE);
			logScreenshot();
		}
	}

	/**
	 * Waits for the current control to become clickable for number of seconds
	 */
	public boolean waitForElementToBeClickableBoolean(int seconds){

		try {
			//(new WebDriverWait(getDriver(), seconds)).until(ExpectedConditions.elementToBeClickable(this.getSelector()));
			getBrowser().waitForElementToBeClickable(this.getSelector(),seconds);
			return true;
		}

		catch (TimeoutException e) {
			return false;
		}
	}


	public void clickScreenElement(Control screenElement) {
		clickScreenElement(screenElement.getElement());
	}


	public void clickScreenElement(WebElement screenElement) {
		// First attempt to click the web Element at the current cursor location
		try {
			this.waitForElementToBeClickable();
			screenElement.click();
		} catch (WebDriverException wde) {
			// The element was not clickable , so sleep for 1000ms and try agian.
			try {
				scroll(200);
				screenElement.click();
			} catch (WebDriverException wde1) {
				scroll(200);
				try {
					screenElement.click();
				} catch (WebDriverException wde2) {
					scroll(200);
					try {
						screenElement.click();
					} catch (WebDriverException wde3) {
						scroll(-300);
						try {
							screenElement.click();
						} catch (WebDriverException wde4) {
							scroll(-300);
							try {
								screenElement.click();
							} catch (WebDriverException wde5) {
								scroll(-300);
								try {
									screenElement.click();
								} catch (WebDriverException wde6) {
									scroll(-200);
									screenElement.click();


								}
							}
						}

					}
				}
			}
		}
	}
	/** The main method for interaction with generic WebElemnets. Attempts to obtain element by looping and checking for element  presence in the DOM
	 * @param by The selector for the element
	 * @return The WebElement objects for the required element
	 * @throws NoSuchElementException
	 */


	/**
	 * Dumps information about a give WebElement.Genrally used by dumpWebElements , but can be used standalone
	 *
	 * @param it the WebElement to dump the information for
	 * @return String containing the information
	 */

	protected String getDetailsWebElement(WebElement it) {
		return "id ='" + it.getAttribute("id") + "' name='" + it.getAttribute("name") + "' tag='" + it.getTagName() + "'text='" + it.getText()
				+ "' Class'" + it.getAttribute("class") + "'onClick='" + it.getAttribute("onclick") + "'" + "' data-click'" + it.getAttribute("data-click") + "'";
	}


/**
 * The main method for interacting with generic webElements . Attempts to obtain element by looping and checking for element  presence in the DOM
 * @param by The selector for the element
 * @return The WebElement objects for the required element 
 * @throws NoSuchElementException
 */
// COMMENTING THIS CODE AS IT SAYS DUPLICATE METHOD-- ******************************** NEED TO REVISIT THIS METHOD
/*protected List<WebElement> getElementWhenReady(By by) throws NoSuchElementException (// Waits for the element to become available  , throws exception when not found)

	int i = 0;
	while (!isElementPresent(by)) {
		sleep(100);
		if(++i >= 10*getMaxAttempts()) {
			log ("Could not find element" + by, Level.SEVERE);
			throw new NoSuchElementException("Could not find Element" + by + "after" + i + "attempts");
		}
	}
	return getDriver().findElements(by);
	}
*/

	/**
	 * Checks whether an element is present in the DOM. Used by getElemnetWhenReady method
	 *
	 * @param by The selector for the element
	 * @return True or false depending on whether the element can be found
	 */

	public boolean isElementPresent(By by) { // work out if the element is available

		try {
			getBrowser().getDriver().findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			// Suppress NoSuchElementsException logging to keep things clean 
			return false;
		} catch (StaleElementReferenceException e) {
			getBrowser().getLogWriter().log("StaleElementReferenceException for element" + by + ".Message:" + e.getLocalizedMessage(), Level.INFO);
			return false;
		}
	}
	/**
	 * Checks whether an element is present in the DOM. Used by getElementWhenReady method

	 * @return True or false depending on whether the element can be found
	 */
	public boolean isElementPresent() { //Work out if the element is available
		try {
			getDriver().findElement(this.getSelector());
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			//Suppress NoSuchElementException logging to keep things clean
			return false;
		} catch (StaleElementReferenceException e) {
			log("StaleElementReferenceException for element " + this.getSelector() + ". Message:" + e.getLocalizedMessage(), Level.INFO);
			return false;
		}
	}
	/**
	 * Wait until Element is no longer displayed
	 */
	public void waitForElementToDisappear() {

		boolean found = false;
		int itCount;
		itCount = getMaxAttempts();
		while (itCount > 0) {
			try {
				if (!getBrowser().getDriver().findElement(this.getSelector()).isDisplayed()) {
					found = false;
					break;
				}
			} catch (Exception e) {
				found = false;
				break;
			}
			itCount--;
			getBrowser().sleep(getTimeout() / 10);

		}
		AAssert.assertFalse(found, "ERROR: Object still found after waiting '" + this.getSelector() + "'", "PASS: Element no longer visible '" + this.getSelector() + "'");
	}

	/**
	 * Wait until Element is  displayed
	 */
	public void waitForElementIdDisplayed() {

		boolean found = false;
		int itCount;
		itCount = getMaxAttempts()+5;
			while (itCount > 0) {
			try {
				if (getBrowser().getDriver().findElement(this.getSelector()).isDisplayed()) {
					found = true;
					break;
				}
			} catch (Exception e) {
				found = false;
				break;
			}
			itCount--;
			getBrowser().sleep(getTimeout() / 10);

		}
		AAssert.assertTrue(found, "ERROR: Object still Not found after waiting '" + this.getSelector() + "'", "PASS: Element is visible '" + this.getSelector() + "'");
	}

	/**
	 * Return if element is displayed
	 */
	public boolean isElementDisplayed() {
		boolean displayed = false;

		try {
			displayed = getBrowser().getDriver().findElement(this.getSelector()).isDisplayed();
		} catch (Exception e) {
			displayed = false;
		}

		return displayed;
	}

	/**
	 * The More simple logging method - Logs at INFO Level
	 *
	 * @param message The message to be output into the logs
	 */

	public void log(String message) {
		getBrowser().getLogWriter().log(message, Level.INFO);
	}

	/**
	 * The more in-depth logging method - Allows logging at different levels
	 *
	 * @param message The message to be output into the logs
	 * @param Level The logging level required -Uses the Level ENUM.
	 */
	
	/*public void log(String message , Level level) {
	//	EvideneLog.getLogger().log(level , message);
		this.getLogWriter().getLogger().log(level, message);
	}
	
	*/

	/**
	 * puts a screenshot of the current browser window into the logs
	 */
	
	/*
	
	public void logScreenshot() {
		this.getLogWriter().logScreenshot();
	}
	
	public void logScreenshot(Level level) {
		this.getLogWriter().logScreenshot(level);
	}
	
	public void waitForElementToBeClickable(By elementSelector) {
		try {
			(new WebDriverWait(getDriver(),20)).until(ExpectedConditions.elementToBeClickable(elementSelector));
			(new WebDriverWait(getDriver(),20)).until(ExpectedConditions.visibilityOlfElementLocated(elementSelector));
			
	   
			int itCount;
			itCount = getMaxAttempts();
			while (itCount > 0) {
				try {
					if (getElementWhenReady(elementSelector).isDisplayed()) {
						break ;
					}
					
				}catch (StaleElementReferenceException e ){
						log("Caught StaleElementReferenceException in WaitForElementToBeClickable method");
					} 
					itCount--;
					sleep (getTimeout()/10);
				}
		}catch (TimeoutException e) {
					log("Caught timeout xception in wait for element to be clickable");
				}
			}
		
	
	
			public void waitForElementToBeClikable(By elementSelector , int seconds) {
				(new WebDriverWait (getDriver() , seconds)).until(ExpectedConditions.elementToBeClickable(elementSelector));
			}
			*/

	public void switchToActiveFrame(){

		getBrowser().sleep(getBrowser().getTimeout() / 5);
		leaveIFrame();
		List<WebElement> iframeElements = getDriver().findElements(By.tagName("iframe"));
		System.out.println(iframeElements.size()-1);
		WebDriverWait wait = new WebDriverWait(getDriver(),10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeElements.size()-1));
//		getDriver().switchTo().frame();
		System.out.println("*******************Exist I Frame");
 
	}



	public void switchToActiveIFrame() {
		getBrowser().sleep(getBrowser().getTimeout() / 5); // Do NOT charge this line . short sleep to make sure the tab's loaded... There's no way  to do this ither than just waiting
		leaveIFrame();
		int iterationCounter = 0;
		while (iterationCounter < 5) {
			try {
				WebElement webGadget = getElementWhenReady(By.cssSelector("iframe[id*='PegaGadget0Ifr']"));
				String iFrameID = webGadget.getAttribute("Name");
				(new WebDriverWait(getBrowser().getDriver(), 3)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrameID));
				getBrowser().getLogWriter().log(iFrameID, Level.FINE);
				return;
			} catch (NoSuchElementException e) {
				getBrowser().sleep(getBrowser().getTimeout() / 10);
				log("Switch to active iFrame" + e.getMessage());

			}
			iterationCounter++;
		}
		throw new RuntimeException("Failed to switch to active iFrame");
	}

	/**
	 * Moves out of the current iFrame and into the default content area m which is not contained within an iFrame
	 */

	public void leaveIFrame() {
		getBrowser().getLogWriter().log("Moving to default content", Level.FINEST);
		int iterationCounter = 0;
		while (iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				getBrowser().getDriver().switchTo().defaultContent();
				break;
			} catch (Exception e) {
				getBrowser().getLogWriter().log(e.getMessage(), Level.FINEST);
				iterationCounter++;
				getBrowser().sleep(30);
			}
		}
	}

	public String getTimeStamp() {
		SimpleDateFormat format = new SimpleDateFormat("YYYYMMddHHmmss");
		Date date = new Date();
		return format.format(date);
	}

	/**
	 * Clicks the button with the specified action string , This method allows for very fast selection of buttons , and automatically  clicks on them.
	 *
	 * @param actionString A string containing some if the vakue from the data-click or onclick attributes of a button tag , This can be match or full match depending on what makes more sense.
	 */
	public void clickButtonByAction(String actionString) {
		clickElementByAction("button", actionString);
	}

	/**
	 * clicks an element with the specified tag name and action string. This method allows for very fast selection of elements , and automatically clicks on them
	 *
	 * @param tagName      The tag name of the element to be clicked on - This is used to form part of the cssSelector
	 * @param actionString A string containing some of the value from the data-click or onclick attributes of a button tag. This can be partail match or a full match depending  on what makes more sense.
	 */
	protected void clickElementByAction(String tagName, String actionString) {
		// Two types of action definition for the buttons have been seen - data -click and onclick , Trying to make it work for both.

		// Check data-click first (its the more common  one )
		int iterationCounter = 0;
		while (iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				if (!getBrowser().getDriver().findElements(By.cssSelector(tagName + "[onclick*='" + actionString + "'")).isEmpty()) {
					WebElement button = getElementWhenReady(By.cssSelector(tagName + "[onclick*='" + actionString + "'"));
					if (button != null) {
						button.click();
						break;
					}
				} else if (!getBrowser().getDriver().findElements(By.cssSelector(tagName + "[data-click*='" + actionString + "'")).isEmpty()) {
					WebElement button = getElementWhenReady(By.cssSelector(tagName + "[data-click='" + actionString + "'"));
					if (button != null) {
						button.click();
						break;
					} else {
						getBrowser().getLogWriter().log("Failed to find element with tagName" + tagName + "and actionString" + actionString, Level.INFO);
						iterationCounter++;

					}
				}
			} catch (Exception e) {
				getBrowser().getLogWriter().log(e.getMessage(), Level.FINEST);
				checkNotClickable(e);
				iterationCounter++;
				getBrowser().sleep(20);

			}
		}

		// If max attempts reached with no click , fail the test

		if (iterationCounter == getBrowser().getMaxAttempts()) {
			throw new RuntimeException("Failed to find element with tagName \"" + tagName + "\" and actionString \"" + actionString + "\" after max attempts");
		}

	}

	/**
	 * Takes in an exception and checks the message . If the message shows that the exception is a Webdriver "ElementNotClickable' exception scroll down by 500px . This enables interration with elements which are hidden behind javascript elements.
	 *
	 * @param e Exception to check on
	 */

	public void checkNotClickable(Exception e) {
		if (e.getMessage().contains("Element is not clickable at point") || e.getMessage().contains("element not visible")) {

			JavascriptExecutor jse = (JavascriptExecutor) getBrowser().getDriver();
			jse.executeScript("window.scrollBy(0,500)", "");
		} else {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Switches to a new window after it has been opened
	 *
	 * @param windowTitle The title of the window to switch to
	 */

	public void switchToNewWindow(String windowTitle) {
		setOriginalWindow(getBrowser().getDriver().getWindowHandle());
		if (getBrowser().getDriverType().equals(DriverType.WINIE)) {
			getBrowser().sleep(2 * getBrowser().getTimeout());
		}
		Set<String> windowList = getBrowser().getDriver().getWindowHandles();
		log("window List size:" + windowList.size());
		if (getBrowser().getDriverType().equals(DriverType.WINIE)) {
			if (windowList.size() != 2) {
				getBrowser().getLogWriter().log("Error : Did not find 2 windows when attempting to switch", Level.SEVERE);
			}
		}
		log(getBrowser().getDriver().getWindowHandle());
		for (String windowHandle : windowList) {
			if (!windowHandle.equals(getOriginalWindow())) { // check that we are not selecting the original again
				getBrowser().getDriver().switchTo().window(windowHandle);
				log(getBrowser().getDriver().getTitle());
				if (!getBrowser().getDriver().getTitle().contains(windowTitle)) { //Chrome can actually handle checking window titles...
					getBrowser().getDriver().switchTo().window(getOriginalWindow()); // This is not the requested window - swaitch back to main window
				}
				getBrowser().getDriver().getWindowHandle();
			}
		}
	}

	/**
	 * Switches back to main driver window
	 */

	public void switchToMainWindow() {
		getBrowser().getDriver().close();
		getBrowser().getDriver().switchTo().window(getOriginalWindow());

	}
/*				public String getOriginalWindow() { return originalWindow ; }
				public void setOriginalWindow(String originalWindow) { this.originalWindow = originalWindow ; }
			*/

	public void waitForElementToBeClickable(By elementSelector) {
		try {
			(new WebDriverWait(getBrowser().getDriver(), 20)).until(ExpectedConditions.elementToBeClickable(elementSelector));
			(new WebDriverWait(getBrowser().getDriver(), 20)).until(ExpectedConditions.visibilityOfElementLocated(elementSelector));
			int itCount;
			itCount = getBrowser().getMaxAttempts();
			while (itCount > 0) {
				try {
					if (getElementWhenReady(elementSelector).isDisplayed()) {
						break;
					}
				} catch (StaleElementReferenceException e) {
					log("Caught timeout exception in wait for element to be clickable");
				}
				itCount--;
				getBrowser().sleep(getBrowser().getTimeout() / 10);
			}
		} catch (TimeoutException e) {
			log("Caught timeout exception in wait for element to be clickable");
		}
	}

	public void waitForElementToBeClickable() {
		getBrowser().waitForElementToBeClickable(this.getSelector());
	}

	public void waitForElementToBeClickable(By elementSelector, int seconds) {
		(new WebDriverWait(getBrowser().getDriver(), seconds)).until(ExpectedConditions.elementToBeClickable(elementSelector));
	}

	protected WebElement getElementWhenReady(By by) throws NoSuchElementException {
		int i = 0;
		while (!isElementPresent(by)) {
			getBrowser().sleep(100);
			if (++i >= getBrowser().getMaxAttempts()) {
				getBrowser().getLogWriter().log("Could not find element " + by, Level.SEVERE);
				throw new NoSuchElementException("Could not find element " + by + " after " + i + " attempts");
			}
		}
		i = 0;
		while (i < getBrowser().getMaxAttempts()) {
			try {
				getBrowser().getLogWriter().log(getDetailWebElement(getBrowser().getDriver().findElement(by)), Level.FINEST);
				break;
			} catch (StaleElementReferenceException e) {
				log("Caught StaleElementReferenceException");
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				i++;
			}
		}
		return getBrowser().getDriver().findElement(by);
	}

	public String getDetailWebElement(WebElement it) {
		return "id='" + it.getAttribute("id") + "' name='" + it.getAttribute("name") + "' tag='" + it.getTagName() + "' text='" + it.getText()
				+ "' class='" + it.getAttribute("class") + "' onclick='" + it.getAttribute("onclick") + "'" + "' data-click='" + it.getAttribute("data-click") + "'";

	}

	public void testValidationMessage(String errorMessage) {

		try {
			AAssert.assertEquals(getBrowser().getElementWhenReady(this.getErrorSelector()).getText(), errorMessage, "FAIL: Error Message is not correct for property" + getErrorText(), getErrorText() + "error test");


		} catch (NoSuchElementException e) {
			getBrowser().getLogWriter().log("could not find error message for validation will try submitted again");

		}
	}

	public boolean scrollIntoViewElement(By ScrollToElement) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) this.getDriver();
			executor.executeScript("arguments[0].scrollIntoView(true);", this.getDriver().findElement(ScrollToElement));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void scrollElementIntoView() {
		try {
			((JavascriptExecutor) this.getDriver()).executeScript("element.focus();", new Object[]{this.getElement()});
			((JavascriptExecutor) this.getDriver()).executeScript("arguments[0].scrollIntoView(true);", new Object[]{this.getElement()});
		} catch (Exception var2) {
			this.log(var2.getLocalizedMessage() + " Exception thrown inside scrollElementIntoView() method ");
			try {
				Actions actions = new Actions(getDriver());
				actions.moveToElement(this.getElement());
				actions.perform();
				this.log(	" Retried to Scroll and Passed  ");
			}catch (Exception var3)
			{
					this.log(var3.getLocalizedMessage() + " Retried to Scroll and Failed ");
			}

			try {
				Actions actions = new Actions(getDriver());
				actions.moveToElement(this.getElement());
				actions.perform();
				this.log(  " Retried to Scroll and Passed  ");
			}catch (Exception var3)
			{
				this.log(var3.getLocalizedMessage() + " Retried to Scroll and Failed ");
			}
		}
	}
	public void verifyOverLayDisplayed() {

		try {
//			waitForElementVisibility();
//			waitForElementVisibility();
		} catch (Exception e)
		{

		}
	}
	public void verifyInvisiblityIslocated()
	{
		try {
			(new WebDriverWait(getDriver(),30)).until(ExpectedConditions.invisibilityOfElementLocated(this.getSelector()));
		}catch (Exception e)
		{
			this.log(e.getLocalizedMessage() + " Element is Still visible ");
		}

	}

}



		
				
					
				
			
		