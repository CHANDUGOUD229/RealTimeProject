package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourPreferredSolution extends Control {
	
	GenericMethodsRemediation GenericMethods_cvp=new GenericMethodsRemediation();
	private Dropdown startLivingMonthDropdown;
	private Dropdown startLivingYearDropdown;
	
	public Dropdown getstartLivingMonthDropdown() {return startLivingMonthDropdown;}
	public Dropdown getstartLivingYearDropdown() {return startLivingYearDropdown;}
	
	public YourPreferredSolution()
	{
		startLivingMonthDropdown=new Dropdown(By.xpath("(//div[text()='When did you start living at this address?']//following::select)[1]"));
		startLivingYearDropdown=new Dropdown(By.xpath("(//div[text()='When did you start living at this address?']//following::select)[2]"));
		
	}
	
	public void clickOnContinuepreferredSolution()
	{
		switchToActiveFrame();
		this.getstartLivingMonthDropdown().selectFromDropdownByText("Aug");
		this.getstartLivingYearDropdown().selectFromDropdownByText("2015");
		GenericMethods_cvp.getContinueButton().click();
	}
	

}
