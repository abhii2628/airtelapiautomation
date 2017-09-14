
package com.myairtel.bin.PostpaidMainCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostpaidBillMode {

    @SerializedName("ebillStatus")
    @Expose
    private String ebillStatus;
    @SerializedName("emailId")
    @Expose
    private String emailId;

    public String getEbillStatus() {
        return ebillStatus;
    }

    public void setEbillStatus(String ebillStatus) {
        this.ebillStatus = ebillStatus;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
