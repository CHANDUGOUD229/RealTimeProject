package com.stepChangeRem.remediation.test.StepDefinition.CSR;

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


public class StepDef_SC89930 extends CucumberGenericTest{
	
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

	
	
	public StepDef_SC89930() {
		
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
	@Then("^User Should Navigate to Home Page and Enter Mandatory Filed$")
	public void user_Should_Navigate_to_Home_Page_and_Enter_Mandatory_Filed(){
	    
	 
	}

	@Then("^User Enter Details On Capture Referral Organisation Page$")
	public void user_Enter_Details_On_Capture_Referral_Organisation_Page(){
	    
	 
	}

	@Then("^User should Navigate to Establish client needs page and fill all Details$")
	public void user_should_Navigate_to_Establish_client_needs_page_and_fill_all_Details(){
	    
	 
	}

	@Then("^User Should Navigate to Explain the process Page and Click on Create An Account Button$")
	public void user_Should_Navigate_to_Explain_the_process_Page_and_Click_on_Create_An_Account_Button(){
	    
	 
	}

	@Then("^User Fill Account Regristation Form$")
	public void user_Fill_Account_Regristation_Form(){
	    
	 
	}

	@Then("^User fill the Email Confirmation$")
	public void user_fill_the_Email_Confirmation(){
	    
	 
	}

	@Then("^User Ushould Navigate to Your household Page and Fill All data$")
	public void user_Ushould_Navigate_to_Your_household_Page_and_Fill_All_data(){
	    
	 
	}

	@Then("^User Enter CreditorOne CreditorTwo CreditorTree Details in YourDebts Page$")
	public void user_Enter_CreditorOne_CreditorTwo_CreditorTree_Details_in_YourDebts_Page(){
	    
	 
	}

	@Then("^User Navigate to your income page and Fill All required Data$")
	public void user_Navigate_to_your_income_page_and_Fill_All_required_Data(){
	    
	 
	}

	@Then("^User Should Navigate To spending fixed cost Page and Fill Required Data$")
	public void user_Should_Navigate_To_spending_fixed_cost_Page_and_Fill_Required_Data(){
	    
	 
	}

	@Then("^User Should Navigate to all spending flexible cost Page and fill All Required Data$")
	public void user_Should_Navigate_to_all_spending_flexible_cost_Page_and_fill_All_Required_Data(){
	    
	 
	}

	@Then("^User Select Advice on Your Budget and Navigate to Review Budget and Budget Summary Page$")
	public void user_Select_Advice_on_Your_Budget_and_Navigate_to_Review_Budget_and_Budget_Summary_Page(){
	    
	 
	}

	@Then("^User Perform Action On Final Question Page$")
	public void user_Perform_Action_On_Final_Question_Page(){
	    
	 
	}

	@Then("^User fill details in Future changes Capture page$")
	public void user_fill_details_in_Future_changes_Capture_page(){
	
	 
	}

	@Then("^User Should Navigate to Our Advice Princle Page and Click on Continue Page$")
	public void user_Should_Navigate_to_Our_Advice_Princle_Page_and_Click_on_Continue_Page(){
	    
	 
	}

	@Then("^User Should able to See Your priority arrears$")
	public void user_Should_able_to_See_Your_priority_arrears(){
	    
	 
	}

	@Then("^User Calculate all details in Arrangements for priority arrears Page and click On Continue Button$")
	public void user_Calculate_all_details_in_Arrangements_for_priority_arrears_Page_and_click_On_Continue_Button(){
	    
	 
	}

	@Then("^User Can See Your debt advice with TPP$")
	public void user_Can_See_Your_debt_advice_with_TPP(){
	    
	 
	}

	@Then("^User Should Manage debts in TPP$")
	public void user_Should_Manage_debts_in_TPP(){
	    
	 
	}

	@Then("^User Should checked Data persistence$")
	public void user_Should_checked_Data_persistence(){
	    
	 
	}

	@Then("^User End the Session and complete in You Are All Done Page$")
	public void user_End_the_Session_and_complete_in_You_Are_All_Done_Page(){
	    
	 
	}

	@Then("^User Search UATDMPVer Admin Only and open the case using Client(\\d+)$")
	public void user_Search_UATDMPVer_Admin_Only_and_open_the_case_using_Client(int arg1){
	    
	 
	}

	@Then("^User Complete all stages of verification and End the Session by clicking on You are all Done$")
	public void user_Complete_all_stages_of_verification_and_End_the_Session_by_clicking_on_You_are_all_Done(){
	    
	 
	}

	@Then("^User End Session  Debt advice completed and  Client returned displayed session ended$")
	public void user_End_Session_Debt_advice_completed_and_Client_returned_displayed_session_ended(){
	    
	 
	}

	@Then("^User check data persistence for DCS$")
	public void user_check_data_persistence_for_DCS(){
	    
	 
	}

	@Then("^Data persistence should checked$")
	public void data_persistence_should_checked(){
	    
	 
	}
}
