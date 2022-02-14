package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.utilities.AAssert;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ReviewYourOptionsPage extends Control{
	AAssert assertion=new AAssert();
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	private Checkbox MonthlyPaymentOptionCheckbox;
	private Button FindOutMoreOptionsMonthlyPaymentOptionCheckbox;
	private Checkbox LiketoDiscussMyOptionsCheckBox;
	private Button FindOutMoreButton;
	private Button ReturnToDebtSolutionsBtn;
	private Button ContinueButtonYourRecommondedSolution;
	private Checkbox InterestedInPaymentSuspensionCheckbox;
	private Checkbox InterestedInMapSolutionCheckbox;

	private Checkbox DebtPaymentProgrammeCheckbox;
    private Button FindOutMoreDPPButton;
    private Div DebtPaymentProgrammeDivText;

	private Checkbox PaymentSuspension2;
	private Button FindOutMorePaymentSuspension2;
	private Checkbox PaymentSuspension3;
	private Button FindOutMorePaymentSuspension3;
	private Div MonthlyPaymentJointMPA;
	private Checkbox paymentSuspension;
	private Checkbox droCheckBox;
	private Button paymentSuspensionFindOut;
	private Button droFindOut;
	private Checkbox solutionCheckBox;

	public Checkbox getDroCheckBox() {
		return droCheckBox=new Checkbox(By.xpath("//label[.='I’m interested in applying for a DRO']"));
	}
	public Checkbox getSolutionCheckBox89933() {
		return solutionCheckBox=new Checkbox(By.xpath("//label[.='I’m interested in making settlement offers']"));
	}

	public Checkbox getMAPCheckBox() {
		return droCheckBox=new Checkbox(By.xpath("//label[.='I’m interested in applying for MAP']"));
	}
	public Checkbox getDMPCheckBox() {
		return droCheckBox=new Checkbox(By.xpath("(//input[contains(@name,'$ppxResults$l1$ppySelected')])[2]/../label"));
	}

	public Button getDroFindOut() {
		return droFindOut=new Button(By.xpath("//button[.='Find out more']"));
	}

	public Checkbox getPaymentSuspension() {
		return paymentSuspension=new Checkbox(By.xpath("//label[.='I’m interested in applying for payment suspension']"));
	}

	public Button getPaymentSuspensionFindOut() {
		return paymentSuspensionFindOut=new Button(By.xpath("(//button[.='Find out more'])[2]"));
	}

	//	public String[] ReviewYourOptionsList= {"CCH-MPA","Settlement Offer","AdminOrder","Bankruptcy","Sequestration",
//			                             "MAP","DMP","DPP","DRO","Financial Solutions referral","IVA5Year","IVALS","ZeroOffers","TrustDeed"};
//
	private Div RecommendedSolutionDiv;
	private Div FinalScPlanIVA;
	private Div FinalPaymentSuspension;
	private Checkbox ApplyigForAnIVACheckBox;

	public Checkbox getLiketoDiscussMyOptionsCheckBox() {return LiketoDiscussMyOptionsCheckBox;}
	public Button getFindOutMoreButton() {return FindOutMoreButton;}
	public Button getReturnToDebtSolutionsBtn() {return ReturnToDebtSolutionsBtn;}
	public Checkbox getInterestedInPaymentSuspensionCheckbox() {return InterestedInPaymentSuspensionCheckbox ;}
//    public Div getRecommendedSolutionDiv() {return RecommendedSolutionDiv; }
	public Checkbox getInterestedInMapSolutionCheckbox() {return InterestedInMapSolutionCheckbox;}
    public Div getRecommendedSolutionDiv() {return RecommendedSolutionDiv; }
	public Checkbox getPaymentSuspension2() {return PaymentSuspension2;}
	private Button getFindOutMorePaymentSuspension2() {return FindOutMorePaymentSuspension2;}
	public Checkbox getPaymentSuspension3() {return PaymentSuspension3;}
	private Button getFindOutMorePaymentSuspension3() {return FindOutMorePaymentSuspension3;}
	private Div BankruptcyText;
	private Div BankruptcyText_89940;
	private Link BackTodashboard;
	private Div FinalScenarioPlan;
	private Button Threedots;
	private Button NonProceedButton;
	private Dropdown ReasonforNonProceedingDropdown;
	private Button NextButton;
	private Button submitButton;
	public Button getNextButton() {
		return NextButton;
	}
	public Button getSubmitButton(){
		return submitButton;
	}
	public Dropdown getReasonforNonProceedingDropdown() {
		return ReasonforNonProceedingDropdown;
	}
	public Button getNonProceedButton() {
		return NonProceedButton;
	}
	public Button getThreedots() {
		return Threedots;
	}
	public Div getFinalScenarioPlan() {
		return FinalScenarioPlan;
	}
	public Link getBackTodashboard() {
		return BackTodashboard;
	}
	public Div getBankruptcyText() {
		return BankruptcyText;
	}
	public Checkbox getApplyigForAnIVACheckBox(){return ApplyigForAnIVACheckBox;}
	public Checkbox getMonthlyPaymentOptionCheckbox(){return MonthlyPaymentOptionCheckbox;}
	public Button getFindOutMoreOptionsMonthlyPaymentOptionCheckbox(){return FindOutMoreOptionsMonthlyPaymentOptionCheckbox;}
    public Div getMonthlyPaymentJointMPA(){return MonthlyPaymentJointMPA;}
	public Div getBankruptcyText_89940(){
		return BankruptcyText_89940;
	}
	public Div getFinalScPlanIVA(){return FinalScPlanIVA;}
	public Div getFinalPaymentSuspension(){return FinalPaymentSuspension;}

	private Div DroPlanForClient1;
	private Div DroPlanForClient2;
	private Checkbox IamInterestedForApplyingDroClient1;
	private Checkbox IamInterestedForApplyingDroClient2;
	private Button FindOutMoreButtonForClient189949;
	private Button FindOutMoreButtonForClient289949;

	public Div getDroPlanForClient1() {
		return DroPlanForClient1;
	}
	public Div getDroPlanForClient2() {
		return DroPlanForClient2;
	}
	public Checkbox getIamInterestedForApplyingDroClient1() { return IamInterestedForApplyingDroClient1; }
	public Checkbox getIamInterestedForApplyingDroClient2() {
		return IamInterestedForApplyingDroClient2;
	}
	public Button getFindOutMoreButtonForClient189949() {
		return FindOutMoreButtonForClient189949;
	}
	public Button getFindOutMoreButtonForClient289949() {
		return FindOutMoreButtonForClient289949;
	}

	public Checkbox getDebtPaymentProgrammeCheckbox(){return DebtPaymentProgrammeCheckbox;}
	public Button getFindOutMoreDPPButton(){return FindOutMoreDPPButton;}
	public Div getDebtPaymentProgrammeDivText(){return DebtPaymentProgrammeDivText; }

	public ReviewYourOptionsPage()
	{
		InterestedInMapSolutionCheckbox=new Checkbox(By.xpath("//label[text()='I’m interested in applying for MAP']"));
		LiketoDiscussMyOptionsCheckBox  =new Checkbox(By.xpath("(//label[@class=' cb_standard'])[1]"));
		FindOutMoreButton=new Button(By.xpath("//button[text()='Find out more']"));
		ReturnToDebtSolutionsBtn=new Button(By.xpath("//button[text()='Return to debt solutions']"));
		ContinueButtonYourRecommondedSolution = new Button(By.xpath("//button[@name='PresentSolutions_pyWorkPage_50']"));
		InterestedInPaymentSuspensionCheckbox = new Checkbox(By.xpath("//label[normalize-space()='I’m interested in applying for payment suspension']"));
        RecommendedSolutionDiv=new Div(By.xpath("(//span[@data-test-id='2018020915010808904914'])[1]"));
		PaymentSuspension2=new Checkbox(By.xpath("([//span[@class='checkbox'])[2]"));
		FindOutMorePaymentSuspension2=new Button(By.xpath("(//button[text()='Find out more'])[2]"));
		PaymentSuspension3=new Checkbox(By.xpath("([//span[@class='checkbox'])[3]"));
		FindOutMorePaymentSuspension3=new Button(By.xpath("(//button[text()='Find out more'])[3]"));
		//		downloadPersonalAction=new Button(By.xpath("//button[@name='DownloadAttachment_D_LatestAttachment_pa2662812244438726pz.pxResults(1)_1']"));
//		SaveAndExistButton=new Button(By.xpath("(//button[text()='Save and exit'])[2]"));
//		endSessionButton=new Button(By.xpath("//button[@name='CPMConfirmDriverWrapper_pyWorkPage_46']"));
		BankruptcyText = new Div(By.xpath("(//span[text()='Bankruptcy'])[1]"));
		BankruptcyText_89940 = new Div(By.xpath("(//span[text()='Debt management plan'])[1]"));
		BackTodashboard = new Link(By.xpath("//a[text()='Back to dashboard']"));
		FinalScenarioPlan = new Div(By.xpath("//span[text()='Debt management plan']"));
		FinalScPlanIVA = new Div(By.xpath("//span[text()='Individual voluntary arrangement']"));
		FinalPaymentSuspension = new Div(By.xpath("//span[text()='Payment suspension']"));
		Threedots = new Button(By.xpath("//i[@class='pi pi-more pi-blue pi-medium']"));
		NonProceedButton = new Button(By.xpath("//span[text()='Non proceed case']"));
		ReasonforNonProceedingDropdown = new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pNonProceedReason']"));
		NextButton = new Button(By.xpath("//button[text()='Next']"));
		ApplyigForAnIVACheckBox = new Checkbox(By.xpath("(//label[@data-test-id='20180213151148070819974-Label'])[1]"));

		MonthlyPaymentOptionCheckbox=new Checkbox(By.xpath("(//label[text()='We’ll make the regular payments to our debts'])[1]"));
		FindOutMoreOptionsMonthlyPaymentOptionCheckbox=new Button(By.xpath("(//button[text()='Find out more'])[1]"));
		MonthlyPaymentJointMPA=new Div(By.xpath("(//span[text()='Monthly payment arrangement'])[1]"));

		submitButton = new Button(By.xpath("//button[text()='Submit']"));

		IamInterestedForApplyingDroClient1 = new Checkbox(By.xpath("(//label[text()='I’m interested in applying for a DRO'])[1]"));
		IamInterestedForApplyingDroClient2 = new Checkbox(By.xpath("(//label[text()='I’m interested in applying for a DRO'])[2]"));
		FindOutMoreButtonForClient189949 = new Button(By.xpath("(//button[text()='Find out more'])[2]"));
		FindOutMoreButtonForClient289949 = new Button(By.xpath("(//button[text()='Find out more'])[3]"));
		DroPlanForClient1  = new Div(By.xpath("(//span[text()='Debt relief order'])[1]"));
		DroPlanForClient2 = new Div(By.xpath("(//span[text()='Debt relief order'])[2]"));

		FindOutMoreDPPButton=new Button(By.xpath("(//button[text()='Find out more'])[1]"));
		DebtPaymentProgrammeCheckbox=new Checkbox(By.xpath("//label[text()='I’m interested in applying for a DPP']"));
		DebtPaymentProgrammeDivText=new Div(By.xpath("//span[text()='Debt payment programme']"));

	}

	public void selctforJoint89929()
	{
		switchToActiveFrame();
		this.getPaymentSuspension2().click();
		this.getFindOutMoreButton().click();
		this.getReturnToDebtSolutionsBtn().click();
		this.getPaymentSuspension3().click();
		this.getFindOutMoreButton().click();
		ContinueButtonYourRecommondedSolution.click();


	}

	public void clickLiketoDiscussMyOptionsCheckBox()
	{
		genericMethodsCvp.implicitWait(3000);
		getLiketoDiscussMyOptionsCheckBox().click();
	}
	
	public void clickOnFindOutMoreButton()
	{
		genericMethodsCvp.implicitWait(3000);
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);
		this.getFindOutMoreButton().click();
		genericMethodsCvp.implicitWait(4000);
	}
	
	
	public void clickOnReturnToDebtSolutionsBtn()
	{
		genericMethodsCvp.implicitWait(3000);
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);
		this.getReturnToDebtSolutionsBtn().click();
		genericMethodsCvp.implicitWait(4000);
	}
	
	public void clickonInterestedInPaymentsCheckbox()
	{
		genericMethodsCvp.implicitWait(3000);
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);
		this.getInterestedInPaymentSuspensionCheckbox().click();
		genericMethodsCvp.implicitWait(2000);
	}
	
	public void clickOnContinueButtonYourRecommondedSolutionButton()/// need to update pages 
	{
		genericMethodsCvp.implicitWait(3000);
		ContinueButtonYourRecommondedSolution.click();
		genericMethodsCvp.implicitWait(4000);
	}
	
