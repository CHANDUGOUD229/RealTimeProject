
package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepChangeRem.remediation.pages.helper.AccountRegistrationHelper;
import com.stepChangeRem.remediation.pages.helper.vo.AccountRegistrationFields;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class StepDef_SC89929 extends CucumberGenericTest{

	public static WebDriver driver;
	public GenericMethodsRemediation genericMethods;
	public LogWriter writer = new LogWriter();
	public String featurefile="";

	AccountRegistrationHelper acctHelper;
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



	public StepDef_SC89929() {
		acctHelper=new AccountRegistrationHelper();
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
		considersmallAmountSavingpage=new YourPriorityPayments_ConsiderSaveSmallAmountPage();
	}
	@Given("^User enters the credentials and logs in$")
	public void user_enters_the_credentials_and_logs_in(){


	}

	@When("^User navigates to capture referral and fills required details$")
	public void user_navigates_to_capture_referral_and_fills_required_details(){
		captureReferalObj.fillCaptureReferralpage();



	}

	@When("^User creates Establish clientOne and clientTwo details$")
	public void user_creates_Establish_clientOne_and_clientTwo_details(){

		establishClientNeedPageObj.SelectCauseOfFinancialDifficulty();
		establishClientNeedPageObj.fillClientDetailsScotland();
		establishClientNeedPageObj.addClient();
		establishClientNeedPageObj.addClientPopup();
		establishClientNeedPageObj.fillClientTwoDetails();
		establishClientNeedPageObj.clickContinueButtonEstablishclient();


	}

	@When("^create Account and fill account Registration form$")
	public void create_Account_and_fill_account_Registration_form(){
		explainTheProcessPageObj.createAccount();
		accountRegistrationPage.fillAccountRegnForm();
		accountRegistrationPage.fillAccountRegnFormClient2();
		accountRegistrationPage.createAccount();


	}

	@Then("^clientOne and clientTwo gets register with the valid emails$")
	public void clientone_and_clientTwo_gets_register_with_the_valid_emails(){
		confirmEmailAddress.fillconfirmEmailTwoClients();


	}

	@Then("^User enters the details of clientOne and clientTwo in your household page$")
	public void user_enters_the_details_of_clientOne_and_clientTwo_in_your_household_page(){
		yourDashBordPageObj.ClickOnYourHouseHoldButton();
		yourHousholdPageObj.FillClient01Client02Details();

	}

	@Then("^User is navigated to Debts page to add the debts of three creditors$")
	public void user_is_navigated_to_Debts_page_to_add_the_debts_of_three_creditors(){
		yourDebtPageObj.fillYourDebtWithThreeCreditors();

	}

	@Then("^User is navigated to create your budget page and continues$")
	public void user_is_navigated_to_create_your_budget_page_and_continues(){

		yourDashBordPageObj.ClickonCreateYourBudgetButton();
		createYourBudget.ClickonContinueCreateBudgetButton();
	}

	@Then("^User enters the required information in YourIncome page$")
	public void user_enters_the_required_information_in_YourIncome_page(){
		yourIncomePageObj.removeWorkingTax();
		yourIncomePageObj.EnterWagsEarning();
		yourIncomePageObj.SelectMonthlyDropdown();
		yourIncomePageObj.EnterWagsEarning02();
		yourIncomePageObj.otherearning();
		yourIncomePageObj.ClickgetAllincomeChekcbox();
		yourIncomePageObj.ClickYourIncomePageContinueButton();

	}

	@Then("^User fills the required data in YourSpendingFixedCosts$")
	public void user_fills_the_required_data_in_YourSpendingFixedCosts(){
		yourSpendingFixedPage.FillRequiredDetailsOf89929();


	}

	@Then("^User enters the required information in YourSpendingFlexibleCosts$")
	public void user_enters_the_required_information_in_YourSpendingFlexibleCosts() {

		yourSpendingFlexiblePage.filltherequireddetails89929();
	}
		@Then("^User is navigated to Advice your budget to review budget$")
		public void User_is_navigated_to_Advice_your_budget_to_review_budget()
		{
			yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();
			//YourBudgetSummaryReviewPage.ClickContinueOnBudgetSummarypage();
		}
	@Then("^User is navigated to Advice your budget to review budget89931$")
	public void User_is_navigated_to_Advice_your_budget_to_review_budget89931()
	{
		yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();
		YourBudgetSummaryReviewPage.ClickContinueOnBudgetSummarypage();
	}

	@Then("^User navigates to Assets page in debt advice of final questions$")
	public void user_navigates_to_Assets_page_in_debt_advice_of_final_questions(){
		YourBudgetSummaryReviewPage.ClickContinueOnBudgetSummarypage();


	}@Then("^User navigates to Assets page in debt advice of final questions89931$")
	public void user_navigates_to_Assets_page_in_debt_advice_of_final_questions89931(){
		//YourBudgetSummaryReviewPage.ClickContinueOnBudgetSummarypage();
		yourDashBordPageObj.ClickOnFinalQuestionstButton();
		//getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionPage.FinalQuestionsFillAsset89934();
		//getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton89941();


	}

	@Then("^User is navigated to Future changes and continues$")
	public void user_is_navigated_to_Future_changes_and_continues(){
		yourDashBordPageObj.ClickOnFinalQuestionstButton();
		finalQuestionPage.FinalQuestionsFill89929();

	}

	@Then("^User fills all the required option in final questions$")
	public void user_fills_all_the_required_option_in_final_questions(){
		finalQuestionFutureChange.ClickAllChangeshavebeenapturedCheckBox();
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton();

	}

	@Then("^User continues in ArrangementsforPriorityArrears of priority payments$")
	public void user_continues_in_ArrangementsforPriorityArrears_of_priority_payments(){
		finalQuestionMainPage.ClickWhatTypesofJobsCouldbeAffectedNoButton();
		finalQuestionMainPage.ClickWhatisaDebtSolutionNoButton();
		finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();
	}

	@Then("^user continues from consider a small amount screen$")
	public void user_continues_from_consider_a_small_amount_screen(){
		yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
		yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageContinueButton();

	}

	@Then("^User navigates to advice principles of review your option$")
	public void user_navigates_to_advice_principles_of_review_your_option(){
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
//		OurAdvicePrinciplespage.ClickOnOurAdvicePronciplesPageContinueButton();

	}

	@Then("^User reviews the available options and selects solution as client undecided$")
	public void user_reviews_the_available_options_and_selects_solution_as_client_undecided(){

		ReviewYourOptionObj.selctforJoint89929();

	}

	@Then("^User views your chosen plan and downloads the PAP$")
	public void user_views_your_chosen_plan_and_downloads_the_PAP(){

		yourChoosenSolutionActiveSession.ClickOnDownloadPersonalActionPlanButton();
		genericMethods.getContinueButton().click();
	}

	@Then("^User ends the session by providing the reason$")
	public void user_ends_the_session_by_providing_the_reason(){
		youAreAllDone.CaptureClientNumber();
		youAreAllDone.ClickOnEndSessionButton();
		endSessionDebtAdvicePage.clickOnSaveClientData();
		endSessionDebtAdvicePage.selectReasonForEndingSession();
		endSessionDebtAdvicePage.submitProvideGeneralAdvise();
		endSessionDebtAdvicePage.clickOnSubmitButton();


	}

	@Then("^Admin logs in reviews all pages of case by clientOne id$")
	public void admin_logs_in_reviews_all_pages_of_case_by_clientOne_id(){
		homePageObj.clickPhoneCallOptionFromhomePage();
		clientSearchPage.verifyTheSoleClientCase();

	}

	@Then("^confirms activation after verification process$")
	public void confirms_activation_after_verification_process(){
		CaseDetailsPageAdminAndViewOnlyOption.soleClientverifydata();
		youAreAllDone.ClickOnEndSessionButton();

	}

	@Then("^User End session and log off$")
	public void user_End_session_and_log_off(){
		youAreAllDone.ClickOnEndSessionButton();

	}

	@Then("^in DCS Debt Advice data capture is displayed to client Ref$")
	public void in_DCS_Debt_Advice_data_capture_is_displayed_to_client_Ref(){


	}

	@And("Registers the User Details")
	public void registersTheUserDetails(DataTable values) {
		List<AccountRegistrationFields> accountRegistrationFields = values.asList(AccountRegistrationFields.class);
		acctHelper.fillAccountRegistration(accountRegistrationFields);
	}

	@And("Navigate to the Priority Arrears page and Continues")
	public void navigateToThePriorityArrearsPageAndContinues() {
		yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
		yourPriorityPaymentsArrearsPage.clickContinueButton();
		considersmallAmountSavingpage.ActionsOnConsidaerSaveSmallAmountPage();
	}



	@And("User Perform Action on Final Question pages and devide main Home as \"([^\"]*)\" into equal portion of \"([^\"]*)\"$")
	public void userPerformActionOnFinalQuestionPagesAndDevideMainHomeAsIntoEqualPortionOf(String totalWorth, String share) {
		yourDashBordPageObj.ClickOnFinalQuestionstButton();
		finalQuestionMainPage.devideAssetIntoEqualPortion(totalWorth,share);
//		yourDashBordPageObj.assetInputCompleteCheckbox();
		finalQuestionMainPage.clickContinueButton();
		yourDashBordPageObj.checkBoxForAllCaptured();
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton();
		finalQuestionMainPage.clickNoForAllFinalQuestions();
		finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();//11
	}

	@And("^User Navigates to Review Your Options Page and Selects DMP as recommended solution$")
	public void userNavigatesToReviewYourOptionsPageAndSelectsMPAAsRecommendedSolution() {
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		OurAdvicePrinciplespage.getContinueButton().click();
		ReviewYourOptionObj.getDroFindOut().click();
		ReviewYourOptionObj.getReturnToDebtSolutionsBtn().click();
		ReviewYourOptionObj.getDMPCheckBox().click();
		ReviewYourOptionObj.clickOnContinueButtonYourRecommondedSolutionButton();
	}
}


