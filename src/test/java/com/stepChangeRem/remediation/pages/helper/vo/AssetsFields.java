package com.stepChangeRem.remediation.pages.helper.vo;

public class AssetsFields {
    private  String field;
    private boolean isMainHome;
    private Integer mainHomeAmount;
    private String  mainHomeOwner;
    private boolean isAllClientAssetsCaptured;
    private String value;
    private String owner;
    private String shareValue;

    public String getValue() {
        return value;
    }

    public String getOwner() {
        return owner;
    }

    public String getShareValue() {
        return shareValue;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public boolean isMainHome() {
        return isMainHome;
    }

    public void setMainHome(boolean mainHome) {
        isMainHome = mainHome;
    }

    public Integer getMainHomeAmount() {
        return mainHomeAmount;
    }

    public void setMainHomeAmount(Integer mainHomeAmount) {
        this.mainHomeAmount = mainHomeAmount;
    }

    public String getMainHomeOwner() {
        return mainHomeOwner;
    }

    public void setMainHomeOwner(String mainHomeOwner) {
        this.mainHomeOwner = mainHomeOwner;
    }

    public boolean isAllClientAssetsCaptured() {
        return isAllClientAssetsCaptured;
    }

    public void setAllClientAssetsCaptured(boolean allClientAssetsCaptured) {
        isAllClientAssetsCaptured = allClientAssetsCaptured;
    }
}
