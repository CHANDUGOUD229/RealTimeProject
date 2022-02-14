package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class StepDef_SC89924 extends CucumberGenericTest{

				public static WebDriver driver;
				public GenericMethodsRemediation genericMethods;
				public LogWriter writer = new LogWriter();
				public String featurefile="";

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
				ReviewYourOptions_YourAdvicePrinciplesPage OurAdvicePrinciplespage ;
				YouAreAllDonePage youAreAllDone;
				CaseDetailPageAdminViewReadOnlyView CaseDetailsPageAdminAndViewOnlyOption;
				CaptureReasonForNonProceedPage ReasoneForNonPorcessCasePage;



				public StepDef_SC89924() {

					accountRegistrationPage = new AccountRegistration();
					clientSearchPage = new ClientSearchPage();
					confirmEmailAddress = new 	ConfirmEmailAddressPage();
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

		@When("^In the Establish Client Needs page capture details$")
		public void in_the_Establish_Client_Needs_page_capture_details(){


		}

		@When("^Continue as a guest$")
		public void continue_as_a_guest(){
			getBrowser().sleep(getBrowser().getTimeout());
			explainTheProcessPageObj.getContinueAsGuest().click();


		}

		@When("^Navigate to the Income page and enter the  data$")
		public void navigate_to_the_Income_page_and_enter_the_data(){


		}

		@Then("^ensure Groceries has retained the same frequencies and amounts$")
		public void ensure_Groceries_has_retained_the_same_frequencies_and_amounts(){

			reviewYourBudgetPage.GroceriesVerifyValuesFor89924();
			reviewYourBudgetPage.clickContinueButton();
			YourBudgetSummaryReviewPage.clickContinueButton();


		}

		@Then("^Navigate to the Priority Arrears page and select Calculate the value$")
		public void navigate_to_the_Priority_Arrears_page_and_select_Calculate_the_value(){
			yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
			yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageContinueButton();

		}

		@Then("^Navigate to the solutions page  and verify DPP recommended solutions$")
		public void navigate_to_the_solutions_page_and_verify_DPP_recommended_solutions(){
			yourDashBordPageObj.ClickOnReviewYourOptionsButton();
			OurAdvicePrinciplespage.ClickOnOurAdvicePrinciplesPageContinueButton();
			ReviewYourOptionObj.ClickSoleClientDPPSolution89924();

		}

		@When("^select solution register client and proceed$")
		public void select_solution_register_client_and_proceed(){


		}

		@When("^Select <Save and exit> and <End session>$")
		public void select_Save_and_exit_and_End_session(){


		}

		@When("^Logout$")
		public void logout(){


		}

		@When("^Log on as a verifier$")
		public void log_on_as_a_verifier(){


		}

		@When("^Search and open the case$")
		public void search_and_open_the_case(){


		}

		@When("^Complete all stages of the verification process, and proceed with Activation$")
		public void complete_all_stages_of_the_verification_process_and_proceed_with_Activation(){


		}

		@When("^Complete all stages of the verification process$")
		public void complete_all_stages_of_the_verification_process(){


		}

		@When("^proceed with Activation and then <End session>$")
		public void proceed_with_Activation_and_then_End_session(){


		}

		@When("^Open DCS and veify the details$")
		public void open_DCS_and_veify_the_details(){


		}

    @And("In the Establish Client Needs page capture details for DPP")
    public void inTheEstablishClientNeedsPageCaptureDetailsForDPP() {
		establishClientNeedPageObj.SelectCauseOfFinancialDifficulty();
		establishClientNeedPageObj.fillClientDetailsScotland();
		establishClientNeedPageObj.clickContinueButtonEstablishclient();

    }

	@And("Navigate to the Final Questions page as SoleGuestDPP")
	public void navigateToTheFinalQuestionsPageAsSoleGuestDPP() {
		yourDashBordPageObj.ClickOnFinalQuestionstButton();;
		finalQuestionPage.ContinueasGuestUser89949();
//		finalQuestionFutureChange.FutureChangesContinueGuestUser();
//		finalQuestionMainPage.FillFinalQuestions89924();
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton89941();
		//genericMethodsCvp.implicitWait(3000);
		finalQuestionMainPage.FinalQuestionAction89921();

	}

    @And("Navigate to the spendings flexible page as SoleClientDPP")
    public void navigateToTheSpendingsFlexiblePageAsSoleClientDPP() {
		yourSpendingFlexiblePage.fillSpendingsFlexibleCost89924();


    }

	@And("Navigate to the Priority Arrears as SoleGuestDPP")
	public void navigateToThePriorityArrearsAsSoleGuestDPP() {
		yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();

	}

	@And("select Calculate the value as SoleGuestDPP")
	public void selectCalculateTheValueAsSoleGuestDPP() {
		yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageContinueButton();
	}


//    @And("user clicks on DAVnumber")
//    public void userClicksOnDAVnumber() {
//		accountRegistrationPage.ClickonDAVNumber();

    }



