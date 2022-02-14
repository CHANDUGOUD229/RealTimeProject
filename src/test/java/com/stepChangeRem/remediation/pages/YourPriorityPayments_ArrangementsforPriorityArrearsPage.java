package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Div;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourPriorityPayments_ArrangementsforPriorityArrearsPage extends Control {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	private Button BackToDashboard;
	private Div ArrangementForpriorityArrearsTitleDiv;
	private Div TotalAmountAvailableFordistributionValueDiv;
	private Div ArrangementInplaceForPriorityDebtsValueDiv;
	private Div AmountTowardsSuggestedArrangementsValueDiv;
	private Div AmountTowardsUnsecuredDebtsValueDiv;
	private Button CalculateArrangementsButton;
	private Div SummaryDebtsAmountOwnedValue;
	private Div SummaryIncomeValue;
	private Div Summaryspendingvalue;
	private Div SummaryAvailableForDebtsValue;
	private Dropdown ShowSummaryAsDropdown;
	private Button ArrangementsforPriorityArrearsPageContinueButton;
	private Button ArrangementsforPriorityArrearsPageBackButton;
	private Button WouldYouLikePutSavingsForMoneyYes;
    private Button SavingsPageContinue;
    private Button previousDebtSolutions;
    private Dropdown previousSolutionNoReason;



	//Getter Methods

	public Dropdown getPreviousSolutionNoReason() {
		return previousSolutionNoReason=new Dropdown(By.xpath("//select[contains(@name,'$pPreviousDebtSolutions$l1$pFailureReason')]"));
	}

	public Button getPreviousDebtSolutions() {
		return previousDebtSolutions=new Button(By.xpath("//input[contains(@name,'$pWasDebtSolutionSuccessful')]/../label[.='No']"));
	}

	public Button getBackToDashboard() {return BackToDashboard;}
	public Div getArrangementForpriorityArrearsTitleDiv() {return ArrangementForpriorityArrearsTitleDiv;}
	public Div getTotalAmountAvailableFordistributionValueDiv() {return TotalAmountAvailableFordistributionValueDiv;}
	public Div getArrangementInplaceForPriorityDebtsValueDiv() {return ArrangementInplaceForPriorityDebtsValueDiv;}
	public Div getAmountTowardsSuggestedArrangementsValueDiv() {return AmountTowardsSuggestedArrangementsValueDiv;}
	public Div getAmountTowardsUnsecuredDebtsValueDiv() {return AmountTowardsUnsecuredDebtsValueDiv;}
	public Button getCalculateArrangementsButton() {return CalculateArrangementsButton;}
	public Div getSummaryDebtsAmountOwnedValue() {return SummaryDebtsAmountOwnedValue;}
	public Div getSummaryIncomeValue() {return SummaryIncomeValue;}
	public Div getSummaryspendingvalue() {return Summaryspendingvalue;}
	public Div getSummaryAvailableForDebtsValue() {return SummaryAvailableForDebtsValue;}
	public Dropdown getShowSummaryAsDropdown() {return ShowSummaryAsDropdown;}
	public Button getArrangementsforPriorityArrearsPageContinueButton() {return ArrangementsforPriorityArrearsPageContinueButton;}
	public Button getArrangementsforPriorityArrearsPageBackButton() {return ArrangementsforPriorityArrearsPageBackButton;}
	private Button getWouldYouLikePutSavingsForMoneyYes(){return WouldYouLikePutSavingsForMoneyYes; }
    private Button getSavingsPageContinue(){return SavingsPageContinue;}

	//Constructor
	
	public YourPriorityPayments_ArrangementsforPriorityArrearsPage() {
		BackToDashboard=new Button(By.xpath("//button[text()='Back to dashboard']"));
		ArrangementForpriorityArrearsTitleDiv=new Div(By.xpath("//h1[@class='header-title']"));
	    TotalAmountAvailableFordistributionValueDiv=new Div(By.xpath("(//div[@class='content-item content-field item-2 remove-top-spacing remove-bottom-spacing flex flex-row margin-0 priority-total_amount dataValueRead custom-control'])[1]"));
		ArrangementInplaceForPriorityDebtsValueDiv=new Div(By.xpath("(//div[@class='content-item content-field item-2 remove-top-spacing remove-bottom-spacing flex flex-row margin-0 priority-total_amount dataValueRead custom-control'])[2]"));
		AmountTowardsSuggestedArrangementsValueDiv=new Div(By.xpath("(//div[@class='content-item content-field item-2 remove-top-spacing remove-bottom-spacing flex flex-row margin-0 priority-total_amount dataValueRead custom-control'])[3]"));
		AmountTowardsUnsecuredDebtsValueDiv=new Div(By.xpath("(//div[@class='content-item content-field item-2 remove-top-spacing remove-bottom-spacing flex flex-row margin-0 priority-total_amount dataValueRead custom-control'])[4]"));
	    CalculateArrangementsButton=new Button(By.xpath("//button[text()='Calculate arrangements']"));
		SummaryDebtsAmountOwnedValue=new Div(By.xpath("(//div[@class='content-item content-field item-2 flex flex-row mobile--font-size--md dataValueRead'])[1]/span"));
		SummaryIncomeValue=new Div(By.xpath("(//div[@class='content-item content-field item-2 flex flex-row mobile--font-size--md dataValueRead'])[2]/span"));
		Summaryspendingvalue=new Div(By.xpath("(//div[@class='content-item content-field item-2 flex flex-row mobile--font-size--md dataValueRead'])[3]"));
	    SummaryAvailableForDebtsValue=new Div(By.xpath("(//div[@class='content-item content-field item-2 flex flex-row mobile--font-size--md dataValueRead'])[4]"));
		ShowSummaryAsDropdown=new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pBudgetSummaryFrequency']"));
		ArrangementsforPriorityArrearsPageBackButton=new Button(By.xpath("//button[text()='back']"));
		ArrangementsforPriorityArrearsPageContinueButton = new Button(By.xpath("//button[@name='PriorityArrears_pyWorkPage_87']"));
		WouldYouLikePutSavingsForMoneyYes=new Button(By.xpath("//label[text()='Yes']"));
		SavingsPageContinue=new Button(By.xpath("//button[text()='Continue']"));
	}


	public void ClickArrangementsforPriorityArrearsPageContinueButton() {
		genericMethodsCvp.implicitWait(3000);
		switchToActiveFrame();
		this.getArrangementsforPriorityArrearsPageContinueButton().click();
		genericMethodsCvp.implicitWait(3000);
	}

	public void ClickArrangementsforPriorityArrearsPageJointMPA()
	{
		genericMethodsCvp.implicitWait(2000);
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(6000);
		this.getCalculateArrangementsButton().click();
		genericMethodsCvp.implicitWait(10000);
		this.getArrangementsforPriorityArrearsPageContinueButton().click();
		genericMethodsCvp.implicitWait(2000);

	}
	
	public void savingAmountJointMPA()
	{
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
        this.getWouldYouLikePutSavingsForMoneyYes().click();
		genericMethodsCvp.implicitWait(8000);
        this.getSavingsPageContinue().click();
		genericMethodsCvp.implicitWait(8000);

	}
	
	
	
}
