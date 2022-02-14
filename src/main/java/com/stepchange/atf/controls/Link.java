package com.stepchange.atf.controls;

import com.stepchange.atf.core.WebDriverException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

/**
 * Needs Refactoring....., stored element need to go, on control as well.
 */
public class Link  extends Control {
	public Link(By by) { this.setSelector(by);}
	public Link (String actionText) { this.setSelector(By.linkText(actionText));}
	public void click() {
		getBrowser().waitForElementToBeClickable(this.getSelector());
		scrollElementIntoView();
		int iterationCounter = 0;
		while (iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				this.getElement().click();
				break;
			} catch (StaleElementReferenceException e) {
				getBrowser().getLogWriter().log("Caught StaleElementReferenceException in click method");
			} catch (WebDriverException f) {
				if (f.getMessage().contains("Link is not clickable at point")) {
					scrollDown();

				}
			}
		}
	}
	public void clickLinkNew( ) {
		scrollElementIntoView();
		click();
	}



	}

