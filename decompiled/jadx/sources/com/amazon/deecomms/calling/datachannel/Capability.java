package com.amazon.deecomms.calling.datachannel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum Capability {
    SCREEN_EVENTS("screen_events"),
    APPLICATION("application");

    private final String value;

    Capability(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
