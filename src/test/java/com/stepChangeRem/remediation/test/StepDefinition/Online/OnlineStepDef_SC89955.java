package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.onlinePages.*;
import com.stepChangeRem.remediation.pages.helper.online.OnlineAdviceOnYourBudgetPage;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDashBoardHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDebtHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineIncomeHelper;
import com.stepChangeRem.remediation.pages.online.OnlineHomePage;
import com.stepchange.atf.tests.CucumberGenericTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OnlineStepDef_SC89955 extends CucumberGenericTest {
	OnlineDashBoardHelper houseHolds=new OnlineDashBoardHelper();
    OnlineDebtHelper helper=new OnlineDebtHelper();
    OnlineAdviceOnYourBudgetPage adviceOnYourBudgetPage=new OnlineAdviceOnYourBudgetPage();
    //Pages
    JourneyStartsHerePage journeyStartsHerePageObj;
    AccountRegistrationPage CreateStepChangeAccountPage;
    DashBoardPageOnline DashBoardPage;
    HouseholdPage HouseholdPageObj;
    OnlineHomePage onlineHomePage;
    YourDebtPage yourDebtPageOnlne;
    AdditionalQuestionsDebtsPage AdditionQuesPageOnline;
    CreatingYourBudgetPage creatYourBudgetObj;
    YourIncomePage incomePageOnline;
    YourSpendingPage spendingPageOnline;
    YourCurrentBudgetPage yourCurrentBudgetPageObj;
    FinalQuestionYourAssetsPage fialQuestionAllPageAction;
    YourPriorityPaymentsPage smallSavingAndYourPriorityPage;
    YourRecommendedSolutionPage yourRecomendedSolverification;
    OnlineIncomeHelper help;

    public OnlineStepDef_SC89955(){
        help=new OnlineIncomeHelper();
        journeyStartsHerePageObj = new JourneyStartsHerePage();
        CreateStepChangeAccountPage= new AccountRegistrationPage();
        DashBoardPage = new DashBoardPageOnline();
        HouseholdPageObj= new HouseholdPage();
        onlineHomePage=new OnlineHomePage();
        yourDebtPageOnlne=new YourDebtPage();
        AdditionQuesPageOnline=new AdditionalQuestionsDebtsPage();
        creatYourBudgetObj = new CreatingYourBudgetPage();
        incomePageOnline = new YourIncomePage();
        spendingPageOnline = new YourSpendingPage();
        yourCurrentBudgetPageObj= new YourCurrentBudgetPage();
        fialQuestionAllPageAction=new FinalQuestionYourAssetsPage();
        smallSavingAndYourPriorityPage=new YourPriorityPaymentsPage();
        yourRecomendedSolverification = new YourRecommendedSolutionPage();

    }
    @Given("^User is on Your debt advice journey starts here page$")
    public void user_is_on_Your_debt_advice_journey_starts_here_page() {
        onlineHomePage.clickOnClickMe();
    }

    @When("^User enters the client details and click on continue$")
    public void user_enters_the_client_details_and_click_on_continue() {
        journeyStartsHerePageObj.EnteringClientDetailOnStartPage89955();
    }

    @When("^On Step Change Account Registration continue without registration$")
    public void on_Step_Change_Account_Registration_continue_without_registration() {
        CreateStepChangeAccountPage.withoutRegistrationOnline();
    }

    @When("^Navigate to household from dashboard and enter the details$")
    public void navigate_to_household_from_dashboard_and_enter_the_details() {
        DashBoardPage.SelectingHousehold89955();
        HouseholdPageObj.actionSetHouseholdSC89955();
    }

    @When("^Navigate to debt page from dashboard and enter the details$")
    public void navigate_to_debt_page_from_dashboard_and_enter_the_details() {
        DashBoardPage.SelectingYourDebts();
        yourDebtPageOnlne.ActionSetOnDebt89955();
    }

    @When("^Action on Additional questions about your debts page$")
    public void action_on_Additional_questions_about_your_debts_page() {
        AdditionQuesPageOnline.selectAllNo();
    }

    @When("^From dashboard navigate to creating your Budget page$")
    public void from_dashboard_navigate_to_creating_your_Budget_page() {
        DashBoardPage.SelectingCreatingYourBudget();
        creatYourBudgetObj.continueButtonCreateBudget();

    }

    @Then("^Enter the details on your income page$")
    public void enter_the_details_on_your_income_page() {
        //For below method using Data table from 89923
        //incomePageOnline.actionOnIncomeOnline89955();
        incomePageOnline.ContinueActionOnIncomePage();

    }

    @Then("^From dashboard navigate to your Spending$")
    public void from_dashboard_navigate_to_your_Spending() {
        DashBoardPage.SelectingYourSpending();
    }

    @Then("^Enter the details on your spending$")
    public void enter_the_details_on_your_spending() {
        spendingPageOnline.actionSetSpending89955();
    }

    @Then("^From dashboard navigate to advice on your budget as Your current budget page$")
    public void from_dashboard_navigate_to_advice_on_your_budget_as_Your_current_budget_page() {
        DashBoardPage.SelectingAdviceonYourBudget();
        yourCurrentBudgetPageObj.ActionSetYourCurrentBudget89955();
    }

    @Then("^Action on Your budget looks good page$")
    public void action_on_Your_budget_looks_good_page() {


    }

    @Then("^Action on Now On Your budget summary page$")
    public void action_on_Now_On_Your_budget_summary_page() {


    }

    @Then("^From dashboard click on final question navigate to Your assets$")
    public void from_dashboard_click_on_final_question_navigate_to_Your_assets() {
        DashBoardPage.SelectingFinalQuestion();
        fialQuestionAllPageAction.ActionSetAssetAndFutureChanges();


    }

    @Then("^Action on final question future changes page$")
    public void action_on_final_question_future_changes_page() {


    }

    @Then("^Select No as answer for final question page$")
    public void select_No_as_answer_for_final_question_page() {


    }

    @Then("^From dashboard navigate to your priority payments and do action$")
    public void from_dashboard_navigate_to_your_priority_payments_and_do_action() {
        DashBoardPage.SelectingYourPriorityPayments();
        smallSavingAndYourPriorityPage.ActionSetOnPriorityAndSavingSmallAmount();


    }

    @Then("^Action on Consider saving a small amount Page$")
    public void action_on_Consider_saving_a_small_amount_Page() {


    }

    @Then("^From dashboard select review your option navigate to Our approach to giving you advice$")
    public void from_dashboard_select_review_your_option_navigate_to_Our_approach_to_giving_you_advice() {
        DashBoardPage.SelectingReviewYourOption();
        yourRecomendedSolverification.ActionSetRecommendedSolutionAndReviewOption89955();


    }

    @Then("^Verify Individual voluntary arrangement is one of the recommended solution$")
    public void verify_Individual_voluntary_arrangement_is_one_of_the_recommended_solution() {
    	//DashBoardPage.clickRecommendedLink();
    	//houseHolds.getReviewOptions().click();
        //helper.getContinueButton().click();
        houseHolds.getFinOutMore().click();
        houseHolds.getReturnToSolution().click();
        houseHolds.getSolution().click();
        helper.getContinueButton().click();
 
    }

    @Then("^Click on close and select I don’t want to save my progress Link$")
    public void click_on_close_and_select_I_don_t_want_to_save_my_progress_Link() {
    		DashBoardPage.clickProgressLink();

    }

    @Then("^close Browser$")
    public void close_Browser() {
        DashBoardPage.CloseAndDontwantToSave89955();
        getDriver().quit();

    }
    @Then("^Quit Browser")
    public void Quit_Browser(){
        getDriver().quit();
    }
}
