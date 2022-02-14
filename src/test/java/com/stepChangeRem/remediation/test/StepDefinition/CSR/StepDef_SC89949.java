package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class StepDef_SC89949 extends CucumberGenericTest{
	public String Client01ReferenceNumber;
	public String Client02ReferenceNumber;

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
	YourPreferredSolution yourPrefferedSolutionObj;
	//SeperateSolutionConfirmationPage seperatesolutionPage;
	DPACheckPage dpaCheckPage;
	RecentCasesPage recentCasePageObj;
	SummaryPage summaryPageObj;


	public StepDef_SC89949() {

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
		yourPrefferedSolutionObj = new YourPreferredSolution();
	//	seperatesolutionPage = new SeperateSolutionConfirmationPage();
		dpaCheckPage = new DPACheckPage();
		recentCasePageObj=new RecentCasesPage();
		summaryPageObj = new SummaryPage();

	}

	@Before
	public void initializeCucumberTest(Scenario scenario) {
		initialise(scenario.getName().replace("/", "or"));
		String URL= getBrowser().getBrowserProperties().getEnvironmentURL();
		System.out.println("URL: "+URL);
		getDriver().get(URL);
		maximiseWindow();
		getBrowser().sleep(3000);
	}

	@After
	public void tearDownCucumberTest(Scenario scenario) {
		if (scenario.isFailed()) {
			logScreenshot();
			homePageObj.clickUserIconButton();
			getBrowser().getLogWriter().log("Logged Out from URL");
		}
	}

	@Given("^User in login page$")
	public void User_in_login_page() {
		loginPageObj.VerifyingTroubleloggingInText();
	}

	@When("^User enter the credentials and click on login Button$")
	public void User_enter_the_credentials_and_click_on_login_Button() {
		loginPageObj.EnterUsername("Balaji.vemula@aaseya.com");
		loginPageObj.EnterPassword("Nov@2020");
		loginPageObj.clickLoginButton();
	}
	@When("^click On NEW Button$")
	public void click_On_NEW_Button()  {

		homePageObj.clickNewButton();
	}

	@When("^Select Phonecall Option$")
	public void select_Phonecall_Option()  {
		homePageObj.selectphoneCall();
	}

	@When("^Create New debt Advice case$")
	public void create_New_debt_Advice_case() throws InterruptedException {

		clientSearchPage.createNewDebtAdviceCase();
	}
	@Then("^In Capture Referrals Organisation capture Referral route$")
	public void In_Capture_Referrals_Organisation_capture_Referral_route () {
		captureReferalObj.ClickReferralRouteDirectButton();
		captureReferalObj.EntertextOtherinWhoreferredThemTextField("Other");
	}
	@Then("^In the Establish Clients Needs page capture Financial difficulty$")
	public void In_the_Establish_Clients_Needs_page_capture_Financial_difficulty() {
		establishClientNeedPageObj.fillClient01andClient02Details();
	}
	@Then("^Continue as a guest $")
	public void continue_as_a_guest() {

		explainTheProcessPageObj.getContinueAsGuest().click();
	}
	@Then("^Navigate to Your Household Page and enter the data$")
	public void Navigate_to_Your_Household_Page_and_enter_the_data() {
		yourDashBordPageObj.ClickOnYourHouseHoldButton();
		yourHousholdPageObj.FillHouseHoldPageWithValidData89949();
	}
	@Then("^Navigate to the Debts Page and enter the data$")
	public void Navigate_to_the_Debts_Page_and_enter_the_data() {

		yourDebtPageObj.fillYourDebtWithTwoCreditors();
	}
	@Then("^Navigate to the Income Page and enter the data$")
	public void Navigate_to_the_Income_Page_and_enter_the_data() {
		yourDashBordPageObj.ClickOnCreatingYourBudgetButton();
		createYourBudget.ClickonContinueCreateBudgetButton();
		yourIncomePageObj.YourIncomePageActionSC89949();
	}
	@Then("^Navigate to the Spending Fixed Costs Page and enter the data$")
	public void Navigate_to_the_Spending_Fixed_Costs_Page_and_enter_the_data() {
		yourSpendingFixedPage.FillSpendingFixedCostRequiredDetailsOf89949();

	}
	@Then("^Navigate to the Spending Flexible Costs Page and enter the data$")
	public void Navigate_to_the_Spending_Flexible_Costs_Page_and_enter_the_data() {
		yourSpendingFlexiblePage.FillSpendigFlexibleCostPageDetailsfor89949();
	}

	@Then("^Verify Understanding your situation details$")
	public void verify_Understanding_your_situation_details() {

		yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();
	}

	@Then("^verify Review your budget indicated as complete Monthly summary89949$")
	public void verify_Review_your_budget_indicated_as_complete_Monthly_summary() {

		//reviewYourBudgetPage.ActionOnShowSummaryContinueButton();
		YourBudgetSummaryReviewPage.ClickContinueOnBudgetSummarypage();


	}
	@Then("^Navigate to the Final Questions section89949$")
	public void navigate_to_the_Final_Questions_section() {

		yourDashBordPageObj.ClickOnFinalQuestionstButton();
	}
	@Then("^Add no Assets or Future Changes Guest$")
	public void add_no_Assets_or_Future_Changes_Guest() {
		finalQuestionPage.ContinueasGuestUser89949();
		finalQuestionFutureChange.FutureChangesContinueGuestUser();
		//finalQuestionFutureChange.ClickFutureChangesPageContinueButton();

	}
	@Then("^On the Final Questions page select <No> for all questions$")
	public void on_the_Final_Questions_page_select_No_for_all_questions() {
		finalQuestionMainPage.FillrequireddetailsForClient1and2for89949();
	}
	@Then("^Navigate to the Priority Arrears page$")
	public void navigate_to_the_Priority_Arrears_page() {
		yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
		yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageContinueButton();
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		/*OurAdvicePrinciplespage.CreateAccountAsaGuestuser();
		accountRegistrationPage.fillAccountRegnFormofClient1For89949();
		accountRegistrationPage.fillAccountRegnFormClient2for89949();
		accountRegistrationPage.createAccount();
		confirmEmailAddress.fillconfirmEmailTwoClientsfor89949();
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();*/
	}
	@Then("^Navigate to the Your debt advice page and verify DRO is one of the recommended solutions$")
	public void navigate_to_the_Your_debt_advice_page_and_verify_DRO_is_one_of_the_recommended_solutions() {
		OurAdvicePrinciplespage.ClickOnOurAdvicePronciplesPageContinueButton();
	}
	@When("^Proceed with DRO for Client1 and DRO for Client2 and register the client$")
	public void proceed_with_DRO_for_Client1_and_DRO_for_Client2_and_register_the_client() {
		ReviewYourOptionObj.SelectDroPlansForClient1andClient2for89949();
		ReviewYourOptionObj.VerifyDroPlansForClient1andClient2for89949();
		ReviewYourOptionObj.clickOnContinueButtonYourRecommondedSolutionButton();
	}

}
	


