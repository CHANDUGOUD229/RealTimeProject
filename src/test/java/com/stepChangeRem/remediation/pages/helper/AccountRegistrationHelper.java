package com.stepChangeRem.remediation.pages.helper;

import com.mongodb.util.Hash;
import com.stepChangeRem.remediation.pages.helper.vo.AccountRegistrationFields;
import com.stepchange.atf.controls.*;
import com.stepchange.atf.utilities.RandomGenerators;
import org.openqa.selenium.By;

import java.util.*;

public class AccountRegistrationHelper extends Control {

    private Dropdown title;
    private TextField firstName;
    private TextField surname;
    private TextField dateOfBirth;
    private TextField email;
    private AutoComplete domain;
    private TextField phoneNumber;
    private Dropdown phoneType;
    private TextField postCode;
    private Button preferredContactMethod;
    private Button searchPostCode;
    private Button addRepresentative;
    private Button createAccount;
    private Dropdown address;
    private TextField confirmEmail;
    private Button confirmButton;

    // representative
    private Dropdown titleRep;
    private TextField firstNameRep;
    private TextField surnameRep;
    private TextField dateOfBirthRep;
    private TextField emailRep;
    private AutoComplete domainRep;
    private TextField phoneNumberRep;
    private Dropdown phoneTypeRep;
    private TextField postCodeRep;
    private Button preferredContactMethodRep;
    private Button searchPostCodeRep;
    private Button addRepresentativeRep;
    private Button createAccountRep;
    private Dropdown addressRep;
    private Dropdown relationShipWithClient;
    private Button createAccountForPartner;
    private TextField houseNumber;
    private TextField streetName;
    private TextField town;
    private TextField country;
    private TextField postcode;

    public TextField getTown() {
        return town = new TextField(By.name("$PpyWorkPage$pClientDetails$l1$pAddresses$l1$pAddressLine3"));
    }

    public TextField getCountry() {
        return country = new TextField(By.name("$PpyWorkPage$pClientDetails$l1$pAddresses$l1$pAddressLine4"));
    }

    public TextField getPostcode() {
        return postcode = new TextField(By.name("$PpyWorkPage$pClientDetails$l1$pAddresses$l1$ppyPostalCode"));
    }

    public TextField getStreetName() {
        return streetName = new TextField(By.name("$PpyWorkPage$pClientDetails$l1$pAddresses$l1$pAddressLine2"));
    }

    public TextField getHouseNumber() {
        return houseNumber = new TextField(By.name("$PpyWorkPage$pClientDetails$l1$pAddresses$l1$pAddressLine1"));
    }

    public Button getCreateAccountForPartner() {
        return createAccountForPartner = new Button(By.xpath("//button[.='Create account for your partner']"));
    }

    public Dropdown getRelationShipWithClient(int index) {
        return relationShipWithClient = new Dropdown(By.name("$PpyWorkPage$pRepresentativeDetails$l" + index + "$pRepRelationshipToClient"));
    }

    public Dropdown getTitleRep(int index) {
        return titleRep = new Dropdown(By.name("$PpyWorkPage$pRepresentativeDetails$l" + index + "$pTitle"));
    }

    public TextField getFirstNameRep(int index) {
        return firstNameRep = new TextField(By.name("$PpyWorkPage$pRepresentativeDetails$l" + index + "$ppyFirstName"));
    }

    public TextField getSurnameRep(int index) {
        return surnameRep = new TextField(By.name("$PpyWorkPage$pRepresentativeDetails$l" + index + "$ppyLastName"));
    }

    public TextField getDateOfBirthRep(int index) {
        return dateOfBirthRep = new TextField(By.name("$PpyWorkPage$pRepresentativeDetails$l" + index + "$pDateOfBirth"));
    }

    public TextField getEmailRep(int index) {
        return emailRep = new TextField(By.name("$PpyWorkPage$pRepresentativeDetails$l1$pEmailAddressList$l" + index + "$ppyEmail"));
    }

    public AutoComplete getDomainRep(int index) {
        return domainRep = new AutoComplete(By.name("$PpyWorkPage$pRepresentativeDetails$l" + index + "$pEmailAddressList$l1$pEmailDomain"));
    }

