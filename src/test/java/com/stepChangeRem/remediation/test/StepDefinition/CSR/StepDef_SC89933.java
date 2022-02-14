package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepChangeRem.remediation.pages.helper.AssetPageHelper;
import com.stepChangeRem.remediation.pages.helper.YourDebtsHelper;
import com.stepChangeRem.remediation.pages.helper.vo.AssetsFields;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.testdata.SoleClientFinancialSolutionsTestData;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.util.List;

public class StepDef_SC89933 extends CucumberGenericTest{
	public static WebDriver driver;
	public GenericMethodsRemediation genericMethods;
	public LogWriter writer = new LogWriter();
	public String featurefile="";
	
	AccountRegistration accountRegistrationPage;
	ClientSearchPage clientSearchPage;
	ConfirmEmailAddressPage confirmEmailAddress;
	CreateYourBudget createYourBudget;
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
	YourDebtsHelper debtHelper;
	AssetPageHelper assetPageHelper;
	
	
	public StepDef_SC89933() {
		assetPageHelper=new AssetPageHelper();
		debtHelper=new YourDebtsHelper();
		accountRegistrationPage = new AccountRegistration();
		clientSearchPage = new ClientSearchPage();
		confirmEmailAddress = new 	ConfirmEmailAddressPage();
		createYourBudget = new CreateYourBudget();
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
	
//	@Before
//	public void initializeCucumberTest(Scenario scenario) {
//		initialise(scenario.getName().replace("/", "or"));
//		String URL= getBrowser().getBrowserProperties().getEnvironmentURL();
//		System.out.println("URL: "+URL);
//		getDriver().get(URL);
//		maximiseWindow();
//		getBrowser().sleep(3000);
//	}
	
	@After
	public void tearDownCucumberTest(Scenario scenario) {
		if(scenario.isFailed()){
			logScreenshot();
			//captureYourDebts.logoutFromApplication();
		}

	}
     
	//data
			public String UserName =SoleClientFinancialSolutionsTestData.getTestData().getUserName();
			public String Password =SoleClientFinancialSolutionsTestData.getTestData().getPassword();
			public String ERRDropDownValue =SoleClientFinancialSolutionsTestData.getTestData().getERRDropDownValue();
			public String address =SoleClientFinancialSolutionsTestData.getTestData().getAddress();

	       	
	@Given("^User is in login page$")
	public void user_is_in_login_page()  {
        loginPageObj.VerifyingTroubleloggingInText();
			     
	}

	@When("^User enteres the credentials and click on login Button$")
	public void user_enteres_the_credentials_and_click_on_login_Button()  {
		loginPageObj.EnterUsername(UserName);
		loginPageObj.EnterPassword(Password);
		loginPageObj.clickLoginButton();
		//yourDashBordPageObj.getAboutYouButton().click();
	     
	}

	@When("^Click On New Button$")
	public void click_On_New_Button() throws InterruptedException, AWTException {
		Thread.sleep(5000);
	/*	for(int i=0; i<2; i++){
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}*/
		homePageObj.clickNewButton();

	}

	@When("^Select PhoneCall Option$")
	public void select_PhoneCall_Option() {
		homePageObj.selectphoneCall();
	    
	}

	@When("^Create new debt Advice case$")
	public void create_new_debt_Advice_case() throws InterruptedException {
		clientSearchPage.createNewDebtAdviceCase();
	    
	}

	@When("^Select Referral Route as ERR$")
	public void select_Referral_Route_as_ERR()   {
		captureReferalObj.ClickReferralRouteErrMethod();
		
	}

	@When("^Select who Referred Them$")
	public void select_who_Referred_Them()   {
		captureReferalObj.SelectERRDropDownValue(ERRDropDownValue);
	    
	}

	@When("^Click On CaptureReferralContinue Button$")
	public void click_On_CaptureReferralContinue_Button()   {
		captureReferalObj.ClickCaptureReferralContinue();
	    
	}

	@When("^Select cause Of Financial difficulty$")
	public void select_cause_Of_Financial_difficulty()   {
//	getBrowser().sleep(getBrowser().getTimeout());
		getBrowser().sleep(3000);
	establishClientNeedPageObj.SelectCauseOfFinancialDifficulty("Unemployment or redundancy");
		getBrowser().sleep(6000);

	}

	@When("^Fill the Client data$")
	public void fill_the_Client_data()   {
//		establishClientNeedPageObj.fillClientDetails("RemediationA2", "DemoTestB", "60");
		
	}

	@When("^click on Create Account Button$")
	public void click_on_Create_Account_Button()   {
		getBrowser().sleep(getBrowser().getTimeout());
		explainTheProcessPageObj.createAccount();	
	    
	}

	@When("^Fill Account Regristation Form$")
	public void fill_Account_Regristation_Form()   {
	accountRegistrationPage.fillAccountRegnForm();
	accountRegistrationPage.createAccount();
	    
	}

    @And("User Links the Asset in Assets Page And Clicks on Continue")
    public void userLinksTheAssetInAssetsPageAndClicksOnContinue() {
		debtHelper.getAddLinkedItem().click();
		debtHelper.getSelectMotagagedAsset().click();
		debtHelper.getSubmitButton().click();
		debtHelper.getMainHomeAmount().enterText("17000");
		debtHelper.getMainHomeDropdown().selectFromDropdownByIndex(1);

    }

	@And("User Perform Action in Final Question page")
	public void userPerformActionInFinalQuestionPage() {
		yourDashBordPageObj.checkBoxForAllCaptured();
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton();
		finalQuestionMainPage.getWhatisaDebtSolutionNoButtonforClient1().click();//
		finalQuestionMainPage.getEmployementBeEffectedInsolvencyYesButtonforclient2No().click();
		finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();//11
	}

	@Then("User Naigates to Final Questions Page")
	public void userNaigatesToFinalQuestionsPage() {
		yourDashBordPageObj.ClickOnFinalQuestionstButton();
	}

	@Then("User Navigates to Asset Page And performs the below Opertations")
	public void userNavigatesToAssetPageAndPerformsTheBelowOpertations(DataTable values) {
		List<AssetsFields> assetsFields = values.asList(AssetsFields.class);
		assetPageHelper.fillAssetDetails(assetsFields);
	}

	@And("User Navigates to Review Your Options Page DMP as recommended Solution")
	public void userNavigatesToReviewYourOptionsPageDMPAsRecommendedSolution() {
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		OurAdvicePrinciplespage.getContinueButton().click();
		ReviewYourOptionObj.getDroFindOut().click();
		ReviewYourOptionObj.getReturnToDebtSolutionsBtn().click();
		ReviewYourOptionObj.getDMPCheckBox().click();
		ReviewYourOptionObj.clickOnContinueButtonYourRecommondedSolutionButton();
	}
	@And("^User Navigates to Review Your Options Page89933$")
	public void userNavigatesToReviewYourOptionsPage89933() {
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		OurAdvicePrinciplespage.getContinueButton().click();
		ReviewYourOptionObj.getDroFindOut().click();
		ReviewYourOptionObj.getReturnToDebtSolutionsBtn().click();
		ReviewYourOptionObj.getSolutionCheckBox89933().click();
		ReviewYourOptionObj.clickOnContinueButtonYourRecommondedSolutionButton();
	}
//
//	@When("^Enter the Email Confirmation$")
//	public void enter_the_Email_Confirmation()   {
//		confirmEmailAddress.fillConfirmEmailAddressDetails("RemediationA2@aol.com");
//	    
//	}
//
//	@Then("^About you should displayed as Locked$")
//	public void about_you_should_displayed_as_Locked()   {
//	//	dashBordPPage.verifyIsAboutYouLocked();
//		yourDashBordPageObj.verifyIsAboutYouLocked();
//	    
//	}
//	@Then("^click on your house hold Button from dashbord$")
//	public void click_on_your_house_hold_Button_from_dashbord()  {
//		yourDashBordPageObj.ClickOnYourHouseHoldButton();	     
//	}
//
//	@Then("^Enter the details for your house page$")
//	public void enter_the_details_for_your_house_page()  {
////		yourHousholdPageObj.SelectHouseStatusFromDropDown();
////		yourHousholdPageObj.SelectmaritalStatusFromDropDown();
////		yourHousholdPageObj.ClickAdultsLivingWithClientToAddButton();
////		yourHousholdPageObj.SelectClientEmployementStatusFromDropDown();
//	
//	}
//	
//	
//	@Then("^click on YourHouseholdContinue  Button$")
//	public void click_on_YourHouseholdContinue_Button()  {
////		yourHousholdPageObj.ClickYourHouseholdContinueButton();
////		yourHousholdPageObj.ClickOnHousHoldPopUpTextField();
////		yourHousholdPageObj.ClickHouseHoldSummaryConfirmButton();  
//	}
//
//	@Then("^click on your debt$")
//	public void click_on_your_debt()   {
//		yourDebtPageObj.ClickAddaDebtButton();
//	    
//	}
//
//	@Then("^select no button for are they laible question$")
//	public void select_no_button_for_are_they_laible_question()   {
//		
//		yourDebtPageObj.SelectNoFromAretheyLiableInGlobalQuestion();
//
//	    
//	}
//
//	@Then("^click on submit Button$")
//	public void click_on_submit_Button()   {
//		yourDebtPageObj.ClickSubmitButtonInGlobalQuestion();
//
//	    
//	}
//
//	@Then("^add debt(\\d+) and debt(\\d+) detais$")
//	public void add_debt_and_debt_detais(int arg1, int arg2)   {
//	//	getBrowser().sleep(5000);
////		yourDebtPageObj.EnterCreditorNameinTextFiled();
////		yourDebtPageObj.EnterDebtTypeNameinTextFiled();
////		yourDebtPageObj.EnterAmountOwedinTextField();
//		//yourDebtPageObj.EnterCreditorNameinTextFiled();
//		yourDebtPageObj.ClickArrearsOrFurtherActionNoButton();
//		yourDebtPageObj.SelectLiabilityFromDropDown();
//		yourDebtPageObj.ClickArrearsOrFurtherActionNoButton();
//		yourDebtPageObj.ClickDetailedViewLink();
//		yourDebtPageObj.EnterOriginalRegularPaymentInTextBox();
//		yourDebtPageObj.SelectOriginalRegularpaymentTimeSelectionDropdown();
//		yourDebtPageObj.ClickAreYouBehindWithpayementNoButton();
//		yourDebtPageObj.ClickIstheDebtSubjectToAGuarantorNoButton();
//		yourDebtPageObj.ClickAddaDebtButton();
//		yourDebtPageObj.EnterCreditor2NameinTextFiled();
//		yourDebtPageObj.EnterDebtType2NameinTextFiled();
//		yourDebtPageObj.EnterAmountOwed2inTextField();
//		yourDebtPageObj.SelectLiability2FromDropDown();
//		yourDebtPageObj.ClickArrearsOrFurtherActionNoButton2();
//		yourDebtPageObj.ClickDetailedViewLink2();
//		yourDebtPageObj.ClickRepaidArrearsNoButton();
//		yourDebtPageObj.SelectMortgageTypeFromDropDown();
//		yourDebtPageObj.ClickIsSVRNoButton();
//		yourDebtPageObj.ClickAreYouBehindWithpayementNoButton2();
//		yourDebtPageObj.ClickAddLinkeditemButton();//popup
//		yourDebtPageObj.EnterMortgagePaymentAmountInTextBox();
//		yourDebtPageObj.SelectFrequencyFromDropDown();
//		yourDebtPageObj.ClickMainHomeCheckBox();
//		yourDebtPageObj.ClickLinksAlertSubmitButton();
//		yourDebtPageObj.ClickAllOfClientsDebtshavebeenCapturedCheckBox();
//		yourDebtPageObj.ClickDoTheyDisputebalanceNoButtonInGlobalQuestionAlert();
//		yourDebtPageObj.ClickDoTheyBelieveStatueBarredorPrescribedQuestionNoButtonInGlobalQuestionAlert();
//		yourDebtPageObj.ClickSubmitButtonInGlobalQuestion();
//
//	}
//
//	@Then("^click on YourDebtsContinue Button$")
//	public void click_on_YourDebtsContinue_Button()   {
//		yourDebtPageObj.ClickyourDebtsPageContinueButton();
//	    
//	}
//
//	@Then("^click on create your budget$")
//	public void click_on_create_your_budget()   {
//		yourDashBordPageObj.ClickOnCreatingYourBudgetButton();
//		
//	}
//	
//	@Then("^click on CreatingYourBudgetcontinue Button$")
//	public void click_on_CreatingYourBudgetcontinue_Button() {
//		createYourBudget.clickCreateBudgetContinueButton();
//	}
//	
//	@Then("^enter the details on your income page$")
//	public void enter_the_details_on_your_income_page()   {
//		yourIncomePageObj.EnterWagsEarning();
//		yourIncomePageObj.SelectMonthlyDropdown();
//		yourIncomePageObj.ClickOtherIncomesNonDependentRemoveButton();
//	 
//	    
//	}
//
//	@Then("^select all income item completed Checkbox$")
//	public void select_all_income_item_completed_Checkbox()   {
//	 
//		yourIncomePageObj.ClickgetAllincomeChekcbox();
//	
//	}
//	
//	@Then("^click on YourIncomePagecontinue Button$")
//	public void click_on_YourIncomePagecontinue_Button() {
//		
//		yourIncomePageObj.ClickYourIncomePageContinueButton();
//	}
//
//	@Then("^enter the detais for all spending fixed cost$")
//	public void enter_the_detais_for_all_spending_fixed_cost()   {
//		yourSpendingFixedPage.RemoveUnwantedOptionsInSpendingFixedCostPage();
//		yourSpendingFixedPage.EnterCouncilTax();
//		yourSpendingFixedPage.SelectCouncileMonthlyDropdown();
//		yourSpendingFixedPage.ClickOnNoButtonForCouncileArrear();
//		yourSpendingFixedPage.EnterTvLicence();
//		yourSpendingFixedPage.SelectTvLicenceMonthlyDropdown();
//		yourSpendingFixedPage.ClickOnNoButtonForTvLicenceArrear();
//		yourSpendingFixedPage.EnterElectricityBil();
//		yourSpendingFixedPage.SelectElectricityMonthlyDropdown();
//		yourSpendingFixedPage.SelectNoButtonForElectricityArrear();
//		yourSpendingFixedPage.EnterGasBil();
//		yourSpendingFixedPage.SelectGasMonthlyDropdown();
//		yourSpendingFixedPage.SelectNoButtonForGasArrear();
//		yourSpendingFixedPage.EnterWaterBil();
//		yourSpendingFixedPage.SelectWaterMonthlyDropdown();
//		yourSpendingFixedPage.SelectNoButtonForWaterArrear();
//		yourSpendingFixedPage.EnterBillingAndInsurance();
//		yourSpendingFixedPage.SelectInsuranceMonthlyDropdown();
//		yourSpendingFixedPage.SelectNoButtonForInsuranceArrear();
//		yourSpendingFixedPage.ClickAllFixedSpendingChekcbox();
//		
//		
//	}
//	
//	@Then("^click on YourSpendingFixedCostcontinue Button$")
//	public void click_on_YourSpendingFixedCostcontinue_Button()
//	{
//		yourSpendingFixedPage.ClickContinueButtonYourSpendingFixedCast();
//	}
//
//	@Then("^enter the detais for all spending flexible cost$")
//	public void enter_the_detais_for_all_spending_flexible_cost()   {
//		yourSpendingFlexiblePage.EnterGroceries();
//		yourSpendingFlexiblePage.SelectfoodAndGroceriesDropdown();
//		yourSpendingFlexiblePage.RemoveUnwantedOptionsFromSpendingFlexibleCostpage();
////		yourSpendingFlexiblePage.EnterGroceries();
////		yourSpendingFlexiblePage.SelectfoodAndGroceriesDropdown();
//		yourSpendingFlexiblePage.RemovePersonalCostButton();//popup
//	}
//
//	@Then("^select check box for other people contribut from reasone for spend pop up$")
//	public void select_check_box_for_other_people_contribut_from_reasone_for_spend_pop_up()   {
//	 
//		yourSpendingFlexiblePage.SelectOtherPeopleContributionCheckbox();		
//
//	}
//   
//	@Then("^click on ReasoneForSpendingsubmit Button$")
//	public void click_on_ReasoneForSpendingsubmit_Button() {
//		yourSpendingFlexiblePage.SelectReasoneForSpendSubmitButton();
//	}
//	
//	@Then("^select all flexible spending itemscompleted Checkbox$")
//	public void select_all_flexible_spending_itemscompleted_Checkbox()   {
//		yourSpendingFlexiblePage.SelectAllFlexibleSpendingCompletedCheckbox();
//
//	}
//
//	@Then("^click on YourSpendingFlexibleCostContinue Button$")
//	public void click_on_YourSpendingFlexibleCostContinue_Button()   {
//		yourSpendingFlexiblePage.SelectcontinueYourFlexibleSpendingButton();
//	}
//
//	@Then("^click on advice on your budget from dashbord$")
//	public void click_on_advice_on_your_budget_from_dashbord()   {
//		yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();
//	}
//	
//
//	@Then("^click on ReviewYourBudgetContinue Button on budget summary page$")
//	public void click_on_ReviewYourBudgetContinue_Button_on_budget_summary_page()   {
//		reviewYourBudgetPage.ActionOnShowSummaryContinueButton();
//	    
//	}
//	
//	@Then("^click on YourBudgetSummaryContinue Button$")
//	public void click_on_YourBudgetSummaryContinue_Button() {
//		YourBudgetSummaryReviewPage.ActionOnYourBugdetSummaryContinueButton();
//	}
//
//	@Then("^click on final question from dashbord$")
//	public void click_on_final_question_from_dashbord()   {
//	//	YourBudgetSummaryReviewPage.ActionOnYourBugdetSummaryContinueButton();
//		yourDashBordPageObj.ClickOnFinalQuestionstButton();
//	    
//	}
//
//	@Then("^enter the details for assets$")
//	public void enter_the_details_for_assets()   {
//		
//		finalQuestionPage.EnterDatainMainHomeTextBox();
//	    
//	}
//
//	@Then("^select the all of client assets checkbox$")
//	public void select_the_all_of_client_assets_checkbox()   {
//		finalQuestionPage.ClickAllofClientsAssetshavebeenCapturedCheckBox();
//		
//	    
//	}
//	
//	@Then("^click on AssestPageContinue Button$")
//	public void click_on_AssestPageContinue_Button() {
//		finalQuestionPage.ClickAssetsPageContinewButton();
//	}
//
//	@Then("^select all changes captured in future changes page$")
//	public void select_all_changes_captured_in_future_changes_page()   {
//		finalQuestionFutureChange.ClickAllChangeshavebeenapturedCheckBox();
//	    
//	}
//	
//	@Then("^click on FutureChangesPageContinue Button$")
//	public void click_on_FutureChangesPageContinue_Button() {
//		finalQuestionFutureChange.ClickFutureChangesPageContinueButton();
//	}
//
//	@Then("^select all option as NO$")
//	public void select_all_option_as_NO()   {
//		finalQuestionMainPage.ClickWhatTypesofJobsCouldbeAffectedNoButton();
//		finalQuestionMainPage.ClickWhatisaDebtSolutionNoButton();	 
//	    
//	}
//	
//	@Then("^click on FinalQuestionContinue Button$")
//	public void click_on_FinalQuestionContinue_Button() {
//		finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();
//	}
//
//	@Then("^click on your priority payments from dashbord$")
//	public void click_on_your_priority_payments_from_dashbord()   {
//		yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
//		
//	}
//	
//	@Then("^click on ClickArrangementsforPriorityArrearsContinue Button$")
//	public void click_on_ClickArrangementsforPriorityArrearsContinue_Button() {
//		yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageContinueButton();
//	}
//
//	
//	@Then("^click on review your option from dashbord$")
//	public void click_on_review_your_option_from_dashbord()   {
//		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
//		
//		
//	    
//	}
//	
//	@Then("^click on OurAdvicePageContinue Button$")
//	public void click_on_OurAdvicePageContinue_Button() {
//		OurAdvicePrinciplespage.ClickOnOurAdvicePronciplesPageContinueButton();
//	}
//
//	@Then("^select I’d like to discuss my options from review your option page$")
//	public void select_I_d_like_to_discuss_my_options_from_review_your_option_page()   {
//		ReviewYourOptionObj.clickLiketoDiscussMyOptionsCheckBox();
//	    
//	}
//
//	@Then("^click on Find out more Button$")
//	public void click_on_Find_out_more_Button()   {
//		//ReviewYourOptionObj.clickLiketoDiscussMyOptionsCheckBox();
//		ReviewYourOptionObj.clickOnFindOutMoreButton();
////		ReviewYourOptionObj.clickOnReturnToDebtSolutionsBtn();
////		ReviewYourOptionObj.clickonInterestedInPaymentsCheckbox();
////		ReviewYourOptionObj.clickOnContinueButtonYourRecommondedSolutionButton();
//	}
//	
//	
//
//	@Then("^click on return to debt solution Button$")
//	public void click_on_return_to_debt_solution_Button()   {
//		ReviewYourOptionObj.clickOnReturnToDebtSolutionsBtn();
//		
//	    
//	}
//	
//	@Then("^click on I'm interested in payment suspension checkbox$")
//	public void click_on_interested_in_payment_suspension_checkbox()
//	{
//	    ReviewYourOptionObj.clickonInterestedInPaymentsCheckbox();
//	    
//    } 
//	@Then("^click on YourRecommondedSolutionContinue Button$")
//	public void click_on_YourRecommondedSolutionContinue_Button() {
//		ReviewYourOptionObj.clickOnContinueButtonYourRecommondedSolutionButton();
//	}
//
//	@Then("^click on your choosen solution from dashbord$")
//	public void click_on_your_choosen_solution_from_dashbord()   {
//		yourDashBordPageObj.ClickOnYourChoosenSolutionButton();
//		
//		
//	    
//	}
//
//	@Then("^click on download PAP Button from your advice session completed page$")
//	public void click_on_download_PAP_Button_from_your_advice_session_completed_page()   {
//		yourChoosenSolutionActiveSession.ClickOnDownloadPersonalActionPlanButton();
//	 
//	    
//	}
//
//	@Then("^then selet no radio button$")
//	public void then_selet_no_radio_button()   {
//		yourChoosenSolutionActiveSession.ClickOnDoestheClientwantToWarmTransferifpossibleNoRadioButton();
//	 
//	    
//	}
//
//	@Then("^click on save and exit Button$")
//	public void click_on_save_and_exit_Button()   {
//		//yourChoosenSolutionActiveSession.ClickOnDownloadPersonalActionPlanButton();
//		yourChoosenSolutionActiveSession.ClickOnYourAdviceSessionIsCompletePageSaveAndExitButton();
//	 //endSessionDebtAdvicePage.clickOnEndSessionButton();
//	   //endSessionDebtAdvicePage.clickOnSaveClientData();
//		//endSessionDebtAdvicePage.selectReasonForEndingSession();
//		//endSessionDebtAdvicePage.submitProvideGeneralAdvise();
//		//endSessionDebtAdvicePage.clickOnSubmitButton();
//	}
//
//	@Then("^Click on End Session Button$")
//	public void click_on_End_Session_Button()   {
//		endSessionDebtAdvicePage.clickOnEndSessionButton();
//	}
//
//	@Then("^Click On Save Client data option as NO$")
//	public void click_On_Save_Client_data_option_as_NO()   {
//		endSessionDebtAdvicePage.clickOnSaveClientData();
//	    
//	}
//
//	@Then("^Select the reason For Ending Session Dropdown as Full session$")
//	public void select_the_reason_For_Ending_Session_Dropdown_as_Full_session()   {
//		endSessionDebtAdvicePage.selectReasonForEndingSession();
//	    
//	}
//
//	@Then("^Click On provide General Advise as No$")
//	public void click_On_provide_General_Advise_as_No()   {
//		endSessionDebtAdvicePage.submitProvideGeneralAdvise();
//	    
//	}
//
//	@Then("^Click on Submit Button$")
//	public void click_on_Submit_Button()   {
//		endSessionDebtAdvicePage.clickOnSubmitButton();
//	    
	}
//---	
	//-------------------------------------------------------------------------------------------//	
			// Starting scenario 89937:-
//			  Scenario: Validate HomePage Functionality
//			  Given User is in login page
//			  When User enteres the credentials and click on login Button 
//			  And Click On New Button
//			  And Select PhoneCall Option
//			  And Create new debt Advice case
			
		
	