package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.testdata.SoleClientFinancialSolutionsTestData;
import com.stepchange.atf.tests.CucumberGenericTest;
import com.stepchange.atf.utilities.LogWriter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepDef_SC89947 extends CucumberGenericTest{
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



	public StepDef_SC89947() {
		
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
			public String CauseOfFinancialDifficultyDropDownValue=SoleClientFinancialSolutionsTestData.getTestData().getCauseOfFinancialDifficultyDropDownValue();
			public String FirstName =SoleClientFinancialSolutionsTestData.getTestData().getFirstName();
			public String SurName =SoleClientFinancialSolutionsTestData.getTestData().getSurName();
			public String Age =SoleClientFinancialSolutionsTestData.getTestData().getAge();
			public String Title =SoleClientFinancialSolutionsTestData.getTestData().getTitle();
			public String dateOfBirth =SoleClientFinancialSolutionsTestData.getTestData().getDateOfBirth();
			public String emailAddress =SoleClientFinancialSolutionsTestData.getTestData().getEmailAddress();
			public String Domain =SoleClientFinancialSolutionsTestData.getTestData().getDomain();
			public String phoneNumber =SoleClientFinancialSolutionsTestData.getTestData().getPhoneNumber();
			public String phoneType =SoleClientFinancialSolutionsTestData.getTestData().getPhoneType();
			public String postalCode =SoleClientFinancialSolutionsTestData.getTestData().getPostalCode();
			public String address =SoleClientFinancialSolutionsTestData.getTestData().getAddress();
			public String fullEmailAddress=SoleClientFinancialSolutionsTestData.getTestData().getFullEmailAddress();
			public String HouseStatusText =SoleClientFinancialSolutionsTestData.getTestData().getHouseStatusText();
			public String MaritalStatustext =SoleClientFinancialSolutionsTestData.getTestData().getMaritalStatustext();
			public String ClientEmployeeStatusText =SoleClientFinancialSolutionsTestData.getTestData().getClientEmployeeStatusText();
			public String CreditorNameDropDownValue=SoleClientFinancialSolutionsTestData.getTestData().getCreditorNameDropDownValue();
			public String DebtTypeNameDropDownValue=SoleClientFinancialSolutionsTestData.getTestData().getDebtTypeNameDropDownValue();
			public String AmountOwedValue =SoleClientFinancialSolutionsTestData.getTestData().getAmountOwedValue();
			public String LiabilityDropDownValue=SoleClientFinancialSolutionsTestData.getTestData().getLiabilityDropDownValue();
			public String OriginalRegularPayment=SoleClientFinancialSolutionsTestData.getTestData().getOriginalRegularPayment();
			public String originalRegularpaymentTimeSelectionDropdown=SoleClientFinancialSolutionsTestData.getTestData().getOriginalRegularpaymentTimeSelectionDropdown();
			public String Creditor2Name=SoleClientFinancialSolutionsTestData.getTestData().getCreditor2Name();
			public String DebtType2Name=SoleClientFinancialSolutionsTestData.getTestData().getDebtType2Name();
			public String AmountOwed2Value=SoleClientFinancialSolutionsTestData.getTestData().getAmountOwed2Value();
			public String MortgageTypeDropDownValue=SoleClientFinancialSolutionsTestData.getTestData().getMortgageTypeDropDownValue();
			public String MortgagePaymentAmount=SoleClientFinancialSolutionsTestData.getTestData().getMortgagePaymentAmount();
			public String FrequencyDropDownValue=SoleClientFinancialSolutionsTestData.getTestData().getFrequencyDropDownValue();
			public String MonthlyWagsEarning =SoleClientFinancialSolutionsTestData.getTestData().getMonthlyWagsEarning();
			public String MonthlyDropdownValue =SoleClientFinancialSolutionsTestData.getTestData().getMonthlyDropdownValue();
			public String CouncilTax=SoleClientFinancialSolutionsTestData.getTestData().getCouncilTax();
			public String TvLicenceValue=SoleClientFinancialSolutionsTestData.getTestData().getTvLicenceValue();
			public String ElectricityBilValue=SoleClientFinancialSolutionsTestData.getTestData().getElectricityBilValue();
			public String GasBilValue=SoleClientFinancialSolutionsTestData.getTestData().getGasBilValue();
			public String WaterBilValue=SoleClientFinancialSolutionsTestData.getTestData().getWaterBilValue();
			public String BillingAndInsuranceValue=SoleClientFinancialSolutionsTestData.getTestData().getBillingAndInsuranceValue();
			public String Groceries=SoleClientFinancialSolutionsTestData.getTestData().getGroceries();
			public String DatainMainHome=SoleClientFinancialSolutionsTestData.getTestData().getDatainMainHome();
			public String ReasonForEndingSession=SoleClientFinancialSolutionsTestData.getTestData().getReasonForEndingSession();


	@When("^User enters the credentials and click on login Button$")
	public void user_enters_the_credentials_and_click_on_login_Button()  {
		loginPageObj.LoginintoApplication();

	}
	@When("^Select who Referred Them as \"([^\"]*)\"$")
	public void select_who_Referred_Them_as(String arg1) throws Throwable {
		CaptureReferralPage captureReferralPage = new CaptureReferralPage();
		captureReferralPage.enterAndSelectValueFromWhoReferredThem(arg1);
	}
	@When("^Select Referral Route as \"([^\"]*)\"$")
	public void select_Referral_Route_as(String arg1) throws Throwable {
		CaptureReferralPage captureReferralPage = new CaptureReferralPage();
		captureReferralPage.ClickReferralRouteDirectButton();
	}

	@And("Fill the Client details")
	public void fillTheClientDetails() {
//		establishClientNeedPageObj.fillClientDetailsScotland();
	}

	@And("user adds second Client details")
	public void userAddsSecondClientDetails() {
//		establishClientNeedPageObj.AddClient2AndFillClient2Details();
	}

	@And("click on continue guests")
	public void clickOnContinueGuests() {
		getBrowser().sleep(getBrowser().getTimeout());
		explainTheProcessPageObj.getContinueAsGuest().click();
	}

	@And("user Navigate to Your Household page and enters all the details")
	public void userNavigateToYourHouseholdPageAndEntersAllTheDetails() {
		yourDashBordPageObj.ClickOnYourHouseHoldButton();
		yourHousholdPageObj.submitHouseHoldPageWithValidData89925();
	}

	@And("user click on continue in debt screen")
	public void userClickOnContinueInDebtScreen() {
		yourDebtPageObj.clickContinueButton();

	}

	@And("user navigates to creating your budget screen and enters all the details")
	public void userNavigatesToCreatingYourBudgetScreenAndEntersAllTheDetails() {
		yourDashBordPageObj.ClickOnYourSpendingButton();
	}



}

