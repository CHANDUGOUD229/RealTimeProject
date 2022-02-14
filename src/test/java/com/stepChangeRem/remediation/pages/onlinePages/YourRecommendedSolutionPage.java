package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Checkbox;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Div;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.utilities.AAssert;
import org.openqa.selenium.By;

public class YourRecommendedSolutionPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button ourApproachContinueButton;
    private Div FinalScPlanIVA;
    private Div PaymentSuspensionPaln;
    private Checkbox IamInterestedinApplyingForPaymentSuspensionCheckBox;
    private Button FindoutMore;
    private Button ReturnToDebtSolution;
    private Button ContinueButton;

    //getters

    public Div getPaymentSuspensionPaln() {
        return PaymentSuspensionPaln;
    }
    public Checkbox getIamInterestedinApplyingForPaymentSuspensionCheckBox() { return IamInterestedinApplyingForPaymentSuspensionCheckBox; }
    public Button getFindoutMore() {
        return FindoutMore;
    }
    public Button getReturnToDebtSolution() {
        return ReturnToDebtSolution;
    }
    public Button getContinueButton() {
        return ContinueButton;
    }

    public YourRecommendedSolutionPage(){

        PaymentSuspensionPaln = new Div(By.xpath("//span[text()='Payment suspension']"));
        IamInterestedinApplyingForPaymentSuspensionCheckBox = new Checkbox(By.xpath("(//label[@class=' cb_standard'])[1]"));
        FindoutMore = new Button(By.xpath("(//button[text()='Find out more'])[1]"));
        ReturnToDebtSolution = new Button(By.xpath("//button[text()='Return to debt solutions']"));
        ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
        ourApproachContinueButton= new Button(By.xpath("//button[text()='Continue']"));
        FinalScPlanIVA = new Div(By.xpath("//span[text()='Individual voluntary arrangement']"));

    }

    public void SelectPaymentSuspensionPlan(){
        GenericMethods_cvp.implicitWait(2000);
        this.getIamInterestedinApplyingForPaymentSuspensionCheckBox().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getFindoutMore().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getReturnToDebtSolution().click();
        GenericMethods_cvp.implicitWait(4000);

    }

    public void VerifyPaymentSuspensionPlan(){
        String Plan =this.getPaymentSuspensionPaln().getDivText();
        System.out.println(Plan);
        AAssert.assertEquals(Plan, "Payment suspension");
        System.out.println("Payment suspension verified");
        GenericMethods_cvp.implicitWait(4000);
        this.getContinueButton().click();
        GenericMethods_cvp.implicitWait(4000);
    }


    public Button getOurApproachContinueButton(){return ourApproachContinueButton;}
    public Div getFinalScPlanIVA(){return FinalScPlanIVA;}

     public void ActionSetRecommendedSolutionAndReviewOption89955(){
         GenericMethods_cvp.implicitWait(10000);
        this.getOurApproachContinueButton().click();
         GenericMethods_cvp.implicitWait(10000);
         String Plan1 =this.getFinalScPlanIVA().getDivText();
         System.out.println(Plan1);
         AAssert.assertEquals(Plan1, "Individual voluntary arrangement");
         System.out.println("Individual voluntary arrangement");
         GenericMethods_cvp.implicitWait(10000);
     }
}
