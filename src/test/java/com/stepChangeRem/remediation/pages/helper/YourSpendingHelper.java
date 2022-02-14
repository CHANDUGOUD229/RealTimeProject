package com.stepChangeRem.remediation.pages.helper;

import com.stepchange.atf.controls.Checkbox;
import org.openqa.selenium.By;

public class YourSpendingHelper {
    private Checkbox Idonthavethiscost;

    public Checkbox getIdonthavethiscost( String spendtype) {
        return Idonthavethiscost=new Checkbox(By.xpath("//span[contains(text(),'"+spendtype+"')]//following::input[contains(@name,'$pIsItemNotApplicable')]/../label"));
    }

    public void  checkItemsNotApplicable(String itemType)
    {
        this.getIdonthavethiscost(itemType).click();
    }
}
