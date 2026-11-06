package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.provider;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum LockScreenSettingState {
    INACTIVE(0),
    ACTIVE(1),
    REMOTELY_DISABLED(2);

    private final int mValue;

    LockScreenSettingState(int i) {
        this.mValue = i;
    }

    public static LockScreenSettingState get(int i) {
        for (LockScreenSettingState lockScreenSettingState : values()) {
            if (lockScreenSettingState.mValue == i) {
                return lockScreenSettingState;
            }
        }
        throw new NoSuchElementException(i + " does not have a LockScreenSettingState representation");
    }

    public int getValue() {
        return this.mValue;
    }

    public boolean isEnabled() {
        return this == ACTIVE || this == INACTIVE;
    }
}
