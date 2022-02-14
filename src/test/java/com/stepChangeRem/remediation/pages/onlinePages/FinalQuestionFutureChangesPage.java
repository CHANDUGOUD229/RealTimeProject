package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.RadioButton;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class FinalQuestionFutureChangesPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button AreuExpectingaChangeQuestionRadioButton;
    private Button ContinueButton;

    //getters
    public Button getAreuExpectingaChangeQuestionRadioButton() { return AreuExpectingaChangeQuestionRadioButton; }
    public Button getContinueButton() {return ContinueButton; }

    public FinalQuestionFutureChangesPage(){
        AreuExpectingaChangeQuestionRadioButton = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[2]"));
        ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
    }

    public void PerformActionsoFutureChangesPage(){
        GenericMethods_cvp.implicitWait(2000);
        this.getAreuExpectingaChangeQuestionRadioButton().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getContinueButton().click();
        GenericMethods_cvp.implicitWait(2000);
    }

}
