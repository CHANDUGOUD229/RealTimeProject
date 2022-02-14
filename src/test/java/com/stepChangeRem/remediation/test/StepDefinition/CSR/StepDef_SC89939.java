package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class StepDef_SC89939 extends CucumberGenericTest {
	public static WebDriver driver;
	public GenericMethodsRemediation genericMethods;
	public LogWriter writer = new LogWriter();
	public String featurefile="";
	Control control;

	AccountRegistration accountRegistrationPage;
	ClientSearchPage clientSearchPage;
	ConfirmEmailAddressPage confirmEmailAddress;
	CreateYourBudget createYourBudget;
//	DashBoardPageP dashBordPPage;
	EndSessionDebtAdviceCompleted endSessionDebtAdvicePage;
	EstablishClientNeedsPage establishClientNeedPageObj;
	ExplainTheProcessPage explainTheProcessPageObj;
	FinalQuestions_AssetsPage finalQuestionPage;
	FinalQuestions_FutureChangesPage finalQuestionFutureChange;
	FinalQuestionsPage finalQuestionMainPage;
	Homepage homePageObj;
	LoginPage loginPageObj;
	ReviewYourBudget reviewYourBudgetPage;
	ReviewYourOptionsPage ReviewYourOptionObj;
	YourBudgetSummaryReview YourBudgetSummaryReviewPage;
	YourChoosenSolution_YourAdviceSessionIsCompletePage yourChoosenSolutionActiveSession;
	YourDashBoardPage yourDashBordPageObj;
	YourDebtsPage yourDebtPageObj;
	YourHouseHoldPage yourHousholdPageObj;
	YourIncomePage yourIncomePageObj;
	YourPriorityPayments_ArrangementsforPriorityArrearsPage yourPriorityPaymentsArrearsPage;
	YourPriorityPayments_ConsiderSaveSmallAmountPage considersmallAmountSavingpage;

	YourSpendingFixedCost yourSpendingFixedPage;
	YourSpendingFlexibleCost yourSpendingFlexiblePage;
	CaptureReferralPage captureReferalObj;
	ReviewYourOptions_YourAdvicePrinciplesPage OurAdvicePrinciplespage ;
	YouAreAllDonePage youAreAllDone;
	CaseDetailPageAdminViewReadOnlyView CaseDetailsPageAdminAndViewOnlyOption;
	CaptureReasonForNonProceedPage ReasoneForNonPorcessCasePage;

	
	
	public StepDef_SC89939() {
		control=new Control() {
			@Override
			public void switchToActiveFrame() {
				super.switchToActiveFrame();
			}
		};
		considersmallAmountSavingpage = new YourPriorityPayments_ConsiderSaveSmallAmountPage();
		genericMethods=new GenericMethodsRemediation();
		accountRegistrationPage = new AccountRegistration();
		clientSearchPage = new ClientSearchPage();
		confirmEmailAddress = new 	ConfirmEmailAddressPage();
		createYourBudget = new CreateYourBudget();
//		dashBordPPage = new DashBoardPageP();
		endSessionDebtAdvicePage = new EndSessionDebtAdviceCompleted();
		establishClientNeedPageObj = new EstablishClientNeedsPage();
		explainTheProcessPageObj = new ExplainTheProcessPage();
		finalQuestionPage = new FinalQuestions_AssetsPage();
		finalQuestionFutureChange = new FinalQuestions_FutureChangesPage();
		finalQuestionMainPage = new FinalQuestionsPage();
		homePageObj = new Homepage();
		loginPageObj = new LoginPage();
		reviewYourBudgetPage = new ReviewYourBudget();
		ReviewYourOptionObj = new ReviewYourOptionsPage();
		YourBudgetSummaryReviewPage = new YourBudgetSummaryReview();
		yourChoosenSolutionActiveSession = new YourChoosenSolution_YourAdviceSessionIsCompletePage();
		yourDashBordPageObj = new YourDashBoardPage();
		yourDebtPageObj = new YourDebtsPage();
		yourHousholdPageObj = new YourHouseHoldPage();
		yourPriorityPaymentsArrearsPage = new YourPriorityPayments_ArrangementsforPriorityArrearsPage();
		yourIncomePageObj = new YourIncomePage();
		yourSpendingFixedPage = new YourSpendingFixedCost();
		yourSpendingFlexiblePage = new YourSpendingFlexibleCost();
		captureReferalObj = new CaptureReferralPage();
		OurAdvicePrinciplespage = new ReviewYourOptions_YourAdvicePrinciplesPage();
		
		youAreAllDone = new YouAreAllDonePage();
		CaseDetailsPageAdminAndViewOnlyOption = new CaseDetailPageAdminViewReadOnlyView();
		ReasoneForNonPorcessCasePage = new CaptureReasonForNonProceedPage();
	}
	

	@When("^In 'Capture Referral Organisation' capture given data$")
	public void in_Capture_Referral_Organisation_capture_given_data()  {
	    
	    
	}

	@Then("^Register case$")
	public void register_case() throws InterruptedException {
		establishClientNeedPageObj.fillClient1andClient2Details_89939("","","25","","","29");
		explainTheProcessPageObj.createAccount();
		accountRegistrationPage.fillAccountRegnFormClient1();
		accountRegistrationPage.fillAccountRegnFormClient2();
		accountRegistrationPage.createAccount();
	    
	}

	@Then("^Navigate to 'Your Household' page and Enter given data$")
	public void navigate_to_Your_Household_page_and_Enter_given_data()  {
		getBrowser().sleep(3000);
		yourDashBordPageObj.ClickOnYourHouseHoldButton();
		yourHousholdPageObj.submitHouseHoldPageWithValidData89939();
		genericMethods.implicitWait(5000);
		getBrowser().sleep(3000);
		getDriver().findElement(By.xpath("(//button[normalize-space()='Continue'])[2]")).click();
//		yourDebtPageObj.clickContinueButton();


	}

	@Then("^From the debts page navigate to the 'Income' page via the top menu enter the data$")
	public void from_the_debts_page_navigate_to_the_Income_page_via_the_top_menu_enter_the_data()  {
		getBrowser().sleep(3000);
		yourDashBordPageObj.ClickOnYourIncomeButton();
		getBrowser().sleep(3000);
		yourIncomePageObj.getMonthlyWagsEarnings().enterText("600");
		yourIncomePageObj.getMonthly().selectFromDropdownByIndex(4);
		genericMethods.scrollIntoViewElement(By.xpath("(//button[normalize-space()='Continue'])[2]"));
		yourIncomePageObj.getContinueYourIncomeButton().click();
//		yourDebtPageObj.clickContinueButton();
		getBrowser().sleep(7000);
//		genericMethods.scrollIntoViewElement(By.xpath("(//button[normalize-space()='Continue'])[2]"));
//		getDriver().findElement(By.xpath("(//button[normalize-space()='Continue'])[2]")).click();

	}

	@Then("^Using the Back button navigate back to the 'Debts' page and enter the data$")
	public void using_the_Back_button_navigate_back_to_the_Debts_page_and_enter_the_data() throws InterruptedException {
		genericMethods.implicitWait(10000);
		//getBrowser().sleep(5000);
		genericMethods.waitForAnObjectToBeVisible(By.xpath("//a[contains(@name,'BackToDashboard_pyWorkPage')]"),3000);
		genericMethods.implicitWait(5000);
		getDriver().findElement(By.xpath("//a[contains(@name,'BackToDashboard_pyWorkPage')]")).click();
		genericMethods.implicitWait(5000);
		yourDashBordPageObj.ClickOnYourDebtsButton();
		genericMethods.implicitWait(5000);
		yourDebtPageObj.yourDebtsWithMultipleCreditor_89939(
				"HSBC",
				"1700",
				"Natwest",
				"Credit card",
				"3000",
				"Halifax",
				"Credit card",
				"1200");
		getBrowser().sleep(3000);
		genericMethods.scrollIntoViewElement(By.xpath("(//button[normalize-space()='Continue'])[2]"));
		getBrowser().sleep(3000);
		getDriver().findElement(By.xpath("(//button[normalize-space()='Continue'])[2]")).click();
		getBrowser().sleep(5000);
	}

	@Then("^Navigate linear through the screens to the 'Spending Fixed Costs' page and enter the data$")
	public void navigate_linear_through_the_screens_to_the_Spending_Fixed_Costs_page_and_enter_the_data()  {
		yourDashBordPageObj.ClickOnYourSpendingButton_89939();
		yourSpendingFixedPage.enterDataAsPer89939();

	}

	@Then("^Navigate via the top menu to the 'Income' page and complete the data$")
	public void navigate_via_the_top_menu_to_the_Income_page_and_complete_the_data() throws InterruptedException {
		genericMethods.implicitWait(10000);
		Thread.sleep(7000);
		getBrowser().sleep(11000);
		control.switchToActiveFrame();
		genericMethods.scrollIntoViewElement(By.xpath("(//i[@class='cursordefault icons pi pi-circle']//following::a[contains(text(),'Your income')][1])"));
//		genericMethods.clickOnElementJse(By.cssSelector("a[name=\"DashboardItemLevel_D_Dashboard_pa595016163767804pz.pxResults(2).pxResults(2)_8\"]"));
		getDriver().findElement(By.xpath("(//i[@class='cursordefault icons pi pi-circle']//following::a[contains(text(),'Your income')][1])")).click();
//		getDriver().findElement(By.cssSelector("a[name='DashboardItemLevel_D_Dashboard_pa595016163767804pz.pxResults(2).pxResults(2)_8']")).click();
//		yourSpendingFlexiblePage.getYourSpendingFlexibleCostBackToDashboardButton().click();
		genericMethods.implicitWait(9000);
		getBrowser().sleep(3000);
//		yourDashBordPageObj.ClickOnYourIncomeButton();
		genericMethods.implicitWait(9000);
		getBrowser().sleep(3000);
		yourIncomePageObj.enterDataFor89939();

	    
	}

	@Then("^Navigate Back to Debts and verify New Linked record has been created$")
	public void navigate_Back_to_Debts_and_verify_New_Linked_record_has_been_created()  {
	    yourDashBordPageObj.ClickOnYourDebtsButton();
	    getBrowser().sleep(9000);
//	    genericMethods.scrollIntoViewElement(By.xpath("//span[text()='Electricity arrears']"));
//	    String verifyElectricityArrears=getDriver().findElement(By.xpath("//span[text()='Electricity arrears']")).getText();
//		Assert.assertEquals("Electricity arrears - added to debts screen","Electricity arrears",verifyElectricityArrears);
//		getBrowser().sleep(5000);
		getDriver().findElement(By.xpath("//*[@name='$PpyWorkPage$pGenericFlag$gDebtInputComplete']/../label")).click();
		getBrowser().sleep(5000);
		genericMethods.scrollIntoViewElement(By.xpath("(//input[@name='$PpyWorkPage$pDoesClientHaveGuarantor']/../label)[2]"));
		genericMethods.implicitWait(5000);
		yourDebtPageObj.getDoTheyGuarantorWhoWillBecomeResponsibleNoButton().click();
		genericMethods.implicitWait(5000);
		yourDebtPageObj.getDoTheyDisputeBalanceNoButton().click();
		genericMethods.implicitWait(5000);
		yourDebtPageObj.getDoTheyBelieveStatueBarredorPrescribedQuestionNoButton().click();
		genericMethods.implicitWait(5000);
		yourDebtPageObj.getSubmitButtonInGlobalQuestionsAlert().click();
		genericMethods.implicitWait(5000);
		//yourDebtPageObj.getYourDebtsContinueButton().click();
		//Changed actions class as submit is not working.
		Actions actions = new Actions(getDriver());
		WebElement element = getDriver().findElement(By.xpath("//*[@name='LiabilityDetails_pyWorkPage_59']"));
		actions.moveToElement(element).click().perform();
		genericMethods.implicitWait(5000);
		yourDebtPageObj.clickContinueButton();
		getBrowser().sleep(20000);
	}

	@Then("^Navigate to the 'Spending Flexible Costs' page and enter the following data$")
	public void navigate_to_the_Spending_Flexible_Costs_page_and_enter_the_following_data()  {
	    yourDashBordPageObj.ClickOnYourSpendingButton();
	    getBrowser().sleep(6000);
	    genericMethods.implicitWait(6000);
//	    yourSpendingFixedPage.getContinueYourFixedSpendingButton().click();
		getDriver().findElement(By.xpath("//a[text()='Flexible Costs']")).click();
		genericMethods.implicitWait(6000);
		getBrowser().sleep(9000);
	    yourSpendingFlexiblePage.getMonthlyFoodAndGroceries().enterText("190");
		yourSpendingFlexiblePage.getMonthlyFoodAndGroceries().tab();
		genericMethods.implicitWait(3000);
	    yourSpendingFlexiblePage.getFoodAndGroceriesmonthlyDropdown().selectFromDropdownByIndex(4);
		genericMethods.implicitWait(3000);
		// CLothing and Footwear
		yourSpendingFlexiblePage.getClothingAndFootwearTextbox().enterTextField("10");
		yourSpendingFlexiblePage.getClothingAndFootwearTextbox().tab();
		genericMethods.implicitWait(3000);
		yourSpendingFlexiblePage.getClothingAndFootwearMonthlyDropdown().selectFromDropdownByIndex(4);
		genericMethods.implicitWait(3000);
	    yourSpendingFlexiblePage.removeOptionsAsPer89939();
		genericMethods.scrollIntoViewElement(By.xpath("//*[@name='$PpyWorkPage$pGenericFlag$gFlexibleExpenditureComplete']/../label"));
		getDriver().findElement(By.xpath("//*[@name='$PpyWorkPage$pGenericFlag$gFlexibleExpenditureComplete']/../label")).click();
		genericMethods.implicitWait(5000);
		getDriver().findElement(By.xpath("(//button[normalize-space()='Continue'])")).click();
		genericMethods.implicitWait(5000);
		getBrowser().sleep(9000);
	}

	@Then("^Add no 'Assets' or 'Future Changes'$")
	public void add_no_Assets_or_Future_Changes()  {
		genericMethods.implicitWait(5000);
		yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();
		getBrowser().sleep(6000);
		genericMethods.implicitWait(5000);
		reviewYourBudgetPage.ActionOnShowSummaryContinueButton();
		getBrowser().sleep(6000);
		YourBudgetSummaryReviewPage.ActionOnYourBugdetSummaryContinueButton();
		genericMethods.implicitWait(10000);
	}

	@Then("^Navigate through 'Review your budget'$")
	public void navigate_through_Review_your_budget()  {

	    
	    
	}

	@Then("^Navigate to the 'Final Questions' page and select <No> for all questions$")
	public void navigate_to_the_Final_Questions_page_and_select_No_for_all_questions()  {
		genericMethods.implicitWait(5000);
		yourDashBordPageObj.ClickOnFinalQuestionstButton();
		genericMethods.implicitWait(5000);
		finalQuestionPage.getAllofClientsAssetshavebeenCapturedCheckBox_89940().click();
		genericMethods.implicitWait(5000);
		finalQuestionPage.ClickAssetsPageContinewButton();   //add no asset  9
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton89941();
		//finalQuestionFutureChange.ClickAllChangeshavebeenapturedCheckBox();//11
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		//getBrowser().sleep(5000);
//		finalQuestionFutureChange.ClickFutureChangesPageContinueButton();
//		getBrowser().sleep(5000);
		genericMethods.implicitWait(5000);
		control.switchToActiveFrame();
		finalQuestionMainPage.selectNoForAllQuestion();
		getBrowser().sleep(getBrowser().getTimeout() / 15);
		finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();//11
		genericMethods.implicitWait(10000);
	}

	@Then("^Navigate to the Priority Arrears page and verify AIP for HSBC CCJ presented$")
	public void navigate_to_the_Priority_Arrears_page_and_verify_AIP_for_HSBC_CCJ_presented()  {
		genericMethods.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
//		genericMethods.clickOnElementJse(yourDashBordPageObj.getYourPriorityPaymentsButton());
		genericMethods.implicitWait(5000);
		getBrowser().sleep(5000);
		Assert.assertEquals("CCJ AIP Displayed","County Court Judgment (CCJ)",getDriver().findElement(By.xpath("//span[normalize-space()='County Court Judgment (CCJ)']")).getText());
		genericMethods.implicitWait(5000);
		yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageContinueButton();
		genericMethods.implicitWait(5000);
		considersmallAmountSavingpage.ActionsOnConsidaerSaveSmallAmountPage();
		getBrowser().sleep(5000);
	}

	@Then("^Navigate to Savings page and click <No>$")
	public void navigate_to_Savings_page_and_click_No()  {
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		genericMethods.implicitWait(5000);
		OurAdvicePrinciplespage.ClickOnOurAdvicePrinciplesPageContinueButton();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		genericMethods.implicitWait(5000);
//		getDriver().findElement(By.xpath("(//button[normalize-space()='Continue'])[2]")).click();
		genericMethods.implicitWait(5000);
	}

	@Then("^Navigate to the solutions page, verify DMP is the joint recommended solution$")
	public void navigate_to_the_solutions_page_verify_DMP_is_the_joint_recommended_solution()  {
		genericMethods.implicitWait(5000);
		getBrowser().sleep(20000);
//		genericMethods.clickOnElementJse(yourDashBordPageObj.getReviewYourOptionsButton());
		genericMethods.implicitWait(5000);
//		getDriver().findElement(By.xpath("(//button[normalize-space()='Continue'])[2]")).click();
		genericMethods.implicitWait(5000);
		String verifyDMP=getDriver().findElement(By.xpath("(//*[contains(text(),'Debt management plan')])[1]")).getText();
		getBrowser().sleep(10000);
		Assert.assertEquals("DMP is joint","Debt management plan",verifyDMP);
		genericMethods.implicitWait(5000);

	}

	@Then("^Select joint solution$")
	public void select_joint_solution()  {
	    
	    
	}

	@Then("^Download the PAP$")
	public void download_the_PAP()  {
	    
	    
	}

	@Then("^Select save and exit, End Session$")
	public void select_save_and_exit_End_Session()  {
	    
	    
	}

	@Then("^Search and open the case in 'Read Only' interaction$")
	public void search_and_open_the_case_in_Read_Only_interaction()  {
	    
	    
	}

	@Then("^Navigate to the summary page and detailed view and verify the details$")
	public void navigate_to_the_summary_page_and_detailed_view_and_verify_the_details()  {
	    
	    
	}

	@Then("^Select<End session>$")
	public void select_End_session()  {

		CaseDetailsPageAdminAndViewOnlyOption.soleClientverifydata();
		youAreAllDone.ClickOnEndSessionButton();
	}

      




}
