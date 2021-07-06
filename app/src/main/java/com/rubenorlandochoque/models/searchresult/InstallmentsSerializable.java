package com.rubenorlandochoque.models.searchresult;

import java.io.Serializable;

public class InstallmentsSerializable implements Serializable {
    private long quantity = 0;
    private double amount = 0;
    private double rate = 0;
    private String currencyID = "";


    public InstallmentsSerializable(Installments installments) {
        if(installments != null) {
            this.quantity = installments.getQuantity();
            this.amount = installments.getAmount();
            this.rate = installments.getRate();
            this.currencyID = installments.getCurrencyID();
        }
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }
}
