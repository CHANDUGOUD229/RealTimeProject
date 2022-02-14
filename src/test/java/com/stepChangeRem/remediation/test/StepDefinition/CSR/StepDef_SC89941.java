package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import com.stepChangeRem.remediation.pages.AccountRegistration;
import com.stepChangeRem.remediation.pages.CaptureReasonForNonProceedPage;
import com.stepChangeRem.remediation.pages.CaptureReferralPage;
import com.stepChangeRem.remediation.pages.CaseDetailPageAdminViewReadOnlyView;
import com.stepChangeRem.remediation.pages.ClientSearchPage;
import com.stepChangeRem.remediation.pages.ConfirmEmailAddressPage;
import com.stepChangeRem.remediation.pages.CreateYourBudget;
import com.stepChangeRem.remediation.pages.EndSessionDebtAdviceCompleted;
import com.stepChangeRem.remediation.pages.EstablishClientNeedsPage;
import com.stepChangeRem.remediation.pages.ExplainTheProcessPage;
import com.stepChangeRem.remediation.pages.FinalQuestionsPage;
import com.stepChangeRem.remediation.pages.FinalQuestions_AssetsPage;
import com.stepChangeRem.remediation.pages.FinalQuestions_FutureChangesPage;
import com.stepChangeRem.remediation.pages.Homepage;
import com.stepChangeRem.remediation.pages.LoginPage;
import com.stepChangeRem.remediation.pages.ReviewYourBudget;
import com.stepChangeRem.remediation.pages.ReviewYourOptionsPage;
import com.stepChangeRem.remediation.pages.ReviewYourOptions_YourAdvicePrinciplesPage;
import com.stepChangeRem.remediation.pages.YouAreAllDonePage;
import com.stepChangeRem.remediation.pages.YourBudgetSummaryReview;
import com.stepChangeRem.remediation.pages.YourChoosenSolution_YourAdviceSessionIsCompletePage;
import com.stepChangeRem.remediation.pages.YourDashBoardPage;
import com.stepChangeRem.remediation.pages.YourDebtsPage;
import com.stepChangeRem.remediation.pages.YourHouseHoldPage;
import com.stepChangeRem.remediation.pages.YourIncomePage;
import com.stepChangeRem.remediation.pages.YourPriorityPayments_ArrangementsforPriorityArrearsPage;
import com.stepChangeRem.remediation.pages.YourSpendingFixedCost;
import com.stepChangeRem.remediation.pages.YourSpendingFlexibleCost;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;

import cucumber.api.java.en.Then;


public class StepDef_SC89941 extends CucumberGenericTest{
		
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
		ReviewYourOptions_YourAdvicePrinciplesPage reviewYourOptionsYourAdvicePrinciplesPage;
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

		
		
