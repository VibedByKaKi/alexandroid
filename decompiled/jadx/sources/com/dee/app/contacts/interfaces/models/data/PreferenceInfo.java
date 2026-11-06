package com.dee.app.contacts.interfaces.models.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PreferenceInfo {

    @JsonProperty("key")
    private String key;

    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("value")
    private String value;

    public String getKey() {
        return this.key;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
