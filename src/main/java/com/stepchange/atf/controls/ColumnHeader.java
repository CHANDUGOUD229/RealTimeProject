package com.stepchange.atf.controls;

import org.openqa.selenium.By;

/**
 * This should be incorperated into the table class
 */

public class ColumnHeader extends Control {

	private By filterSelector;
	public ColumnHeader(By selector) { this.setSelector(selector); }
	public void setFilterSelector (By selector) { filterSelector = selector;}
	public By getFilterSelector() { return filterSelector; }
	

	}


