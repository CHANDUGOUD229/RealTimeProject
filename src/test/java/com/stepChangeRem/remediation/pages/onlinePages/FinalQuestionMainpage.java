package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.RadioButton;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class FinalQuestionMainpage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button HaveUBeenAwardebankRuptcyNoRB;
    private Button MinimalAssetsProcessNoRb;
    private Button IsEveryoneShareDebtsNoRb;
    private Button WhatisdebtSolutionNoRb;
    private Button ContinueButton;
    private Button MinimalAssetsProcessNoRbUpdated;

    //getters
    public Button getHaveUBeenAwardebankRuptcyNoRB() {
        return HaveUBeenAwardebankRuptcyNoRB;
    }
    public Button getMinimalAssetsProcessNoRb() {
        return MinimalAssetsProcessNoRb;
    }
    public Button getIsEveryoneShareDebtsNoRb() {
        return IsEveryoneShareDebtsNoRb;
    }
    public Button getWhatisdebtSolutionNoRb() {
        return WhatisdebtSolutionNoRb;
    }
    public Button getMinimalAssetsProcessNoRbUpdated() {
        return MinimalAssetsProcessNoRbUpdated;
    }

    public Button getContinueButton() {return ContinueButton; }

    public FinalQuestionMainpage(){
        HaveUBeenAwardebankRuptcyNoRB = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[2]"));
        MinimalAssetsProcessNoRb = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[4]"));
        MinimalAssetsProcessNoRbUpdated = new Button(By.xpath("//input[@class='Radio rb_standard '])[2]"));
        IsEveryoneShareDebtsNoRb = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[6]"));
        WhatisdebtSolutionNoRb = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[9]"));
        ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
    }

    public void PerformActionOnFinalQuestionMainPage(){
        GenericMethods_cvp.implicitWait(5000);
        this.getHaveUBeenAwardebankRuptcyNoRB().click();
        GenericMethods_cvp.implicitWait(5000);
        //getBrowser().sleep(getBrowser().getTimeout() / 10);
        //this.getMinimalAssetsProcessNoRb().scrollElementIntoView();
        this.getMinimalAssetsProcessNoRb().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getIsEveryoneShareDebtsNoRb().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getWhatisdebtSolutionNoRb().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getContinueButton().click();
        GenericMethods_cvp.implicitWait(5000);
    }


}
