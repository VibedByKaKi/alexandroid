package com.amazon.comms.ringservice.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum Capability {
    AUDIO("audio"),
    VIDEO("video");

    private final String name;

    Capability(String str) {
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}
