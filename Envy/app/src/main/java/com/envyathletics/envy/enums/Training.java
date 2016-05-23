package com.envyathletics.envy.enums;

/**
 * Created by Sora on 5/22/2016.
 */
public enum Training {
    NAME("name"), DETAIL("detail"), URL("url");

    public final String field;

    Training(final String field) {
        this.field = field;
    }
}
