package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class JourneyStartsHerePage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button clickHereButton;

    private Button ScotlandLocationRb;
    private Button NorthIrelandOption;
    private Button UkDebtYesRb;
    private TextField HowoldAreYouTextField;
    private Button AreYouSelfEmployedNoRb;
    private Dropdown PromptToSeekHelp;
    private Dropdown CauseOfFinancialDifficulty;
    private Button DoYouLiveWithPartnerNoRb;
    private Button ContinueButtonofYourDebtAdviceJourneypage;

    //getters

    public Button getclickHereButton() {return clickHereButton;}

    public Button getScotlandLocationRb() {
        return ScotlandLocationRb;
    }
    public Button getNorthIrelandOption(){ return NorthIrelandOption;}
    public Button getUkDebtYesRb() {
        return UkDebtYesRb;
    }
    public TextField getHowoldAreYouTextField() {
        return HowoldAreYouTextField;
    }
    public Button getAreYouSelfEmployedNoRb() {
        return AreYouSelfEmployedNoRb;
    }
    public Dropdown getPromptToSeekHelp() {
        return PromptToSeekHelp;
    }
    public Dropdown getCauseOfFinancialDifficulty() {
        return CauseOfFinancialDifficulty;
    }
    public Button getDoYouLiveWithPartnerNoRb() {
        return DoYouLiveWithPartnerNoRb;
    }
    public Button getContinueButtonofYourDebtAdviceJourneypage() {
        return ContinueButtonofYourDebtAdviceJourneypage;
    }



    public JourneyStartsHerePage(){
        clickHereButton = new Button(By.xpath("//a[text()='Click Here']"));
        ScotlandLocationRb = new Button(By.xpath("//label[text()='Where do you live?']//following::label[3]"));
        NorthIrelandOption= new Button(By.xpath("//label[text()='Where do you live?']//following::label[4]"));
        UkDebtYesRb= new Button(By.xpath("//Div[text()='Do you have at least one UK based debt?']//following::label[2]"));
        HowoldAreYouTextField= new TextField(By.xpath("//label[text()='How old are you?']//following::input[1]"));
        AreYouSelfEmployedNoRb= new Button(By.xpath("//div[text()='Are you self-employed?']//following::label[3]"));
        PromptToSeekHelp= new Dropdown(By.xpath("//label[text()='What prompted you to seek help from StepChange?']//following::select[1]"));
        CauseOfFinancialDifficulty= new Dropdown(By.xpath("//label[contains(text(),'cause of your financial difficulty is?')]//following::select[1]"));
        DoYouLiveWithPartnerNoRb = new Button(By.xpath("//label[text()='Do you live with a partner?']//following::label[2]"));
        ContinueButtonofYourDebtAdviceJourneypage= new Button(By.xpath("//button[text()='Continue']"));

    }
    public void EnteringClientDetailOnStartPage89955(){
        GenericMethods_cvp.implicitWait(10000);
        this.getNorthIrelandOption().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getUkDebtYesRb().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getHowoldAreYouTextField().enterTextField("45");
        GenericMethods_cvp.implicitWait(10000);
        this.getAreYouSelfEmployedNoRb().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getPromptToSeekHelp().selectFromDropdownByIndex(3);
        GenericMethods_cvp.implicitWait(10000);
        this.getCauseOfFinancialDifficulty().selectFromDropdownByIndex(5);
        GenericMethods_cvp.implicitWait(10000);
        this.getDoYouLiveWithPartnerNoRb().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getContinueButtonofYourDebtAdviceJourneypage().click();
        GenericMethods_cvp.implicitWait(10000);
    }

    public void EnterClientDetailsfor89963(String age,int number1,int number2){
        this.getScotlandLocationRb().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getUkDebtYesRb().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getHowoldAreYouTextField().enterText(age);
        GenericMethods_cvp.implicitWait(2000);
        this.getAreYouSelfEmployedNoRb().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getPromptToSeekHelp().selectFromDropdownByIndex(number1);
        GenericMethods_cvp.implicitWait(2000);
        this.getCauseOfFinancialDifficulty().selectFromDropdownByIndex(number2);
        GenericMethods_cvp.implicitWait(2000);
        this.getDoYouLiveWithPartnerNoRb().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getContinueButtonofYourDebtAdviceJourneypage().click();
    }
}
