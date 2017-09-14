
package com.myairtel.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NdsUserInfo {

    @SerializedName("preferredLanguage")
    @Expose
    private String preferredLanguage;
    @SerializedName("circle")
    @Expose
    private String circle;
    @SerializedName("userType")
    @Expose
    private String userType;
    @SerializedName("corporateUser")
    @Expose
    private Boolean corporateUser;
    @SerializedName("dataUser")
    @Expose
    private Boolean dataUser;
    @SerializedName("dataRating")
    @Expose
    private String dataRating;
    @SerializedName("threeGCapable")
    @Expose
    private Boolean threeGCapable;
    @SerializedName("gprsCapable")
    @Expose
    private Boolean gprsCapable;
    @SerializedName("imei")
    @Expose
    private String imei;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("dateOfBirth")
    @Expose
    private String dateOfBirth;
    @SerializedName("emailID")
    @Expose
    private String emailID;
    @SerializedName("activationDate")
    @Expose
    private String activationDate;
    @SerializedName("device4gCapable")
    @Expose
    private Boolean device4gCapable;

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Boolean getCorporateUser() {
        return corporateUser;
    }

    public void setCorporateUser(Boolean corporateUser) {
        this.corporateUser = corporateUser;
    }

    public Boolean getDataUser() {
        return dataUser;
    }

    public void setDataUser(Boolean dataUser) {
        this.dataUser = dataUser;
    }

    public String getDataRating() {
        return dataRating;
    }

    public void setDataRating(String dataRating) {
        this.dataRating = dataRating;
    }

    public Boolean getThreeGCapable() {
        return threeGCapable;
    }

    public void setThreeGCapable(Boolean threeGCapable) {
        this.threeGCapable = threeGCapable;
    }

    public Boolean getGprsCapable() {
        return gprsCapable;
    }

    public void setGprsCapable(Boolean gprsCapable) {
        this.gprsCapable = gprsCapable;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public Boolean getDevice4gCapable() {
        return device4gCapable;
    }

    public void setDevice4gCapable(Boolean device4gCapable) {
        this.device4gCapable = device4gCapable;
    }

}
