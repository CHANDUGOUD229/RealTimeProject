package com.stepchange.atf.controls;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RepeatLayout extends Control {
	private int index;
	private String pageListName;
	private String selectorString;
	private WebElement repeatLayoutElement;
	
	public RepeatLayout (String pageList) {
		setIndex(1);
		setPageListName(pageList);
		selectorString = "div[base_ref=*'." + pageListName + "(" + index + ")']";
		
	}
	//Getters and Setters
	public int getIndex() { return index; }
	private void setIndex(int index) { this.index = index; }
	public String getPageListName() { return pageListName ; }
	public void setPageListName(String pageListName) { this.pageListName = pageListName; }
	public WebElement getRepeatLayoutElement() {
		return getBrowser().getElementWhenReady(By.cssSelector (selectorString));
	}
	// METHOD 
	public void changeRepeatGridIndex (int indexch) {
		setIndex(indexch);
		selectorString = "div[base_ref=*'." + pageListName + "(" + index + ")']";
	}

	

	}

