package com.stepChangeRem.remediation.pages.helper;

import com.stepChangeRem.remediation.pages.YourHouseHoldPage;
import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Checkbox;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.controls.TextField;
import org.openqa.selenium.By;

import java.util.List;

public class YourHouseHoldHelper extends YourHouseHoldPage {
    public YourHouseHoldHelper()
    {

    }


    Dropdown housingStatus;
    Dropdown maritalStatus;
    TextField ageUnde16Children;
    TextField ageBetween16and18child;
    TextField adultsResponsible;
    Checkbox houseAwareOfDebtSituation;
    Dropdown employment;
    Dropdown partnerEmployment;
    TextField noOfVehicles;
    private Button continueButton;
    private Button cofirmHouseHold;

    public Button getCofirmHouseHold() {
        return cofirmHouseHold=new Button(By.xpath("//button[.='Confirm']"));
    }

    public Button getContinueButton() {
        return continueButton=new Button(By.xpath("//button[.='Continue']"));
    }
    public Dropdown getHousingStatus() {
        return housingStatus=new Dropdown(By.name("$PpyWorkPage$pHouseholdComposition$pHousingTenure"));
    }

    public Dropdown getMaritalStatus() {
        return maritalStatus=new Dropdown(By.name("$PpyWorkPage$pClientDetails$l1$pMaritalStatus"));
    }

    public TextField getAgeUnde16Children() {
        return ageUnde16Children=new TextField(By.name("$PpyWorkPage$pHouseholdComposition$pChildrenUnder16"));
    }

    public TextField getAgeBetween16and18child() {
        return ageBetween16and18child=new TextField(By.name("$PpyWorkPage$pHouseholdComposition$pChildren16To18"));
    }

    public TextField getAdultsResponsible() {
        return adultsResponsible=new TextField(By.name("$PpyWorkPage$pHouseholdComposition$pOtherDependents"));
    }

    public Checkbox getHouseAwareOfDebtSituation() {
        return houseAwareOfDebtSituation=new Checkbox(By.xpath("//input[@name='$PpyWorkPage$pIsHouseholdNotAware']/../label"));
    }

    public Dropdown getEmployment() {
        return employment=new Dropdown(By.name("$PpyWorkPage$pClientDetails$l1$pCurrentEmploymentStatusUI"));
    }

    public Dropdown getPartnerEmployment() {
        return partnerEmployment=new Dropdown(By.name("$PpyWorkPage$pClientDetails$l2$pCurrentEmploymentStatusUI"));
    }

    public TextField getNoOfVehicles() {
        return noOfVehicles=new TextField(By.name("$PpyWorkPage$pHouseholdComposition$pVehiclesInBudget"));
    }

    public void fillHouseHoldDetails(List<HouseHoldsFileds> houseHoldsFileds)
    {
        HouseHoldsFileds houseHolds = houseHoldsFileds.get(0);
        this.getHousingStatus().selectFromDropdownByText(houseHolds.getHousingStatus());
        this.getMaritalStatus().selectFromDropdownByText(houseHolds.getMaritalStatus());
        if(Integer.valueOf(houseHolds.getAgeUnde16Children())>0)
        this.getAgeUnde16Children().enterText(houseHolds.getAgeUnde16Children());
        if(Integer.valueOf(houseHolds.getAgeBetween16and18child())>0)
        this.getAgeBetween16and18child().enterText(houseHolds.getAgeBetween16and18child());
        if(Integer.valueOf(houseHolds.getAdultsResponsible())>0)
        this.getAdultsResponsible().enterText(houseHolds.getAdultsResponsible());
        this.getEmployment().selectFromDropdownByText(houseHolds.getEmployment());
        if(houseHolds.getHouseAwareOfDebtSituation().equalsIgnoreCase("true"))
        this.getHouseAwareOfDebtSituation().click();
        if(!houseHolds.getPartnerEmployment().equalsIgnoreCase("false"))
        this.getPartnerEmployment().selectFromDropdownByText(houseHolds.getPartnerEmployment());
        if(Integer.valueOf(houseHolds.getNoOfVehicles())>0)
        this.getNoOfVehicles().enterText(houseHolds.getNoOfVehicles());
        this.getContinueButton().click();
        this.getCofirmHouseHold().click();

    }
}
