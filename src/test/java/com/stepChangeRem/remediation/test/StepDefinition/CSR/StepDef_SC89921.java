package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepChangeRem.remediation.pages.helper.AccountRegistrationHelper;
import com.stepChangeRem.remediation.pages.helper.vo.AccountRegistrationFields;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class StepDef_SC89921 extends CucumberGenericTest{
	public static WebDriver driver;
	public GenericMethodsRemediation genericMethodsCvp;
	public LogWriter writer = new LogWriter();
	public String featurefile="";

	AccountRegistration accountRegistrationPage;
	AccountRegistrationHelper acctHelper;
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

	
	
	public StepDef_SC89921() {
		
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
		acctHelper=new AccountRegistrationHelper();
	}
	
	@When("^Continue without email registration$")
	public void continue_without_email_registration()  {
	    
	    
	}

	@When("^Navigate to the Debts page and enter the data$")
	public void navigate_to_the_Debts_page_and_enter_the_data()  {
	    
	    
	}

	@When("^Navigate to the Income page and enter the data$")
	public void navigate_to_the_Income_page_and_enter_the_data()  {
	    
	    
	}

	@When("^Navigate to the Spending - Fixed Costs page and enter the data$")
	public void navigate_to_the_Spending_Fixed_Costs_page_and_enter_the_data()  {
	    
	    
	}

	@When("^Navigate to back to the Debts page and enter the data$")
	public void navigate_to_back_to_the_Debts_page_and_enter_the_data()  {
	    
	    
	}

	@When("^Navigate to the Spending Flexible Costs page and enter the data$")
	public void navigate_to_the_Spending_Flexible_Costs_page_and_enter_the_data()  {
	    
	    
	}

	@When("^Navigate through Review your budget$")
	public void navigate_through_Review_your_budget()  {
	    
	    
	}

	@When("^Navigate to the Final Questions page$")
	public void navigate_to_the_Final_Questions_page()  {
	    
	    
	}

	@When("^Add no Assets or Future Changes and select <No> for all questions$")
	public void add_no_Assets_or_Future_Changes_and_select_No_for_all_questions()  {
	    
	    
	}

	@When("^In Our advice principles register the client via account settings$")
	public void in_Our_advice_principles_register_the_client_via_account_settings()  {
	    
	    
	}

	@When("^Navigate to the Priority Arrears page and select Calculate where required$")
	public void navigate_to_the_Priority_Arrears_page_and_select_Calculate_where_required()  {
	    
	    
	}

	@When("^Navigate to the solutions page and verify DRO is one of the recommended solutions$")
	public void navigate_to_the_solutions_page_and_verify_DRO_is_one_of_the_recommended_solutions(DataTable values)  {
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		OurAdvicePrinciplespage.CreateAccountAsaGuestuser();
		List<AccountRegistrationFields> accountRegistrationFields = values.asList(AccountRegistrationFields.class);
		acctHelper.fillAccountRegistration(accountRegistrationFields);
	}

	@When("^Select and Proceed with the Solution$")
	public void select_and_Proceed_with_the_Solution()  {
	    
	    
	}

	@When("^Select save and exit, End Session and Log Off$")
	public void select_save_and_exit_End_Session_and_Log_Off()  {
	    
	    
	}

	@When("^Log on as a verifier, search and open the case Via PendingVerification workbasket$")
	public void log_on_as_a_verifier_search_and_open_the_case_Via_PendingVerification_workbasket()  {
	    
	    
	}

	@When("^Navigate to the summary page and detailed view check Address, Income, Spending, Debts, Assets and Future Changes match the test data entered$")
	public void navigate_to_the_summary_page_and_detailed_view_check_Address_Income_Spending_Debts_Assets_and_Future_Changes_match_the_test_data_entered()  {
	    
	    
	}

	@When("^Complete all stages of the verification process $")
	public void complete_all_stages_of_the_verification_process()  {
	    
	    
	}

	@When("^Click the link Complete drafter details$")
	public void click_the_link_Complete_drafter_details()  {
	    
	    
	}

	@Then("^Select End Session and Log Off $")
	public void select_End_Session_and_Log_Off()  {
	    
	    
	}

	@When("^Log on as a verifier, search and open the case$")
	public void log_on_as_a_verifier_search_and_open_the_case()  {
	    
	    
	}

	@When("^Navigate to the Draft stage and complete all steps$")
	public void navigate_to_the_Draft_stage_and_complete_all_steps()  {
	    
	    
	}

	@When("^End session $")
	public void end_session()  {
	    
	    
	}

	@And("^User Navigates to Review Your Options Page$")
	public void userNavigatesToReviewYourOptionsPage() {
		getBrowser().sleep(getBrowser().getTimeout()/25);
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		//yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		getBrowser().sleep(getBrowser().getTimeout()/5);
		OurAdvicePrinciplespage.getContinueButton().click();
		ReviewYourOptionObj.getDroFindOut().click();
		ReviewYourOptionObj.getReturnToDebtSolutionsBtn().click();
		ReviewYourOptionObj.getDroCheckBox().click();
		ReviewYourOptionObj.clickOnContinueButtonYourRecommondedSolutionButton();
	}

	@And("User Ends the session and Logout from the Application")
	public void userEndsTheSessionAndLogoutFromTheApplication() {
		homePageObj.getEndSession().click();
//		homePageObj.getEndSessionConfirm().click();
//		homePageObj.getClickOnAvatar().click();
//		homePageObj.getLogout().click();

	}


	@And("^User Perform Action on Final Question pages$")
	public void userPerformActionOnFinalQuestionPages() {

		yourDashBordPageObj.ClickOnFinalQuestionstButton();
		yourDashBordPageObj.assetInputCompleteCheckbox();
		finalQuestionPage.ClickAssetsPageContinewButton();   //add no asset  9
		//yourDashBordPageObj.checkBoxForAllCaptured();
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton89941();
		//genericMethodsCvp.implicitWait(3000);
		finalQuestionMainPage.FinalQuestionAction89921();
//		finalQuestionMainPage.getWhatisaDebtSolutionNoButtonforClient1().click();//
//		//genericMethodsCvp.implicitWait(3000);
//		finalQuestionMainPage.getEmployementBeEffectedInsolvencyYesButtonforclient2No().click();
//		//genericMethodsCvp.implicitWait(3000);
//		finalQuestionMainPage.ClickWhatisaDebtSolutionNoButtonforclient21();
//		finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();//11
	}


}