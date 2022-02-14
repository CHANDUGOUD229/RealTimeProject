package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Link;
import com.stepchange.atf.controls.RadioButton;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourCurrentBudgetPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button BudgetFeelAccurateYesRb;
    private Button ContinueButtonforYourCurrentBudgePage;
    private Link RegisteToSaveProgresslink;
    private Button feelAccurateYesButton;
    private Button continueCurrentBudgetPageButton;

    //getters

    public Button getBudgetFeelAccurateYesRb() {
        return BudgetFeelAccurateYesRb;
    }
    public Button getContinueButtonforYourCurrentBudgePage() {
        return ContinueButtonforYourCurrentBudgePage;
    }
    public Link getRegisteToSaveProgresslink() {
        return RegisteToSaveProgresslink;

    }
    //getters
    public Button getFeelAccurateYesButton() {return feelAccurateYesButton;}
    public Button getContinueCurrentBudgetPageButton() {return continueCurrentBudgetPageButton;}

    public YourCurrentBudgetPage(){
         feelAccurateYesButton= new Button(By.xpath("(//label[text()='Yes'])[1]"));
         continueCurrentBudgetPageButton = new Button(By.xpath("//button[text()='Continue']"));
        BudgetFeelAccurateYesRb = new Button(By.xpath("//label[text()='Does your budget feel accurate to you?']//following::label[1]"));
        ContinueButtonforYourCurrentBudgePage = new Button(By.xpath("//button[text()='Continue']"));
        RegisteToSaveProgresslink = new Link(By.xpath("//a[text()='Register to save progress']"));

    }

    public void performActionsonyourCurrentBudgetPage(){
        GenericMethods_cvp.implicitWait(4000);
        this.getBudgetFeelAccurateYesRb().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getContinueButtonforYourCurrentBudgePage().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getContinueButtonforYourCurrentBudgePage().click();
        GenericMethods_cvp.implicitWait(4000);
    }
    public void ActionSetYourCurrentBudget89955(){
        GenericMethods_cvp.implicitWait(10000);
        this.getFeelAccurateYesButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getContinueCurrentBudgetPageButton().click();
        GenericMethods_cvp.implicitWait(10000);

        //On your budget Lookes good, click on continue
        this.getContinueCurrentBudgetPageButton().click();
        GenericMethods_cvp.implicitWait(10000);
        // On your Budget Summary clicking on continue again on the page
        this.getContinueCurrentBudgetPageButton().click();
        GenericMethods_cvp.implicitWait(10000);
        //and navigated to dashboard.
    }
}
