package com.stepChangeRem.remediation.pages.helper.vo;

public class OnlineFinalQuestionsFields {
    private boolean isMortgage;
    private String mortgagedPropertyValue;
    private String mortgageOwner;
    private String mortgageSplit;
    private String cutBackFor;
    private String canYouCutback;
    private String assetType;
    private String assetEstimatedValue;
    private String whoOwnsTheAsset;
    private String reasonforNoCutback;

    public String getReasonforNoCutback() {
        return reasonforNoCutback;
    }

    public void setReasonforNoCutback(String reasonforNoCutback) {
        this.reasonforNoCutback = reasonforNoCutback;
    }

    public String getAssetType() {
        return assetType;
    }

    public String getAssetEstimatedValue() {
        return assetEstimatedValue;
    }

    public String getWhoOwnsTheAsset() {
        return whoOwnsTheAsset;
    }

    public boolean isMortgage() {
        return isMortgage;
    }

    public void setMortgage(boolean mortgage) {
        isMortgage = mortgage;
    }

    public String getCutBackFor() {
        return cutBackFor;
    }

    public void setCutBackFor(String cutBackFor) {
        this.cutBackFor = cutBackFor;
    }

    public String getCanYouCutback() {
        return canYouCutback;
    }

    public void setCanYouCutback(String canYouCutback) {
        this.canYouCutback = canYouCutback;
    }



    public String getMortgagedPropertyValue() {
        return mortgagedPropertyValue;
    }

    public void setMortgagedPropertyValue(String mortgagedPropertyValue) {
        this.mortgagedPropertyValue = mortgagedPropertyValue;
    }

    public String getMortgageOwner() {
        return mortgageOwner;
    }

    public void setMortgageOwner(String mortgageOwner) {
        this.mortgageOwner = mortgageOwner;
    }

    public String getMortgageSplit() {
        return mortgageSplit;
    }

    public void setMortgageSplit(String mortgageSplit) {
        this.mortgageSplit = mortgageSplit;
    }
}
