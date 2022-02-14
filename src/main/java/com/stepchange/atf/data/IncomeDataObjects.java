package com.stepchange.atf.data;

public class IncomeDataObjects {

    private String WageEarning;
    private String ChildBenefit;
    private String ChildTaxCredit;
    private String WorkingTaxCredit;
    private String ZeroValue;

    public String getWageEarning() { return WageEarning; }
    public String getChildBenefit() { return ChildBenefit; }
    public String getChildTaxCredit() { return ChildTaxCredit; }
    public String getWorkingTaxCredit() { return WorkingTaxCredit; }
    public String getZeroValue() { return ZeroValue; }

    public IncomeDataObjects (String WageEarning,String ChildBenefit,String ChildTaxCredit,
                              String WorkingTaxCredit,String ZeroValue){


        this.WageEarning =WageEarning;
        this.ChildBenefit = ChildBenefit;
        this.ChildTaxCredit = ChildTaxCredit;
        this.WorkingTaxCredit = WorkingTaxCredit;
        this.ZeroValue = ZeroValue;
    }
}
