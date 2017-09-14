
package com.myairtel.bin.PostpaidMainCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Account {

    @SerializedName("postpaidAccountDetails")
    @Expose
    private PostpaidAccountDetails postpaidAccountDetails;
    @SerializedName("postpaid3GUsage")
    @Expose
    private Postpaid3GUsage postpaid3GUsage;
    @SerializedName("postpaidBillMode")
    @Expose
    private PostpaidBillMode postpaidBillMode;
    @SerializedName("postpaidCreditLimit")
    @Expose
    private PostpaidCreditLimit postpaidCreditLimit;
    @SerializedName("lob")
    @Expose
    private String lob;
    @SerializedName("accountSummary")
    @Expose
    private AccountSummary accountSummary;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("alerts")
    @Expose
    private List<Object> alerts = null;

    public PostpaidAccountDetails getPostpaidAccountDetails() {
        return postpaidAccountDetails;
    }

    public void setPostpaidAccountDetails(PostpaidAccountDetails postpaidAccountDetails) {
        this.postpaidAccountDetails = postpaidAccountDetails;
    }

    public Postpaid3GUsage getPostpaid3GUsage() {
        return postpaid3GUsage;
    }

    public void setPostpaid3GUsage(Postpaid3GUsage postpaid3GUsage) {
        this.postpaid3GUsage = postpaid3GUsage;
    }

    public PostpaidBillMode getPostpaidBillMode() {
        return postpaidBillMode;
    }

    public void setPostpaidBillMode(PostpaidBillMode postpaidBillMode) {
        this.postpaidBillMode = postpaidBillMode;
    }

    public PostpaidCreditLimit getPostpaidCreditLimit() {
        return postpaidCreditLimit;
    }

    public void setPostpaidCreditLimit(PostpaidCreditLimit postpaidCreditLimit) {
        this.postpaidCreditLimit = postpaidCreditLimit;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    public AccountSummary getAccountSummary() {
        return accountSummary;
    }

    public void setAccountSummary(AccountSummary accountSummary) {
        this.accountSummary = accountSummary;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Object> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Object> alerts) {
        this.alerts = alerts;
    }

}
