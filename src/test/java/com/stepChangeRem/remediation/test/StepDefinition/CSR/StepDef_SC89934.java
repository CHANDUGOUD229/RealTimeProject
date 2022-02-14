package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


 public class StepDef_SC89934 extends CucumberGenericTest{
	public static WebDriver driver;
	public GenericMethodsRemediation genericMethods;
	public LogWriter writer = new LogWriter();
	public String featurefile="";
	
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
	YourSpendingFixedCost yourSpendingFixedPage;
	YourSpendingFlexibleCost yourSpendingFlexiblePage;
	CaptureReferralPage captureReferalObj;
	ReviewYourOptions_YourAdvicePrinciplesPage OurAdvicePrinciplespage ;
	YouAreAllDonePage youAreAllDone;
	CaseDetailPageAdminViewReadOnlyView CaseDetailsPageAdminAndViewOnlyOption;
	CaptureReasonForNonProceedPage ReasoneForNonPorcessCasePage;
	YourPriorityPayments_ConsiderSaveSmallAmountPage considersmallAmountSavingpage;

	
	
	public StepDef_SC89934() {
		
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
		considersmallAmountSavingpage = new YourPriorityPayments_ConsiderSaveSmallAmountPage();
	}
	@When("^In the Establish Client Needs page capture the details$")
	public void in_the_Establish_Client_Needs_page_capture_the_details()  {
		captureReferalObj.fillCaptureReferralpage89934("Other");
		establishClientNeedPageObj.ActionSetClientNeedPage89934();
	    
	}

	@When("^Register client via email$")
	public void register_client_via_email()  {
	//	explainTheProcessPageObj.getContinueAsGuest().click();
		explainTheProcessPageObj.createAccount();
		accountRegistrationPage.fillAccountRegnFormSC89934();
		accountRegistrationPage.createAccount();
		accountRegistrationPage.fillConfirmEmailAddressDetails();
	}

	@When("^Navigate to Your Household page and enter the data$")
	public void navigate_to_Your_Household_page_and_enter_the_data()  {
		yourDashBordPageObj.ClickOnYourHouseHoldButton();
		yourHousholdPageObj.ActionSetYourHouseHold89934();
	    
	}
	@When("^Navigate to Debts and enter the data$")// Question this method is used for one debts but how its going toreuse for multiple debts
	public void navigate_to_Debts_and_enter_the_data()  {
		yourDebtPageObj.ClickAddaDebtButton();
		yourDebtPageObj.EnterCreditor1Details89934();

	}
	@When("^Navigate to YourIncome89934 page and enter the data$")
	public void navigate_to_YourIncome_page_and_enter_the_data()  {
		yourDashBordPageObj.ClickonCreateYourBudgetButton();
		createYourBudget.ClickonContinueCreateBudgetButton();
		yourIncomePageObj.YourIncomePageActionSC89934();

	}

	@When("^Navigate to Spending fixed costs page and enter the data$")
	public void navigate_to_Spending_fixed_costs_page_and_enter_the_data()  {
		yourSpendingFixedPage.YourSpendingFixdCostActionSet_SC89934();
	}


	@When("^Navigate to Spending Flexible Costs and enter the data$")
	public void navigate_to_Spending_Flexible_Costs_and_enter_the_data()  {
	    yourSpendingFlexiblePage.YourSpendingFlexibleCostActionSet_SC89934();
	    
	}
	//	@When("^Select Back to Dashboard$")
//	public void select_Back_to_Dashboard()  {
//
//
//	}

	@When("^Navigate through Review your budget and ensure Food and housekeeping34$")
	public void Navigate_through_Review_your_budget_and_ensure_Food_and_housekeeping34()  {
		yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();
		//reviewYourBudgetPage.ActionOnShowSummaryContinueButton();
		YourBudgetSummaryReviewPage.ClickContinueOnBudgetSummarypage();
	}

	@When("^Add no 'Assets' or 'Future Changes89934'$")
	public void add_no_Assets_or_Future_Changes()  {
		yourDashBordPageObj.ClickOnFinalQuestionstButton();
		finalQuestionPage.FinalQuestionsFillAsset89934();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton89941();
//		finalQuestionFutureChange.getAllChangeshavebeenCapturedCheckBox().click();
//		finalQuestionFutureChange.ClickFutureChangesPageContinueButton();
	}

	@When("^Navigate to the'Final Questions' and select <No> for all questions$")
	public void navigate_to_the_Final_Questions_and_select_No_for_all_questions()  {
		finalQuestionMainPage.ClickWhatTypesofJobsCouldbeAffectedNoButton();
		finalQuestionMainPage.ClickWhatisaDebtSolutionNoButton();
		finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();
	}

	@When("^Navigate to Priority Arrears and select 'Calculate' where required$")
	public void navigate_to_Priority_Arrears_and_select_Calculate_where_required()  {
		yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
		yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageContinueButton();
	}

	@When("^Navigate to Savings and select <No>$")
	public void navigate_to_Savings_and_select_No()  {
		considersmallAmountSavingpage.ActionsOnConsidaerSaveSmallAmountPage();
	    
	}

	@When("^Navigate to 'Your debt advice'$")
	public void navigate_to_Your_debt_advice()  {
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
	//	OurAdvicePrinciplespage.ClickOnOurAdvicePronciplesPageContinueButton();
		OurAdvicePrinciplespage.ClickOnOurAdvicePrinciplesPageContinueButton();
	    
	}

	@When("^Navigate to 'Your preferred solution' and proceed with the solution as per test case$")
	public void navigate_to_Your_preferred_solution_and_proceed_with_the_solution_as_per_test_case()  {
		//ReviewYourOptionObj.
		// need to verify that----ReviewYourOptionObj.VerifyFinalScenarioPlan89934();
		ReviewYourOptionObj.selectIVASolution89934();
//		yourDashBordPageObj.ClickOnYourChoosenSolutionButton();
//		yourChoosenSolutionActiveSession.ClickOnDownloadPersonalActionPlanButton();;
//		yourChoosenSolutionActiveSession.ClickOnYourAdviceSessionIsCompletePageSaveAndExitButton();
		//Logout from here

	}

	


}
