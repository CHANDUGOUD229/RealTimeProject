package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class CreateYourBudget extends Control{
	GenericMethodsRemediation genericMethods = new GenericMethodsRemediation();
	private Button continueCreateBudgetButton;
	private Button createBudgetBackButton;
	private Button createBudgetBackToDashboard;

	//getters
//	public Button getContinueCreateBudget() { return continueCreateBudgetButton; }
	public Button getcreateBudgetBackButton() {return createBudgetBackButton;}
	public Button getcreateBudgetBackToDashboard() {return createBudgetBackToDashboard;}
//	private By continueCreateBudgetButton;

	public Button getContinueCreateBudget() {
		return continueCreateBudgetButton;
	}
	//constructor
	public CreateYourBudget() {

//		continueCreateBudgetButton = By.xpath("//button[normalize-space()='Continue']");
		continueCreateBudgetButton = new Button(By.xpath("//button[normalize-space()='Continue']"));
	createBudgetBackButton=new Button(By.name("CreatingYourBudget_pyWorkPage_43"));
	createBudgetBackToDashboard=new Button(By.xpath("//a[text()='Back to dashboard']"));
	}
	


	public void ClickonContinueCreateBudgetButton()
	{
		switchToActiveFrame();
		this.getContinueCreateBudget().click();
		System.out.println("=== Exit Then user clicks on create budget and submits screen");
	}
	public void clickCreateBudgetContinueButton() {

		this.getContinueCreateBudget().click();
	}

}

