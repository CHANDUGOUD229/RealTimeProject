package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.RadioButton;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class AdditionalQuestionsDebtsPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
private Button question1;
private Button question2;
private Button question3;
private Button continueAdditionalQus;
    private Button GuarantorNoRb;
    private Button DisputedNoRb;
    private Button UnEnforcableNoRb;
    private Button AdditionalQuestionPageContinueButton;

    //getters
    public Button getGuarantorNoRb() {
        return GuarantorNoRb;
    }
    public Button getDisputedNoRb() {
        return DisputedNoRb;
    }
    public Button getUnEnforcableNoRb() {
        return UnEnforcableNoRb;
    }
    public Button getAdditionalQuestionPageContinueButton() {
        return AdditionalQuestionPageContinueButton;
    }
    public Button getQuestion1() {return question1;}
    public Button getQuestion2() {return question2;}
    public Button getQuestion3() {return question3;}
    public Button getContinueAdditionalQus() {return continueAdditionalQus;}

    public AdditionalQuestionsDebtsPage(){
        GuarantorNoRb = new Button(By.xpath("//h6[text()='What is a guarantor?']//following::label[3]"));
        DisputedNoRb= new Button(By.xpath("//h6[text()='What is a disputed debt?']//following::label[3]"));
        UnEnforcableNoRb= new Button(By.xpath("//h6[text()='When is a debt unenforceable?']//following::label[3]"));
        AdditionalQuestionPageContinueButton = new Button(By.xpath("//button[text()='Continue']"));
        question1= new Button(By.xpath("(//label[text()='No'])[1] "));
        question2= new Button(By.xpath("(//label[text()='No'])[2] "));
        question3= new Button(By.xpath("(//label[text()='No'])[3] "));
        continueAdditionalQus = new Button(By.xpath("//button[text()='Continue']"));
    }


    public void SelectNoForAllAdditionalQuestionFor89963(){
        GenericMethods_cvp.implicitWait(4000);
        this.getGuarantorNoRb().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getDisputedNoRb().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getUnEnforcableNoRb().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getAdditionalQuestionPageContinueButton().click();
        GenericMethods_cvp.implicitWait(4000);
    }

    /*public AdditionalQuestionsDebtsPage(){
        question1= new Button(By.xpath("(//label[text()='No'])[1] "));
        question2= new Button(By.xpath("(//label[text()='No'])[2] "));
        question3= new Button(By.xpath("(//label[text()='No'])[3] "));
        continueAdditionalQus = new Button(By.xpath("//button[text()='Continue']"));
    }*/
    public void selectAllNo(){
        GenericMethods_cvp.implicitWait(10000);
        this.getQuestion1().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getQuestion2().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getQuestion3().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getContinueAdditionalQus().click();

    }
}
