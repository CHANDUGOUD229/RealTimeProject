package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class OurApproachGivingAdvicePage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button ContinueButton;
    //getters
    public Button getContinueButton() {
        return ContinueButton;
    }

    public OurApproachGivingAdvicePage(){
        ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
    }


    public void PerformActionsonourApproachGivingAdvicePage(){
        GenericMethods_cvp.implicitWait(2000);
        this.getContinueButton().click();
        GenericMethods_cvp.implicitWait(2000);
    }

}
