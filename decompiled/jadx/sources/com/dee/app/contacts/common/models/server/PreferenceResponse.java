package com.dee.app.contacts.common.models.server;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PreferenceResponse {
    private String key;
    private String namespace;
    private String value;

    public PreferenceResponse(String str, String str2, String str3) {
        this.namespace = str;
        this.key = str2;
        this.value = str3;
    }

    public String getKey() {
        return this.key;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getValue() {
        return this.value;
    }

    private PreferenceResponse() {
    }
}