    public TextField getPhoneNumberRep(int index) {
        return phoneNumberRep = new TextField(By.name("$PpyWorkPage$pRepresentativeDetails$l" + index + "$pTelephoneNumbers$l1$ppyPhoneNumber"));
    }

    public Dropdown getPhoneTypeRep(int index) {
        return phoneTypeRep = new Dropdown(By.name("$PpyWorkPage$pRepresentativeDetails$l" + index + "$pTelephoneNumbers$l1$pCommunicationChannelType"));
    }

    public TextField getPostCodeRep(int index) {
        return postCodeRep = new TextField(By.name("$PpyWorkPage$pRepresentativeDetails$l" + index + "$pAddresses$l1$ppyPostalCode"));
    }


    public Button getSearchPostCodeRep(int index) {
        index = index + 1;
        return searchPostCodeRep = new Button(By.xpath("(//button[.='Search'])[" + index + "]"));
    }


    public Dropdown getAddressRep(int index) {
        return addressRep=new Dropdown(By.name("$PpyWorkPage$pRepresentativeDetails$l"+index+"$pAddresses$l1$pIndex"));
    }

    public Button getConfirmButton() {
        return confirmButton=new Button(By.xpath("//button[.='Confirm']"));
    }

    public TextField getConfirmEmail(int index) {
        return confirmEmail=new TextField(By.name("$PpyWorkPage$pClientDetails$l"+index+"$ppyEmail"));
    }

    public Dropdown getAddress(int index) {
        return address=new Dropdown(By.name("$PpyWorkPage$pClientDetails$l"+index+"$pAddresses$l"+index+"$pIndex"));
    }

    public Button getCreateAccount() {
        return createAccount=new Button(By.xpath("//button[.='Create account']"));
    }

    public Button getAddRepresentative() {
        return addRepresentative=new Button(By.xpath("//button[.='Add representative']"));
    }

    public TextField getEmail(int index) {
        return email=new TextField(By.name("$PpyWorkPage$pClientDetails$l"+index+"$pEmailAddressList$l1$ppyEmail"));
    }

    public Dropdown getTitle(int index) {
        return title=new Dropdown(By.name("$PpyWorkPage$pClientDetails$l"+index+"$pTitle"));
    }

    public TextField getFirstName(int index) {
        return firstName = new TextField(By.name("$PpyWorkPage$pClientDetails$l" + index + "$ppyFirstName"));
    }

    public TextField getSurname(int index) {
        return surname = new TextField(By.name("$PpyWorkPage$pClientDetails$l" + index + "$ppyLastName"));
    }

    public TextField getDateOfBirth(int index) {
        return dateOfBirth = new TextField(By.name("$PpyWorkPage$pClientDetails$l" + index + "$pDateOfBirth"));
    }

    public AutoComplete getDomain(int index) {
        return domain = new AutoComplete(By.name("$PpyWorkPage$pClientDetails$l" + index + "$pEmailAddressList$l1$pEmailDomain"));
    }

    public TextField getPhoneNumber(int index) {
        return phoneNumber = new TextField(By.name("$PpyWorkPage$pClientDetails$l" + index + "$pTelephoneNumbers$l1$ppyPhoneNumber"));
    }

    public Dropdown getPhoneType(int index) {
        return phoneType = new Dropdown(By.name("$PpyWorkPage$pClientDetails$l" + index + "$pTelephoneNumbers$l1$pCommunicationChannelType"));
    }

    public TextField getPostCode(int index) {
        return postCode = new TextField(By.name("$PpyWorkPage$pClientDetails$l" + index + "$pAddresses$l1$ppyPostalCode"));
    }

    public Button getPreferredContactMethod(int index, String contactMethod) {
        return preferredContactMethod = new Button(By.xpath("//input[contains(@name,'$PpyWorkPage$pClientDetails$l" + index + "$pPreferredContactMethod')]/../label[.='" + contactMethod + "']"));
    }

    public Button getSearchPostCode(int index) {
        return searchPostCode = new Button(By.xpath("(//button[.='Search'])[" + index + "]"));
    }

