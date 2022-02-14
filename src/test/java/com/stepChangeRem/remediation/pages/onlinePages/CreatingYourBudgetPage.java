package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class CreatingYourBudgetPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
private Button ContinuebuttonforCreatingyourBudget;


    public Button getContinuebuttonforCreatingyourBudget() {
        return ContinuebuttonforCreatingyourBudget;
    }
    public CreatingYourBudgetPage(){
        ContinuebuttonforCreatingyourBudget = new Button(By.xpath("//button[text()='Continue']"));
    }
    public void continueButtonCreateBudget(){
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        this.getContinuebuttonforCreatingyourBudget().click();
        getBrowser().sleep(getBrowser().getTimeout() / 10);
    }

    public void ClickonConinueButtonofCreatingyourBudgetfor89963(){
        GenericMethods_cvp.implicitWait(2000);
        this.getContinuebuttonforCreatingyourBudget().click();
        GenericMethods_cvp.implicitWait(2000);
    }
}
