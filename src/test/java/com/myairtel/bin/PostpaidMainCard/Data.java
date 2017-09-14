
package com.myairtel.bin.PostpaidMainCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("isPureOttUser")
    @Expose
    private Boolean isPureOttUser;
    @SerializedName("header")
    @Expose
    private Header header;
    @SerializedName("footer")
    @Expose
    private Footer footer;
    @SerializedName("accounts")
    @Expose
    private List<Account> accounts = null;
    @SerializedName("ctas")
    @Expose
    private List<Cta_> ctas = null;
    @SerializedName("content")
    @Expose
    private Content content;

    public Boolean getIsPureOttUser() {
        return isPureOttUser;
    }

    public void setIsPureOttUser(Boolean isPureOttUser) {
        this.isPureOttUser = isPureOttUser;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Cta_> getCtas() {
        return ctas;
    }

    public void setCtas(List<Cta_> ctas) {
        this.ctas = ctas;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

}
