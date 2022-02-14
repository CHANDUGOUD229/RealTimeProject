package com.stepChangeRem.remediation.pages.helper.vo;

public class AccountRegistrationFields {
    private String title;
    private String firstName;
    private String surname;
    private String dateOfBirth;
    private String domain;
    private String phoneNumber;
    private String phoneType;
    private String postCode;
    private String preferredContactMethod;
    private Integer address;
    private boolean captureAddressManually;

    public boolean isCaptureAddressManually() {
        return captureAddressManually;
    }

    public void setCaptureAddressManually(boolean captureAddressManually) {
        this.captureAddressManually = captureAddressManually;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public Integer getAddress() {
        return address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPreferredContactMethod() {
        return preferredContactMethod;
    }

    public void setPreferredContactMethod(String preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
    }
}