 package com.stepchange.atf.controls;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.stepchange.atf.core.Browser;
import com.stepchange.atf.drivers.SupportedDriver;

public class Screen {

	Checkbox  checkbox_welshSpeaking;
	Checkbox checkbox_authorisedForCorrespondence;
	
	public Browser getBrowser() { return SupportedDriver.getBrowsers().get(Thread.currentThread().getId()); }
	public Screen () {
		checkbox_welshSpeaking = new Checkbox(By.xpath("//input[@id[contains(., 'WelshSpeaking')]]"));
		checkbox_authorisedForCorrespondence = new Checkbox (By.xpath("//input[@name[contains(., '$IsAuthorised')]][2]"));
	}
	
	//public Checkbox getCheckbox_welishSpeaking()	{
//		retrun checkbox_welishSpeaking; }
//
	
	public void selectCheckbox_welshSpeaking() { selectCheckboxMultipleOccurences(checkbox_welshSpeaking, false); }
	public void selectCheckbox_authorisedForCorrespondence() {
		selectCheckboxMultipleOccurences(checkbox_authorisedForCorrespondence, true);
	}
	public static void selectCheckboxMultipleOccurences(Checkbox checkBox,  boolean breakLoop) {
		selectCheckboxMultipleOccurences(checkBox,0,breakLoop);
	}
	public static void selectCheckboxMultipleOccurences(Checkbox checkBox, int scrollAmount, boolean breakLoop) {
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		WebElement checkbox = null;
		WebDriver driver = SupportedDriver.getBrowsers().get(Thread.currentThread().getId()).getDriver();
		List<WebElement> checkboxList = driver.findElements(checkBox.getSelector());
		
		Iterator<WebElement> checkboxListIterator = checkboxList.iterator();
		checkBoxLoop: while(checkboxListIterator.hasNext()) {
			checkbox = checkboxListIterator.next();
		if(checkbox.isEnabled() && checkbox.isDisplayed()) {
			if(!checkbox.isSelected() ) {
				if(scrollAmount > 0) {
					JavascriptExecutor jse = (JavascriptExecutor)SupportedDriver.getBrowsers().get(Thread.currentThread().getId()).getDriver();
					String scrollString = "window.scrollBy(0," +String.valueOf(scrollAmount) + ")";
					jse.executeScript(scrollString, "");
				}
				checkbox.click();
				if(breakLoop) {
					break checkBoxLoop;
				}
				
				}
			}
		
		
		}
		}
	
	
	}

