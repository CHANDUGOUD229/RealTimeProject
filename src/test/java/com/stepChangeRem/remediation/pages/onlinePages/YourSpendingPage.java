package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.controls.TextField;
import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourSpendingPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button ContinueButton;
    private Button iHaveFinish;
    private Button PopUpConfirmButton;
    private Button homeAndContentButton;
    private Button rentButton;
    private TextField rentTextbox;
    private Dropdown rentDropdown;
    private Button rentArrearButtonNo;

    private Button rateButton;
    private TextField rateTextBox;
    private Dropdown rateDropdown;
    private Button rateArrearButtonNo;

    private Button tvLicenceButton;
    private TextField tvLicenceTextbox;
    private Dropdown tvLicenceDropdown;
    private Button tvLicenceArrearButtonNo;

    private Button utilityButton;
    private Button elctricityButton;
    private TextField electricityTextBox;
    private Dropdown electricityDropdown;
    private Button electricityArrearButtonNo;

    private Button gasButton;
    private TextField gasTextbox;
    private Dropdown gasDropdown;
    private Button gasArrearButtonNo;

    private Button waterSupplyButton;
    private TextField waterSupTextBox;
    private Dropdown waterSupplyDropdown;
    private Button waterSupplyArrearButtonNo;


    private Button foodAndHousekeepingButton;
    private Button groceriesButton;
    private TextField groceriesTextBox;
    private Dropdown geroceresDropdown;

    private Button personalCostButton;
    private Button clothingAndFootwarebutton;
    private TextField clothingTextBox;
    private Dropdown clothingDropdown;

    private Button careAndHelthCostButton;
    private Button chaildCareButton;
    private TextField chaildCareTextBox;
    private Dropdown chaildCaredropdown;
    private Button chaildCareArrearNo;

    private Button pesionAndInsuranceButton;
    private Button buildingContentInsuranceButton;
    private TextField buildingContTextBox;
    private Dropdown buildingContDropdown;
    private Button buildingContArrearNo;

    private Button schoolCostButton;
    private Button schoolUniformButton;
    private TextField schoolUniformTextBox;
    private Dropdown schoolUniformDropdown;
    private Button addButtonForAll;

    private Button HomeandContents;
    private Button Board;
    private TextField HowMuchdoyouPayTextbox;
    private Dropdown HowOftenDropdown;
    private Button AreYouBehindWithPaymentsNoRb;//need to use Add button

    private Button PensionsandInsurance;
    private Button BuildingsandContentInsurances;
    private TextField HowMuchdoyouPayTextboxForBuildingandContents;
    private Dropdown HowOftenDropdownForBuildingandContents;
    private Button AreYouBehindWithPaymentsNoRbForBuildingandContents;//need to use Add button


    private Button FoodandHouseKeeping;
    private Button Groceries;
    private TextField HowMuchDoyouSpendtextbox;
    private Dropdown HowOftengroceriesDropdown;
    private Button ContinueButtonforYourSpendingPage;
    private Checkbox IdontHavethisCostCheckBoxForClothingandFootware;
    private Button AddButton;
    private Button ConfirmButtoninDebtPopUp;
    private Button IhaveAddedEverythingYesRbinDebtPopUp;


    //getters
    public Button getAddButton() {
        return AddButton;
    }
    public Button getHomeandContents() {
        return HomeandContents;
    }
    public Button getBoard() {
        return Board;
    }
    public TextField getHowMuchdoyouPayTextbox() {
        return HowMuchdoyouPayTextbox;
    }
    public Dropdown getHowOftenDropdown() {
        return HowOftenDropdown;
    }
    public Button getAreYouBehindWithPaymentsNoRb() {
        return AreYouBehindWithPaymentsNoRb;
    }
    public Button getPensionsandInsurance() {
        return PensionsandInsurance;
    }
    public Button getBuildingsandContentInsurances() {
        return BuildingsandContentInsurances;
    }
    public TextField getHowMuchdoyouPayTextboxForBuildingandContents() {
        return HowMuchdoyouPayTextboxForBuildingandContents;
    }
    public Dropdown getHowOftenDropdownForBuildingandContents() {
        return HowOftenDropdownForBuildingandContents;
    }
    public Button getAreYouBehindWithPaymentsNoRbForBuildingandContents() {
        return AreYouBehindWithPaymentsNoRbForBuildingandContents;
    }
    public Button getFoodandHouseKeeping() {
        return FoodandHouseKeeping;
    }

    public Button getGroceries() {
        return Groceries;
    }
    public TextField getHowMuchDoyouSpendtextbox() {
        return HowMuchDoyouSpendtextbox;
    }
    public Dropdown getHowOftengroceriesDropdown() {
        return HowOftengroceriesDropdown;
    }
    public Button getContinueButtonforYourSpendingPage() {
        return ContinueButtonforYourSpendingPage;
    }
    public Checkbox getIdontHavethisCostCheckBoxForClothingandFootware() {
        return IdontHavethisCostCheckBoxForClothingandFootware;
    }
    public Button getConfirmButtoninDebtPopUp() {
        return ConfirmButtoninDebtPopUp;
    }
    public Button getIhaveAddedEverythingYesRbinDebtPopUp() {
        return IhaveAddedEverythingYesRbinDebtPopUp;
    }
    public Button getContinueButton() { return ContinueButton; }
    public Button getiHaveFinish() { return iHaveFinish;}
    public Button getPopUpConfirmButton() { return PopUpConfirmButton; }
    public Button getHomeAndContentButton() {return homeAndContentButton;}
    public Button getRentButton() {return rentButton;  }
    public TextField getRentTextbox() {  return rentTextbox;   }
    public Dropdown getRentDropdown() { return rentDropdown; }
    public Button getRentArrearButtonNo() {return rentArrearButtonNo; }
    public Button getRateButton() {  return rateButton;  }
    public TextField getRateTextBox() { return rateTextBox; }
    public Dropdown getRateDropdown() { return rateDropdown; }
    public Button getRateArrearButtonNo() {   return rateArrearButtonNo; }
    public Button getTvLicenceButton() {  return tvLicenceButton;  }
    public TextField getTvLicenceTextbox() {  return tvLicenceTextbox;  }
    public Dropdown getTvLicenceDropdown() {  return tvLicenceDropdown; }
    public Button getTvLicenceArrearButtonNo() {return tvLicenceArrearButtonNo;  }
    public Button getUtilityButton() { return utilityButton;   }
    public Button getElctricityButton() {return elctricityButton;   }
    public TextField getElectricityTextBox() {return electricityTextBox;  }
    public Dropdown getElectricityDropdown() {return electricityDropdown;  }
    public Button getElectricityArrearButtonNo() {   return electricityArrearButtonNo; }
    public Button getGasButton() {return gasButton;  }
    public TextField getGasTextbox() { return gasTextbox; }
    public Dropdown getGasDropdown() {return gasDropdown;  }
    public Button getGasArrearButtonNo() { return gasArrearButtonNo; }
    public Button getWaterSupplyButton() {return waterSupplyButton; }
    public TextField getWaterSupTextBox() {return waterSupTextBox;}
    public Dropdown getWaterSupplyDropdown() { return waterSupplyDropdown; }
    public Button getWaterSupplyArrearButtonNo() { return waterSupplyArrearButtonNo;  }
    public Button getFoodAndHousekeepingButton() { return foodAndHousekeepingButton; }
    public Button getGroceriesButton() {return groceriesButton; }
    public TextField getGroceriesTextBox() {return groceriesTextBox; }
    public Dropdown getGeroceresDropdown() { return geroceresDropdown;}
    public Button getPersonalCostButton() {return personalCostButton;  }
    public Button getClothingAndFootwarebutton() {return clothingAndFootwarebutton;  }
    public TextField getClothingTextBox() {return clothingTextBox; }
    public Dropdown getClothingDropdown() { return clothingDropdown; }
    public Button getCareAndHelthCostButton() { return careAndHelthCostButton; }
    public Button getChaildCareButton() { return chaildCareButton;  }
    public TextField getChaildCareTextBox() { return chaildCareTextBox; }
    public Dropdown getChaildCaredropdown() { return chaildCaredropdown;  }
    public Button getChaildCareArrearNo() {return chaildCareArrearNo;   }
    public Button getPesionAndInsuranceButton() {  return pesionAndInsuranceButton;   }
    public Button getBuildingContentInsuranceButton() {return buildingContentInsuranceButton; }
    public TextField getBuildingContTextBox() { return buildingContTextBox;   }
    public Dropdown getBuildingContDropdown() { return buildingContDropdown;   }
    public Button getBuildingContArrearNo() { return buildingContArrearNo;  }
    public Button getSchoolCostButton() { return schoolCostButton;  }
    public Button getSchoolUniformButton() { return schoolUniformButton; }
    public TextField getSchoolUniformTextBox() {  return schoolUniformTextBox; }
    public Dropdown getSchoolUniformDropdown() { return schoolUniformDropdown; }
    public Button getAddButtonForAll() { return addButtonForAll; }

