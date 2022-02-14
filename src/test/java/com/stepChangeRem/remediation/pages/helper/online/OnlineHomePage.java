package com.stepChangeRem.remediation.pages.helper.online;

import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.controls.Link;
import org.openqa.selenium.By;

public class OnlineHomePage extends Control {
    private Link clickMe;

    public Link getClickMe() {
        return clickMe=new Link(By.linkText("Click Here"));

    }


    public void clickOnClickMe()
    {
        this.getClickMe().click();
        getBrowser().sleep(20000);
        switchToNewWindow("Debt Advice");
        getDriver().manage().window().maximize();
    }
}
