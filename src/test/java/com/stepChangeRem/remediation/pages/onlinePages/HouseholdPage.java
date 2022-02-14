package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class HouseholdPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Dropdown whatIsyourHousingStatusDropdown;
    private Dropdown maritalStatusDropdown;
    private Button childrenUnder16Button;
    private Dropdown employmentStatusDropdown;
    private Button HouseholdContinueButton;
    private Button HouseHoldSummaryConfirm;

    public Dropdown getwhatIsyourHousingStatusDropdown(){return whatIsyourHousingStatusDropdown;}
    public Dropdown getmaritalStatusDropdown(){return maritalStatusDropdown;}
    public Button getchildrenUnder16Button(){return childrenUnder16Button;}
    public Dropdown getemploymentStatusDropdown(){return employmentStatusDropdown;}
    public Button getHouseholdContinueButton(){return HouseholdContinueButton;}
    public Button getHouseHoldSummaryConfirm() {return HouseHoldSummaryConfirm;	}


    public HouseholdPage() {
        whatIsyourHousingStatusDropdown = new Dropdown(By.xpath("//select[@data-test-id='201710251155120569776213']"));
        //select[@name='$PpyWorkPage$pHouseholdComposition$pHousingTenure']
        maritalStatusDropdown= new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pClientDetails$l1$pMaritalStatus']"));
        childrenUnder16Button= new Button(By.xpath("(//span[@class='inc-button ico-fill-plus'])[1]"));
        employmentStatusDropdown = new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pClientDetails$l1$pCurrentEmploymentStatusUI']"));
        HouseholdContinueButton= new Button(By.xpath("//button[@name='CaptureHouseholdComposition_pyWorkPage_65']"));
        HouseHoldSummaryConfirm = new Button(By.xpath("//button[text()='Confirm']"));

    }
    public void actionSetHouseholdSC89955(){
        GenericMethods_cvp.implicitWait(10000);
        this.getwhatIsyourHousingStatusDropdown().selectFromDropdownByIndex(3);
        this.getmaritalStatusDropdown().selectFromDropdownByIndex(3);
        for (int i = 0; i < 2; i++){
            this.getchildrenUnder16Button().click();
        }
        this.getemploymentStatusDropdown().selectFromDropdownByIndex(2);
        this.getHouseholdContinueButton().click();
        this.getHouseHoldSummaryConfirm().click();
        GenericMethods_cvp.implicitWait(10000);
    }
    public void FillHouseholdPageDetailsfor89963(int number1,int number2,int number3){
        this.getwhatIsyourHousingStatusDropdown().selectFromDropdownByIndex(number1);
        GenericMethods_cvp.implicitWait(2000);
        this.getmaritalStatusDropdown().selectFromDropdownByIndex(number2);
        GenericMethods_cvp.implicitWait(2000);
        this.getemploymentStatusDropdown().selectFromDropdownByIndex(number3);
        GenericMethods_cvp.implicitWait(2000);
        this.getHouseholdContinueButton().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getHouseHoldSummaryConfirm().click();
        GenericMethods_cvp.implicitWait(4000);
    }
}
