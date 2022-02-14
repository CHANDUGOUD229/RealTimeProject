package com.stepChangeRem.remediation.pages.helper.online;

import com.stepChangeRem.remediation.pages.helper.vo.IncomeFields;
import com.stepChangeRem.remediation.pages.helper.vo.SpendingsFields;
import com.stepchange.atf.controls.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnlineIncomeHelper extends Control {
    private Button header;
    private Button subHeading;
    private TextField amountField;
    private Dropdown paymentFrequency;
    private Button addButton;
    private Button behindWithPayments;
    //Spening Fixed
    private AutoComplete creditor;
    private Dropdown debtType;
    private Button whoIsDebtor;
    private TextField mortgageBalance;
    private Button paidArrearsIn12Months;
    private Button typeOfMortgage;
    private Button isSVR;
    private Button mainHome;
    private TextField assetWorth;
    private Dropdown assetBelogsto;
    private Button addLink;
    private Button submit;
    private Button whoPays;
    private Div pageHeader;
    private Button idontHaveThisCost;
    //spending Fixed


    public Button getIdontHaveThisCost() {
        return idontHaveThisCost=new Button(By.xpath("//input[contains(@name,'$pIsItemNotApplicable')]/../label"));
    }

    public Div getPageHeader() {
        return pageHeader=new Div(By.xpath("//h1[@class='header-title']"));
    }

    public Button getWhoPays(String field, String label) {
        return whoPays=new Button(By.xpath("//h1[.='"+field+"']//following::label[.='"+label+"']"));
    }

    public Button getSubmit() {
        return submit=new Button(By.xpath("//button[.='Submit']"));
    }

    public Button getAddLink() {
        return addLink=new Button(By.xpath("//button[.='Add information']"));
    }

    public AutoComplete getCreditor() {
        return creditor=new AutoComplete(By.xpath("//input[contains(@name,'$l1$pCreditor$pDescription')]"));
    }

    public Dropdown getDebtType() {
        return debtType=new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l1$pCode')]"));
    }

    public Button getWhoIsDebtor(String client) {
        return whoIsDebtor=new Button(By.xpath("//input[contains(@name,'$l1$pOwnership$pCode')]/../label[.='"+client+"']"));
    }

    public TextField getMortgageBalance() {
        return mortgageBalance=new TextField(By.xpath("//input[contains(@name,'$l1$pAmountOwed')]"));
    }

    public Button getPaidArrearsIn12Months(String action) {
        return paidArrearsIn12Months=new Button(By.xpath("//input[contains(@name,'$l1$pPaymentMissedInLast12Months')]/../label[.='"+action+"']"));
    }

    public Button getTypeOfMortgage(String type) {
        return typeOfMortgage=new Button(By.xpath("//input[contains(@name,'$ppxResults$l1$pMortgageType')]/../label[.='"+type+"']"));
    }

    public Button getIsSVR(String isSvr) {
        return isSVR=new Button(By.xpath("//input[contains(@name,'$l1$pClientOnStandardVariableRate')]/../label[.='"+isSvr+"']"));
    }

    public Button getMainHome(String isMainHome) {
        return mainHome=new Button(By.xpath("//input[contains(@name,'$l1$pIsDebtRelatedToMainHome')]/../label[.='"+isMainHome+"']"));
    }

    public TextField getAssetWorth() {
        return assetWorth=new TextField(By.xpath("//input[contains(@name,'$l2$pAmount')]"));
    }

    public Dropdown getAssetBelogsto() {
        return assetBelogsto=new Dropdown(By.xpath("//select[contains(@name,'$l2$pOwnership$pCode')]"));
    }

    //Income
    public Button getBehindWithPayments(String field,String label) {
        return behindWithPayments=new Button(By.xpath("//h1[.='"+field+"']//following::label[.='"+label+"']"));
    }

    public Button getAddButton() {
        return addButton=new Button(By.xpath("//button[.='Add']"));
    }

    public TextField getAmountField(String heading) {
        return amountField=new TextField(By.xpath("//h1[.='"+heading+"']//following::input[not(@type='hidden')][1]"));
    }

    public Dropdown getPaymentFrequency(String heading) {
        return paymentFrequency=new Dropdown(By.xpath("//h1[.='"+heading+"']//following::select[1]"));
    }

    public Button getSubHeading(String subHeading) {
        return new Button(By.xpath("//div[not(@style=' display:none;')]/span[.='"+subHeading+"' and @class='body_text']"));
    }

    public Button getHeader(String header) {
        return new Button(By.xpath("//div[.='"+header+"' and @string_type='label']"));
    }

    public void fillTheIncomeDetails(List<IncomeFields> incomeFields) {
        getBrowser().sleep(getTimeout());
        this.getPageHeader().waitForElementIdDisplayed();
        for (IncomeFields field:incomeFields) {
            getBrowser().sleep(getTimeout()/10);
            this.getHeader(field.getHeader()).click();
            getBrowser().sleep(getTimeout()/10);
            this.getSubHeading(field.getField()).click();
            this.getAmountField(field.getField()).enterText(field.getAmount());
            this.getPaymentFrequency(field.getField()).selectFromDropdownByIndex(Integer.parseInt(field.getIndex()));
            if(field.getWhoPays()!=null && !field.getWhoPays().equalsIgnoreCase("false"))
                this.getWhoPays(field.getField(),field.getWhoPays()).click();
            this.getAddButton().click();
            this.getHeader(field.getHeader()).click();
        }
    }
    public void selectAllAsiDontHave()
    {
        getBrowser().sleep(getTimeout());
        List<WebElement> elements = getDriver().findElements(this.getIdontHaveThisCost().getSelector());
        for (WebElement element:elements) {
            element.click();
        }
    }
    public void fillTheSpendingDetails(List<SpendingsFields> spendingFields) {
        getBrowser().sleep(getTimeout());
        this.getPageHeader().waitForElementIdDisplayed();
        for (SpendingsFields field:spendingFields) {
            getBrowser().sleep(getTimeout()/10);
            this.getHeader(field.getHeader()).click();
            getBrowser().sleep(getTimeout()/10);
            this.getSubHeading(field.getField()).click();
            this.getAmountField(field.getField()).enterText(field.getAmount());
            this.getPaymentFrequency(field.getField()).selectFromDropdownByIndex(Integer.parseInt(field.getIndex()));
            if(field.getArrears()!=null && (field.getArrears().equalsIgnoreCase("yes")||field.getArrears().equalsIgnoreCase("No")))
            this.getBehindWithPayments(field.getField(),field.getArrears()).click();
//            if(field.getWhoPays()!=null && !field.getWhoPays().equalsIgnoreCase("false"))
//                this.getWhoPays(field.getField(),field.getWhoPays()).click();
            if(field.isMortagageLink())
            {
                this.getAddLink().click();
                this.getDebtType().selectFromDropdownByText(field.getDebtType());
                getBrowser().sleep(500);
                this.getCreditor().enterTextThenSelectFromAutoComplete(field.getCreditor());
                this.getCreditor().tab();
                this.getWhoIsDebtor(field.getWhoIsDebtor()).click();
                this.getMortgageBalance().enterText(field.getMortgageBalance().toString());
                this.getPaidArrearsIn12Months(field.getPaidArrearsIn12Months()).click();
                this.getTypeOfMortgage(field.getTypeOfMortgage()).click();
                this.getIsSVR(field.getIsSVR()).click();
                this.getMainHome(field.getMainHome()).click();
                if(field.getMainHome()!=null && field.getMainHome().equalsIgnoreCase("No"))
                {
                    this.getAssetWorth().enterText(field.getAssetWorth().toString());
                    this.getAssetBelogsto().selectFromDropdownByText(field.getAssetBelogsto());
                }
                this.getSubmit().click();
            }
            this.getAddButton().click();
            this.getHeader(field.getHeader()).click();
        }
    }
}
