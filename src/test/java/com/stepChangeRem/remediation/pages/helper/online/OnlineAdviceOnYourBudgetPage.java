package com.stepChangeRem.remediation.pages.helper.online;

import com.stepchange.atf.controls.Button;
import org.openqa.selenium.By;

public class OnlineAdviceOnYourBudgetPage {
    private Button ruSatisified;

    public Button getRuSatisified() {
        return ruSatisified=new Button(By.xpath("//input[@name='$PpyWorkPage$pIsYourSituationCorrect']/../label[.='Yes']"));
    }

}
