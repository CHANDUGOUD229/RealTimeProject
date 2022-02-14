package com.stepchange.atf.controls;

import org.openqa.selenium.By;

/**
 * TableCell control class - Implement when you have a table cell which needs to be checked 
 */

public class TableCell  extends Container {
	
	public TableCell (By selector ) { this.setSelector(selector); }
	public void verifyRowContains( String expectedText) { verifyContainerContains(expectedText,  "Cell"); }
	public void verifyRowNotContains(String doesNotContains) { verifyContainerNotContains(doesNotContains ,  "Cell");

}
}