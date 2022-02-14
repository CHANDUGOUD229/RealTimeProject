package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourPriorityPaymentsPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();

    private Button ContinueButton;
    private Button priorityPaymentContinueButton;
    private Button putSomeMoneyAsideNoButton;
    //getters
    public Button getContinueButton() {
        return ContinueButton;
    }
    public Button getPriorityPaymentContinueButton(){return priorityPaymentContinueButton;}
    public Button getPutSomeMoneyAsideNoButton(){return putSomeMoneyAsideNoButton;}

    public YourPriorityPaymentsPage(){
        ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
        priorityPaymentContinueButton = new Button(By.xpath("//button[text()='Continue']"));
        putSomeMoneyAsideNoButton = new Button(By.xpath("//label[text()='No']"));
    }

    public void ClickonConinueButtonofCreatingyourBudgetfor89963() {
        GenericMethods_cvp.implicitWait(2000);
        this.getContinueButton().click();
        GenericMethods_cvp.implicitWait(2000);
    }

    public void ActionSetOnPriorityAndSavingSmallAmount(){
        GenericMethods_cvp.implicitWait(10000);
        this.getPriorityPaymentContinueButton().click();
        GenericMethods_cvp.implicitWait(10000);
        //Actions on Consider saving a small amount page
        this.getPutSomeMoneyAsideNoButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getPriorityPaymentContinueButton().click();
        GenericMethods_cvp.implicitWait(10000);


    }

}
