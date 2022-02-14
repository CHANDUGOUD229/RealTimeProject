package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class BudgetLooksGoodPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button ContinueButton;
    public Button getContinueButton() {
        return ContinueButton;
    }

    public BudgetLooksGoodPage(){

        ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
    }

}
