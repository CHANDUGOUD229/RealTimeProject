package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.onlinePages.*;
import com.stepChangeRem.remediation.pages.online.OnlineHomePage;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OnlineStepDef_SC89963 extends CucumberGenericTest {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    //Pages
    JourneyStartsHerePage journeyStartsHerePageObj;
    AccountRegistrationPage CreateStepChangeAccountPage;
    DashBoardPageOnline DashBoardPage;
    HouseholdPage HouseholdPageObj;
    OnlineHomePage onlineHomePage;
    AdditionalQuestionsDebtsPage additionalquestionsObj;
    BudgetLooksGoodPage budgetlookgoodPageObj;
    CreatingYourBudgetPage creatingYourBudgetPageObj;
    FinalQuestionFutureChangesPage finalquestionFutureChangesPageObj;
    FinalQuestionMainpage finalQuestionmainPageObj;
    FinalQuestionYourAssetsPage finalQuestionassetsPageObj;
    OurApproachGivingAdvicePage ourApproachGivingAdvicePageObj;
    YourBudgetSummaryPage yourBudgetSummarypageObj;
    YourCurrentBudgetPage yourCurrentBudgetPageObj;
    YourDebtPage yourDebtsPageObj;
    YourIncomePage yourincomePageObj;
    YourPriorityPaymentsPage yourPriorityPaymentsPageObj;
    YourRecommendedSolutionPage yourRecommendedSolutionPageObj;
    YourSpendingPage yourSpendingPageObj;


    public OnlineStepDef_SC89963(){
        journeyStartsHerePageObj = new JourneyStartsHerePage();
        CreateStepChangeAccountPage= new AccountRegistrationPage();
        DashBoardPage = new DashBoardPageOnline();
        HouseholdPageObj= new HouseholdPage();
        onlineHomePage=new OnlineHomePage();
        additionalquestionsObj = new AdditionalQuestionsDebtsPage();
        budgetlookgoodPageObj = new BudgetLooksGoodPage();
        creatingYourBudgetPageObj = new CreatingYourBudgetPage();
        finalquestionFutureChangesPageObj = new FinalQuestionFutureChangesPage();
        finalQuestionmainPageObj = new FinalQuestionMainpage();
        finalQuestionassetsPageObj = new FinalQuestionYourAssetsPage();
        ourApproachGivingAdvicePageObj = new OurApproachGivingAdvicePage();
        yourBudgetSummarypageObj = new YourBudgetSummaryPage();
        yourCurrentBudgetPageObj = new YourCurrentBudgetPage();
        yourDebtsPageObj = new YourDebtPage();
        yourincomePageObj = new YourIncomePage();
        yourPriorityPaymentsPageObj = new YourPriorityPaymentsPage();
        yourRecommendedSolutionPageObj = new YourRecommendedSolutionPage();
        yourSpendingPageObj = new YourSpendingPage();
    }


   /* @Given("^User in Your debt advice journey starts here page and enter data$")
    public void user_in_Your_debt_advice_journey_starts_here_page_and_enter_data()  {


    }*/

    @When("^User Navigate to Create a StepChange account page and Clicks Continue without registering$")
    public void user_Navigate_to_Create_a_StepChange_account_page_and_Clicks_Continue_without_registering()  {
        journeyStartsHerePageObj.EnterClientDetailsfor89963("27",3,5);
        CreateStepChangeAccountPage.withoutRegistrationOnline();


    }

    @Then("^User Naviagate to Your House hold Page from dashboard and enter valid data$")
    public void user_Naviagate_to_Your_House_hold_Page_from_dashboard_and_enter_valid_data()  {
        DashBoardPage.SelectingHousehold89963();
        HouseholdPageObj.FillHouseholdPageDetailsfor89963(7,6,5);

    }

    @Then("^User Navigate to Debts page and enter debts details$")
    public void user_Navigate_to_Debts_page_and_enter_debts_details()  {
        DashBoardPage.SelectingYourDebts89963();
        yourDebtsPageObj.EntertwoDebtDetailsfor89963("Natwest","2800","British Gas","3000");
        additionalquestionsObj.SelectNoForAllAdditionalQuestionFor89963();

    }

    @Then("^User Naviagate to Creating your budget from dashboard and Click on Continue$")
    public void user_Naviagate_to_Creating_your_budget_from_dashboard_and_Click_on_Continue()  {
        DashBoardPage.SelectingCreatingYourBudget();
        creatingYourBudgetPageObj.ClickonConinueButtonofCreatingyourBudgetfor89963();

    }

    @Then("^User Navigate to Your Income Page and Click on Continue$")
    public void user_Navigate_to_Your_Income_Page_and_Click_on_Continue()  {
       /* DashBoardPage.SelectingYourIncome();
        GenericMethods_cvp.implicitWait(4000);*/
        GenericMethods_cvp.implicitWait(4000);
        yourincomePageObj.getContinuebuttonforYourIncomePage().click();
        GenericMethods_cvp.implicitWait(4000);
        yourincomePageObj.getIhaveAddedEverythingYesRbinDebtPopUp().click();
        GenericMethods_cvp.implicitWait(4000);
        yourincomePageObj.getConfirmButtoninDebtPopUp().click();
        GenericMethods_cvp.implicitWait(4000);

    }


    @Then("^user Navigate to Your Spending cost Page from dashboard and Enter valid data$")
    public void user_Navigate_to_Your_Spending_cost_Page_from_dashboard_and_Enter_valid_data()  {
        DashBoardPage.SelectingYourSpending();
        yourSpendingPageObj.FillSpendingPagedatafor89963("200",4,"110",5,"5",4);

    }

    @Then("^user Navigate to Your Advice on your budget Page from dashboard and Click on Register to Save Progress link$")
    public void user_Navigate_to_Your_Advice_on_your_budget_Page_from_dashboard_and_Click_on_Register_to_Save_Progress_link()  {
        DashBoardPage.SelectingAdviceonYourBudget();
        yourCurrentBudgetPageObj.getRegisteToSaveProgresslink().click();

    }

    @Then("^user Navigate to Create Step Change Account page and Enter Valid data$")
    public void user_Navigate_to_Create_Step_Change_Account_page_and_Enter_Valid_data()  {
        CreateStepChangeAccountPage.CreateAccountforClient89963();

    }
    @Then("^Create Step Change Account page and Enter Valid data89944$")
    public void Create_Step_Change_Account_page_and_Enter_Valid_data89944()  {
        CreateStepChangeAccountPage.CreateAccountforClient89944();

    }
    @Then("^Create Step Change Account page and Enter Valid data899447$")
    public void Create_Step_Change_Account_page_and_Enter_Valid_data89947()  {
        CreateStepChangeAccountPage.CreateAccountforClient89947();

    }
    @Then("^Create Step Change Account page and Enter Valid data89950$")
    public void Create_Step_Change_Account_page_and_Enter_Valid_data89950()  {
        CreateStepChangeAccountPage.CreateAccountforClient89950();

    }
    @Then("^Create Step Change Account page and Enter Valid data89954$")
    public void Create_Step_Change_Account_page_and_Enter_Valid_data89954()  {
        CreateStepChangeAccountPage.CreateAccountforClient89954();

    }

    @Then("^User Navigate to Your Income Page from dashboard and Enter Valid data$")
    public void user_Navigate_to_Your_Income_Page_from_dashboard_and_Enter_Valid_data()  {
        DashBoardPage.SelectingYourIncomeButtonAfterBack();
        yourincomePageObj.FillincomePagedetailsfor89963("146.20",2);

    }

    @Then("^user Navigate to Your Advice on your budget Page from dashboard and perform Action on Page$")
    public void user_Navigate_to_Your_Advice_on_your_budget_Page_from_dashboard_and_perform_Action_on_Page()  {
        DashBoardPage.SelectingAdviceonYourBudget();
        yourCurrentBudgetPageObj.performActionsonyourCurrentBudgetPage();

    }

    @Then("^user Navigate to Your your budget Summary page and Perform Action On Page$")
    public void user_Navigate_to_Your_your_budget_Summary_page_and_Perform_Action_On_Page()  {
        GenericMethods_cvp.implicitWait(4000);
        yourBudgetSummarypageObj.getContinueButton().click();
        GenericMethods_cvp.implicitWait(4000);

    }

    @Then("^user Navigate to Final Question Assets page and Future Changes Page and perform Action on page$")
    public void user_Navigate_to_Final_Question_Assets_page_and_Future_Changes_Page_and_perform_Action_on_page()  {
        DashBoardPage.SelectingFinalQuestion();
        finalQuestionassetsPageObj.PerformActionsOnAssetsPagefor89963();
        finalquestionFutureChangesPageObj.PerformActionsoFutureChangesPage();

    }

    @Then("^User Navigate to Final Questions Page and Perform Action on Page$")
    public void user_Navigate_to_Final_Questions_Page_and_Perform_Action_on_Page()  {
        finalQuestionmainPageObj.PerformActionOnFinalQuestionMainPage();

    }

    @Then("^User Navigate to Your priority payments page from dashboard and Click on Continue$")
    public void user_Navigate_to_Your_priority_payments_page_from_dashboard_and_Click_on_Continue()  {
        DashBoardPage.SelectingYourPriorityPayments();
        yourPriorityPaymentsPageObj.ClickonConinueButtonofCreatingyourBudgetfor89963();


    }

    @Then("^User Navigate to Review Your options page from dashboard and Click on Continue$")
    public void user_Navigate_to_Review_Your_options_page_from_dashboard_and_Click_on_Continue()  {
        DashBoardPage.SelectingReviewYourOption();
        ourApproachGivingAdvicePageObj.PerformActionsonourApproachGivingAdvicePage();


    }

    @Then("^Verify Payment Suspension is one of the recommended solution from Your Recommended Solutions Page$")
    public void verify_Payment_Suspension_is_one_of_the_recommended_solution_from_Your_Recommended_Solutions_Page()  {
        yourRecommendedSolutionPageObj.SelectPaymentSuspensionPlan();
        yourRecommendedSolutionPageObj.VerifyPaymentSuspensionPlan();

    }
    @Then("^Click on close and close Browser$")
    public void Click_on_close_and_close_Browser()  {
        DashBoardPage.getCloseButton().click();
        GenericMethods_cvp.implicitWait(4000);
        getDriver().quit();

    }


}
