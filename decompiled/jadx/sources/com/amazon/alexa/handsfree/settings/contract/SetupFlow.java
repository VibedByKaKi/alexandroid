package com.amazon.alexa.handsfree.settings.contract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum SetupFlow {
    DOUBLE_MICROPHONE(false),
    SINGLE_MICROPHONE(false),
    DOUBLE_MICROPHONE_1PSV(false),
    SINGLE_MICROPHONE_1PSV(false),
    DOUBLE_MICROPHONE_AIS(true),
    SINGLE_MICROPHONE_AIS(true),
    DEFAULT(false),
    AIS(true);

    private final boolean mIsAIS;

    SetupFlow(boolean z) {
        this.mIsAIS = z;
    }

    public boolean isAIS() {
        return this.mIsAIS;
    }
}
