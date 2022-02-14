package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import cucumber.api.java.en.And;
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
import cucumber.api.java.en.When;

import java.awt.*;


public class StepDef_SC89937 extends CucumberGenericTest{
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



	public StepDef_SC89937() {

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

	@When("^Perform Logout And Close Browser$")
	public void Perform_Logout_And_Close_Browser() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		homePageObj.clickUserIconButton();

	}

	@Then("^perform action on capture referal page$")
	public void perform_action_on_capture_referal_page()   {
		captureReferalObj.fillCaptureReferralpage89934("Other");
	}

	@Then("^Actions on Establish client needs page$")
	public void Actions_on_Establish_client_needs_page()   {
		establishClientNeedPageObj.ActionSetClientNeedPage89937();
	}
	@Then("^Action on Account Registration page$")
	public void Action_on_Account_Registration_page()   {
	//	explainTheProcessPageObj.getContinueAsGuest().click();
		explainTheProcessPageObj.createAccount();
		accountRegistrationPage.fillAccountRegnFormSC89937();
		accountRegistrationPage.createAccount();
		accountRegistrationPage.fillConfirmEmailAddressDetails();
	}
	@Then("^Action on Your house hold from dashbord$")
	public void Action_on_Your_house_hold_from_dashbord() {
		yourDashBordPageObj.ClickOnYourHouseHoldButton();
		yourHousholdPageObj.ActionSetYourHouseHold89937();
	}
//	@Then("^Action on Your household page$")
//	public void Action_on_Your_household_page()   {
//		yourHousholdPageObj.ActionOnHousePageSC89937();
//	
//		
//		}
////	@Then("^Action on Household summary page$")
////	public void Action_on_Household_summary_page()   {
////	Covered this action "Action on Your household page$"	
////		
////		}	
	@Then("^Action on Your Debt page$")
	public void Action_on_Your_Debt_page()   {
		yourDebtPageObj.ClickAddaDebtButton();
		yourDebtPageObj.EnterCreditor1Details89937();
		}
	@Then("^Action on Create your budget from dashbord and proceed$")
	public void Action_on_Create_your_budget_from_dashbord_and_proceed()   {
		yourDashBordPageObj.ClickonCreateYourBudgetButton();
		createYourBudget.ClickonContinueCreateBudgetButton();
		}
//	@Then("^Action on create your budget page$")
//	public void Action_on_create_your_budget_page()   {
//		createYourBudget.clickCreateBudgetContinueButton();
//	}
	@Then("^Action on Your income pageSCB$")
	public void Action_on_Your_income_pageSCB()   {
		yourIncomePageObj.YourIncomePageActionSC89937();
		}
	@Then("^Action on Your Spending fixed costs PageSCB$")
	public void Action_on_Your_Spending_fixed_costs_Page()   {
		yourSpendingFixedPage.SetOfActionYourSpendingFixedSC89937();
		}
	@Then("^Action on Your Spending flexible costsSCB$")
	public void Action_on_Your_Spending_flexible_costsSCB()   {
		yourSpendingFlexiblePage.SetOfActionSpendingFlexibleCostSC89937();
		}
//	@Then("^Action on Advice on your budget from dashbord$")
//	public void Action_on_Advice_on_your_budget_from_dashbord()   {
//		yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();
//		}
	@Then("^Action on Review budgetAndSummary pageSCB$")
	public void Action_on_Review_budgetAndSummary_pageSCB()   {
		//yourSpendingFlexiblePage.ContinueOnSpending();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();
		//reviewYourBudgetPage.ActionOnShowSummaryContinueButton();
		YourBudgetSummaryReviewPage.ClickContinueOnBudgetSummarypage();
		//getBrowser().sleep(getBrowser().getTimeout() / 10);
		}
	@Then("^Action on Assets PageSCB$")
	public void Action_on_Assets_PageSCB()   {
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourDashBordPageObj.ClickOnFinalQuestionstButton();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionPage.FinalQuestionsFillAsset89934();
		}
	@Then("^Action on Future changes PageSCB$")
	public void Action_on_Future_changes_PageSCB()   {
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton89941();
//		finalQuestionFutureChange.getAllChangeshavebeenCapturedCheckBox().click();
//		finalQuestionFutureChange.ClickFutureChangesPageContinueButton();

	}
//	@When("^Action on final question from dashbord$")
//	public void action_on_final_question_from_dashbord()   {
//		finalQuestionMainPage.SetOfActionFinalQuestionMainPageSC89937();}
//
	@Then("^Action on Final questions PageSCB$")
	public void Action_on_Final_questions_PageSCB()   {
		finalQuestionMainPage.FillrequireddetailsasQASC89937();
		}
////	***** Not an issue with code till here 		//
////	@When("^Action on your priority payment from dashbord$")
////	public void action_on_your_priority_payment_from_dashbord()   {
////		 	}
//
	@When("^Action on Arrangements for priority arrears PageSCB$")
	public void action_on_Arrangements_for_priority_arrears_PageSCB()   {
		yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
		yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageContinueButton();
	}
//
	@When("^Action on review your option from dashbordSCB$")
	public void action_on_review_your_option_from_dashbordSCB()   {
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		OurAdvicePrinciplespage.ClickOnOurAdvicePrinciplesPageContinueButton();
		ReviewYourOptionObj.selectPaymentSuspSolution89937();
//		yourDashBordPageObj.ClickOnYourChoosenSolutionButton();
//		yourChoosenSolutionActiveSession.ClickOnDownloadPersonalActionPlanButton();
		//yourChoosenSolutionActiveSession.ClickOnYourAdviceSessionIsCompletePageSaveAndExitButton();
		//yourChoosenSolutionActiveSession.LogOutAndCloseBrowser();
	}
	@And("User Ends the session and Logout from the ApplicationSCB89937")
	public void user_Ends_The_Session_And_Logout_From_The_ApplicationSCB89937() {
		homePageObj.getEndSession().click();
		homePageObj.getEndSessionConfirm().click();
		yourChoosenSolutionActiveSession.LogOutAndCloseBrowser();
//		homePageObj.getClickOnAvatar().click();
//		homePageObj.getLogout().click();

	}
////
////	@When("^Action on Our advice principles Page$")
////	public void action_on_Our_advice_principles_Page()   {
////		OurAdvicePrinciplespage.ClickOnOurAdvicePronciplesPageContinueButton();   
////	   
////	}
//
//	@When("^Action on Review your options page$")
//	public void action_on_Review_your_options_page()   {
//		yourDashBordPageObj.ClickOnReviewYourOptionsButton();    
//		OurAdvicePrinciplespage.ClickOnOurAdvicePronciplesPageContinueButton(); 
////		ReviewYourOptionObj.clickLiketoDiscussMyOptionsCheckBox();//Will use incase of not work
//		ReviewYourOptionObj.clickOnFindOutMoreButton();
//		ReviewYourOptionObj.clickOnReturnToDebtSolutionsBtn();
//		ReviewYourOptionObj.clickonInterestedInPaymentsCheckbox();
//		ReviewYourOptionObj.clickOnContinueButtonYourRecommondedSolutionButton();
//	}
//
//	@When("^Action on chosen solution option from dashbord$")
//	public void action_on_chosen_solution_option_from_dashbord()   {
//		yourDashBordPageObj.ClickOnYourChoosenSolutionButton();
//		yourChoosenSolutionActiveSession.ClickOnDownloadPersonalActionPlanButton();
//		yourChoosenSolutionActiveSession.ClickOnYourAdviceSessionIsCompletePageSaveAndExitButton();
//		
//	   
//	}
//
//	@When("^Action on Your advice session is complete Page$")
//	public void action_on_Your_advice_session_is_complete_Page()   {
//		endSessionDebtAdvicePage.clickOnEndSessionButton();
//	    endSessionDebtAdvicePage.clickOnSaveClientData();
// // Submitted without any question, f required will uncommnet below line
//	    endSessionDebtAdvicePage.selectReasonForEndingSession();
//		endSessionDebtAdvicePage.submitProvideGeneralAdvise();
//		endSessionDebtAdvicePage.clickOnSubmitButton();  
//	   
//	}
////************** Not an issue with code till here**********************//
//	@When("^Action on home page for admin verification$")
//	public void action_on_home_page_for_admin_verification()   {
//		  homePageObj.clickNewButton();
//		  homePageObj.slectAdminOnlyOption();   
//	   
//	}
//
//	@When("^open the case in detail view and verify as admin$")
//	public void open_the_case_in_detail_view_and_verify_as_admin()   {
//		clientSearchPage.SetOfActionClientSearchAdminSC89937();
//		CaseDetailsPageAdminAndViewOnlyOption.SetOfActionCaseDetailPageAdminViewSC89937();
//	     
//	}
//
//	@When("^Action on case to make as non proceed case$")
//	public void action_on_case_to_make_as_non_proceed_case()   {
//		yourDashBordPageObj.ActionOnTreeDotAndNonProcessCaseSC89937();
//		}
//
//	@When("^Capture reason for non-proceed page$")
//	public void capture_reason_for_non_proceed_page()   {
//		ReasoneForNonPorcessCasePage.SetOfActionOnCaptureReasoneNonProceed(); 
//	   
//	}
//
//	@When("^Action on You are all done page$")
//	public void action_on_You_are_all_done_page()   {
//		youAreAllDone.ClickOnEndSessionButton();
//	   
//	}
//
//	@When("^Action on End session Debt advice completed client returnedAdminOnly page$")
//	public void action_on_End_session_Debt_advice_completed_client_returnedAdminOnly_page()   {
//		endSessionDebtAdvicePage.allActionForEndSessionSC89937();
//	   
//	}
//
//	@When("^Action on home page for Read only verification$")
//	public void action_on_home_page_for_Read_only_verification()   {
//		  homePageObj.clickNewButton();
//		  homePageObj.slectReadOnlyOption();
//	   
//	}
//
//	@When("^open the case in detail view and verify as read only$")
//	public void open_the_case_in_detail_view_and_verify_as_read_only()   {
//		clientSearchPage.SetOfActionClientSearchReadOnlySC89937();;
//		CaseDetailsPageAdminAndViewOnlyOption.SetOfActionCaseDetailPageViewOnlySC89937();
//	   
//	}
//	@When("^Action on End session Debt advice completed client returnedViewOnly page$")
//	public void Action_on_End_session_Debt_advice_completed_client_returnedViewOnly_page()   {
//		endSessionDebtAdvicePage.allActionForEndSessionSC89937();
//	   
//	}
//	@When("^Action on End session Debt advice completed client returnedViewOnlypage$")
//	public void action_on_End_session_Debt_advice_completed_client_returnedViewOnlypage()  {
//		endSessionDebtAdvicePage.allActionForEndSessionSC89937();
//	}
//	
////-------------------------------------------------------------------------------------------


}


       