//	public void comparingRecommendedSolutionWithList()
//	{
//		String RecommendedSolution=this.getRecommendedSolutionDiv().getText();
//		boolean matchfound=false;
//		String expectedSolution=null;
//		for(int i=0;(ReviewYourOptionsList.length)>=0;i++)
//		{
//			RecommendedSolution.equals(ReviewYourOptionsList);
//			matchfound=true;
//			break;
//		}
//		if(matchfound==true)
//		{
//		    expectedSolution=RecommendedSolution;
//			log("Recommended solution is available in the ReviewOptions list");
//		}
//		else
//			log("Wrong value for the recommended solution");
//		
//		assertion.assertContains(RecommendedSolution, expectedSolution,"This is one of the given solution" );
//	}
	
//	public void clickOndownloadPersonalAction()
//	{
//		getBrowser().sleep(2000);
//		downloadPersonalAction.click();
//	}
//	
//	public void clickOnSaveAndExistButton()
//	{
//		getBrowser().sleep(2000);
//		SaveAndExistButton.click();
//	}
//	
//	public void clickOnendSessionButton()
//	{
//		getBrowser().sleep(2000);
//		endSessionButton.click();
//	}


	public void selectMAPSolution()
	{
		switchToActiveFrame();
		this.getInterestedInMapSolutionCheckbox().click();
		this.getFindOutMoreButton().click();
		this.getReturnToDebtSolutionsBtn().click();
		ContinueButtonYourRecommondedSolution.click();
	}
	public void VerifyCurrentScenarioPlan() {
		String Actualvalue =this.getBankruptcyText().getText();
		String Expected ="Bankruptcy";
		Assert.assertEquals(Expected, Actualvalue);
	}

	public void VerifyCurrentScenarioPlan_89940(){
		String Actualvalue =this.getBankruptcyText_89940().getText();
		String Expected ="Debt management plan";
		AAssert.assertEquals(Actualvalue,Expected);

	}

	public void clickOnBacktoDashBoardlink()/// need to update pages
	{
		genericMethodsCvp.implicitWait(3000);
		switchToActiveFrame();
		this.getBackTodashboard().click();
		genericMethodsCvp.implicitWait(4000);
	}

	public void VerifyFinalScenarioPlan() {
		String Actualvalue =this.getFinalScenarioPlan().getText();
		String Expected ="Debt management plan";
		Assert.assertEquals(Expected, Actualvalue);
	}
	public void VerifyFinalScenarioPlan89934() {
		String Actualvalue =this.getFinalScenarioPlan().getDivText();
		String Expected ="Individual voluntary arrangement";
		Assert.assertEquals(Expected, Actualvalue);
	}
	public void selectIVASolution89934() {
		genericMethodsCvp.implicitWait(3000);
		switchToActiveFrame();
		this.getApplyigForAnIVACheckBox().click();
		this.getFindOutMoreButton().click();
		this.getReturnToDebtSolutionsBtn().click();
		genericMethodsCvp.implicitWait(5000);

		String Plan1 =this.getFinalScPlanIVA().getDivText();
		System.out.println(Plan1);
		AAssert.assertEquals(Plan1, "Individual voluntary arrangement");
		System.out.println("Individual voluntary arrangement");
		genericMethodsCvp.implicitWait(5000);


//		String Actualvalue =this.getFinalScenarioPlan().getDivText();
//		String Expected ="Individual voluntary arrangement";
//		AAssert.assertEquals(Expected, Actualvalue);
		ContinueButtonYourRecommondedSolution.click();
		genericMethodsCvp.implicitWait(5000);
	}
	public void selectPaymentSuspSolution89937() {
		genericMethodsCvp.implicitWait(3000);
		switchToActiveFrame();
		this.getApplyigForAnIVACheckBox().click();
		this.getFindOutMoreButton().click();
		this.getReturnToDebtSolutionsBtn().click();
		genericMethodsCvp.implicitWait(5000);

		String Plan1 =this.getFinalPaymentSuspension().getDivText();
		System.out.println(Plan1);
		AAssert.assertEquals(Plan1, "Payment suspension");
		System.out.println("Payment suspension");
		getBrowser().sleep(getBrowser().getTimeout()/10);


//		String Actualvalue =this.getFinalScenarioPlan().getDivText();
//		String Expected ="Individual voluntary arrangement";
//		AAssert.assertEquals(Expected, Actualvalue);
		ContinueButtonYourRecommondedSolution.click();
		genericMethodsCvp.implicitWait(5000);
	}

	public void clickThreeDotsFromAdviceOnYourBudget()
	{
		genericMethodsCvp.implicitWait(3000);
		this.getThreedots().click();
	}

	public void clickNonProceedFromAdviceOnYourBudget()
	{
		genericMethodsCvp.implicitWait(3000);
		this.getNonProceedButton().click();

	}


	public void SelectReasonfornonProceedingFromDropdown()
	{
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(ReasonforNonProceedingDropdown, "Client no longer requires a solution");

	}
	public void clickNextButtonfromReviewYourOptions()
	{
		genericMethodsCvp.implicitWait(3000);
		this.getNextButton().click();

	}

	public void ClickMonthlypaymentsasJointMPA()
	{
		genericMethodsCvp.implicitWait(20000);
		switchToActiveFrame();
		this.getMonthlyPaymentOptionCheckbox().click();
		genericMethodsCvp.implicitWait(20000);
		this.getFindOutMoreOptionsMonthlyPaymentOptionCheckbox().click();
		genericMethodsCvp.implicitWait(5000);
		this.getReturnToDebtSolutionsBtn().click();
		genericMethodsCvp.implicitWait(5000);
		String Plan1 =this.getMonthlyPaymentJointMPA().getDivText();
		System.out.println(Plan1);
		AAssert.assertEquals(Plan1, "Monthly payment arrangement");
		//System.out.println("Monthly payment arrangement");
		getBrowser().sleep(getBrowser().getTimeout()/5);
		//verifyJointMPAPlan();
		this.getMonthlyPaymentOptionCheckbox().click();
		genericMethodsCvp.implicitWait(3000);
		this.clickOnContinueButtonYourRecommondedSolutionButton();
		genericMethodsCvp.implicitWait(3000);

	}

	public void verifyJointMPAPlan()
	{
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
		String Plan1 =getMonthlyPaymentJointMPA().getDivText();
		Assert.assertEquals(Plan1, "Monthly Payment Arrangement");
		System.out.println("Plan1  is JointMPA verified");

	}

	public void ClickSoleClientDPPSolution89924()
	{
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
		this.getFindOutMoreDPPButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getReturnToDebtSolutionsBtn().click();
		genericMethodsCvp.implicitWait(2000);
		this.getDebtPaymentProgrammeCheckbox().click();
		genericMethodsCvp.implicitWait(2000);
		String Plan=this.getDebtPaymentProgrammeDivText().getDivText();
		AAssert.assertContains(Plan,"Debt payment programme","DPP plan displayed");

	}

	public void VerifyDroPlansForClient1andClient2for89949() {
		genericMethodsCvp.implicitWait(1000);
		String Plan1 =this.getDroPlanForClient1().getDivText();
		System.out.println(Plan1);
		AAssert.assertEquals(Plan1, "Debt relief order");
		System.out.println("Plan1  is DRO verified");

		genericMethodsCvp.implicitWait(1000);
		String Plan2 =this.getDroPlanForClient2().getDivText();
		AAssert.assertEquals(Plan2, "Debt relief order");
		System.out.println("Plan2  is DRO verified");


	}
	public void SelectDroPlansForClient1andClient2for89949(){

		this.getIamInterestedForApplyingDroClient1().click();
		genericMethodsCvp.implicitWait(3000);
		this.getFindOutMoreButtonForClient189949().click();
		genericMethodsCvp.implicitWait(3000);
		clickOnReturnToDebtSolutionsBtn();
		genericMethodsCvp.implicitWait(3000);
		this.getIamInterestedForApplyingDroClient2().click();
		genericMethodsCvp.implicitWait(3000);
		this.getFindOutMoreButtonForClient289949().click();
		genericMethodsCvp.implicitWait(3000);
		clickOnReturnToDebtSolutionsBtn();
		genericMethodsCvp.implicitWait(3000);

	}
}
