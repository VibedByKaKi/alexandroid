package com.dee.app.contacts.common.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum RemoteConfig {
    ACMS_HOST(com.dee.app.contacts.common.constants.coremodules.Constants.ACMS_HOST_KEY, "https://alexa-comms-mobile-service.amazon.com");

    private final String defaultValue;
    private final String key;

    RemoteConfig(String str, String str2) {
        this.key = str;
        this.defaultValue = str2;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public String getKey() {
        return this.key;
    }
}
