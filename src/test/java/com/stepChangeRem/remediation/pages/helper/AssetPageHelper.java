package com.stepChangeRem.remediation.pages.helper;

import com.stepChangeRem.remediation.pages.helper.vo.AssetsFields;
import com.stepchange.atf.controls.*;
import org.openqa.selenium.By;

import java.util.List;

public class AssetPageHelper extends Control {

    private TextField totalAmount;
    private Dropdown owner;
    private Button allAssetsCaptured;
    private Button addAsset;
    private TextField valueOfTheAsset;
    private Dropdown ownerOfTheAsset;
    private TextField shareValue;

    public Button getAddAsset(String addFieldName) {
        return addAsset=new Button(By.xpath("//button[.=\"" + addFieldName + "\"]"));
    }

    public TextField getValueOfTheAsset(String text) {
        return valueOfTheAsset=new TextField(By.xpath("//div[.=\""+text+"\"]//following::input[2][@value='']"));
    }

    public Dropdown getOwnerOfTheAsset(String text) {
        return ownerOfTheAsset= new Dropdown(By.xpath("//div[.=\""+text+"\"]//following::select[1]"));
    }

    public TextField getShareValue(int index) {
        return shareValue=new TextField(By.xpath("//input[contains(@name,\"$l"+index+"$pPercentage\")]"));
    }

    public Button getAllAssetsCaptured() {
        return allAssetsCaptured=new Button(By.xpath("//input[@name='$PpyWorkPage$pGenericFlag$gAssetInputComplete'][2]/../label"));
    }

    public TextField getTotalAmount(String text) {
           return new TextField(By.xpath("//div[.='"+text+"']//following::input[2][@value='']"));
    }

    public Dropdown getOwner(String text) {
        return owner= new Dropdown(By.xpath("//div[.='"+text+"']//following::select[1]"));
    }
    public void fillAssetDetails(List<AssetsFields> assetsFields)
    {
        switchToActiveFrame();
        for (AssetsFields field:assetsFields) {
            if(field.isMainHome())
            {
                this.getTotalAmount(field.getField()).enterText(field.getMainHomeAmount().toString());
                this.getOwner(field.getField()).selectFromDropdownByText(field.getMainHomeOwner());
            }
            else
            {
                this.getAddAsset(field.getField().toLowerCase()).click();
                this.getValueOfTheAsset(field.getField()).enterText(field.getValue());
                this.getOwnerOfTheAsset(field.getField()).selectFromDropdownByIndex(Integer.valueOf(field.getOwner()));
                this.getShareValue(1).enterText(field.getShareValue());
                this.getShareValue(1).tab();
            }
        }
        this.getAllAssetsCaptured().click();

    }
}
