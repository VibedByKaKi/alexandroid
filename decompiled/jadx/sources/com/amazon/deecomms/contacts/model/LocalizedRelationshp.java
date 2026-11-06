package com.amazon.deecomms.contacts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class LocalizedRelationshp {

    @JsonProperty("localizedValue")
    private String localizedValue;

    @JsonProperty("key")
    private String rawValue;

    public String getLocalizedValue() {
        return this.localizedValue;
    }

    public String getRawValue() {
        return this.rawValue;
    }

    public void setLocalizedValue(String str) {
        this.localizedValue = str;
    }

    public void setRawValue(String str) {
        this.rawValue = str;
    }
}
