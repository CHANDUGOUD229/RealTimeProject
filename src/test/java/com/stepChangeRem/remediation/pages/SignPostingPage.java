package com.stepChangeRem.remediation.pages;

import com.stepChangeRem.remediation.pages.helper.vo.SignPostingFields;
import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Checkbox;
import com.stepchange.atf.controls.Control;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SignPostingPage extends Control {
    private Button signPosting;
    private Button submitSign;
    private Button client1;

    public Button getSubmitSign() {
        return submitSign=new Button(By.xpath("//button[.='Submit']"));
    }

    public Button getClient1(String dicussedWith) {
        return client1=new Button(By.xpath("//div[.='"+dicussedWith+"']//following::label/../input[2]"));
    }


    public Button getSignPosting() {
        try {
            (new WebDriverWait(getBrowser().getDriver(), 5)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("PegaGadget1Ifr"));
        }catch (Exception e){}
        switchtoActiveIframe("PegaGadget1Ifr");
        return signPosting=new Button(By.xpath("//div[.='Signposting']"));
    }
    public void getSignPostingDone(List<SignPostingFields> signPostingFields)
    {
        switchtoActiveIframe("PegaGadget1Ifr");
        for (SignPostingFields field:signPostingFields) {
            this.getClient1(field.getService()).click();
        }
        this.getSubmitSign().click();
        this.getSubmitSign().verifyOverLayDisplayed();
    }
}
