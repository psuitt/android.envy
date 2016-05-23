package com.envyathletics.envy.beans;

/**
 * Created by Sora on 5/22/2016.
 */
public class TrainingItem {

    private String name;
    private String detail;
    private String url;

    public TrainingItem(String name, String detail, String url) {
        this.name = name;
        this.detail = detail;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