		public StepDef_SC89941() {
			
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
			reviewYourOptionsYourAdvicePrinciplesPage=new ReviewYourOptions_YourAdvicePrinciplesPage();
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

		@Given("^User login with credentials$")
		public void User_login_with_credentials()
		{
			loginPageObj.UserEntersLoginCredentials();
		}

		@And("^Navigate to the Spending Fixed Costs page and enter the data as JointMPA$")
		public void Navigate_to_the_Spending_Fixed_Costs_page_and_enter_the_data_as_JointMPA()
		{
			yourDebtPageObj.navigateToDashBoardpage();
			yourDashBordPageObj.NavigateToSpendingFixedAsJointMPA();
		//	yourDashBordPageObj.ClickOnYourSpendingButton();
			yourSpendingFixedPage.EnterdetailsofJointMPA();
			yourDebtPageObj.navigateToDashBoardpage();

		}

		@And("^Navigate to the Debts page and enter the data as JointMPA$")
		public void Navigate_to_the_Debts_page_and_enter_the_data_as_JointMPA()
		{
			yourDashBordPageObj.NavigateToDebtsAsJointMPA();
			yourDebtPageObj.debtsWithCreditorsforJointMPA();
		}

		@And("User creates Establish clientOne and clientTwo client details as JointMPA")
		public void userCreatesEstablishClientOneAndClientTwoClientDetailsAsJointMPA() {

		//	establishClientNeedPageObj.fillClient1Details();
			establishClientNeedPageObj.fillClientDetailsJointMPA();
		}

		@Then("^client1 and client2 gets register with the valid emails$")
		public void client1_and_client2_gets_register_with_the_valid_emails()
		{
			confirmEmailAddress.fillconfirmEmailTwoClients();
		}

		@And("^User enters the details of client1 and client2 in your household page$")
		public void User_enters_the_details_of_client1_and_client2_in_your_household_page()
		{
			yourDashBordPageObj.ClickOnYourHouseHoldButton();
			yourHousholdPageObj.FillClient01Client02Details();
		}

		@And("Navigate to the Income page and enter the data as JointMPA")
		public void navigateToTheIncomePageAndEnterTheDataAsJointMPA() {
			yourDashBordPageObj.NavigateToYourIncomepageJointMPA();
			yourIncomePageObj.FillIncomeJointMPA();

		}

		@And("Navigate to the Spending Flexible Costs page and enter the data as JointMPA")
		public void navigateToTheSpendingFlexibleCostsPageAndEnterTheDataAsJointMPA() {
			//yourSpendingFixedPage.getContinueYourFixedSpendingButton().click();
			yourSpendingFixedPage.clickContinueYourFixedSpendingButton();
			yourSpendingFlexiblePage.EnterdetailsJointMPA();

		}

		@And("Navigate through Review your budget and make no changes as JointMPA")
		public void navigateThroughReviewYourBudgetAndMakeNoChangesAsJointMPA() {
			yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();
			reviewYourBudgetPage.ClickonContinueButtonReviewBudget();
			YourBudgetSummaryReviewPage.ClickContinueOnBudgetSummarypage();

		}

		@And("Navigate to the Final Questions page and  enter details in Assets page as JointMPA")
		public void navigateToTheFinalQuestionsPageAndEnterDetailsInAssetsPageAsJointMPA() {
			yourDashBordPageObj.ClickOnFinalQuestionstButton();
			finalQuestionPage.FillAssestsJointMPA();

		}



		@And("add answers for all the final questions as JointMPA")
		public void addAnswersForAllTheFinalQuestionsAsJointMPA() {
			finalQuestionFutureChange.ClickAllChangeshavebeenapturedCheckBox();
			finalQuestionFutureChange.clickContinueButton();
			finalQuestionFutureChange.ClickFutureChangesPageContinueButton89941();
			finalQuestionMainPage.FinalQuestionsJointMPA();

		}

		@And("Navigate to the Priority Arrears page and select Calculate as JointMPA")
		public void navigateToThePriorityArrearsPageAndSelectCalculateAsJointMPA() {
			yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
			yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageJointMPA();

		}

		@And("Navigate to Savings page and click Yes as JointMPA")
		public void navigateToSavingsPageAndClickYesAsJointMPA() {
			yourPriorityPaymentsArrearsPage.savingAmountJointMPA();

		}

		@Then("continue with Review your options as JointMPA")
		public void continueWithReviewYourOptionsAsJointMPA() {
			yourDashBordPageObj.ClickOnReviewYourOptionsButton();

			reviewYourOptionsYourAdvicePrinciplesPage.getContinueButton().click();


		}

		@And("Choose your solution as JointMPA download the PAP")
		public void Choose_your_solution_as_JointMPA_download_the_PAP() {
			//yourDashBordPageObj.ClickOnYourChoosenSolutionButton();
			ReviewYourOptionObj.ClickMonthlypaymentsasJointMPA();
//			yourChoosenSolutionActiveSession.ClickOnDownloadPersonalActionPlanButton();
//			yourChoosenSolutionActiveSession.ClickOnYourAdviceSessionIsCompletePageSaveAndExitButton();

		}

		@And("create Account and fill account Registration form as JointMPA")
		public void createAccountAndFillAccountRegistrationFormAsJointMPA() {
			explainTheProcessPageObj.createAccount();
			accountRegistrationPage.fillAccountRegnForm();
		//	accountRegistrationPage.fillUserDetailsAsJointMPA();
			accountRegistrationPage.fillAccountRegnFormClient2();
			accountRegistrationPage.createAccount();

		}
	}
