
package com.myairtel.bin.PostpaidMainCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Footer {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("uri")
    @Expose
    private String uri;

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

}
