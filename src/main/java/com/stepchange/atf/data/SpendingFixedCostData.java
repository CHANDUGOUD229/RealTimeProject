package com.stepchange.atf.data;

public class SpendingFixedCostData {

    private String councilTax;
    private String TVlicence;
    private String electricity;
    private String gas;
    private String water;
    private String buildingsAndContentsInsurance;
    private String childCare;
    private String schoolUniform;

    public String getCouncilTax() {
        return councilTax;
    }

    public String getTVlicence() {
        return TVlicence;
    }

    public String getElectricity() {
        return electricity;
    }

    public String getGas() {
        return gas;
    }

    public String getWater() {
        return water;
    }

    public String getBuildingsAndContentsInsurance() {
        return buildingsAndContentsInsurance;
    }

    public String getChildCare() {
        return childCare;
    }

    public String getSchoolUniform() {
        return schoolUniform;
    }


    public SpendingFixedCostData (String councilTax, String TVlicence, String electricity, String gas,
                 String water, String buildingsAndContentsInsurance, String childCare, String schoolUniform) {

        this.councilTax = councilTax;
        this.TVlicence = TVlicence;
        this.electricity = electricity;
        this.gas = gas;
        this.water = water;
        this.buildingsAndContentsInsurance = buildingsAndContentsInsurance;
        this.childCare = childCare;
        this.schoolUniform = schoolUniform;


    }
}
