package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Checkbox;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.TextField;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FinalQuestionsPage extends Control {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	private Button WhatTypesofJobsCouldbeAffectedNoButton;
	private Button WhatisaDebtSolutionNoButton;
	private Button FinalQuestionsPageContinueButton;
private Button EmploymentbeEffectedNoButton;
	private Button AwardedbankruptcyNoButton;
	private Button MinimalAssetprocessNoButton;
	private Button PreviouslybeenADebtSolution;
	private Button WhatisaDebtSolutionNoButtonforClient1;
	private Button WhatisaDebtSolutionNoButtonforclient2;
	private Button EmployementBeEffectedInsolvencyYesButtonforclient2;
	private Button EmployementBeEffectedInsolvencyYesButtonforclient2No;
	private Button HaveYouPreviouslyBeenOnDebtSolutionClient01;
	private Button HaveYouPreviouslyBeenOnDebtSolutionClient02;
	private Button WhatisaDebtSolutionNoButtonforClient1_89940;

	private Button WhatTypesofJobsCouldbeAffectedNoButtonClient1;
	private Button WhatTypesofJobsCouldbeAffectedYesButtonClient1;
	private Button WhatisaDebtSolutionNoButtonClient1;
	private Button HaveTheyAppliedDroNoButtonClient1;
	private Button WhatTypesofJobsCouldbeAffectedNoButtonClient2;
	private Button WhatisaDebtSolutionNoButtonClient2;
	private Button HaveTheyAppliedDroNoButtonClient2;
	private Button WhatisaDebtSolutionNoButtonforClient2_89940;
	private Button WhatisaDebtSolutionNoButtonforClient2_89921_02;

	public Button getWhatTypesofJobsCouldbeAffectedYesButtonClient1() {
		return WhatTypesofJobsCouldbeAffectedYesButtonClient1;
	}

	//Getter Methods
	public Button getWhatTypesofJobsCouldbeAffectedNoButton() {
		return WhatTypesofJobsCouldbeAffectedNoButton;
	}
	public Button getWhatisaDebtSolutionNoButton() {
		return WhatisaDebtSolutionNoButton;
	}
	public Button getFinalQuestionsPageContinueButton() {
		return FinalQuestionsPageContinueButton;
	}


	public Button getEmploymentbeEffectedNoButton() {return EmploymentbeEffectedNoButton;}
	public Button getAwardedbankruptcyNoButton() {return AwardedbankruptcyNoButton;}
	public Button getMinimalAssetprocessNoButton() {return MinimalAssetprocessNoButton;}
	public Button getPreviouslybeenADebtSolution() {return PreviouslybeenADebtSolution;}

	public Button getWhatisaDebtSolutionNoButtonforClient1() {
		return WhatisaDebtSolutionNoButtonforClient1;
	}
	public Button getWhatisaDebtSolutionNoButtonforclient2() {
		return WhatisaDebtSolutionNoButtonforclient2;
	}
	public Button getEmployementBeEffectedInsolvencyYesButtonforclient2() {
		return EmployementBeEffectedInsolvencyYesButtonforclient2;
	}

	public Button getEmployementBeEffectedInsolvencyYesButtonforclient2No() {
		return EmployementBeEffectedInsolvencyYesButtonforclient2No;
	}

	public Button getHaveYouPreviouslyBeenOnDebtSolutionClient01(){return HaveYouPreviouslyBeenOnDebtSolutionClient01;}
	public Button getHaveYouPreviouslyBeenOnDebtSolutionClient02(){return HaveYouPreviouslyBeenOnDebtSolutionClient02;}

	public Button getWhatisaDebtSolutionNoButtonforClient1_89940(){
		return WhatisaDebtSolutionNoButtonforClient1_89940;
	}

	public Button getWhatTypesofJobsCouldbeAffectedNoButtonClient1() { return WhatTypesofJobsCouldbeAffectedNoButtonClient1; }
	public Button getWhatisaDebtSolutionNoButtonClient1() {
		return WhatisaDebtSolutionNoButtonClient1;
	}
	public Button getHaveTheyAppliedDroNoButtonClient1() {
		return HaveTheyAppliedDroNoButtonClient1;
	}
	public Button getWhatTypesofJobsCouldbeAffectedNoButtonClient2() { return WhatTypesofJobsCouldbeAffectedNoButtonClient2; }
	public Button getWhatisaDebtSolutionNoButtonClient2() {
		return WhatisaDebtSolutionNoButtonClient2;
	}
	public Button getHaveTheyAppliedDroNoButtonClient2() {
		return HaveTheyAppliedDroNoButtonClient2;
	}
	public Button getWhatisaDebtSolutionNoButtonforClient2_89940(){return WhatisaDebtSolutionNoButtonforClient2_89940;}
    public Button getWhatisaDebtSolutionNoButtonforClient2_89921_02(){return WhatisaDebtSolutionNoButtonforClient2_89921_02;}


	public FinalQuestionsPage() {
		HaveYouPreviouslyBeenOnDebtSolutionClient01=new Button(By.xpath("(//label[text()='No'])[1]"));
		HaveYouPreviouslyBeenOnDebtSolutionClient02=new Button(By.xpath("(//label[text()='No'])[2]"));
		WhatTypesofJobsCouldbeAffectedNoButton = new Button(By.xpath("(//label[text()='No'])[1]"));	
		WhatisaDebtSolutionNoButton = new Button(By.xpath("(//label[text()='No'])[2]"));
		FinalQuestionsPageContinueButton = new Button(By.xpath("//button[text()='Continue']"));
		EmploymentbeEffectedNoButton=new Button(By.xpath("(//label[text()='No'])[1]"));
		AwardedbankruptcyNoButton=new Button(By.xpath("(//label[text()='No'])[2]"));
		MinimalAssetprocessNoButton=new Button(By.xpath("(//label[text()='No'])[3]"));
		PreviouslybeenADebtSolution=new Button(By.xpath("(//label[text()='No'])[4]"));
		WhatisaDebtSolutionNoButtonforClient1= new Button(By.xpath("(//label[text()='No'])[1]"));
		WhatisaDebtSolutionNoButtonforclient2= new Button(By.xpath("(//label[text()='No'])[3]"));
		EmployementBeEffectedInsolvencyYesButtonforclient2= new Button(By.xpath("(//label[text()='Yes'])[2]"));
		EmployementBeEffectedInsolvencyYesButtonforclient2No= new Button(By.xpath("(//label[text()='No'])[2]"));

		WhatTypesofJobsCouldbeAffectedNoButtonClient1= new Button(By.xpath("//div[text()='Could employment be impacted by an insolvency solution?'][1]//following::label[2]"));
		WhatTypesofJobsCouldbeAffectedYesButtonClient1= new Button(By.xpath("//div[text()='Could employment be impacted by an insolvency solution?'][1]//following::label[1]"));
		WhatisaDebtSolutionNoButtonClient1= new Button(By.xpath("(//div[text()='Have you previously been on a debt solution?'])[1]//following::label[2]"));
		HaveTheyAppliedDroNoButtonClient1= new Button(By.xpath("((//div[text()='Have they applied for a Debt Relief Order which was approved in the last 6 years?'])[1])//following::label[2]"));
		WhatTypesofJobsCouldbeAffectedNoButtonClient2= new Button(By.xpath("(//div[text()='Could employment be impacted by an insolvency solution?'])[2]//following::label[2]"));
		WhatisaDebtSolutionNoButtonClient2= new Button(By.xpath("(//div[text()='Have you previously been on a debt solution?'])[2]//following::label[2]"));
		HaveTheyAppliedDroNoButtonClient2= new Button(By.xpath("(//div[text()='Have they applied for a Debt Relief Order which was approved in the last 6 years?'])[2]//following::label[2]"));
		WhatisaDebtSolutionNoButtonforClient1_89940=new Button(By.xpath("( //input[contains(@name,'QualifierList$ppxResults')])[2]"));
		WhatisaDebtSolutionNoButtonforClient2_89940=new Button(By.xpath("( //input[contains(@name,'QualifierList$ppxResults')])[4]"));
		WhatisaDebtSolutionNoButtonforClient2_89921_02=new Button(By.xpath("(//label[text()='No'])[3]"));
	}
//WhatisaDebtSolutionNoButtonforClient2_89921_02=new Button(By.xpath(//input[contains(@name,'QualifierList$ppxResults')])[7]

	public void ClickWhatTypesofJobsCouldbeAffectedNoButton() {
		genericMethodsCvp.implicitWait(2000);	
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);	
		this.getWhatTypesofJobsCouldbeAffectedNoButton().click();
		genericMethodsCvp.implicitWait(3000);
	}	
	
	public void ClickWhatisaDebtSolutionNoButton() {
		genericMethodsCvp.implicitWait(3000);
		this.getWhatisaDebtSolutionNoButton().click();
	}
	
	public void ClickFinalQuestionsPageContinueButton() {
		genericMethodsCvp.implicitWait(3000);
		this.getFinalQuestionsPageContinueButton().click();
		//genericMethodsCvp.implicitWait(3000);
	}
	public void FinalQuestionAction89921(){
		genericMethodsCvp.implicitWait(3000);
		this.getWhatisaDebtSolutionNoButtonforClient1().click();
		genericMethodsCvp.implicitWait(3000);
		this.getEmployementBeEffectedInsolvencyYesButtonforclient2No().click();
		genericMethodsCvp.implicitWait(3000);
        this.getWhatisaDebtSolutionNoButtonforClient2_89921_02().click();
		genericMethodsCvp.implicitWait(3000);
		this.getFinalQuestionsPageContinueButton().click();
		genericMethodsCvp.implicitWait(3000);

	}

	public void FillrequireddetailsasGuestUser()
	{
		switchToActiveFrame();
		this.getEmploymentbeEffectedNoButton().click();
		this.getAwardedbankruptcyNoButton().click();
		this.getMinimalAssetprocessNoButton().click();
		this.getPreviouslybeenADebtSolution().click();
		this.getFinalQuestionsPageContinueButton().click();

	}
	public void FillrequireddetailsasQASC89937() {
		genericMethodsCvp.implicitWait(2000);
		switchToActiveFrame();
		this.getEmploymentbeEffectedNoButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getAwardedbankruptcyNoButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getMinimalAssetprocessNoButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getPreviouslybeenADebtSolution().click();
		genericMethodsCvp.implicitWait(2000);
		this.getFinalQuestionsPageContinueButton().click();
	}

	public void FillFinalQuestions89924()
	{
		switchToActiveFrame();
		this.getEmploymentbeEffectedNoButton().click();
		this.getAwardedbankruptcyNoButton().click();
		this.getMinimalAssetprocessNoButton().click();
		this.getFinalQuestionsPageContinueButton().click();
		getBrowser().sleep(3000);

	}

	public void ClickWhatisaDebtSolutionNoButtonforclient1() {
		genericMethodsCvp.implicitWait(3000);
		this.getWhatisaDebtSolutionNoButtonforClient1().click();
	}
	public void ClickWhatisaDebtSolutionNoButtonforclient21() {
		genericMethodsCvp.implicitWait(3000);
		this.getWhatisaDebtSolutionNoButtonforClient2_89921_02().click();
	}

	public void ClickWhatisaDebtSolutionNoButtonforclient2() {
		genericMethodsCvp.implicitWait(3000);
		this.getWhatisaDebtSolutionNoButtonforClient2_89940().click();
	}
	public void ClickYesEmployeebeEffectedByInslolvencyforclient2() {
		genericMethodsCvp.implicitWait(3000);
		this.getEmployementBeEffectedInsolvencyYesButtonforclient2().click();
	}

	public void FinalQuestionsJointMPA()
	{
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
		this.getHaveYouPreviouslyBeenOnDebtSolutionClient01().click();
		genericMethodsCvp.implicitWait(2000);
		this.getHaveYouPreviouslyBeenOnDebtSolutionClient02().click();
		genericMethodsCvp.implicitWait(2000);
		this.getFinalQuestionsPageContinueButton().click();
		genericMethodsCvp.implicitWait(8000);


	}

	public void FillrequireddetailsForClient1and2for89949() {
		this.getWhatTypesofJobsCouldbeAffectedNoButtonClient1().click();
		this.getHaveTheyAppliedDroNoButtonClient1().click();
		this.getWhatisaDebtSolutionNoButtonClient1().click();
		this.getWhatTypesofJobsCouldbeAffectedNoButtonClient2().click();
		this.getHaveTheyAppliedDroNoButtonClient2().click();
		this.getWhatisaDebtSolutionNoButtonClient2().click();
		ClickFinalQuestionsPageContinueButton();

	}
	public void clickNoForAllFinalQuestions()
	{
		switchToActiveFrame();
		List<WebElement> noAnswers = getDriver().findElements(By.xpath("//label[.='No']"));
		for (int i = 1; i <= noAnswers.size() ; i++) {
			Button noButton=new Button(By.xpath("(//label[.='No'])["+i+"]"));
			noButton.click();
		}
	}

	public void selectNoForAllQuestion() {
		int totalQuestionHasNo=getDriver().findElements(By.xpath("(//div[@node_name='QualifierQuestion' and @index='1']//following::label[text()='No'])")).size();
		for (int i = 1; i <= totalQuestionHasNo; i++) {
			genericMethodsCvp.clickOnElementJse(By.xpath("(//div[@node_name='QualifierQuestion' and @index='1']//following::label[text()='No'])["+i+"]"));
			getBrowser().sleep(getBrowser().getTimeout() / 10);
			genericMethodsCvp.implicitWait(5000);
		}
	}
	public void devideAssetIntoEqualPortion(String totalWorth, String share)
	{
		new TextField(By.xpath("//input[contains(@name,'$ppxResults$l1$pAmount')]")).enterText(totalWorth);
		new TextField(By.xpath("//input[contains(@name,'$ppxResults$l1$pAmount')]")).tab();
		verifyOverLayDisplayed();
		new TextField(By.xpath("//input[contains(@name,'$ppxResults$l1$pOwnership$pExposureList$l1$pPercentage')]")).enterText(share);
		new TextField(By.xpath("//input[contains(@name,'$ppxResults$l1$pOwnership$pExposureList$l1$pPercentage')]")).tab();
		new Checkbox(By.xpath("//input[@name='$PpyWorkPage$pGenericFlag$gAssetInputComplete']/../label")).click();
	}
}