public YourSpendingPage(){
            HomeandContents = new Button(By.xpath("//div[text()='Home and contents']"));
            Board = new Button(By.xpath("(//span[text()='Board'])[1]"));
            HowMuchdoyouPayTextbox = new TextField(By.xpath("//div[text()='How much do you pay?']//following::input[1]"));
            HowOftenDropdown = new Dropdown(By.xpath("//div[text()='How often?']//following::select"));
            AreYouBehindWithPaymentsNoRb = new Button(By.xpath("//label[text()='Are you  currently behind with payments?']//following::label[2]"));

            PensionsandInsurance = new Button(By.xpath("//div[text()='Pensions and insurances']"));
            BuildingsandContentInsurances = new Button(By.xpath("(//span[text()='Buildings and contents insurance'])[1]"));
            HowMuchdoyouPayTextboxForBuildingandContents = new TextField(By.xpath("//div[text()='How much do you pay?']//following::input[1]"));
            HowOftenDropdownForBuildingandContents = new Dropdown(By.xpath("//div[text()='How often?']//following::select"));
            AreYouBehindWithPaymentsNoRbForBuildingandContents = new Button(By.xpath("//label[text()='Are you  currently behind with payments?']//following::label[2]"));


            homeAndContentButton= new Button(By.xpath("//div[text()='Home and contents']"));
            rentButton=new Button(By.xpath("(//span[text()='Rent'])[1]"));
            rentTextbox=new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l1$ppxResults$l1$pAmount']"));
            rentDropdown=new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l1$ppxResults$l1$pFrequency']"));
            rentArrearButtonNo=new Button(By.xpath("//label[text()='No']"));

            rateButton=new Button(By.xpath("(//span[text()='Rates'])[1]"));
            rateTextBox= new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l1$ppxResults$l2$pAmount']"));
            rateDropdown=new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l1$ppxResults$l2$pFrequency']"));
            rateArrearButtonNo=new Button(By.xpath("//label[text()='No']"));

            tvLicenceButton=new Button(By.xpath("(//span[text()='TV licence'])[1]"));
            tvLicenceTextbox=new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l1$ppxResults$l3$pAmount']"));
            tvLicenceDropdown=new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l1$ppxResults$l3$pFrequency']"));
            tvLicenceArrearButtonNo= new Button(By.xpath("//label[text()='No']"));

            utilityButton=new Button(By.xpath("//div[text()='Utilities']"));
            elctricityButton=new Button(By.xpath("(//span[text()='Electricity'])[1]"));
            electricityTextBox= new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l2$pAmount']"));
            electricityDropdown= new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l2$pFrequency']"));
            electricityArrearButtonNo= new Button(By.xpath("(//label[text()='No'])[1]"));

            gasButton=new Button(By.xpath("(//span[text()='Gas'])[1]"));
            gasTextbox = new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l3$pAmount']"));
            gasDropdown=new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l3$pFrequency']"));
            gasArrearButtonNo= new Button(By.xpath("(//label[text()='No'])[1]"));

            waterSupplyButton=new Button(By.xpath("(//span[text()='Water supply'])[1]"));
            waterSupTextBox=new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l4$pAmount']"));
            waterSupplyDropdown=new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l4$pFrequency']"));
            waterSupplyArrearButtonNo= new Button(By.xpath("(//label[text()='No'])[1]"));


           foodAndHousekeepingButton=new Button(By.xpath("//div[text()='Food and housekeeping']"));
           groceriesButton=new Button(By.xpath("(//span[text()='Groceries'])[1]"));
           groceriesTextBox= new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l3$ppxResults$l1$pAmount']"));
           geroceresDropdown= new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l3$ppxResults$l1$pFrequency']"));

           personalCostButton=new Button(By.xpath("//div[text()='Personal costs']"));
           clothingAndFootwarebutton=new Button(By.xpath("(//span[text()='Clothing and footwear'])[1]"));
           clothingTextBox=new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l6$ppxResults$l1$pAmount']"));
           clothingDropdown=new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l6$ppxResults$l1$pFrequency']"));

           careAndHelthCostButton=new Button(By.xpath("//div[text()='Care and health costs']"));
           chaildCareButton=new Button(By.xpath("(//span[text()='Childcare'])[1]"));
           chaildCareTextBox= new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l7$ppxResults$l1$pAmount']"));
           chaildCaredropdown= new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l7$ppxResults$l1$pFrequency']"));
           chaildCareArrearNo= new Button(By.xpath("(//label[text()='No'])[1]"));

           pesionAndInsuranceButton=new Button(By.xpath("//div[text()='Pensions and insurances']"));
           buildingContentInsuranceButton=new Button(By.xpath("(//span[text()='Buildings and contents insurance'])[1]"));
           buildingContTextBox= new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l8$ppxResults$l1$pAmount']"));
           buildingContDropdown= new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l8$ppxResults$l1$pFrequency']"));
           buildingContArrearNo=new Button(By.xpath("(//label[text()='No'])[1]"));

           schoolCostButton=new Button(By.xpath("//div[text()='School costs']"));
           schoolUniformButton=new Button(By.xpath("(//span[text()='School uniform'])[1]"));
           schoolUniformTextBox= new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l10$ppxResults$l1$pAmount']"));
           schoolUniformDropdown= new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l10$ppxResults$l1$pFrequency']"));

           ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
           iHaveFinish = new Button(By.xpath("//label[text()='Yes, I have finished']"));
           PopUpConfirmButton = new Button(By.xpath("//button[text()='Confirm']"));
           addButtonForAll= new Button(By.xpath("//button[text()='Add']"));
           FoodandHouseKeeping = new Button(By.xpath("//div[text()='Food and housekeeping']"));
           Groceries = new Button(By.xpath("(//span[text()='Groceries'])[1]"));
           HowMuchDoyouSpendtextbox= new TextField(By.xpath("//div[text()='How much do you spend?']//following::input[1]"));
           HowOftengroceriesDropdown = new Dropdown(By.xpath("//div[text()='How often?']//following::select"));
           ContinueButtonforYourSpendingPage = new Button(By.xpath("//button[text()='Continue']"));
           IdontHavethisCostCheckBoxForClothingandFootware= new Checkbox(By.xpath("//label[@class=' cb_standard']"));
           AddButton = new Button(By.xpath("//button[text()='Add']"));
           IhaveAddedEverythingYesRbinDebtPopUp = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[2]"));
           ConfirmButtoninDebtPopUp = new Button(By.xpath("//button[text()='Confirm']"));
     }

    public void actionSetSpending89955(){
        GenericMethods_cvp.implicitWait(10000);
        this.getHomeAndContentButton().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getRentButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getRentTextbox().enterText("526.70");
        GenericMethods_cvp.implicitWait(10000);
        this.getRentArrearButtonNo().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getRentDropdown().selectFromDropdownByIndex(4);
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButtonForAll().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getRateButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getRateTextBox().enterText("100");
        GenericMethods_cvp.implicitWait(10000);
        this.getRateArrearButtonNo().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getRateDropdown().selectFromDropdownByIndex(4);
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButtonForAll().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getTvLicenceButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getTvLicenceTextbox().enterText("13.12");
        GenericMethods_cvp.implicitWait(10000);
        this.getTvLicenceDropdown().selectFromDropdownByIndex(3);
        GenericMethods_cvp.implicitWait(10000);
        this.getTvLicenceArrearButtonNo().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButtonForAll().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getUtilityButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getElctricityButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getElectricityTextBox().enterText("50");
        GenericMethods_cvp.implicitWait(10000);
        this.getElectricityDropdown().selectFromDropdownByIndex(4);
        GenericMethods_cvp.implicitWait(10000);
        this.getElectricityArrearButtonNo().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButtonForAll().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getGasButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getGasTextbox().enterText("50");
        GenericMethods_cvp.implicitWait(10000);
        this.getGasDropdown().selectFromDropdownByIndex(4);
        GenericMethods_cvp.implicitWait(10000);
        this.getGasArrearButtonNo().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButtonForAll().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getWaterSupplyButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getWaterSupTextBox().enterText("50");
        GenericMethods_cvp.implicitWait(10000);
        this.getWaterSupplyDropdown().selectFromDropdownByIndex(4);
        GenericMethods_cvp.implicitWait(10000);
        this.getWaterSupplyArrearButtonNo().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButtonForAll().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getFoodAndHousekeepingButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getGroceriesButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getGroceriesTextBox().enterText("300");
        GenericMethods_cvp.implicitWait(10000);
        this.getGeroceresDropdown().selectFromDropdownByIndex(5);
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButtonForAll().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getPersonalCostButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getClothingAndFootwarebutton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getClothingTextBox().enterText("60");
        GenericMethods_cvp.implicitWait(10000);
        this.getClothingDropdown().selectFromDropdownByIndex(4);
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButtonForAll().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getCareAndHelthCostButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getChaildCareButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getChaildCareTextBox().enterText("50");
        GenericMethods_cvp.implicitWait(10000);
        this.getChaildCaredropdown().selectFromDropdownByIndex(4);
        GenericMethods_cvp.implicitWait(10000);
        this.getChaildCareArrearNo().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButtonForAll().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getPesionAndInsuranceButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getBuildingContentInsuranceButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getBuildingContTextBox().enterText("20");
        GenericMethods_cvp.implicitWait(10000);
        this.getBuildingContDropdown().selectFromDropdownByIndex(4);
        GenericMethods_cvp.implicitWait(10000);
        this.getBuildingContArrearNo().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButtonForAll().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getSchoolCostButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getSchoolUniformButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getSchoolUniformTextBox().enterText("20");
        GenericMethods_cvp.implicitWait(10000);
        this.getSchoolUniformDropdown().selectFromDropdownByIndex(4);
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButtonForAll().click();
        GenericMethods_cvp.implicitWait(10000);

        this.getContinueButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getiHaveFinish().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getPopUpConfirmButton().click();
        GenericMethods_cvp.implicitWait(10000);

    }
    public void FillSpendingPagedatafor89963(String amount1,int number1, String amount2,int number2,String amount3,int number3 ) {
        GenericMethods_cvp.implicitWait(4000);
        this.getHomeandContents().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getBoard().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getHowMuchdoyouPayTextbox().enterText(amount1);
        GenericMethods_cvp.implicitWait(4000);
        this.getHowOftenDropdown().selectFromDropdownByIndex(number1);
        GenericMethods_cvp.implicitWait(4000);
        this.getAreYouBehindWithPaymentsNoRb().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getAddButton().click();
        getBrowser().sleep(getBrowser().getTimeout()/20);
        this.getFoodandHouseKeeping().click();
        getBrowser().sleep(getBrowser().getTimeout()/20);
        this.getGroceries().click();
        getBrowser().sleep(getBrowser().getTimeout()/20);
        this.getHowMuchDoyouSpendtextbox().enterText(amount2);
        GenericMethods_cvp.implicitWait(4000);
        this.getHowOftengroceriesDropdown().selectFromDropdownByIndex(number2);
        GenericMethods_cvp.implicitWait(4000);
        this.getAddButton().click();

        getBrowser().sleep(getBrowser().getTimeout()/20);
        this.getPensionsandInsurance().click();
        getBrowser().sleep(getBrowser().getTimeout()/20);
        this.getBuildingsandContentInsurances().click();
        getBrowser().sleep(getBrowser().getTimeout()/20);
        this.getHowMuchdoyouPayTextboxForBuildingandContents().enterText(amount3);
        GenericMethods_cvp.implicitWait(5000);
        this.getHowOftenDropdownForBuildingandContents().selectFromDropdownByIndex(number3);
        GenericMethods_cvp.implicitWait(5000);
        this.getAreYouBehindWithPaymentsNoRbForBuildingandContents().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getAddButton().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getContinueButtonforYourSpendingPage().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getIhaveAddedEverythingYesRbinDebtPopUp().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getConfirmButtoninDebtPopUp().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getIdontHavethisCostCheckBoxForClothingandFootware().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getContinueButtonforYourSpendingPage().click();
        GenericMethods_cvp.implicitWait(4000);
    }
}
