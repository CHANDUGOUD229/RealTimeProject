	package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepChangeRem.remediation.pages.helper.YourDebtsHelper;
import com.stepChangeRem.remediation.pages.helper.YourIncomePageHelper;
import com.stepChangeRem.remediation.pages.helper.vo.DebtsFields;
import com.stepChangeRem.remediation.pages.helper.vo.IncomeFields;
import com.stepChangeRem.remediation.pages.helper.vo.SpendingsFields;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;


	public class StepDef_SC89936 extends CucumberGenericTest {
		public static WebDriver driver;
		public GenericMethodsRemediation genericMethods;
		public LogWriter writer = new LogWriter();
		public String featurefile = "";

		AccountRegistration accountRegistrationPage;
		ClientSearchPage clientSearchPage;
		ConfirmEmailAddressPage confirmEmailAddress;
		CreateYourBudget createYourBudget;
		//		DashBoardPageP dashBordPPage;
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
		YourIncomePageHelper yourIncomePageHelperObj;

		YourPriorityPayments_ArrangementsforPriorityArrearsPage yourPriorityPaymentsArrearsPage;
		YourSpendingFixedCost yourSpendingFixedPage;
		YourSpendingFlexibleCost yourSpendingFlexiblePage;
		CaptureReferralPage captureReferalObj;
		ReviewYourOptions_YourAdvicePrinciplesPage OurAdvicePrinciplespage;
		YouAreAllDonePage youAreAllDone;
		CaseDetailPageAdminViewReadOnlyView CaseDetailsPageAdminAndViewOnlyOption;
		CaptureReasonForNonProceedPage ReasoneForNonPorcessCasePage;
		YourDebtHelperClass yourDebtHelperClass;
		YourDebtsHelper yourDebtsHelper;


		public StepDef_SC89936() {
			yourDebtsHelper=new YourDebtsHelper();
			yourDebtHelperClass = new YourDebtHelperClass();
			yourIncomePageHelperObj = new YourIncomePageHelper();
			accountRegistrationPage = new AccountRegistration();
			clientSearchPage = new ClientSearchPage();
			confirmEmailAddress = new ConfirmEmailAddressPage();
			createYourBudget = new CreateYourBudget();
//			dashBordPPage = new DashBoardPageP();
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


		@When("^In Capture Referral Organisation capture Referral route$")
		public void in_Capture_Referral_Organisation_capture_Referral_route() {
			captureReferalObj.captureReferralRoute();


		}

		@When("^In the Establish Client Needs page capture$")
		public void in_the_Establish_Client_Needs_page_capture() {


		}

		@When("^Register the client via email or Telephone number$")
		public void register_the_client_via_email_or_Telephone_number() {
			accountRegistrationPage.fillConfirmEmailAddressDetails();

		}

		@When("^Navigate to Your Household page and enter the data  $")
		public void navigate_to_Your_Household_page_and_enter_the_data() {


		}

		@When("^Navigate to the Spending Fixed Costs page and enter the data$")
		public void navigate_to_the_Spending_Fixed_Costs_page_and_enter_the_data() {


		}

		@Then("^In the dashboard verify total income and total spending$")
		public void in_the_dashboard_verify_total_income_and_total_spending() {


		}

		@Then("^Navigate through Review your budget and make no changes$")
		public void navigate_through_Review_your_budget_and_make_no_changes() {


		}

		@Then("^Navigate through Assets and Future changes Non to add$")
		public void navigate_through_Assets_and_Future_changes_Non_to_add() {


		}

		@And("^Navigate to the Priority Arrears page and select Calculate$")
		public void navigateToThePriorityArrearsPageAndSelectCalculate() {
			yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
			yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageJointMPA();

		}

		@Then("^Navigate to the Final Questions page $")
		public void navigate_to_the_Final_Questions_page() {


		}

		@Then("^Navigate to Priority Arrears and select Calculate where required$")
		public void navigate_to_Priority_Arrears_and_select_Calculate_where_required() {


		}

		@Then("^Navigate to Your debt advice and verify as TPP is one of the recommended solutions$")
		public void navigate_to_Your_debt_advice_and_verify_as_TPP_is_one_of_the_recommended_solutions() {


		}

		@Then("^Navigate to Select a debt solution and selecting TPP activates $")
		public void navigate_to_Select_a_debt_solution_and_selecting_TPP_activates() {


		}

		@Then("^ Check Pursuing a write off and select <Continue>$")
		public void check_Pursuing_a_write_off_and_select_Continue() {


		}

		@Then("^ In Your preferred solution enter address yrs and click <Continue>$")
		public void in_Your_preferred_solution_enter_address_yrs_and_click_Continue() {


		}

		@Then("^Select <Save and exit> and in You are all done click <End Session>$")
		public void select_Save_and_exit_and_in_You_are_all_done_click_End_Session() {


		}

		@Then("^UATDMPVer Admin Only search and open the case and open Detailed View and verify$")
		public void uatdmpver_Admin_Only_search_and_open_the_case_and_open_Detailed_View_and_verify() {


		}

		@Then("^Under Case details click Pending Verification Paperwork$")
		public void under_Case_details_click_Pending_Verification_Paperwork() {


		}

		@Then("^the then click <Proceed to verification>$")
		public void the_then_click_Proceed_to_verification() {


		}

		@Then("^click <Start verification>$")
		public void click_Start_verification() {


		}

		@Then("^In You are all done under Case details$")
		public void in_You_are_all_done_under_Case_details() {


		}

		@Then("^click Pending activation$")
		public void click_Pending_activation() {


		}

		@Then("^then click <Confirm>$")
		public void then_click_Confirm() {


		}

		@Then("^In You are all done click <End session> and complete $")
		public void in_You_are_all_done_click_End_session_and_complete() {
		}

		@And("In the Establish Client Needs page capture Financial for client \"([^\"]*)\"$")
		public void inTheEstablishClientNeedsPageCaptureFinancialForClient(String arg0) {
			establishClientNeedPageObj.fillClient1Details(arg0);
		}

		@And("Navigate to Your Household page and enters all the details for \"([^\"]*)\"$")
		public void NavigateToYourHouseholdPageAndEntersAllTheDetailsFor(String arg0) {
			yourDashBordPageObj.ClickOnYourHouseHoldButton();
			yourHousholdPageObj.submitHouseHoldPageWithValidDataForAllScenarios(arg0);
			log("Test Data of Your Household page accepted");
		}

		@And("user Navigate to debt page and enters all the details for \"([^\"]*)\"$")
		public void userNavigateToDebtPageAndEntersAllTheDetailsFor(String arg0) {
			yourDebtHelperClass.EnterDataForCoupleOfDebtsForAllFeatures(arg0);
			//yourDebtHelperClass.addThirdAndFourthDebt(arg0);
			getBrowser().getLogWriter().logScreenshot();

		}

		@And("verify total debts after adding all debts")
		public void verifyTotalDebtsAfterAddingAllDebts() {
			yourDebtHelperClass.verifyTotalDebts();
			getBrowser().getLogWriter().logScreenshot();
		}

		@And("user selects options from Global Questions as \"([^\"]*)\"$")
		public void userSelectsOptionsFromGlobalQuestionsAs(String arg0) {
			yourDebtHelperClass.clickYesOrNoForGlobalQuestions(arg0);
			yourDebtHelperClass.clickGlobalQuestionSubmitButton();
		}

//		@And("Navigate to the Income page and enter the data for \"([^\"]*)\"$")
//		public void navigateToTheIncomePageAndEnterTheDataFor(String arg0) {
//			yourIncomePageObj.EnterIncomeForAllScenarios(arg0);
//		}

		@And("user clicks on create budget and submits screen")
		public void userClicksOnCreateBudgetAndSubmitsScreen() {
			yourDashBordPageObj.ClickonCreateYourBudgetButton();
			createYourBudget.ClickonContinueCreateBudgetButton();
		}


		@And("click on Create An Account Button")
		public void clickOnCreateAnAccountButton() {
			getBrowser().sleep(getBrowser().getTimeout());
			explainTheProcessPageObj.clickCreateAccount();
		}

		@And("Navigate to the Income page and enter the data as DataTable and Assert Total Income as \"([^\"]*)\"$")
		public void navigateToTheIncomePageAndEnterTheDataAsDataTableAndAssertTotalIncomeAs(String totalAmount,DataTable values) {
			List<IncomeFields> incomeFieldsList = values.asList(IncomeFields.class);
			yourIncomePageHelperObj.addIncomeDetails(incomeFieldsList,totalAmount);
		}

//		@And("Navigate to the Your Spendings Flexible page and enter the data as DataTable")
//		public void navigateToTheYourSpendingsFlexiblePageAndEnterTheDataAsDataTable(DataTable values) {
//			List<SpendingsFields> incomeFieldsList = new ArrayList<SpendingsFields>(values.asList(SpendingsFields.class));
//			yourIncomePageHelperObj.addFlexibleSpendingDetails(incomeFieldsList);
//		}


	

		@And("User Click on Continue Button")
		public void userClickOnContinueButton() {
			yourDebtPageObj.completeYourDebtPage();
		}

		@Then("User fills the Debt Details for Client and assert Total Amount \"([^\"]*)\"$")
		public void userFillsTheDebtDetailsForClientAndAssertTotalAmount(String amount,DataTable values) {
			List<DebtsFields> debtDetails = new ArrayList<DebtsFields>(values.asList(DebtsFields.class));
			yourDebtsHelper.completeTheDebtDetails(debtDetails,amount);
		}

		@And("User clicks on continue The screen")
		public void userClicksOnContinueInDebtScreen() {
			yourDebtsHelper.getContinueButton().click();

		}

		@And("User Clicks On A Case And Navigates to Flexible Spendings")
		public void userClicksOnACaseAndNavigatesToFlexibleSpendings() {
			Homepage page=new Homepage();
			page.clickonCase();
			getBrowser().sleep(600);

		}

		@And("Navigate to the Final Questions pages")
		public void navigateToTheFinalQuestionsPages() {
			getBrowser().sleep(getBrowser().getTimeout() / 5);
			finalQuestionPage.FinalQuestionsFillAsset89934();
			finalQuestionFutureChange.FutureChangesContinueGuestUser();
			finalQuestionMainPage.clickNoForAllFinalQuestions();
			finalQuestionMainPage.getWhatTypesofJobsCouldbeAffectedYesButtonClient1().click();
			finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();//11
		}

		@And("^User Clicks On Your Priority Payments$")
		public void userClicksOnYourPriorityPayments() {
			yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
		}


		@And("Navigate to the Your Spendings Fixed page and enter the data as DataTable and Assert Total Fixed Spendings as \"([^\"]*)\"$")
		public void navigateToTheYourSpendingsFixedPageAndEnterTheDataAsDataTableAndAssertTotalFixedSpendingsAs(String totalFixedSpendings,DataTable values) {
			List<SpendingsFields> incomeFieldsList = new ArrayList<SpendingsFields>(values.asList(SpendingsFields.class));
			yourIncomePageHelperObj.addSpendingDetails(incomeFieldsList,totalFixedSpendings);
		}

        @And("Navigate to the Your Spendings Flexible page and enter the data as DataTable and Assert The totatl Spedings As \"([^\"]*)\"$")
        public void navigateToTheYourSpendingsFlexiblePageAndEnterTheDataAsDataTableAndAssertTheTotatlSpedingsAs(String totalSpendings,DataTable values) {
            List<SpendingsFields> incomeFieldsList = new ArrayList<SpendingsFields>(values.asList(SpendingsFields.class));
            yourIncomePageHelperObj.addFlexibleSpendingDetails(incomeFieldsList,totalSpendings);
        }


		@And("User Clicked on final Question Button")
		public void userClickedOnFinalQuestionButton() {
			getBrowser().sleep(getBrowser().getTimeout() / 10);
			yourDashBordPageObj.ClickOnFinalQuestionstButton();
		}




		@Then("^User fills the Debt Details for Client and assert Total Amount \"([^\"]*)\" after Navigating Back After completing (\\d+)$")
        public void userFillsTheDebtDetailsForClientAndAssertTotalAmountAfterNavigatingBackAfterCompleting(String amount, int alreadyCompletedDebts,DataTable values) {
            List<DebtsFields> debtDetails = new ArrayList<DebtsFields>(values.asList(DebtsFields.class));
            yourDebtsHelper.navigatedBackAndCompleteTheDebtDetails(debtDetails,amount,alreadyCompletedDebts);
        }

		@Then("User reviews the available options and selects TPP as the Solution")
		public void userReviewsTheAvailableOptionsAndSelectsTPPAsTheSolution() {
			yourDashBordPageObj.ClickOnReviewYourOptionsButton();
			OurAdvicePrinciplespage.getContinueButton().click();
			ReviewYourOptionObj.getDroFindOut().click();
			ReviewYourOptionObj.getReturnToDebtSolutionsBtn().click();
			ReviewYourOptionObj.getDMPCheckBox().click();
			ReviewYourOptionObj.clickOnContinueButtonYourRecommondedSolutionButton();
		}
	}
