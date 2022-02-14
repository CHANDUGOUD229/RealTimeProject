package com.stepChangeRem.remediation.pages.helper.online;

import com.stepChangeRem.remediation.pages.helper.vo.OnlineFinalQuestionsFields;
import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.controls.TextField;
import org.openqa.selenium.By;

import java.util.List;

public class OnlineAssetsPage extends Control {
    private boolean isMortgage;
    private TextField mortgagedPropertyValue;
    private Button mortgageOwner;
    private Button mortgageSplit;
    private Button addButton;
    private Button cutBackField;
    private Button canYouCutback;
    private Dropdown assetType;
    private TextField assetEstimatedValue;
    private Button whoOwnsTheAsset;
    private Button addAsset;
    private Dropdown reasonForNoCutBack;

    public Dropdown getReasonForNoCutBack(int index) {
        return reasonForNoCutBack=new Dropdown(By.xpath("//select[contains(@name,'$pReason')]"));
    }

    public Button getAddAsset() {
        return addAsset=new Button(By.xpath("//button[.='Add an asset']"));
    }

    public Dropdown getAssetType(int index) {
        return assetType=new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l"+index+"$pCode')]"));
    }

    public TextField getAssetEstimatedValue(int index) {
        return assetEstimatedValue=new TextField(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pAmount')]"));
    }

    public Button getWhoOwnsTheAsset(int index,String client) {
        return whoOwnsTheAsset=new Button(By.xpath("//input[contains(@name,'$l"+index+"$pOwnership$pCode')]/../label[.='"+client+"']"));
    }

    public Button getCanYouCutback(String index) {
        return canYouCutback=new Button(By.xpath("//input[contains(@name,'$pCanReduceSpendingAmount')]/../label[.='"+index+"']"));
    }

    public Button getCutBackField(String cutBack) {
        return cutBackField=new Button(By.xpath("//span[.='"+cutBack+"']"));
    }

    public Button getAddButton() {
        return addButton=new Button(By.xpath("//button[.='Add']"));
    }
    public boolean isMortgage() {
        return isMortgage;
    }

    public TextField getMortgagedPropertyValue(int index) {
        return mortgagedPropertyValue=new TextField(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pAmount')]"));
    }

    public Button getMortgageOwner(int index,String owner) {
        return mortgageOwner=new Button(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pOwnership$pCode')]/../label[.='"+owner+"']"));
    }

    public Button getMortgageSplit(int index,String split) {
        return mortgageSplit=new Button(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pIsEqualSplit')]/../label[.='"+split+"']"));
    }
    public Button getContinueButton() {
        return new Button(By.xpath("//button[.='Continue']"));
    }
    public void fillCutBackAmount(List<OnlineFinalQuestionsFields> finalQuestions)
    {
        int count=1;
        for (OnlineFinalQuestionsFields fields:finalQuestions) {
            this.getCutBackField(fields.getCutBackFor()).click();
            this.getCanYouCutback(fields.getCanYouCutback()).click();
            if(fields.getReasonforNoCutback()!=null && !fields.getReasonforNoCutback().equalsIgnoreCase("false"))
            {
                this.getReasonForNoCutBack(count*3).selectFromDropdownByText(fields.getReasonforNoCutback());
                count++;
            }
            this.getContinueButton().click();
        }

    }
    public void fillAssetsFormFinalQuestionsPage(List<OnlineFinalQuestionsFields> finalQuestions)
    {
        new Button(By.xpath("//div[.='Main home']")).click();
        for (int i = 0; i < finalQuestions.size(); i++) {
            OnlineFinalQuestionsFields finalQuestionsFields=finalQuestions.get(i);
         if(finalQuestionsFields.isMortgage())
        {
            int actualPosition=i+1;
            this.getMortgagedPropertyValue(actualPosition).enterText(finalQuestionsFields.getMortgagedPropertyValue());
            if(finalQuestionsFields.getMortgageOwner()!=null)
            this.getMortgageOwner(actualPosition,finalQuestionsFields.getMortgageOwner()).click();
            this.getMortgageSplit(actualPosition,finalQuestionsFields.getMortgageSplit()).click();
            this.getAddButton().click();
        }

        }

    }
    public void addAssetsToAssetPage(List<OnlineFinalQuestionsFields> finalQuestions)
    {
        getBrowser().sleep(getMaxAttempts());
        new Button(By.xpath("//label[.='Yes']")).click();
        for (int i = 0; i < finalQuestions.size(); i++) {
            OnlineFinalQuestionsFields finalQuestionsFields=finalQuestions.get(i);
            this.getAddAsset().click();
                int actualPosition=i+1;
                this.getAssetType(actualPosition).selectFromDropdownByText(finalQuestionsFields.getAssetType());
                this.getAssetEstimatedValue(actualPosition).enterText(finalQuestionsFields.getAssetEstimatedValue());
                this.getWhoOwnsTheAsset(actualPosition,finalQuestionsFields.getWhoOwnsTheAsset()).click();
                this.getAddButton().click();


        }
    }
}
