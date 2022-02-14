package com.stepchange.atf.data;

public class DebtDataObjects {

    private String creditor;
    private String debtType;
    private String amountOwed;
    private String liability;

    public String getCreditor() { return creditor; }
    public String getDebtType() { return debtType; }
    public String getAmountOwed() { return amountOwed; }
    public String getLiability() { return liability; }

    public void setCreditor(String creditor) { this.creditor = creditor; }
    public void setDebtType(String debtType) { this.debtType = debtType; }
    public void setAmountOwed(String amountOwed) { this.amountOwed = amountOwed; }

    public DebtDataObjects (String creditor, String debtType, String amountOwed, String liability){

        this.creditor = creditor;
        this.debtType = debtType;
        this.amountOwed = amountOwed;
        this.liability = liability;


    }

}