    public void fillAccountRegistration(List<AccountRegistrationFields> accountRegistrationFields) {

        ArrayList<String> email = new ArrayList<String>();

        for (int i = 0; i < accountRegistrationFields.size(); i++) {
            String randomString = "test" + RandomGenerators.getRandomString();
            email.add(randomString + i);
            if (i > 0) {
                this.getCreateAccountForPartner().click();
//                    this.getAddRepresentative().click();
//                    this.getTitleRep(i).selectFromDropdownByText(accountRegistrationFields.get(i).getTitle());
//                    this.getFirstNameRep(i).enterText(accountRegistrationFields.get(i).getFirstName());
//                    this.getSurnameRep(i).enterText(accountRegistrationFields.get(i).getSurname());
//                    this.getRelationShipWithClient(i).selectFromDropdownByIndex(i);
//                    this.getDateOfBirthRep(i).enterText(accountRegistrationFields.get(i).getDateOfBirth());
//                    getBrowser().sleep(200);
//                    String emails=email.get(0)+"1";
//                    getBrowser().sleep(200);
//                    this.getEmailRep(i).enterCharByChar(emails);
//                    getBrowser().sleep(200);
//                    for (int j = 0; j <3 ; j++) {
//                        this.getDomainRep(i).enterText(accountRegistrationFields.get(i).getDomain());
//                        this.getDomainRep(i).downArrow();
//                        this.getDomainRep(i).enter();
//                        this.getDomainRep(i).tab();
//                                            }
//                    this.getPhoneNumberRep(i).enterText(accountRegistrationFields.get(i).getPhoneNumber());
//                    this.getPhoneTypeRep(i).selectFromDropdownByText(accountRegistrationFields.get(i).getPhoneType());
//                    this.getPostCodeRep(i).enterText(accountRegistrationFields.get(i).getPostCode());
//                    this.getSearchPostCodeRep(i).click();
//                    this.getAddressRep(i).selectFromDropdownByIndex(accountRegistrationFields.get(i).getAddress().intValue());
            }
//            if (i == 0) {
            int actualPosition = i + 1;
            this.getTitle(actualPosition).selectFromDropdownByText(accountRegistrationFields.get(i).getTitle());
            this.getFirstName(actualPosition).enterText(accountRegistrationFields.get(i).getFirstName());
            this.getSurname(actualPosition).enterText(accountRegistrationFields.get(i).getSurname());
            this.getDateOfBirth(actualPosition).enterText(accountRegistrationFields.get(i).getDateOfBirth());
            this.getEmail(actualPosition).enterText(randomString + i);
            for (int j = 0; j < 3; j++) {
                this.getDomain(actualPosition).enterText(accountRegistrationFields.get(i).getDomain());
                this.getDomain(actualPosition).downArrow();
                this.getDomain(actualPosition).enter();
            }
            this.getPhoneNumber(actualPosition).enterText(accountRegistrationFields.get(i).getPhoneNumber());
            this.getPhoneType(actualPosition).selectFromDropdownByText(accountRegistrationFields.get(i).getPhoneType());
            if (i == 0 && !accountRegistrationFields.get(i).isCaptureAddressManually()) {
                this.getPostCode(actualPosition).enterText(accountRegistrationFields.get(i).getPostCode());
                this.getSearchPostCode(actualPosition).click();
                this.getAddress(actualPosition).selectFromDropdownByIndex(accountRegistrationFields.get(i).getAddress().intValue());
            } else if (accountRegistrationFields.get(i).isCaptureAddressManually()) {
                new Button(By.xpath("//button[.='Enter address manually']")).click();
                this.getHouseNumber().enterText("5");
                this.getStreetName().enterText("Wall Mart");
                this.getTown().enterText("Liver pool");
                this.getPostcode().enterText("L1 8JQ");

            }
            this.getPreferredContactMethod(actualPosition, accountRegistrationFields.get(i).getPreferredContactMethod()).click();
//            }

        }
        this.getCreateAccount().click();
        switchToActiveFrame();
        for (int i = 0; i < email.size(); i++) {
            this.getConfirmEmail(i + 1).clear();
            this.getConfirmEmail(i + 1).enterText(email.get(i) + "@" + accountRegistrationFields.get(i).getDomain());
            this.getConfirmEmail(i + 1).tab();
        }
        this.getConfirmButton().click();
    }

}
