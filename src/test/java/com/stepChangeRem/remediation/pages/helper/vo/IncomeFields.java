package com.stepChangeRem.remediation.pages.helper.vo;

public class IncomeFields {
    private String field;
    private String amount;
    private String index;
    private Integer owner;
    private String header;
    private String whoPays;

    public String getWhoPays() {
        return whoPays;
    }

    public void setWhoPays(String whoPays) {
        this.whoPays = whoPays;
    }
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public IncomeFields() {
    }
}
