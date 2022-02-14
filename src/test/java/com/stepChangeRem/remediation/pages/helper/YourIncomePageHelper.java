package com.stepChangeRem.remediation.pages.helper;

import com.stepChangeRem.remediation.pages.YourIncomePage;
import com.stepChangeRem.remediation.pages.helper.vo.IncomeFields;
import com.stepChangeRem.remediation.pages.helper.vo.SpendingsFields;
import com.stepchange.atf.controls.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class YourIncomePageHelper extends YourIncomePage{
    static int counter=0;

    public Div getSpendingPageHeader() {
        return spendingPageHeader= new Div(By.xpath("//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing flex flex-row dataLabelWrite heading_1_dataLabelWrite']"));
    }
    public Button getSubmit() {
        return submit = new Button(By.xpath("//button[.='Submit']"));
    }

    Button submit;
    Button addField;

    public Button getAddField(String addFieldName) {
        return addField=new Button(By.xpath("//button[.=\"" + addFieldName + "\"]"));
    }
    // Fields
//    Button removeButtonXpath;
//    WebElement  removeButton;

    Div spendingPageHeader;

    public Div getTotalIncome() {
        return totalIncome=new Div(By.xpath("//div[.='Income']//following::span[3]"));
    }

    public Div getTotalSpendings() {
        return totalSpendings=new Div(By.xpath("//p[@name='$PpyWorkPage$pNewAgreedTotalMonthlyExpWithAIP']"));
    }

    public Div getTotableAvaialeForDebts() {
        return totableAvaialeForDebts= new Div(By.name("$PpyWorkPage$pNewAgreedTotalMonthlyDifference"));
    }

    Div totalIncome;
    Div totalSpendings;
    Div totableAvaialeForDebts;
    TextField incomeTextBox;
    Dropdown  incomePaymentDropDown;
    List<WebElement>  labelOfTheField;
    ArrayList<String> allDetailsFromWebPage;
    Button arrearsButton;
    private Checkbox allFixedSpendingCompleted;
    private Checkbox allFlexibleSpendingCompleted;
    private Button backButton;
    private Dropdown owner;

    public Dropdown getOwner(String field) {
        return owner=new Dropdown(By.xpath("//div[.='"+field+"']//following::select[2]"));
    }

    public Button getBackButton() {
        switchToActiveFrame();
        return backButton=new Button(By.xpath("//button[@title='Back Action']"));
    }

    //    HashMap<String,WebElement> requiredDetailsFromWebPage;
    // Getter Methods
    public Checkbox getAllFlexibleSpendingCompleted() {
        return allFixedSpendingCompleted=new Checkbox(By.xpath("//label[normalize-space()='All flexible spending items are complete']"));
    }
    public Checkbox getAllFixedSpendingCompleted() {
        return allFixedSpendingCompleted=new Checkbox(By.xpath("//label[normalize-space()='All fixed spending items are complete']"));
    }
    public TextField getIncomeTextBox(String text) {
        return incomeTextBox=new TextField(By.xpath("//div[.=\""+text+"\"]//following::input[2][@value='']"));
    }
    public Dropdown getIncomePaymentDropDown(String text) {
        return incomePaymentDropDown= new Dropdown(By.xpath("//div[.=\""+text+"\"]//following::select[1]"));
    }
    public Button getArrearsButton(String text,String label) {
        return arrearsButton= new Button(By.xpath("//div[.=\""+text+"\" ]//following::label[.='"+label+"']"));
    }
    public YourIncomePageHelper()
    {


    }
    public void retriveAllRemoveButtons()
    {
        allDetailsFromWebPage=new ArrayList<String>();
        labelOfTheField=  getDriver().findElements(By.xpath("//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing flex flex-row dataLabelWrite heading_4_dataLabelWrite']"));
        for (WebElement labelField:labelOfTheField) {
            String lable;
            try {
                lable=labelField.getText();
            }
            catch (StaleElementReferenceException e)
            {
                getBrowser().sleep(100);
                lable=labelField.getText();
            }

            if(!lable.isEmpty())
            {
                allDetailsFromWebPage.add(lable);
            }

        }
    }

    public <T extends IncomeFields> void  removeButtonsFromIncomePage(List<T> details)
    {
//        requiredDetailsFromWebPage=new HashMap<String,WebElement>();
        retriveAllRemoveButtons();
            for (IncomeFields income:details) {
            if(allDetailsFromWebPage.contains(income.getField()))
            {
//                requiredDetailsFromWebPage.put(income.getField(),allDetailsFromWebPage.get(income.getField()));
                allDetailsFromWebPage.remove(income.getField());
            }

        }
        getBrowser().sleep(5000);
        for (String field:allDetailsFromWebPage) {
            scrollIntoElementView();
            cickOnRemoveButton(field);
        }
        System.out.println("====Remove All Action Itom and Exist from income Screen");
        }

    private void cickOnRemoveButton(String entry) {

        try {
                if(this.getIncomeTextBox(entry).getText().isEmpty())
            {
                Button remove = new Button(By.xpath("//div[.='" + entry + "']//following::button[.='Remove']"));
                this.log("Clicking On Remove Button For :: " + entry);
                if (remove.isElementDisplayed()) {
                    remove.click();
                }
                if (new Checkbox(By.xpath("//label[.='Someone else pays for this']")).isElementDisplayed()) {
                    new Checkbox(By.xpath("//label[.='Someone else pays for this']")).click();
                    this.getSubmit().click();
                }
                verifyOverLayDisplayed();
                waitForElementInVisibility(remove.getSelector());
//                remove = new Button(By.xpath("//div[.='" + entry.getKey() + "']//following::button[.='Remove']"));
//                this.log("Clicking On Remove Button For :: " + entry.getKey());
//                if (remove.isElementDisplayed()) {
//                    remove.click();
//                }
            }
        }
        catch (StaleElementReferenceException e)
        {
            counter++;
            if(counter<1)
            cickOnRemoveButton(entry);
        }
        catch (ElementNotVisibleException e)
        {
            counter++;
            if(counter<1)
            cickOnRemoveButton(entry);
        }
        catch (Exception e)
        {
            this.log(e.getMessage()+" :: From Your Income Page Helper");
        }
    }
    protected synchronized void waitForElementInVisibility(By element){
        Wait<WebDriver> wait = null;
        try {
            System.out.println("Waiting started :: "+System.currentTimeMillis());
            wait = new FluentWait<WebDriver>((WebDriver) getDriver()).withTimeout(getBrowser().getTimeout(), TimeUnit.MILLISECONDS).pollingEvery(1,
                    TimeUnit.SECONDS);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
            System.out.println("Waiting Ended :: "+System.currentTimeMillis());
        }catch(Exception e) {
        }

    }

    protected synchronized void waitForElementVisibility(By element){
        Wait<WebDriver> wait = null;
        try {
            System.out.println("Waiting started :: "+System.currentTimeMillis());
            wait = new FluentWait<WebDriver>((WebDriver) getDriver()).withTimeout(getBrowser().getTimeout(), TimeUnit.MILLISECONDS).pollingEvery(1,
                    TimeUnit.SECONDS);
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            System.out.println("Waiting Ended :: "+System.currentTimeMillis());
        }catch(Exception e) {
        }

    }



    public void addIncomeDetails(List<IncomeFields> details,String totalAmount)
    {
        ArrayList<String> duplicates=new ArrayList<String>();
        switchToActiveFrame();
        this.removeButtonsFromIncomePage(details);
        for (IncomeFields field:details) {
            int index=1;
            if(duplicates.size()>0&& duplicates.contains(field.getField()))
            {
                index=duplicates.indexOf(field.getField());
            }

            this.log("Value Provided for Income Field:: "+field.getField()+" :: "+field.getAmount()+" :: "+field.getIndex());
            verifyFieldIsAddedInthScreenIfNotAddTheFieldIncome(field);
            verifyOverLayDisplayed();
            this.getIncomeTextBox(field.getField()).enterText(field.getAmount());
            this.getIncomeTextBox(field.getField()).tab();
            getBrowser().sleep(getBrowser().getTimeout());
            verifyOverLayDisplayed();
//            verifyOverLayDisplayed();
            for (WebElement element:getDriver().findElements(this.getIncomePaymentDropDown(field.getField()).getSelector())) {
                Select payments=new Select(element);
                if(payments.getFirstSelectedOption().getText().contains("select"))
                {
                    payments.selectByIndex(Integer.parseInt(field.getIndex()));
                    break;
//                    this.getIncomePaymentDropDown(field.getField()).selectFromDropdownByIndex(Integer.parseInt(field.getIndex()));
                }
            }
            if(field.getOwner()!=null && field.getOwner().intValue()>0)
            {
                this.getOwner(field.getField()).selectFromDropdownByIndex(field.getOwner().intValue());
            }
            duplicates.add(field.getField());
        }
        getAllIncome().click();
//        AAssert.assertContains(this.getTotalIncome().getDivText().replaceAll("[^a-zA-Z0-9.]", ""),totalAmount,"Total Income Is Not Matched");
        this.getContinueYourIncomeButton().click();

    }
    public void  addSpendingDetails(List<SpendingsFields> details,String totalFixedSpendings)
    {
        switchToActiveFrame();
       // this.getSpendingPageHeader().waitForElementIdDisplayed();
        getBrowser().sleep(5000);
        System.out.println("====Enter in to Navigate to the Your Spendings Fixed page");
        //this.removeButtonsFromIncomePage(details);//***********cmt by Priya
        //clicking in Spending link--****** Added by priya
        //getBrowser().sleep(5000);
       // ClickYourSpendingLink();
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        for (SpendingsFields field:details) {
            this.log("Value Provided for Spending Field:: "+field.getField()+" :: "+field.getAmount()+" :: "+field.getIndex()+" :: "+field.getArrears());
            System.out.println("Value Provided for Spending Field:: "+field.getField()+" :: "+field.getAmount()+" :: "+field.getIndex()+" :: "+field.getArrears());
            verifyOverLayDisplayed();
                verifyFieldIsAddedInthScreenIfNotAddTheField(field);
            this.getIncomeTextBox(field.getField()).enterText(field.getAmount());
            verifyOverLayDisplayed();
            this.getIncomeTextBox(field.getField()).tab();
            verifyOverLayDisplayed();
            this.getIncomePaymentDropDown(field.getField()).selectFromDropdownByIndex(Integer.parseInt(field.getIndex()));
            verifyOverLayDisplayed();
            if(!field.getArrears().equalsIgnoreCase("false"))
            this.getArrearsButton(field.getField(),field.getArrears()).click();
            System.out.println("====Exist in to Navigate to the Your Spendings Fixed page");

        }
        this.getAllFixedSpendingCompleted().click();
//        String amount = ;
//        AAssert.assertContains(getTotalSpendings().getDivText().replaceAll("[^a-zA-Z0-9.]", ""),totalFixedSpendings,"Total Fixed Spendings are Not Matched");
//        this.getTotalSpendings().verifyDivContains(totalFixedSpendings);


    }
    public void  addFlexibleSpendingDetails(List<SpendingsFields> details,String totalSpendings)
    {
        switchToActiveFrame();
        this.getSpendingPageHeader().waitForElementIdDisplayed();
        this.getBrowser().sleep(10000);
        this.removeButtonsFromIncomePage(details);
        for (SpendingsFields field:details)
        {
            verifyFieldIsAddedInthScreenIfNotAddTheField(field);
            this.log("Value Provided for Spending Field:: "+field.getField()+" :: "+field.getAmount()+" :: "+field.getIndex()+" :: "+field.getArrears());
            verifyOverLayDisplayed();
            this.getIncomeTextBox(field.getField()).enterText(field.getAmount());
            verifyOverLayDisplayed();
            this.getIncomeTextBox(field.getField()).tab();
            verifyOverLayDisplayed();
            this.getIncomePaymentDropDown(field.getField()).selectFromDropdownByIndex(Integer.parseInt(field.getIndex()));
            verifyOverLayDisplayed();
            if(!field.getArrears().equalsIgnoreCase("false"))
                this.getArrearsButton(field.getField(),field.getArrears()).click();
        }
        this.getAllFlexibleSpendingCompleted().click();
//        String amount = ;
//        AAssert.assertContains(getTotalSpendings().getDivText().replaceAll("[^a-zA-Z0-9.]", "") ,totalSpendings,"Total Flexible Spendings are Not Matched");
//        this.getTotalSpendings().verifyDivContains(totalSpendings);
    }
    public void verifyOverLayDisplayed() {

        try {
            waitForElementVisibility();
            waitForElementInVisibility();
        } catch (Exception e)
        {

        }
    }

    public void verifyFieldIsAddedInthScreenIfNotAddTheField(SpendingsFields text) {
        try {
            this.getIncomeTextBox(text.getField()).clear();
        } catch (Exception ex) {
            if (text.getField().equalsIgnoreCase("Childcare")) {
                this.getAddField("childcare").click();
            } else if (text.getField().equalsIgnoreCase("School uniform")) {
                this.getAddField("school uniform").click();
            } else {
                this.getAddField(text.getField().toLowerCase()).click();
            }
        }
    }
    public void verifyFieldIsAddedInthScreenIfNotAddTheFieldIncome(IncomeFields text)
    {
        try {
            this.getIncomeTextBox(text.getField()).clear();
        }catch (Exception ex){
            if(text.getField().equalsIgnoreCase("Other earnings"))
            {
                this.getAddField("other earning").click();
            }else if(text.getField().equalsIgnoreCase("Jobseeker's Allowance (contribution-based)")){
                this.getAddField("JSA (contribution-based)");
            }
            else {
                this.getAddField(text.getField().toLowerCase()).click();
            }
            waitForElementVisibility(this.getIncomeTextBox(text.getField()).getSelector());
            try {
                new Dropdown(By.xpath("//div[.='"+text.getField()+"']//following::select[2]")).selectFromDropdownByIndex(3);
            }catch (Exception e){}


        }


    }



    public void scrollIntoElementView() {
        try {
            ((JavascriptExecutor) this.getDriver()).executeScript("element.focus();", new Object[]{this.getElement()});
            ((JavascriptExecutor) this.getDriver()).executeScript("arguments[0].scrollIntoView(true);", new Object[]{this.getElement()});
        } catch (Exception var2) {
            this.log(var2.getLocalizedMessage() + " Exception thrown inside scrollElementIntoView() method ");
            try {
                Actions actions = new Actions(getDriver());
                actions.moveToElement(this.getElement());
                actions.perform();
                this.log(	" Retried to Scroll and Passed  ");
            }catch (Exception var3)
            {
                this.log(var3.getLocalizedMessage() + " Retried to Scroll and Failed ");
            }

            try {
                Actions actions = new Actions(getDriver());
                actions.moveToElement(this.getElement());
                actions.perform();
                this.log(  " Retried to Scroll and Passed  ");
            }catch (Exception var3)
            {
                this.log(var3.getLocalizedMessage() + " Retried to Scroll and Failed ");
            }
        }
    }
}
