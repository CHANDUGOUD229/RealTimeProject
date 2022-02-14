	package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


	public class StepDef_SC89925 extends CucumberGenericTest {

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
		YourPriorityPayments_ArrangementsforPriorityArrearsPage yourPriorityPaymentsArrearsPage;
		YourSpendingFixedCost yourSpendingFixedPage;
		YourSpendingFlexibleCost yourSpendingFlexiblePage;
		CaptureReferralPage captureReferalObj;
		ReviewYourOptions_YourAdvicePrinciplesPage OurAdvicePrinciplespage;
		YouAreAllDonePage youAreAllDone;
		CaseDetailPageAdminViewReadOnlyView CaseDetailsPageAdminAndViewOnlyOption;
		CaptureReasonForNonProceedPage ReasoneForNonPorcessCasePage;
		YourPreferredSolution yourpreferredsolution;


		public StepDef_SC89925() {
			yourpreferredsolution = new YourPreferredSolution();
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

		@And("^Navigate to the Income page and enter the data as a guest user$")
		public void Navigate_to_the_Income_page_and_enter_the_data_as_a_guest_user() {
			yourDashBordPageObj.ClickonCreateYourBudgetButton();
			createYourBudget.ClickonContinueCreateBudgetButton();
			yourIncomePageObj.EnterWagesGuestUser();

		}

		@And("^Navigate to the Debts page and enter the data as a guest user$")
		public void Navigate_to_the_Debts_page_and_enter_the_data_as_a_guest_user() {

			yourDebtPageObj.EnterdataforCoupleofDebtsAsaGuestuser();

		}

		@And("^Navigate to the Spending Fixed Costs page and enter the data as a guest user$")
		public void Navigate_to_the_Spending_Fixed_Costs_page_and_enter_the_data_as_a_guest_user() {
			yourSpendingFixedPage.EnterSpendingdetailsofguestUser();
		}

		@And("^Navigate to the Spending Flexible Costs page and enter the data as a guest user$")
		public void Navigate_to_the_Spending_Flexible_Costs_page_and_enter_the_data_as_a_guest_user() {
			yourSpendingFlexiblePage.EnterdetailsGuestUser();
		}

		@And("^Navigate to Advice on your Budget as a guest user$")
		public void Navigate_to_Advice_on_your_Budget_as_a_guest_user() {
			yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();
			reviewYourBudgetPage.clickContinueButton();
			YourBudgetSummaryReviewPage.ClickContinueOnBudgetSummarypage();

		}

		@When("^Navigate to the Final Questions pages as guest user$")
		public void navigate_to_the_Final_Questions_pages_as_guest_user() {
			finalQuestionPage.ContinueasGuestUser();
			finalQuestionFutureChange.FutureChangesContinueGuestUser();
			finalQuestionMainPage.ClickWhatisaDebtSolutionNoButtonforclient1();
			finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();
		}

		@And("^Navigate to the Priority Arrears page and select Calculate as a guest user$")
		public void Navigate_to_the_Priority_Arrears_page_and_select_Calculate_as_a_guest_user() {
			yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
			yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageContinueButton();

		}

		@Then("^Navigate to the solutions page and verify MAP is one of the recommended solutions for the guest user$")
		public void navigate_to_the_solutions_page_and_verify_MAP_is_one_of_the_recommended_solutions_for_the_guest_user() {
			yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		//	OurAdvicePrinciplespage.ClickOnOurAdvicePronciplesPageContinueButton();
			//	OurAdvicePrinciplespage.CreateAccountAsaGuestuser();
			//	accountRegistrationPage.fillAccountRegnFormGuestUser();
			//	confirmEmailAddress.fillConfirmEmailAddressDetailsguestuser();
			ReviewYourOptionObj.selectMAPSolution();


		}

		@And("^download the PAP after client registration$")
		public void download_the_PAP_after_client_registration() {
			yourDashBordPageObj.ClickOnYourChoosenSolutionButton();
			accountRegistrationPage.fillAccountRegnFormGuestUser();
			confirmEmailAddress.fillConfirmEmailAddressDetailsguestuser();
			yourpreferredsolution.clickOnContinuepreferredSolution();
			yourChoosenSolutionActiveSession.ClickOnDownloadPersonalActionPlanButton();
			yourChoosenSolutionActiveSession.ClickOnYourAdviceSessionIsCompletePageSaveAndExitButton();

		}


		@And("^Select End session and capture DAV$")
		public void Select_End_session_and_capture_DAV() {
			youAreAllDone.CaptureClientNumber();
			youAreAllDone.ClickOnEndSessionButton();
			endSessionDebtAdvicePage.clickOnSaveClientData();
			endSessionDebtAdvicePage.selectReasonForEndingSession();
			endSessionDebtAdvicePage.submitProvideGeneralAdvise();
			endSessionDebtAdvicePage.clickOnSubmitButton();

		}

		@When("^Log on as a verifier search and open the case$")
		public void log_on_as_a_verifier_search_and_open_the_case() {
			homePageObj.clickPhoneCallOptionFromhomePage();
			clientSearchPage.verifyTheSoleClientCase();


		}

		@And("click on continue Button")
		public void clickOnContinue() {
			explainTheProcessPageObj.clickContinurButton();
		}

		@And("User Clicked On Final Questions Button")
		public void userClickedOnFinalQuestionsButton() {
			yourDashBordPageObj.ClickOnFinalQuestionstButton();
		}

        @And("User Perform Action on Final Question page for MAP")
        public void userPerformActionOnFinalQuestionPageForMAP() {
			yourDashBordPageObj.ClickOnFinalQuestionstButton();
			yourDashBordPageObj.assetInputCompleteCheckbox();
			finalQuestionPage.ClickAssetsPageContinewButton();   //add no asset  9
			yourDashBordPageObj.checkBoxForAllCaptured();
			finalQuestionFutureChange.ClickFutureChangesPageContinueButton();
			finalQuestionMainPage.clickNoForAllFinalQuestions();//
			finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();//11
        }

		@And("Navigate to the Priority Arrears And Continue to next screens")
		public void navigateToThePriorityArrearsAndContinueToNextScreens() {
			yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
			OurAdvicePrinciplespage.getContinueButton().click();
		}

		@And("User Navigates to Review Your Options Page and Selects the MAP as the recommended solution")
		public void userNavigatesToReviewYourOptionsAndSelectsTheMAPAsTheRecommendedSolution() {
			getBrowser().sleep(getBrowser().getTimeout()/20);
			yourDashBordPageObj.ClickOnReviewYourOptionsButton();
			//yourDashBordPageObj.ClickOnReviewYourOptionsButton();
			getBrowser().sleep(getBrowser().getTimeout()/5);
			OurAdvicePrinciplespage.getContinueButton().click();
			ReviewYourOptionObj.getDroFindOut().click();
			ReviewYourOptionObj.getReturnToDebtSolutionsBtn().click();
			ReviewYourOptionObj.getMAPCheckBox().click();
			ReviewYourOptionObj.clickOnContinueButtonYourRecommondedSolutionButton();
		}
	}

