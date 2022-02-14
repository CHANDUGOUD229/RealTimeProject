package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Link;
import com.stepchange.atf.controls.TextField;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.utilities.RandomGenerators;
import org.openqa.selenium.By;

public class AccountRegistrationPage extends Control {
    final String email = RandomGenerators.getRandomString();
    final String finalValue = "test"+ email;
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();

    private Link LinkContinueWithoutRegistration;
    private Button ContinueButtonOnRegistration;
    private TextField EmailAddressTextBox;
    private TextField FirstNameTextBox;
    private TextField DateOfBirthTextBox;
    private Button RegisterButton;

    public Link getLinkContinueWithoutRegistration() {return LinkContinueWithoutRegistration;}
    public Button getContinueButtonOnRegistration() {return ContinueButtonOnRegistration;}
    public TextField getEmailAddressTextBox() {
        return EmailAddressTextBox;
    }
    public TextField getFirstNameTextBox() {
        return FirstNameTextBox;
    }
    public TextField getDateOfBirthTextBox() {
        return DateOfBirthTextBox;
    }
    public Button getRegisterButton() {
        return RegisterButton;
    }

    public AccountRegistrationPage(){
        LinkContinueWithoutRegistration=new Link(By.xpath("//a[@data-test-id='201812131425510620399']"));
        ContinueButtonOnRegistration=new Button(By.xpath("//button[@data-test-id='201806251335470614103160']"));
        EmailAddressTextBox = new TextField(By.xpath("//div[text()='Email address']//following::input[1]"));
        FirstNameTextBox = new TextField(By.xpath("//div[text()='First name']//following::input[1]"));
        DateOfBirthTextBox = new TextField(By.xpath("//label[text()='Date of birth']//following::input[1]"));
        RegisterButton = new Button(By.xpath("//button[text()='Register']"));
    }
    public void withoutRegistrationOnline(){
        GenericMethods_cvp.implicitWait(10000);
        this.getLinkContinueWithoutRegistration().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getContinueButtonOnRegistration().click();
        GenericMethods_cvp.implicitWait(10000);
    }
    public void CreateAccountforClient89963 () {
        GenericMethods_cvp.implicitWait(2000);
        this.getEmailAddressTextBox().enterText(finalValue+"@gmail.com");
        GenericMethods_cvp.implicitWait(2000);
        this.getFirstNameTextBox().enterText(finalValue);
        GenericMethods_cvp.implicitWait(3000);
        this.getDateOfBirthTextBox().enterText("10101979");
        this.getDateOfBirthTextBox().enterText("10101979");
        GenericMethods_cvp.implicitWait(3000);
        this.getRegisterButton().click();
        GenericMethods_cvp.implicitWait(3000);
    }
    public void CreateAccountforClient89944 () {
        GenericMethods_cvp.implicitWait(2000);
        this.getEmailAddressTextBox().enterText(finalValue+"89944@gmail.com");
        GenericMethods_cvp.implicitWait(2000);
        this.getFirstNameTextBox().enterText("Client1");
        GenericMethods_cvp.implicitWait(3000);
        this.getDateOfBirthTextBox().enterText("10011983");
        this.getDateOfBirthTextBox().enterText("10011983");
        GenericMethods_cvp.implicitWait(3000);
        this.getRegisterButton().click();
        GenericMethods_cvp.implicitWait(3000);
    }
    public void CreateAccountforClient89947 () {
        GenericMethods_cvp.implicitWait(2000);
        this.getEmailAddressTextBox().enterText(finalValue+"89947@gmail.com");
        GenericMethods_cvp.implicitWait(2000);
        this.getFirstNameTextBox().enterText("Client1");
        GenericMethods_cvp.implicitWait(3000);
        this.getDateOfBirthTextBox().enterText("10011983");
        this.getDateOfBirthTextBox().enterText("10011983");
        GenericMethods_cvp.implicitWait(3000);
        this.getRegisterButton().click();
        GenericMethods_cvp.implicitWait(3000);
    }
    public void CreateAccountforClient89950 () {
        GenericMethods_cvp.implicitWait(2000);
        this.getEmailAddressTextBox().enterText(finalValue+"89950@gmail.com");
        GenericMethods_cvp.implicitWait(2000);
        this.getFirstNameTextBox().enterText("Client1");
        GenericMethods_cvp.implicitWait(3000);
        this.getDateOfBirthTextBox().enterText("10011973");
        this.getDateOfBirthTextBox().enterText("10011973");
        GenericMethods_cvp.implicitWait(3000);
        this.getRegisterButton().click();
        GenericMethods_cvp.implicitWait(3000);
    }
    public void CreateAccountforClient89954 () {
        GenericMethods_cvp.implicitWait(2000);
        this.getEmailAddressTextBox().enterText(finalValue+"89954@gmail.com");
        GenericMethods_cvp.implicitWait(2000);
        this.getFirstNameTextBox().enterText("Client1");
        GenericMethods_cvp.implicitWait(3000);
        this.getDateOfBirthTextBox().enterText("10011985");
        this.getDateOfBirthTextBox().enterText("10011985");
        GenericMethods_cvp.implicitWait(3000);
        this.getRegisterButton().click();
        GenericMethods_cvp.implicitWait(3000);
    }

}
