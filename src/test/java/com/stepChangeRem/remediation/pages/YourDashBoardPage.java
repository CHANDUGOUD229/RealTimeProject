package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourDashBoardPage extends Control {
	GenericMethodsRemediation GenericMethods_cvp=new GenericMethodsRemediation();
	private By AboutYouButton;
	private Button undesrStandYourSituation;
	private Button YourHouseholdButton;
	private By YourDebtsButton;
	private Button YourDebtsJointMPA;
	private By CreatingYourBudgetButton;
	private By YourIncomeButton;
	private By YourSpendingButton;
	private By AdviceOnYourBudgetButton;
	private By FinalQuestionsButton;
	private By YourPriorityPaymentsButton;
	private By ReviewYourOptionsButton;
	private By YourChoosenSolutionButton;
	private Div aboutYouLocked;
	private Div SummaryYourDebtsValue;
	private Div SummaryYourMonthlyIncomeValue;
	private Div SummaryYourMonthlySpendingvalue;
	private Div SummaryAvailableForDebtsvalue;
	private Button UnderstandYourSituationMakeChangesButton;
	private Button CreateYourBudgetMakeChangesButton;
	private Button YourDebtAdviceMakeChangesButton;
	private TextField DashboardCommentsTextarea;
	private Button DashboardPostButton;
	private Button MakeChangesPopupConfirmButton;
	private Button MakeChangesPopupCancelButton;
	
	private Button threeDotRightCornerButton;
	private Button AfterThreeDotOptionNonProceedCase;
	private Button YourIncomeJointMPA;

	//Getters

	public Button getUndesrStandYourSituation() {
		switchToActiveFrame();
		return undesrStandYourSituation=new Button(By.xpath("//div[.='Understand your situation']"));
	}

	public By getAboutYouButton() { return AboutYouButton; }
	public Button getYourHouseholdButton() { return YourHouseholdButton;}
	public By getYourDebtsButton() { return YourDebtsButton; }
	public By getCreatingYourBudgetButton() { return CreatingYourBudgetButton; }
	public By getYourIncomeButton() { return YourIncomeButton; }
	public By getYourSpendingButton() { return YourSpendingButton;}
	public By getAdviceOnYourBudgetButton() {return AdviceOnYourBudgetButton;}
	public By getFinalQuestionsButton() {return FinalQuestionsButton;}

	public By getYourPriorityPaymentsButton() {return YourPriorityPaymentsButton;}
	public By getReviewYourOptionsButton() {return ReviewYourOptionsButton;}
	public By getYourChoosenSolutionButton() {return YourChoosenSolutionButton;}
	public Div getaboutYouLocked() {return aboutYouLocked;	}
	public Div getSummaryYourDebtsValue() {return SummaryYourDebtsValue;}
	public Div getSummaryYourMonthlyIncomeValue() {return SummaryYourMonthlyIncomeValue;}
	public Div getSummaryYourMonthlySpendingvalue() {return SummaryYourMonthlySpendingvalue;}
	public Div getSummaryAvailableForDebtsvalue() {return SummaryAvailableForDebtsvalue;}
	public Button getUnderstandYourSituationMakeChangesButton() {return UnderstandYourSituationMakeChangesButton;}
	public Button getCreateYourBudgetMakeChangesButton() {return CreateYourBudgetMakeChangesButton ;}
	public Button getYourDebtAdviceMakeChangesButton( ) {return YourDebtAdviceMakeChangesButton;}
	public TextField getDashboardCommentsTextarea() {return DashboardCommentsTextarea;}
	public Button getDashboardPostButton() {return DashboardPostButton;}
	public Button getMakeChangesPopupConfirmButton() {return MakeChangesPopupConfirmButton;}
	public Button getMakeChangesPopupCancelButton() {return MakeChangesPopupCancelButton;}
	
	public Button getthreeDotRightCornerButton() {return threeDotRightCornerButton;	}
	public Button getAfterThreeDotOptionNonProceedCase() {return AfterThreeDotOptionNonProceedCase;	}

	private Button MakeChangesinUnderstandYourSituationButton;
	private Button AreuSureMakeChangesConfirmButton;
	public Button getAreuSureMakeChangesConfirmButton() {
		return AreuSureMakeChangesConfirmButton;
	}
	public Button getMakeChangesinUnderstandYourSituationButton() {
		return MakeChangesinUnderstandYourSituationButton;
	}
	public Button getYourDebtsJointMPA(){return YourDebtsJointMPA;}
	public Button getYourDebtsLink(){return new Button(By.xpath("(//div[text()='Your debts'])[4]"));}
	public Button getYourSpendigsLink(){
		switchToActiveFrame();
		return new Button(By.xpath("(//div[text()='Your spending'])[4]"));}
	public Button getYourIncomeJointMPA(){return YourIncomeJointMPA; }
	//Constructors
	public YourDashBoardPage() {

		AboutYouButton = By.xpath("(//div[text()='About you'])[4]");
		YourHouseholdButton = new Button(By.xpath("(//div[text()='Your household'])[2]"));
		YourDebtsButton = By.xpath("(//div[text()='Your debts'])[2]");
		YourDebtsJointMPA = new Button(By.xpath("(//div[text()='Your debts'])[2]"));
		YourIncomeJointMPA = new Button(By.xpath("(//div[text()='Your income'])[4]"));
		CreatingYourBudgetButton = By.xpath("(//div[text()='Creating your budget']//preceding-sibling::div)[4]");
		YourIncomeButton = By.xpath("(//div[text()='Your income'])[4]");
		YourSpendingButton = By.xpath("(//div[text()='Your spending'])[4]");
		AdviceOnYourBudgetButton = By.xpath("(//div[text()='Advice on your budget'])[4]");
		FinalQuestionsButton = By.xpath("(//div[text()='Final questions'])[4]");
		YourPriorityPaymentsButton = By.xpath("(//div[text()='Your priority payments'])[4]");
		ReviewYourOptionsButton = By.xpath("(//div[text()='Review your options'])[4]");
		YourChoosenSolutionButton = By.xpath("(//div[text()='Your chosen solution'])[4]");
		aboutYouLocked = new Div(By.xpath("(//i[@alt='Locked'])[4]"));
		SummaryYourDebtsValue = new Div(By.xpath("(//span[@data-test-id='20171109145857045611457'])[1]"));
		SummaryYourMonthlyIncomeValue = new Div(By.xpath("(//span[@data-test-id='20171109145857045611457'])[2]"));
		SummaryYourMonthlySpendingvalue = new Div(By.xpath("(//p[@name='$PpyWorkPage$pNewAgreedTotalMonthlyExpWithAIP'])[1]"));
		SummaryAvailableForDebtsvalue = new Div(By.xpath("//span[@data-test-id='201712081247000543207658']"));
		UnderstandYourSituationMakeChangesButton = new Button(By.xpath("(//button[text()='Make changes'])[1]"));
		CreateYourBudgetMakeChangesButton = new Button(By.xpath("(//div[.='Creating your budget'])[4]"));
		YourDebtAdviceMakeChangesButton = new Button(By.xpath("(//button[text()='Make changes'])[3]"));
		DashboardCommentsTextarea = new TextField(By.xpath("//textarea[@name='$PD_pxRenderPosts_pa4408941815856240pz$ppyPostPage$ppyMessage']"));
		DashboardPostButton = new Button(By.xpath("//button[text()='Post']"));
		MakeChangesPopupConfirmButton = new Button(By.name("AreYouSureYouWantToMakeChanges_D_Dashboard_pa4412441550768769pz.pxResults(1)_14"));
		MakeChangesPopupCancelButton = new Button(By.name("AreYouSureYouWantToMakeChanges_D_Dashboard_pa4412441550768769pz.pxResults(1)_11"));
		threeDotRightCornerButton = new Button(By.xpath("//i[contains(@class,'pi pi-more pi-blue pi-medium')]"));
		AfterThreeDotOptionNonProceedCase = new Button(By.xpath("//span[contains(text(),'Non proceed case')]"));
		MakeChangesinUnderstandYourSituationButton = new Button(By.xpath("(//button[text()='Make changes'])[1]"));
		AreuSureMakeChangesConfirmButton = new Button(By.xpath("//button[text()='Confirm']"));
	}

	public void ActionOnTreeDotAndNonProcessCaseSC89937() {
		GenericMethods_cvp.implicitWait(1000);
		this.getthreeDotRightCornerButton().click();
		GenericMethods_cvp.implicitWait(2000);
		this.getAfterThreeDotOptionNonProceedCase().click();
	}

	public void ClickOnAboutYouButton() {

		GenericMethods_cvp.implicitWait(3000);	
		GenericMethods_cvp.clickOnElementJse(this.getAboutYouButton());	
	}

	public void NavigateToSpendingFixedAsJointMPA()
	{
		switchToActiveFrame();
		GenericMethods_cvp.implicitWait(4000);
		ClickOnCreatingYourBudgetButton();
		GenericMethods_cvp.implicitWait(2000);
		switchToActiveFrame();
		GenericMethods_cvp.implicitWait(2000);
		getBrowser().scrollDown();
		GenericMethods_cvp.implicitWait(6000);
		GenericMethods_cvp.getContinueButton().click();
		GenericMethods_cvp.implicitWait(5000);
		switchToActiveFrame();
		GenericMethods_cvp.implicitWait(2000);
		getBrowser().scrollDown();
		GenericMethods_cvp.getContinueButton().click();
		GenericMethods_cvp.implicitWait(28000);


	}
	public void NavigateToDebtsAsJointMPA()
	{
		getBrowser().sleep(getBrowser().getTimeout()/10);
		switchToActiveFrame();
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getYourDebtsJointMPA().click();
		GenericMethods_cvp.implicitWait(3000);
	}
	public void NavigateToYourIncomepageJointMPA()
	{
		getBrowser().sleep(getBrowser().getTimeout()/10);
		switchToActiveFrame();
		getBrowser().sleep(getBrowser().getTimeout()/10);
        this.getYourIncomeJointMPA().click();
		GenericMethods_cvp.implicitWait(3000);
	}

	public void ClickYourHouseholdButton()
	{
		switchToActiveFrame();
		this.getYourHouseholdButton().click();
	}
	
	public void ClickOnYourHouseHoldButton() {
		
		GenericMethods_cvp.implicitWait(3000);
		switchToActiveFrame();
		GenericMethods_cvp.implicitWait(5000);
		GenericMethods_cvp.verifyOverLayDisplayed();
		GenericMethods_cvp.implicitWait(5000);
		this.getYourHouseholdButton().click();
		GenericMethods_cvp.implicitWait(5000);
		GenericMethods_cvp.verifyOverLayDisplayed();
	}

	public void ClickOnYourDebtsButton() {
		GenericMethods_cvp.clickOnElementJse(this.getYourDebtsButton());
	}
	
	public void ClickOnCreatingYourBudgetButton() {
		GenericMethods_cvp.clickOnElementJse(this.getCreatingYourBudgetButton());
	}
	
	public void ClickOnYourIncomeButton() {
		GenericMethods_cvp.clickOnElementJse(this.getYourIncomeButton());
	}
	
	public void ClickOnYourSpendingButton() {


		GenericMethods_cvp.implicitWait(3000);
		switchToActiveFrame();
		GenericMethods_cvp.implicitWait(1000);
		//	GenericMethods_cvp.verifyOverLayDisplayed();
		//this.getYourSpendingButton().click();
		//GenericMethods_cvp.implicitWait(3000);
		GenericMethods_cvp.clickOnElementJse(this.getYourSpendingButton());
	}

	public void ClickOnYourSpendingButton_89939() {


		GenericMethods_cvp.implicitWait(3000);
		switchToActiveFrame();
		GenericMethods_cvp.implicitWait(1000);
		GenericMethods_cvp.clickOnElementJse(By.xpath("(//div[text()='Your spending'])[4]"));
	}
	
	public void ClickOnAdviceOnYourBudgetButton() {
		GenericMethods_cvp.implicitWait(3000);
		switchToActiveFrame();
		GenericMethods_cvp.implicitWait(5000);
		GenericMethods_cvp.clickOnElementJse(this.getAdviceOnYourBudgetButton());
	}


	public void ClickOnFinalQuestionstButton() {
		GenericMethods_cvp.implicitWait(3000);
		switchToActiveFrame();
		GenericMethods_cvp.implicitWait(8000);
		GenericMethods_cvp.clickOnElementJse(this.getFinalQuestionsButton());
		GenericMethods_cvp.implicitWait(5000);
	}
	
	public void ClickOnYourPriorityPaymentsButton() {
		switchToActiveFrame();
		GenericMethods_cvp.clickOnElementJse(this.getYourPriorityPaymentsButton());
	}

	public void ClickonCreateYourBudgetButton()
	{
		switchToActiveFrame();
		this.getCreateYourBudgetMakeChangesButton().click();
	}
	public void ClickOnReviewYourOptionsButton() {
		switchToActiveFrame();
		GenericMethods_cvp.implicitWait(5000);
		GenericMethods_cvp.clickOnElementJse(this.getReviewYourOptionsButton());
		GenericMethods_cvp.implicitWait(5000);

	}
	
	public void ClickOnYourChoosenSolutionButton() {
		GenericMethods_cvp.clickOnElementJse(this.getYourChoosenSolutionButton());
	}
	
	
	public void verifyIsAboutYouLocked()
	{
		aboutYouLocked.isElementDisplayed();		
	}
//	public void ClickonCreateYourBudgetButton()
//	{
//		switchToActiveFrame();
//		this.getCreateYourBudgetMakeChangesButton().click();
//	}

	public void ClickOnMakeChangesinUnderstandYourSituationButton() {
		this.getMakeChangesinUnderstandYourSituationButton().click();
	}
	public void ClickOnAreuSureMakeChangesConfirmButton() {
		this.getAreuSureMakeChangesConfirmButton().click();
	}

	public void checkBoxForAllCaptured() {
		GenericMethods_cvp.implicitWait(10000);
		new Checkbox(By.xpath("//input[@name='$PpyWorkPage$pGenericFlag$gCICInputComplete']/../label")).click();
	}

	public void assetInputCompleteCheckbox() {
		switchToActiveFrame();
		new Checkbox(By.xpath("//input[@name='$PpyWorkPage$pGenericFlag$gAssetInputComplete']/../label")).click();
	}
}
