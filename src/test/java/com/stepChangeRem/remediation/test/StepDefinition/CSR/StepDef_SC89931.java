package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepChangeRem.remediation.pages.helper.AssetPageHelper;
import com.stepChangeRem.remediation.pages.helper.vo.AssetsFields;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;


public class StepDef_SC89931 extends CucumberGenericTest{
		
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
		AssetPageHelper asset;

		
		
		public StepDef_SC89931() {
			
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
			asset=new AssetPageHelper();
		}
		

	
	
	@When("^In the Establish Client Needs page capture Financial difficulty$")
	public void in_the_Establish_Client_Needs_page_capture_Financial_difficulty()   {
	//		establishClientNeedPageObj.fillClientDetailsScotland();
	}

	@Then("^Register the client using email$")
	public void register_the_client_using_email()   {
	
	
	}

	@Then("^Add no Assets or Future Changes$")
	public void add_no_Assets_or_Future_Changes()   {
	
	
	}

	@Then("^Navigate to the Final Questions page and select <No> for all questions$")
	public void navigate_to_the_Final_Questions_page_and_select_No_for_all_questions()   {
	
	
	}

	@Then("^Navigate to Savings page and click <Yes>$")
	public void navigate_to_Savings_page_and_click_Yes()   {
	
	
	}

	@Then("^Navigate to the solutions page verify Admin Order is one of the available solutions$")
	public void navigate_to_the_solutions_page_verify_Admin_Order_is_one_of_the_available_solutions()   {
	
	
	}

	@When("^Proceed with selected Solution$")
	public void proceed_with_selected_Solution()   {
	
	
	}

	@When("^<Save and exit> and <End Session>$")
	public void save_and_exit_and_End_Session()   {
	
	
	}

	@When("^Search and open the case Via POST and go to Detailed View$")
	public void search_and_open_the_case_Via_POST_and_go_to_Detailed_View()   {
	
	
	}

	@When("^In Detailed View verify the details$")
	public void in_Detailed_View_verify_the_details()   {
	
	
	}

	@When("^End Session$")
	public void end_Session()   {
	
	
	}

        @Then("User Navigates to Asset Page And add Asset")
        public void userNavigatesToAssetPageAndAddAsset(DataTable values) {
			List<AssetsFields> assetsFields = new ArrayList<AssetsFields>(values.asList(AssetsFields.class));
			asset.fillAssetDetails(assetsFields);

        }
    }
