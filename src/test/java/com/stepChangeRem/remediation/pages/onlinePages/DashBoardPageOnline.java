package com.stepChangeRem.remediation.pages.onlinePages;
import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;
public class DashBoardPageOnline extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button YourHouseHoldButton;
    private Button YourDebtButton;
    private Button CreatingYourBudgetButton;
    private Button YourIncomeButton;
    private Button YourSpendingButton;
    private Button AdviceOnYourBudgetButton;
    private Button FinalQuestionsbutton;
    private Button YourPriorityPaymentsButton;
    private Button ReviewYourOptionButton;
    private Button YourIncomeButtonAfterBack;
    private Button CloseButton;
    private Button iDontWantContinue;
    private Button closeButtonLastPage;
    private Button dontWantContinue;
    private Button getFindOutButton;
    private Button getReturnDebtNavigation;
    private Button getCheckDebtBox;
    private Button getContinueButton;

    //getters
    public Button getYourHouseHoldButton() {
        return YourHouseHoldButton;
    }

    public Button getYourDebtButton() {
        return YourDebtButton;
    }

    public Button getCreatingYourBudgetButton() {
        return CreatingYourBudgetButton;
    }

    public Button getYourIncomeButton() {
        return YourIncomeButton;
    }

    public Button getYourSpendingButton() {
        return YourSpendingButton;
    }

    public Button getAdviceOnYourBudgetButton() {
        return AdviceOnYourBudgetButton;
    }

    public Button getFinalQuestionsbutton() {
        return FinalQuestionsbutton;
    }

    public Button getYourPriorityPaymentsButton() {
        return YourPriorityPaymentsButton;
    }

    public Button getReviewYourOptionButton() {
        return ReviewYourOptionButton;
    }
    public Button getYourIncomeButtonAfterBack() { return YourIncomeButtonAfterBack; }
    public Button getCloseButton() {return CloseButton;}
    public Button getiDontWantContinue(){return iDontWantContinue;}
    public Button getcloseButtonLastPage(){return closeButtonLastPage;}
    public Button getDontWant() {return dontWantContinue;}
    public Button getFindout() {return getFindOutButton;}
    public Button getReturnDebt() {return getReturnDebtNavigation;}
    public Button getCheckDebt() {return getCheckDebtBox;}
    public Button getContinueBtn() {return getContinueButton;}

    public DashBoardPageOnline() {
        YourHouseHoldButton = new Button(By.xpath("(//div[text()='Your household'])[2]"));
        YourDebtButton = new Button(By.xpath("(//div[text()='Your debts'])[2]"));
        CreatingYourBudgetButton = new Button(By.xpath("(//div[text()='Creating your budget'])[4]"));
        YourIncomeButton = new Button(By.xpath("(//div[text()='Your income'])[4]"));
        YourSpendingButton = new Button(By.xpath("(//div[text()='Your spending'])[4]"));
        AdviceOnYourBudgetButton = new Button(By.xpath("(//div[text()='Advice on your budget'])[4]"));
        FinalQuestionsbutton = new Button(By.xpath("(//div[text()='Final questions'])[4]"));
        YourPriorityPaymentsButton = new Button(By.xpath("(//div[text()='Your priority payments'])[4]"));
        ReviewYourOptionButton = new Button(By.xpath("(//div[text()='Review your options'])[4]"));
        YourIncomeButtonAfterBack= new Button(By.xpath("(//div[text()='Your income'])[8]"));
        iDontWantContinue= new Button(By.xpath("//a[@name='LogOffConfirmation_pyWorkPage_13']"));
        closeButtonLastPage=new Button(By.xpath("//div[text()='Close']"));
        CloseButton = new Button(By.xpath("//div[text()='Close']"));
        dontWantContinue = new Button(By.xpath("//button[@name='LogOffConfirmation_pyWorkPage_17' or contains(text(),\"I don't want to save my progress\")]"));
        getFindOutButton = new Button(By.xpath("(//button[contains(text(),'Find out more')])[1]"));
        getReturnDebtNavigation = new Button(By.xpath("//button[contains(text(),'Return to debt solutions')]"));
        getCheckDebtBox = new Button(By.xpath("(//input[@class='checkbox chkBxCtl '])[1]"));
        getContinueButton = new Button(By.xpath("//button[contains(text(),'Continue')]"));
        
        
    }

    public void SelectingHousehold89955() {
//        getBrowser().sleep(getBrowser().getTimeout() / 10);
//        switchToActiveFrame();
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        this.getYourHouseHoldButton().click();
        GenericMethods_cvp.implicitWait(3000);
    }

    public void SelectingYourDebts() {
//        getBrowser().sleep(getBrowser().getTimeout() / 10);
//        switchToActiveFrame();
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        this.getYourDebtButton().click();
        GenericMethods_cvp.implicitWait(3000);
    }

    public void SelectingCreatingYourBudget() {
        GenericMethods_cvp.implicitWait(5000);
        this.getCreatingYourBudgetButton().click();
        GenericMethods_cvp.implicitWait(5000);
    }

    public void SelectingYourIncome() {
        GenericMethods_cvp.implicitWait(5000);
        this.getYourIncomeButton().click();
        GenericMethods_cvp.implicitWait(5000);
    }

    public void SelectingYourSpending() {
        GenericMethods_cvp.implicitWait(5000);
        this.getYourSpendingButton().click();
        GenericMethods_cvp.implicitWait(5000);
    }

    public void SelectingAdviceonYourBudget() {
        GenericMethods_cvp.implicitWait(5000);
        this.getAdviceOnYourBudgetButton().click();
        GenericMethods_cvp.implicitWait(5000);
    }

    public void SelectingFinalQuestion() {
        GenericMethods_cvp.implicitWait(5000);
        this.getFinalQuestionsbutton().click();
        GenericMethods_cvp.implicitWait(5000);
    }

    public void SelectingYourPriorityPayments() {
        GenericMethods_cvp.implicitWait(5000);
        this.getYourPriorityPaymentsButton().click();
        GenericMethods_cvp.implicitWait(5000);
    }

    public void SelectingReviewYourOption() {
        GenericMethods_cvp.implicitWait(5000);
        this.getReviewYourOptionButton().click();
        GenericMethods_cvp.implicitWait(5000);
    }

    public void SelectingHousehold89963() {
        GenericMethods_cvp.implicitWait(5000);
        this.getYourHouseHoldButton().click();
        GenericMethods_cvp.implicitWait(5000);
    }

    public void SelectingYourDebts89963() {
        GenericMethods_cvp.implicitWait(10000);
        this.getYourDebtButton().click();
        GenericMethods_cvp.implicitWait(5000);
    }
    public void SelectingYourIncomeButtonAfterBack(){
        GenericMethods_cvp.implicitWait(5000);
        this.getYourIncomeButtonAfterBack().click();
        GenericMethods_cvp.implicitWait(5000);
    }
    public void CloseAndDontwantToSave89955(){
        GenericMethods_cvp.implicitWait(10000);
        this.getcloseButtonLastPage().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getiDontWantContinue().click();
        GenericMethods_cvp.implicitWait(10000);
    }

	public void clickProgressLink() {
		GenericMethods_cvp.implicitWait(10000);
		this.getDontWant().click();
		
	}

	public void clickRecommendedLink() {
		GenericMethods_cvp.implicitWait(10000);
		this.getFindout().scrollElementIntoView();
		this.getFindout().click();
		GenericMethods_cvp.implicitWait(10000);
		this.getReturnDebt().click();
		GenericMethods_cvp.implicitWait(10000);
		this.getCheckDebt().click();
		GenericMethods_cvp.implicitWait(10000);
		this.getContinueBtn().click();
		GenericMethods_cvp.implicitWait(10000);
		
		
		
	}

}


