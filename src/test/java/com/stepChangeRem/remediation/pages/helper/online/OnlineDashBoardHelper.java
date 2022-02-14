package com.stepChangeRem.remediation.pages.helper.online;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnlineDashBoardHelper extends Control {
    private Button houseHold;
    private Button yourDebts;
    private Button createYourBudget;
    private Button createYourIncome;
    private Button createYourSpending;
    private Button adviceOnBudget;
    private Button finalQuestion;
    private Button noButton;
    private Button priorutyPayments;
    private Button reviewOptions;
    private Button finOutMore;
    private Button returnToSolution;
    private Button solution;
    private Button closeTheSession;
    private Button repayArrears;
    private Link registerToSaveProgress;
    public Link getRegisterToSaveProgress() {
        return registerToSaveProgress=new Link(By.xpath("//a[contains(text(),'Register to save progress')]"));
    }
    public Button getRepayArrears() {
        return repayArrears=new Button(By.xpath("//label[contains(text(),'I understand that I must arrange to repay these arrears')]"));
    }

    public Button getCloseTheSession() {
        return closeTheSession=new Button(By.xpath("//div[.='Close']"));
    }

    public Button getSolution() {
        return solution=new Button(By.xpath("//input[contains(@name,'$ppxResults$l1$ppySelected')]/../label"));
    }

    public Button getReturnToSolution() {
        return returnToSolution=new Button(By.xpath("//button[.='Return to debt solutions']"));
    }

    public Button getFinOutMore() {
        return finOutMore=new Button(By.xpath("//button[.='Find out more']"));
    }

    public Button getReviewOptions() {
        return reviewOptions=new Button(By.xpath("(//div[.='Review your options'])[4]"));
    }

    public Button getPriorutyPayments() {
        return priorutyPayments=new Button(By.xpath("(//div[.='Your priority payments'])[4]"));
    }


    public void clickOnNoButtons() {
        getBrowser().sleep(getTimeout()/5);
        List<WebElement> elements = getDriver().findElements(By.xpath("//label[.='No']"));
        for (int i = 0; i < elements.size(); i++) {
            verifyOverLayDisplayed();
            new Button(By.xpath("(//label[.='No'])["+(i+1)+"]")).click();
            verifyOverLayDisplayed();
        }
    }

    public Button getFinalQuestion() {
        return finalQuestion=new Button(By.xpath("(//div[.='Final questions'])[4]"));
    }

    public Button getAdviceOnBudget() {
        return adviceOnBudget=new Button(By.xpath("(//div[.='Advice on your budget'])[4]"));
    }

    public Button getCreateYourSpending() {
        return createYourSpending=new Button(By.xpath("(//div[.='Your spending'])[4]"));
    }

    public Button getCreateYourIncome() {
        return createYourIncome=new Button(By.xpath("(//div[.='Your income'])[4]"));
    }

    public Button getCreateYourBudget() {
        return createYourBudget=new Button(By.xpath("(//div[.='Creating your budget'])[4]"));
    }

    public Button getHouseHold() {
        return houseHold=new Button(By.xpath("(//div[.='Your household'])[2]"));
    }

    public Button getYourDebts() {
        return yourDebts=new Button(By.xpath("(//div[.='Your debts'])[2]"));
    }

}
