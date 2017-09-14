
package com.myairtel.bin.PostpaidMainCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostpaidAccountDetails {

    @SerializedName("accountNo")
    @Expose
    private String accountNo;
    @SerializedName("unbillAmt")
    @Expose
    private String unbillAmt;
    @SerializedName("outstandingAmt")
    @Expose
    private String outstandingAmt;
    @SerializedName("fromDate")
    @Expose
    private String fromDate;
    @SerializedName("toDate")
    @Expose
    private String toDate;
    @SerializedName("fromDateNew")
    @Expose
    private String fromDateNew;
    @SerializedName("toDateNew")
    @Expose
    private String toDateNew;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getUnbillAmt() {
        return unbillAmt;
    }

    public void setUnbillAmt(String unbillAmt) {
        this.unbillAmt = unbillAmt;
    }

    public String getOutstandingAmt() {
        return outstandingAmt;
    }

    public void setOutstandingAmt(String outstandingAmt) {
        this.outstandingAmt = outstandingAmt;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getFromDateNew() {
        return fromDateNew;
    }

    public void setFromDateNew(String fromDateNew) {
        this.fromDateNew = fromDateNew;
    }

    public String getToDateNew() {
        return toDateNew;
    }

    public void setToDateNew(String toDateNew) {
        this.toDateNew = toDateNew;
    }

}
