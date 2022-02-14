package com.stepChangeRem.remediation.pages.helper.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClientNeedsVO {
    String firstname;
    String lastname;
    String whereDoTheyLive;
    String ukDebt;
    String insolvencySolutions;
    String age;
    String areTheySelfEmployed;
    String healthCondition;
    String consentForStepChangeToRecord;
    String consentForStepChangeToShare;
    String referredBY;
    String financialDifficulty;
    String doTheyLiveWithPartner;

    public String getDoTheyLiveWithPartner() {
        return doTheyLiveWithPartner;
    }

    public String getReferredBY() {
        return referredBY;
    }

    public void setReferredBY(String referredBY) {
        this.referredBY = referredBY;
    }

    public String getFinancialDifficulty() {
        return financialDifficulty;
    }

    public void setFinancialDifficulty(String financialDifficulty) {
        this.financialDifficulty = financialDifficulty;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getWhereDoTheyLive() {
        return whereDoTheyLive;
    }

    public void setWhereDoTheyLive(String whereDoTheyLive) {
        this.whereDoTheyLive = whereDoTheyLive;
    }

    public String getUkDebt() {
        return ukDebt;
    }

    public void setUkDebt(String ukDebt) {
        this.ukDebt = ukDebt;
    }

    public String getInsolvencySolutions() {
        return insolvencySolutions;
    }

    public void setInsolvencySolutions(String insolvencySolutions) {
        this.insolvencySolutions = insolvencySolutions;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAreTheySelfEmployed() {
        return areTheySelfEmployed;
    }

    public void setAreTheySelfEmployed(String areTheySelfEmployed) {
        this.areTheySelfEmployed = areTheySelfEmployed;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public String getConsentForStepChangeToRecord() {
        return consentForStepChangeToRecord;
    }

    public void setConsentForStepChangeToRecord(String consentForStepChangeToRecord) {
        this.consentForStepChangeToRecord = consentForStepChangeToRecord;
    }

    public String getConsentForStepChangeToShare() {
        return consentForStepChangeToShare;
    }

    public void setConsentForStepChangeToShare(String consentForStepChangeToShare) {
        this.consentForStepChangeToShare = consentForStepChangeToShare;
    }

    private List<ClientNeedsVO> details = new ArrayList<>();
     public void addClient(Map<String, String> entry) {
         this.firstname=entry.get("entry");
         details.add(new ClientNeedsVO());
    }
}
