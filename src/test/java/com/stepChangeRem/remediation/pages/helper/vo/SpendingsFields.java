package com.stepChangeRem.remediation.pages.helper.vo;

public class SpendingsFields extends IncomeFields{

    private String arrears;
    private boolean isMortagageLink;
    private String creditor;
    private String debtType;
    private String whoIsDebtor;
    private Integer mortgageBalance;
    private String paidArrearsIn12Months;
    private String typeOfMortgage;
    private String isSVR;
    private String mainHome;
    private Integer assetWorth;
    private String assetBelogsto;


    public String getWhoIsDebtor() {
        return whoIsDebtor;
    }

    public void setWhoIsDebtor(String whoIsDebtor) {
        this.whoIsDebtor = whoIsDebtor;
    }

    public Integer getMortgageBalance() {
        return mortgageBalance;
    }

    public void setMortgageBalance(Integer mortgageBalance) {
        this.mortgageBalance = mortgageBalance;
    }

    public String getPaidArrearsIn12Months() {
        return paidArrearsIn12Months;
    }

    public void setPaidArrearsIn12Months(String paidArrearsIn12Months) {
        this.paidArrearsIn12Months = paidArrearsIn12Months;
    }

    public String getTypeOfMortgage() {
        return typeOfMortgage;
    }

    public void setTypeOfMortgage(String typeOfMortgage) {
        this.typeOfMortgage = typeOfMortgage;
    }

    public String getIsSVR() {
        return isSVR;
    }

    public void setIsSVR(String isSVR) {
        this.isSVR = isSVR;
    }

    public String getMainHome() {
        return mainHome;
    }

    public void setMainHome(String mainHome) {
        this.mainHome = mainHome;
    }

    public Integer getAssetWorth() {
        return assetWorth;
    }

    public void setAssetWorth(Integer assetWorth) {
        this.assetWorth = assetWorth;
    }

    public String getAssetBelogsto() {
        return assetBelogsto;
    }

    public void setAssetBelogsto(String assetBelogsto) {
        this.assetBelogsto = assetBelogsto;
    }

    public boolean isMortagageLink() {
        return isMortagageLink;
    }

    public void setMortagageLink(boolean mortagageLink) {
        isMortagageLink = mortagageLink;
    }

    public String getCreditor() {
        return creditor;
    }

    public void setCreditor(String creditor) {
        this.creditor = creditor;
    }

    public String getDebtType() {
        return debtType;
    }

    public void setDebtType(String debtType) {
        this.debtType = debtType;
    }

    public String getArrears() {
        return arrears;
    }

    public void setArrears(String arrears) {
        this.arrears = arrears;
    }

    public SpendingsFields() {
    }
}
