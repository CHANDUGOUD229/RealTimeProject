package com.stepchange.atf.controls;

import org.openqa.selenium.By;

/**
 * Frame control class - Use when navigating between frames -pega 6
 * Dont use in Pega 7
 */

public class Frame extends Container{

	public Frame(String section) {
	String selectorString = "div[param_name*='"+section+ "']";
	this.setSelector(By.cssSelector(selectorString));
			
	}

public Frame(By by) { this.setSelector(by);}
public void verifyDivContains(String expectedText) { verifyContainerContains(expectedText, "Frame"); }
public void verifyDivNotContains( String doesNotContains) { verifyContainerNotContains(doesNotContains,  "Frame");}
		
}
