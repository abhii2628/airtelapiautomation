
package com.myairtel.bin.PostpaidMainCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Postpaid3GUsage {

    @SerializedName("usedData")
    @Expose
    private String usedData;
    @SerializedName("unUsedData")
    @Expose
    private String unUsedData;
    @SerializedName("availableData")
    @Expose
    private String availableData;
    @SerializedName("deltaData")
    @Expose
    private String deltaData;
    @SerializedName("rollOverDataAvailable")
    @Expose
    private String rollOverDataAvailable;
    @SerializedName("rollOverDataTotal")
    @Expose
    private String rollOverDataTotal;
    @SerializedName("oldData")
    @Expose
    private String oldData;
    @SerializedName("finalTotalData")
    @Expose
    private String finalTotalData;
    @SerializedName("finalAvailableData")
    @Expose
    private String finalAvailableData;
    @SerializedName("finalUsedData")
    @Expose
    private String finalUsedData;
    @SerializedName("usgMap")
    @Expose
    private UsgMap usgMap;

    public String getUsedData() {
        return usedData;
    }

    public void setUsedData(String usedData) {
        this.usedData = usedData;
    }

    public String getUnUsedData() {
        return unUsedData;
    }

    public void setUnUsedData(String unUsedData) {
        this.unUsedData = unUsedData;
    }

    public String getAvailableData() {
        return availableData;
    }

    public void setAvailableData(String availableData) {
        this.availableData = availableData;
    }

    public String getDeltaData() {
        return deltaData;
    }

    public void setDeltaData(String deltaData) {
        this.deltaData = deltaData;
    }

    public String getRollOverDataAvailable() {
        return rollOverDataAvailable;
    }

    public void setRollOverDataAvailable(String rollOverDataAvailable) {
        this.rollOverDataAvailable = rollOverDataAvailable;
    }

    public String getRollOverDataTotal() {
        return rollOverDataTotal;
    }

    public void setRollOverDataTotal(String rollOverDataTotal) {
        this.rollOverDataTotal = rollOverDataTotal;
    }

    public String getOldData() {
        return oldData;
    }

    public void setOldData(String oldData) {
        this.oldData = oldData;
    }

    public String getFinalTotalData() {
        return finalTotalData;
    }

    public void setFinalTotalData(String finalTotalData) {
        this.finalTotalData = finalTotalData;
    }

    public String getFinalAvailableData() {
        return finalAvailableData;
    }

    public void setFinalAvailableData(String finalAvailableData) {
        this.finalAvailableData = finalAvailableData;
    }

    public String getFinalUsedData() {
        return finalUsedData;
    }

    public void setFinalUsedData(String finalUsedData) {
        this.finalUsedData = finalUsedData;
    }

    public UsgMap getUsgMap() {
        return usgMap;
    }

    public void setUsgMap(UsgMap usgMap) {
        this.usgMap = usgMap;
    }

}
