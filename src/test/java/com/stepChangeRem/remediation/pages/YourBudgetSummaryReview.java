package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Div;
import com.stepchange.atf.controls.TextField;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourBudgetSummaryReview extends Control{
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	
	private Button BackToDashboardButton;
	private Div YourBudgetSummaryTitleDiv;
	private Div YourIncomeValue;
	private Div YourSpendingValue;
	private Div AvailableForYourDebtsValue;
	private Button BudgetSummaryContinueButton;
	private Button BudgetSummaryBackButton;
	private TextField BudgetSummaryCommentTextArea;
	private Button BudgetSummaryPostButton;
	
	//getters
	
	public Button getBackToDashboardButton(){return BackToDashboardButton;}
	public Div getYourBudgetSummaryTitleDiv() {return YourBudgetSummaryTitleDiv;}
	public Div getYourIncomeValue() {return YourIncomeValue;}
	public Div getYourSpendingValue() {return YourSpendingValue;}
	public Div getAvailableForYourDebtsValue() {return AvailableForYourDebtsValue;}
	public Button getBudgetSummaryContinueButton() {return BudgetSummaryContinueButton;}
	public Button getBudgetSummaryBackButton() {return BudgetSummaryBackButton;}
	public TextField getBudgetSummaryCommentTextArea() {return BudgetSummaryCommentTextArea;}
	public Button getBudgetSummaryPostButton() {return BudgetSummaryPostButton;}
	
	//Constructor
	public YourBudgetSummaryReview() {
		
		BackToDashboardButton=new Button(By.xpath("//button[text()='Back to dashboard']"));
		YourBudgetSummaryTitleDiv=new Div(By.xpath("//h1[@class='header-title']"));
		YourIncomeValue=new Div(By.xpath("//span[@data-test-id='20171109145857045611457']"));
		YourSpendingValue=new Div(By.xpath("//p[@name='$PpyWorkPage$pNewAgreedTotalMonthlyExpWithAIP']"));
		AvailableForYourDebtsValue=new Div(By.xpath("//p[@name='$PpyWorkPage$pNewAgreedTotalMonthlyDifference']"));
		BudgetSummaryContinueButton =new Button(By.xpath("//button[normalize-space()='Continue']"));
		BudgetSummaryBackButton=new Button(By.xpath("//button[text()='Back']"));
		BudgetSummaryCommentTextArea=new TextField(By.xpath("//textarea[@name='$PD_pxRenderPosts_pa4408941815856240pz$ppyPostPage$ppyMessage']"));
		BudgetSummaryPostButton=new Button(By.xpath("//button[text()='Post']"));
	}
//	public void ClickContinueOnBudgetSummarypage()
//	{
//		genericMethodsCvp.implicitWait(1000);
//		switchToActiveFrame();
//		genericMethodsCvp.clickOnElementJse(this.getBudgetSummaryContinueButton());
//		genericMethodsCvp.implicitWait(1000);
//	}


	public void ClickContinueOnBudgetSummarypage()
	{
		genericMethodsCvp.implicitWait(5000);
		switchToActiveFrame();
		this.getBudgetSummaryContinueButton().click();
		getBrowser().sleep(10000);
		genericMethodsCvp.implicitWait(5000);
		/*this.getBudgetSummaryContinueButton().click();
		genericMethodsCvp.implicitWait(5000);*/
	}

	public void ClickContinueOnBudgetSummarypage89940()
	{
		genericMethodsCvp.implicitWait(5000);
		switchToActiveFrame();
		this.getBudgetSummaryContinueButton().click();
		getBrowser().sleep(10000);
		genericMethodsCvp.implicitWait(5000);
		this.getBudgetSummaryContinueButton().click();
		genericMethodsCvp.implicitWait(5000);
	}
	public void ActionOnYourBugdetSummaryContinueButton () {

		genericMethodsCvp.implicitWait(1000);
		switchToActiveFrame();
		this.getBudgetSummaryContinueButton().click();
		genericMethodsCvp.implicitWait(1000);

	}


}
