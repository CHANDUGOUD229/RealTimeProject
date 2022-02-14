package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDef_SC89940 extends CucumberGenericTest {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	public static WebDriver driver;
	// public GenericMethods genericMethodsCvp;
	public LogWriter writer = new LogWriter();
	public String featurefile = "";

	AccountRegistration accountRegistrationPage;
	ClientSearchPage clientSearchPage;
	ConfirmEmailAddressPage confirmEmailAddress;
	CreateYourBudget createYourBudget;
	// DashBoardPageP dashBordPPage;
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
	YourPriorityPayments_ConsiderSaveSmallAmountPage considersmallAmountSavingpage;
	DPACheckPage dpachechPage;
	RecentCasesPage recentCasesPage;
	SummaryPage summarypage;
	YourSpendingFixedCost yourSpendingFixedCost = new YourSpendingFixedCost();
	YourSpendingFlexibleCost yourSpendingFlexibleCost = new YourSpendingFlexibleCost();

	public StepDef_SC89940() {
		accountRegistrationPage = new AccountRegistration();
		clientSearchPage = new ClientSearchPage();
		confirmEmailAddress = new ConfirmEmailAddressPage();
		createYourBudget = new CreateYourBudget();
		// dashBordPPage = new DashBoardPageP();
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
		considersmallAmountSavingpage = new YourPriorityPayments_ConsiderSaveSmallAmountPage();
		dpachechPage = new DPACheckPage();
		recentCasesPage = new RecentCasesPage();
		summarypage = new SummaryPage();
	}

	// @Before
	// public void initializeCucumberTest(Scenario scenario) {
	// initialise(scenario.getName().replace("/", "or"));
	// String URL= getBrowser().getBrowserProperties().getEnvironmentURL();
	// System.out.println("URL: "+URL);
	// getDriver().get(URL);
	// maximiseWindow();
	// getBrowser().sleep(3000);
	// }

	@After
	public void tearDownCucumberTest(Scenario scenario) {
		if (scenario.isFailed()) {
			logScreenshot();
			// captureYourDebts.logoutFromApplication();
		}

	}

//	@Given("^User is in login page$")
//	public void user_is_in_login_page() {
//		// loginPageObj.VerifyingTroubleloggingInText();
//		loginPageObj.LoginintoApplication();
//	}

	@When("^User enteres the credentials and logged in$")
	public void user_enteres_the_credentials_and_logged_in() {
		loginPageObj.LoginintoApplication();

	}

	@Then("^User in HomePage and select mandatory fields$")
	public void user_in_HomePage_and_select_mandatory_fields() throws InterruptedException {
		homePageObj.clickNewButton();
		homePageObj.selectphoneCall();
		clientSearchPage.createNewDebtAdviceCase();

	}

	@Then("^User Enter details on Capture Refferal Page$")
	public void user_Enter_details_on_Capture_Refferal_Page() {

//		captureReferalObj.ClickReferralRouteDirectButton();
//		captureReferalObj.EntertextinWhoreferredThemTextField("Other");
//		captureReferalObj.ClickCaptureReferralContinue();

	}

	@Then("^User Enter Clients details on EstablishClient Needs page$")
	public void user_Enter_Clients_details_on_EstablishClient_Needs_page() {
		establishClientNeedPageObj.fillClient1andClient2Details("Remo", "surRemo", "38", "Alex", "surAlex", "34");
		establishClientNeedPageObj.SelectContinueButtonEstablishClientNeed();
		explainTheProcessPageObj.createAccount();
	}

	@Then("^user Register with  Client(\\d+) Details In Account Registration Page$")
	public void user_Register_with_Client_Details_In_Account_Registration_Page(int arg1) {
		accountRegistrationPage.fillAccountRegnForm();
		accountRegistrationPage.createAccount();
		confirmEmailAddress.fillConfirmEmailAddressDetails(accountRegistrationPage.finalValue + "@gmail.com");

	}

	@Then("^User Navigated to YourHouseHold Page and fill required data$")
	public void user_Navigated_to_YourHouseHold_Page_and_fill_required_data() {
		yourDashBordPageObj.verifyIsAboutYouLocked();
		yourDashBordPageObj.ClickOnYourHouseHoldButton();
		yourHousholdPageObj.SelectHouseStatusFromDropDown("Renting - Council");
		yourHousholdPageObj.SelectmaritalStatusFromDropDown("Civil Partnership");
		yourHousholdPageObj.EnterChildrensUnder16("2");
		yourHousholdPageObj.SelectClientEmployementStatusFromDropDown("Unemployed: looking for work");
		yourHousholdPageObj.SelectPartnerEmployementStatusfromDropdown("Zero hour contract");
		yourHousholdPageObj.ClickYourHouseholdContinueButton();
		yourHousholdPageObj.ClickHouseHoldSummaryConfirmButton();

	}

	@Then("^User Enters Debt(\\d+), Debt(\\d+) and Debt(\\d+) Details In YourDebts Page$")
	public void user_Enters_Debt_Debt_and_Debt_Details_In_YourDebts_Page(int arg1, int arg2, int arg3) {
		// for debt1
		
		/* yourDebtPageObj.ClickAddaDebtButton();
		 * yourDebtPageObj.ClickSubmitButtonInGlobalQuestion();
		 * yourDebtPageObj.EnterCreditor1NameinTextFiledfordebt1("Blackhorse");
		 * yourDebtPageObj.EnterDebtType1NameinTextFiledfordebt1("Other debt");
		 * yourDebtPageObj.EnterAmountOwed1inTextFieldfordebt1("10000");
		 * yourDebtPageObj.SelectLiability1FromDropDownfordebt1(3);
		 * yourDebtPageObj.ClickDetailedViewLinkForDebt1();
		 * yourDebtPageObj.ClickNoFurtherActionForDebt1(); //for debt2
		 * yourDebtPageObj.ClickAddaDebtButton();
		 * yourDebtPageObj.EnterCreditor2NameinTextFiledfordebt2("HSBC");
		 * yourDebtPageObj.EnterDebtType2NameinTextFiledfordebt2("Personal loan"
		 * ); yourDebtPageObj.EnterAmountOwedDebt2inTextFieldfordebt2("10500");
		 * yourDebtPageObj.SelectLiability2FromDropDownfordebt2(1);
		 * yourDebtPageObj.ClickDetailedViewLink2fordebt2();
		 * yourDebtPageObj.EnterOriginalRegularPaymentInTextBoxfordebt2("200");
		 * yourDebtPageObj.
		 * SelectOriginalRegularpaymentTimeSelectionDropdownforDebt2("month");
		 * yourDebtPageObj.ClickAreYouBehindWithpayementNoButton2fordebt2();
		 * //yourDebtPageObj.ClickIsSVRNoButtonfordebt2(); //for debt3
		 * yourDebtPageObj.ClickAddaDebtButton();
		 * yourDebtPageObj.EnterCreditorNameinTextFiledfordebt3("HSBC");
		 * yourDebtPageObj.EnterDebtTypeNameinTextFieldfordebt3("Personal loan"
		 * );
		 * yourDebtPageObj.EnterAmountOwedforDebtinTextFieldfordebt3("11000");
		 * yourDebtPageObj.SelectLiabilityforDebtFromDropDownfordebt3(2);
		 * yourDebtPageObj.ClickDetailedViewLinkfordebt3();
		 * yourDebtPageObj.EnterOriginalRegularPaymentInTextBoxfordebt3("300");
		 * yourDebtPageObj.
		 * SelectOriginalRegularpaymentTimeSelectionDropdownforDebt3("month");
		 * yourDebtPageObj.ClickAreYouBehindWithpayementNoButtonfordebt3();
		 * yourDebtPageObj.ClickIsSVRNoButtonfordebt3();
		 * yourDebtPageObj.ClickAllOfClientsDebtshavebeenCapturedCheckBox();
		 * yourDebtPageObj.
		 * ClickDoTheyDisputebalanceNoButtonInGlobalQuestionAlert();
		 * yourDebtPageObj.
		 * ClickDoTheyBelieveStatueBarredorPrescribedQuestionNoButtonInGlobalQuestionAlert
		 * (); yourDebtPageObj.ClickSubmitButtonInGlobalQuestion();
		 * yourDebtPageObj.ClickyourDebtsPageContinueButton();
		 */

		yourDebtPageObj.EnterDebtsforJointCase89940();
	}

	@Then("^User Clicks Continue Button In Creating Your Budget Page$")
	public void user_Clicks_Continue_Button_In_Creating_Your_Budget_Page() {
		yourDashBordPageObj.ClickOnCreatingYourBudgetButton();
		createYourBudget.clickCreateBudgetContinueButton();

	}

	@Then("^user Navigated to Spending-Fixed cost page and fill the data$")
	public void user_Navigated_to_Spending_Fixed_cost_page_and_fill_the_data() {
		System.out.println("=== Enter user Navigated to Spending-Fixed cost page and fill the data");
		// .enterSpendingDetailsFor89940();
		/*
		 * genericMethodsCvp.implicitWait(10000);
		 *
		 * genericMethodsCvp.implicitWait(10000);
		 * yourSpendingFixedPage.SelectChildcareOptionFromSpendingFixedcostpage(
		 * ); genericMethodsCvp.implicitWait(10000);
		 * yourSpendingFixedPage.RemoveUnwantedOptionFropSpendingFixedPage();
		 * genericMethodsCvp.implicitWait(10000);
		 * yourSpendingFixedPage.EnterRent("251.96");
		 * genericMethodsCvp.implicitWait(10000);
		 * yourSpendingFixedPage.SelectRentMonthlyDropdown();
		 * genericMethodsCvp.implicitWait(10000);
		 * yourSpendingFixedPage.ClickOnNoButtonForRentArrear();
		 * genericMethodsCvp.implicitWait(10000);
		 * yourSpendingFixedPage.EnterCouncilTax("100");
		 * yourSpendingFixedPage.SelectCouncileMonthlyDropdown();
		 * yourSpendingFixedPage.ClickOnNoButtonForCouncileArrear();
		 * yourSpendingFixedPage.EnterTvLicence("13.12");
		 * yourSpendingFixedPage.SelectTvLicenceMonthlyDropdown();
		 * yourSpendingFixedPage.ClickOnNoButtonForTvLicenceArrear();
		 * yourSpendingFixedPage.EnterElectricityBil("50");
		 * yourSpendingFixedPage.SelectElectricityMonthlyDropdown();
		 * yourSpendingFixedPage.SelectNoButtonForElectricityArrear();
		 * yourSpendingFixedPage.EnterGasBil("50");
		 * yourSpendingFixedPage.SelectGasMonthlyDropdown();
		 * yourSpendingFixedPage.SelectNoButtonForGasArrear();
		 * yourSpendingFixedPage.EnterWaterBil("50");
		 * yourSpendingFixedPage.SelectWaterMonthlyDropdown();
		 * yourSpendingFixedPage.SelectNoButtonForWaterArrear();
		 * yourSpendingFixedPage.EnterBillingAndInsurance("2");
		 * yourSpendingFixedPage.SelectInsuranceMonthlyDropdown();
		 * yourSpendingFixedPage.SelectNoButtonForInsuranceArrear();
		 * yourSpendingFixedPage.EnterChildcarevalue("100");
		 * yourSpendingFixedPage.SelectChildcareMonthlyDropdown();
		 * yourSpendingFixedPage.ClickOnNoButtonForChildcareArrear();
		 * yourSpendingFixedPage.EnterSchoolUniform("20");
		 * yourSpendingFixedPage.SelectSchoolUniformMonthlyDropdown();
		 * yourSpendingFixedPage.ClickAllFixedSpendingChekcbox();
		 * yourSpendingFixedPage.ClickContinueButtonYourSpendingFixedCast();
		 */

		genericMethodsCvp.implicitWait(10000);
		yourIncomePageObj.switchToActiveFrame();
		(new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(yourIncomePageObj.getYourSpendinglink().getSelector()));
		yourIncomePageObj.ClickYourSpendingLink();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourSpendingFixedCost.enterSpendingDetailsFor89940();

	}


	/*getBrowser().sleep(getBrowser().getTimeout()/10);
	   this.getRent().enterTextField("251.96");
	   getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getRentMonthly().selectFromDropdownByIndex(4);
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getRentArrearsNoButton().click();
		getBrowser().sleep(getBrowser().getTimeout()/10);*/

	@Then("^User Naviagated to Income page from top Navigation and fill required fields$")
	public void user_Naviagated_to_Income_page_from_top_Navigation_and_fill_required_fields() {
		System.out.println("=== Enter User Naviagated to Income page from top Navigation and fill required fields");
		getBrowser().sleep(6000);
		yourSpendingFixedPage.ClickContinueButtonYourSpendingFixedCast();
		getBrowser().sleep(10000);
		genericMethodsCvp.implicitWait(10000);
		yourIncomePageObj.switchToActiveFrame();
		(new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(yourSpendingFlexiblePage.getYourIncomelink().getSelector()));
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourSpendingFlexiblePage.clickYourIncomelink();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		getBrowser().sleep(10000);
		yourIncomePageObj.clickWagesremoveButton();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
//		yourIncomePageObj.clickChildTaxCreditremoveButton();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.clickWorkingtaxCreditremoveButton();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.clickUniversalCreditremoveButton();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.getJSIncomeBasedRemove().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.clickOnOtherEarnings();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.EnterOtherearnings("20");
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.getOtherEarningDropdown().selectFromDropdownByIndex(2);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.getOtherEarningOwnerDropdown().selectFromDropdownByIndex(2);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		getDriver().findElement(By.xpath("//button[.='child benefit']")).click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.EnterChildBenfit("34.40");
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.getChildBenfitDropdown().selectFromDropdownByIndex(1);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.getChildBenfitOwnerDropdown().selectFromDropdownByIndex(3);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.EnterHousingbenfit("100");
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.getHousingBenfitDropdown().selectFromDropdownByIndex(1);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.getHousingBenfitOwnerDropdown().selectFromDropdownByIndex(3);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.getJSContributionBasedText().enterText("229.70");
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.getJSContributionBasedDropDwn().selectFromDropdownByIndex(1);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.getJSSharedContributionBasedDropDwn().selectFromDropdownByIndex(3);
		//workaround code--vinod
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		//yourIncomePageObj.removeUnwantedOptionsFromIncomePage();
		yourIncomePageObj.ClickgetAllincomeChekcbox();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.ClickgetAllincomeChekcbox();
		//workaround code completed
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.clickOnOYesforAreYouHappythatsClientQuestions();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.ClickgetAllincomeChekcbox();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourIncomePageObj.ClickYourIncomePageContinueButton();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		System.out.println("=== Exist User Naviagated to Income page from top Navigation and fill required fields");

	}

	@Then("^user Naviagated to Spending-Flexible cost Page By clicking Hyperlink and fill Required fields$")
	public void user_Naviagated_to_Spending_Flexible_cost_Page_By_clicking_Hyperlink_and_fill_Required_fields() {
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourSpendingFixedPage.getFlexiblecostlink().click();
//		yourSpendingFlexibleCost.YourSpendingFlexibleCostActionSet_SC89940();  //8

	}

	@Then("^User Select Advice On your Budget Navigated to Review Budget and Budget Summary pages$")
	public void user_Select_Advice_On_your_Budget_Navigated_to_Review_Budget_and_Budget_Summary_pages() {
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();//10
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		//YourBudgetSummaryReviewPage.ClickContinueOnBudgetSummarypage();//******Cmt by Priya
		YourBudgetSummaryReviewPage.ClickContinueOnBudgetSummarypage89940();//******Added by priya
//		reviewYourBudgetPage.ActionOnShowSummaryContinueButton();//10
//		YourBudgetSummaryReviewPage.ActionOnYourBugdetSummaryContinueButton();//9


	}
	@Then("^User Perform Action on Final Question page89931$")
	public void user_Perform_Action_on_Final_Question_page89931() {
//		getBrowser().sleep(getBrowser().getTimeout() / 10);
//		yourDashBordPageObj.ClickOnFinalQuestionstButton();
//		getBrowser().sleep(getBrowser().getTimeout() / 10);
//		finalQuestionPage.getAllofClientsAssetshavebeenCapturedCheckBox_89940().click();
//		getBrowser().sleep(getBrowser().getTimeout() / 10);
//		finalQuestionPage.ClickAssetsPageContinewButton();   //add no asset  9
//		getBrowser().sleep(getBrowser().getTimeout() / 10);
//		finalQuestionFutureChange.ClickAllChangeshavebeenapturedCheckBox();//11
//		getBrowser().sleep(getBrowser().getTimeout() / 10);
//		finalQuestionFutureChange.ClickFutureChangesPageContinueButton();
		finalQuestionMainPage.selectNoForAllQuestion();//
		finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();//11
	}

	@Then("^User Perform Action on Final Question page$")
	public void user_Perform_Action_on_Final_Question_page() {
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		getBrowser().sleep(3000);
		yourDashBordPageObj.ClickOnFinalQuestionstButton();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionPage.getAllofClientsAssetshavebeenCapturedCheckBox_89940().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionPage.ClickAssetsPageContinewButton();   //add no asset  9
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		//finalQuestionFutureChange.ClickAllChangeshavebeenapturedCheckBox();//11 *****Cmt by Priya
		finalQuestionFutureChange.getAllChangescaptureCheckboc89941();//11****Added by Priya
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton();
		finalQuestionMainPage.selectNoForAllQuestion();//
		finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();//11
	}

	@Then("^User Perform Action on Final Question page Without Assets$")
	public void user_Perform_Action_on_Final_Question_page_without_assets() {

		getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionFutureChange.ClickAllChangeshavebeenapturedCheckBox();//11
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton();
		finalQuestionMainPage.selectNoForAllQuestion();//
		finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();//11

	}
	@Then("^User Perform Action on Final Question page Without Assets89930$")
	public void user_Perform_Action_on_Final_Question_page_without_assets89930() {
		//yourDashBordPageObj.ClickOnFinalQuestionstButton();
		finalQuestionPage.FinalQuestionsFillAsset89934();
		//getBrowser().sleep(getBrowser().getTimeout() / 10);
		finalQuestionFutureChange.ClickFutureChangesPageContinueButton89941();
		//here need to enter for debug-----------
		finalQuestionMainPage.clickNoForAllFinalQuestions();//
		finalQuestionMainPage.ClickFinalQuestionsPageContinueButton();//11

	}


	@Then("^User perform Action on Your Priority payments page$")
	public void user_perform_Action_on_Your_Priority_payments_page() {
		System.out.println("*** Enter in to User perform Action on Your Priority payments page");
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		yourDashBordPageObj.ClickOnYourPriorityPaymentsButton();
		yourPriorityPaymentsArrearsPage.ClickArrangementsforPriorityArrearsPageContinueButton();
		considersmallAmountSavingpage.ActionsOnConsidaerSaveSmallAmountPage();
		System.out.println("*** Exist User perform Action on Your Priority payments page");

	}

	@Then("^User perform Action on Review your option page and navigate to DashBoard$")
	public void user_perform_Action_on_Review_your_option_page_and_navigate_to_DashBoard() {

		System.out.print("*****Enter in to User perform Action on Review your option page and navigate to DashBoard");
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		OurAdvicePrinciplespage.ClickOnOurAdvicePrinciplesPageContinueButton();
		//getBrowser().sleep(getBrowser().getTimeout() / 30);
		//(new WebDriverWait(getDriver(),30)).until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//span[text()='Debt management plan'])[1]"), "Debt management plan"));
		//ReviewYourOptionObj.VerifyCurrentScenarioPlan_89940();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		//getBrowser().sleep(5000);//***Added by Priya
		//ReviewYourOptionObj.getBackTodashboard().click();
		//getBrowser().sleep(getBrowser().getTimeout() / 10);
		/*ReviewYourOptionObj.getThreedots().click();//cmt by priya
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		ReviewYourOptionObj.getNonProceedButton().click();*/
		

		//ReviewYourOptionObj.clickOnBacktoDashBoardlink();
		//yourDashBordPageObj.ClickOnMakeChangesinUnderstandYourSituationButton();
		//yourDashBordPageObj.ClickOnAreuSureMakeChangesConfirmButton();
		System.out.print("*****Exist From User perform Action on Review your option page and navigate to DashBoard");

	}

	@Then("^User Select Non Proceed Case  from Your Debt Advice Page$")
	public void user_Select_Non_Proceed_Case_from_Your_Debt_Advice_Page() {
		ReviewYourOptionObj.clickThreeDotsFromAdviceOnYourBudget();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		ReviewYourOptionObj.clickNonProceedFromAdviceOnYourBudget();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		ReviewYourOptionObj.SelectReasonfornonProceedingFromDropdown();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		//ReviewYourOptionObj.getSubmitButton().click();//**Cmt By Priya
		ReviewYourOptionObj.getNextButton().click();//** Added By priya
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		//youAreAllDone.VerifyResolvedNonProceedTextFromYouareAllDonePage();
	}

	/*@Then("^User Select About you and Client(\\d+) is removed from Establish Client Need page$")
	public void user_Select_About_you_and_Client_is_removed_from_Establish_Client_Need_page(int arg1) {

		yourDashBordPageObj.ClickOnAboutYouButton();
		captureReferalObj.ClickCaptureReferralContinue();
//		establishClientNeedPageObj.RemoveClient2fromEstablishClientneedspage();
//		establishClientNeedPageObj.AreuwantToRemoveClient2fromEstablishClientneed2page();
//		establishClientNeedPageObj.SelectContinueButtonEstablishClientNeed();

	}

	@Then("^User make No Changes in Your House Hold Page$")
	public void user_make_No_Changes_in_Your_House_Hold_Page() {
		yourDashBordPageObj.ClickOnYourHouseHoldButton();
		yourHousholdPageObj.ClickYourHouseholdContinueButton();
		yourHousholdPageObj.ClickHouseHoldSummaryConfirmButton();

	}

	@Then("^User verify Your Debts Page$")
	public void user_verify_Your_Debts_Page() {
		yourDebtPageObj.ClickAllOfClientsDebtshavebeenCapturedCheckBox();
		yourDebtPageObj.getAreTheyLiableQuestionYesButtonInGlobalQuestionsAlert();
		yourDebtPageObj.ClickSubmitButtonInGlobalQuestion();
		yourDebtPageObj.ClickyourDebtsPageContinueButton();

	}

	@Then("^User verify Your income page$")
	public void user_verify_Your_income_page() {
		yourDashBordPageObj.ClickOnCreatingYourBudgetButton();
		createYourBudget.clickCreateBudgetContinueButton();
		yourIncomePageObj.removeUnwantedOptionsFromIncomePage();
		yourIncomePageObj.ClickgetAllincomeChekcbox();
		yourIncomePageObj.ClickYourIncomePageContinueButton();
		yourSpendingFixedPage.ClickAllFixedSpendingChekcbox();
		yourSpendingFixedPage.ClickContinueButtonYourSpendingFixedCast();

	}

	@Then("^User Verify Your Spending Flexible Cost Page$")
	public void user_Verify_Your_Spending_Flexible_Cost_Page() {
		yourSpendingFlexiblePage.SelectAllFlexibleSpendingCompletedCheckbox();
		yourSpendingFlexiblePage.SelectcontinueYourFlexibleSpendingButton();

	}

	@Then("^User Perform Action on Advice On your Budget Page$")
	public void user_Perform_Action_on_Advice_On_your_Budget_Page() {
		yourDashBordPageObj.ClickOnAdviceOnYourBudgetButton();
		reviewYourBudgetPage.ActionOnShowSummaryContinueButton();
		YourBudgetSummaryReviewPage.ActionOnYourBugdetSummaryContinueButton();

	}



	@Then("^user perform Action on Review Your Option page$")
	public void user_perform_Action_on_Review_Your_Option_page() {
		yourDashBordPageObj.ClickOnReviewYourOptionsButton();
		OurAdvicePrinciplespage.ClickOnOurAdvicePrinciplesPageContinueButton();
		ReviewYourOptionObj.VerifyFinalScenarioPlan();

	}

	@Then("^User Select Non Proceed Case  from Your Debt Advice Page$")
	public void user_Select_Non_Proceed_Case_from_Your_Debt_Advice_Page() {
		ReviewYourOptionObj.clickThreeDotsFromAdviceOnYourBudget();
		ReviewYourOptionObj.clickNonProceedFromAdviceOnYourBudget();
		ReviewYourOptionObj.SelectReasonfornonProceedingFromDropdown();
		ReviewYourOptionObj.clickNextButtonfromReviewYourOptions();
		youAreAllDone.VerifyResolvedNonProceedTextFromYouareAllDonePage();
	}

	@Then("^User End the Session$")
	public void user_End_the_Session() {
		endSessionDebtAdvicePage.clickOnEndSessionButton();
		endSessionDebtAdvicePage.clickOnSaveClientData();
		endSessionDebtAdvicePage.selectReasonForEndingSessionByIndex();
		endSessionDebtAdvicePage.submitProvideGeneralAdvise();
		endSessionDebtAdvicePage.clickOnSubmitButton();
	}

	@Then("^User verify the data by open the case$")
	public void user_verify_the_data_by_open_the_case() {
		homePageObj.clickNewButton();
		homePageObj.selectphoneCall();
		clientSearchPage.EnterClientReferenceNumber("");
		clientSearchPage.ClickSearchButton();
		clientSearchPage.ClickFirstOptionButton();
		clientSearchPage.ClickOnOPenButton();
		dpachechPage.ClickOnPassedDPAButton();
		recentCasesPage.ClickOnStatusButton();
		summarypage.VerifyCaseStatusfromSummaryPage("Resolved -NonProceed");
		summarypage.VerifyYourDebtsAmountfromSummaryPage("£31,500.00");
		summarypage.VerifyYourMonthlyIncomeAmountfromSummaryPage("£1,166.75");
		summarypage.VerifyYourMonthlySpendingAmountfromSummaryPage("£1,097.08");
		summarypage.VerifyAvilableDebtsAmountfromSummaryPage("£69.67");

	}

	@Then("^user Ends the Session$")
	public void user_Ends_the_Session() throws Throwable {
		endSessionDebtAdvicePage.clickOnEndSessionButton();
		endSessionDebtAdvicePage.clickOnSaveClientData();
		endSessionDebtAdvicePage.selectReasonForEndingSessionByIndex();
		endSessionDebtAdvicePage.submitProvideGeneralAdvise();
		endSessionDebtAdvicePage.clickOnSubmitButton();
	}
*/
}
