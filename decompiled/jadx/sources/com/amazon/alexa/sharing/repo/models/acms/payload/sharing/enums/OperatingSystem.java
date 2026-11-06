package com.amazon.alexa.sharing.repo.models.acms.payload.sharing.enums;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum OperatingSystem {
    Android("android"),
    Headless("headless"),
    iOS("ios"),
    MultiModal("multimodal");

    private final String serializedName;

    OperatingSystem(String str) {
        this.serializedName = str;
    }

    public String getSerializedName() {
        return this.serializedName;
    }
}
