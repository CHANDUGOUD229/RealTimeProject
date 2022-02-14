package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Div;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;
import org.testng.Assert;
//import com.stepchange.atf.genericMethods.GenericMethods_CVP;

public class SummaryPage extends Control {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	private Div CaseStaus;
	private Div YourDebtsAmount;
	private Div YourMonthlyIncomeAmount;
	private Div YourMonthlySpendingAmount;
	private Div AvailbleYourDebtsAmount;
	
	public Div getYourDebtsAmount() {
		return YourDebtsAmount;
	}
	public Div getYourMonthlyIncomeAmount() {
		return YourMonthlyIncomeAmount;
	}
	public Div getYourMonthlySpendingAmount() {
		return YourMonthlySpendingAmount;
	}
	public Div getAvailbleYourDebtsAmount() {
		return AvailbleYourDebtsAmount;
	}
	public Div getCaseStaus() {
		return CaseStaus;
	}
	
	public SummaryPage() {
		YourDebtsAmount = new Div(By.xpath("//div[text()='Your debts']//following::div[1]"));
		YourMonthlyIncomeAmount= new Div(By.xpath("//div[text()='Your monthly income']//following::div[1]"));
		YourMonthlySpendingAmount = new Div(By.xpath("//div[text()='Your monthly spending']//following::div[1]"));
		AvailbleYourDebtsAmount= new Div(By.xpath("//div[text()='Available for your debts']//following::div[1]"));
		CaseStaus = new Div(By.xpath("(//span[@class='field-caption dataLabelForRead'])[1]//following::div[1]"));
	}
	public void VerifyYourDebtsAmountfromSummaryPage(String debts) {
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);
		String data =this.getYourDebtsAmount().getText();
		Assert.assertEquals(data, debts);
	}
	
	public void VerifyYourMonthlyIncomeAmountfromSummaryPage(String income) {
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);
		String data =this.getYourMonthlyIncomeAmount().getText();
		Assert.assertEquals(data, income);
	}
	
	
	public void VerifyYourMonthlySpendingAmountfromSummaryPage(String Spend) {
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);
		String data =this.getYourMonthlySpendingAmount().getText();
		Assert.assertEquals(data, Spend);
	}
	public void VerifyAvilableDebtsAmountfromSummaryPage(String Availdebts) {
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);
		String data =this.getAvailbleYourDebtsAmount().getText();
		Assert.assertEquals(data, Availdebts);
	}
	
	public void VerifyCaseStatusfromSummaryPage(String caseStatus) {
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);
		String data =this.getCaseStaus().getText();
		Assert.assertEquals(data, caseStatus);
	}
	
}
