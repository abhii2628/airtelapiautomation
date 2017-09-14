
package com.myairtel.bin.PostpaidMainCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Header {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("ctas")
    @Expose
    private List<Cta> ctas = null;
    @SerializedName("overflow")
    @Expose
    private List<Object> overflow = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<Cta> getCtas() {
        return ctas;
    }

    public void setCtas(List<Cta> ctas) {
        this.ctas = ctas;
    }

    public List<Object> getOverflow() {
        return overflow;
    }

    public void setOverflow(List<Object> overflow) {
        this.overflow = overflow;
    }

}
