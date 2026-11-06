package com.amazonaws.services.s3.model;

import java.io.Serializable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class FilterRule implements Serializable {
    private String name;
    private String value;

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setName(String str) {
        if (str != null) {
            this.name = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("FilterRule Name is a required argument");
        }
    }

    public void setValue(String str) {
        this.value = str;
    }

    public FilterRule withName(String str) {
        setName(str);
        return this;
    }

    public FilterRule withValue(String str) {
        setValue(str);
        return this;
    }
}
