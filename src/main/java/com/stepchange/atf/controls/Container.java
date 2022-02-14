package com.stepchange.atf.controls;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.stepchange.atf.core.WebDriverException;
import com.stepchange.atf.drivers.SupportedDriver;
import com.stepchange.atf.utilities.AAssert;

public abstract class Container extends Control {

	protected void verifyContainerContains(String expectedText, String containerType) {
		String actualText = null;
		int iterationCounter = 0;
		while(iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				actualText = this.getElement().getText().replaceAll("\n", " " );
				break;
			} catch (StaleElementReferenceException e) {
				
				iterationCounter++ ;
				getBrowser().getLogWriter().log("Caught staleElementReferenceException in verifuy container contains");
			}
			
		}
		
		if(iterationCounter == getBrowser().getMaxAttempts()) {
			throw new RuntimeException("Could not execute verify container contains");
		}
		
		AAssert.assertContains(actualText, expectedText, "FAIL: " + containerType + " does not contain checked text" );
		getBrowser().getLogWriter().log(containerType + "contains the expected Text ' "  + expectedText + " ' " );
	}

	protected void verifyContainerNotContains(String doesNotContain, String containerType) {
		
		String actualText;
		actualText = this.getElement().getText().replaceAll("\n", " ");
		AAssert.assertNotContains(actualText, doesNotContain, "FAIL: " + containerType + " wrongly contains checked text");
		getBrowser().getLogWriter().log(containerType + "does not contain the checked Text");
				
	}
	
	protected void verifyChildContains(Control controlObject, String expectedText, String containerType) {
		int iterationCounter = 0;
		while(iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				AAssert.assertContains(this.getTextChildElement(controlObject),expectedText, "FAIL: " + containerType + " does not contain checked text", containerType + " contains the expected Text" );
			break;
			} catch (NoSuchElementException e) {
				
				getBrowser().getLogWriter().log("Caught NoSuchElementException in verify Child contains for control" + controlObject.getSelector(),Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout()/100);
				iterationCounter++;
			}catch (StaleElementReferenceException f) {
				
				getBrowser().getLogWriter().log("Caught staleElementReference Exception in verify Child contains for control" + controlObject.getSelector(),Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout()/100);
				iterationCounter++;
		
		}
	}
}
	
	public void verifyChildContainsObject(Control controlObject, String controlType) {
		
		boolean controlCondition;
		
		controlCondition = this.findChildElement(controlObject).isDisplayed();
		AAssert.assertTrue(controlCondition, "FAIL: " + controlType + "cannot be found within the parent");
		getBrowser().getLogWriter().log(controlType + "is within the parent element" );
		
	}
	
	public WebElement findChildElement(Control controlObject) {
		
		int iterationCounter = 0;
		
		while(iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				return this.getElement().findElement(controlObject.getSelector());
			} catch (NoSuchElementException e) {
				
				getBrowser().getLogWriter().log("Caught NoSuchElementException in verify Child contains for control" + controlObject.getSelector(),Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
			}catch (StaleElementReferenceException f) {
				
				getBrowser().getLogWriter().log("Caught staleElementReference Exception in verify Child contains for control" + controlObject.getSelector(),Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
		
		}
	} 
		return null;
	}
	
	
	public List<WebElement> findChildElements(Control controlObject){
		
		int iterationCounter = 0;
		while(iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				return this.getElement().findElements(controlObject.getSelector());
						
			} catch (NoSuchElementException e) {
				getBrowser().getLogWriter().log("Caught NoSuchElementException in verify Child contains for control" + controlObject.getSelector(),Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
			}catch (StaleElementReferenceException f) {
				getBrowser().getLogWriter().log("Caught staleElementReference Exception in verify Child contains for control" + controlObject.getSelector(),Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
		}
	} 
		return null;
	}
	
	public WebElement findChildElement(By selector) {
		
		int iterationCounter = 0;
		while(iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				return this.getElement().findElement(selector);
						
			} catch (NoSuchElementException e) {
				getBrowser().getLogWriter().log("Caught NoSuchElementException in verify Child contains for control" + selector,Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
			}catch (StaleElementReferenceException f) {
				getBrowser().getLogWriter().log("Caught staleElementReference Exception in verify Child contains for control" + selector,Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
		}
	} 
		return null;	
		
	}
	
	
	public List<WebElement> findChildElements(By selector){
		int iterationCounter = 0;
		while(iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				return this.getElement().findElements(selector);
						
			} catch (NoSuchElementException e) {
				getBrowser().getLogWriter().log("Caught NoSuchElementException in verify Child contains for control" + selector,Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
			}catch (StaleElementReferenceException f) {
				getBrowser().getLogWriter().log("Caught staleElementReference Exception in verify Child contains for control" + selector,Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
		}
	} 
		return null;
	}
	
	
	public void clickChildElement(Control controlObject) {
		int iterationCounter = 0;
		while(iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				findChildElement(controlObject).click();
				break;
						
			} catch (StaleElementReferenceException f) {
				getBrowser().getLogWriter().log("Caught StaleElementReferenceException in findChildElement for control" + controlObject.getSelector(), Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
			}catch (NullPointerException e) {
				getBrowser().getLogWriter().log("Caught Null Pointer Exception in findChildElement for control" + controlObject.getSelector(),Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
		} catch (WebDriverException g) {
			scrollDown();
		}
			
	}
	}
	
	public void enterTextChildElement(Control controlObject, String text) {
		int iterationCounter = 0;
		while(iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				findChildElement(controlObject).sendKeys(text);
				break;
						
			} catch (StaleElementReferenceException f) {
				getBrowser().getLogWriter().log("Caught StaleElementReferenceException in findChildElement for control" + controlObject.getSelector(), Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
			}catch (NullPointerException e) {
				getBrowser().getLogWriter().log("Caught Null Pointer Exception in findChildElement for control" + controlObject.getSelector(),Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
		}
		
	}
	}
	
	public String getTextChildElement(Control controlObject) {
		int iterationCounter = 0;
		while(iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				findChildElement(controlObject).getText();
				break;
						
			} catch (StaleElementReferenceException f) {
				getBrowser().getLogWriter().log("Caught StaleElementReferenceException in getTextChildElement for control" + controlObject.getSelector(), Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
			}catch (NullPointerException e) {
				getBrowser().getLogWriter().log("Caught Null Pointer Exception in getTextChildElement for control" + controlObject.getSelector(),Level.FINE);
				getBrowser().sleep(getBrowser().getTimeout() / 100);
				iterationCounter++;
		}
		
	}
		return null;
		
	}
	
	public void verifyElementExists(boolean expected) {
		boolean exists = false;
		
		try {
			getBrowser().getDriver().findElement(this.getSelector());
			exists = true;
		}catch (Exception e) {
			exists = false;
		}
		
		if (expected) {
			AAssert.assertTrue(exists, "FAIL: Element " + this.getSelector() + "does not exist", "PASS: Element " + this.getSelector() + "exists");
		}else {
			AAssert.assertFalse(exists, "FAIL: Element " + this.getSelector() + "exist when it should not", "PASS: Element " + this.getSelector() + " does not exists");
		}
		getBrowser().getLogWriter().logScreenshot();
					
	}
	
	
	public void verifyElementExists(Control controlObject, boolean expected) {
		boolean exists = false;
		
		try {
			this.getElement().findElement(controlObject.getSelector());
			exists = true;
		}catch (Exception e) {
			exists = false;
		}
		
		if (expected) {
			AAssert.assertTrue(exists, "FAIL: Element " + this.getSelector() + "does not exist", "PASS: Element " + this.getSelector() + "exists");
		}else {
			AAssert.assertFalse(exists, "FAIL: Element " + this.getSelector() + "exist when it should not", "PASS: Element " + this.getSelector() + " does not exists");
		}
		getBrowser().getLogWriter().logScreenshot();
					
	}
	
	
	public void verifyErrorMessage(String errorMessage) {
		boolean found = false;
		
		List<WebElement>errorMessages = getBrowser().getDriver().findElements(this.getSelector());
		
		//Go through all the elements until text is found.
		
		Iterator<WebElement> itr = errorMessages.iterator();
		while(itr.hasNext()) {
			String errorText = itr.next().getText();
			if(errorText.contains(errorMessage)) {
				found = true;
				break;
			}
		}
		
		AAssert.assertTrue(found, "ERROR: Error message " + errorMessage + "not found", "PASS:  Error message is " + errorMessage + " as expected");
	}
	
	
	/*public static WebElement getActiveWebElement(Container container) {
		WebDriver driver = SupportDriver.getBrowsers().get(Thread.currentThread().getId()).getDriver();
		List<WebElement> webElementList = driver.findElements(container.getSelector());
		
		WebElement activeElement = null;
		Iterator<WebElement> webElementListIterator = webElementList.iterator();
		elementIterationLoop: while (webElementListIterator.hasNext()) {
			WebElement element = webElementListIterator.next();
			if(element !=null && element.isEnabled() && element.isDisplayed()){
				activeElement = element;
				break elementIterationLoop;
			}
		}
		return activeElement;
		
	}*/
	

	public static WebElement getActiveWebElement(Control control) {
	WebDriver driver = SupportedDriver.getBrowsers().get(Thread.currentThread().getId()).getDriver();
	List<WebElement> webElementList = driver.findElements(control.getSelector());
	
		WebElement activeElement = null;
		Iterator<WebElement> webElementListIterator = webElementList.iterator();
		elementIterationLoop: while (webElementListIterator.hasNext()) {
			WebElement element = webElementListIterator.next();
			if (element !=null && element.isEnabled() && element.isDisplayed()) {
				activeElement = element;
				break elementIterationLoop;
			}
		}
		return activeElement;
		
	}

	
	
}