package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.RadioButton;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class FinalQuestionYourAssetsPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button whyDoWeNeedNoButton;
    private Button continueFinalQuestionPageButton;
    private Button whatJobAffectedNoButton;
    private Button prevBeenDebtSolNoButton;
    private Button DoYouOwnAnyNoRadioButton;
    private Button ContinueButton;
    private Button whatIsDebtSolution;
    //getters
    public Button getwhyDoWeNeedNoButton() {return whyDoWeNeedNoButton;}
    public Button getcontinueFinalQuestionPageButton() {return continueFinalQuestionPageButton;}
    public Button getWhatJobAffectedNoButton(){return whatJobAffectedNoButton;}
    public Button getPrevBeenDebtSolNoButton(){return prevBeenDebtSolNoButton;}
    public Button getDoYouOwnAnyNoRadioButton() {return DoYouOwnAnyNoRadioButton;}
    public Button getContinueButton() {return ContinueButton;}
    public Button getWhatIsDebtSolution(){return whatIsDebtSolution;}

    public FinalQuestionYourAssetsPage(){
        //same will use for final question future changes as well
        whyDoWeNeedNoButton= new Button(By.xpath("//label[text()='No']"));
        continueFinalQuestionPageButton = new Button(By.xpath("//button[text()='Continue']"));
        //(//label[@class='rb_standard rb_standard radioLabel'])[2]
        whatJobAffectedNoButton = new Button(By.xpath("(//label[text()='No'])[1]"));
        prevBeenDebtSolNoButton =new Button(By.xpath("(//label[text()='No'])[2]"));
        DoYouOwnAnyNoRadioButton = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[2]"));
        ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
        whatIsDebtSolution = new Button(By.xpath("(//label[text()='No'])[3]"));

    }
    public void ActionSetAssetAndFutureChanges(){
        GenericMethods_cvp.implicitWait(10000);
        this.getwhyDoWeNeedNoButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getcontinueFinalQuestionPageButton().click();
        GenericMethods_cvp.implicitWait(10000);
        //same is for future changes as well
        this.getwhyDoWeNeedNoButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getcontinueFinalQuestionPageButton().click();
        //Action for Final ques main page ans 2 question as no
        GenericMethods_cvp.implicitWait(10000);
        this.getWhatJobAffectedNoButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getPrevBeenDebtSolNoButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getWhatJobAffectedNoButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getcontinueFinalQuestionPageButton().click();
        GenericMethods_cvp.implicitWait(10000);

    }

    public void PerformActionsOnAssetsPagefor89963()
    {
        GenericMethods_cvp.implicitWait(2000);
        this.getDoYouOwnAnyNoRadioButton().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getContinueButton().click();
        GenericMethods_cvp.implicitWait(2000);
    }
}
