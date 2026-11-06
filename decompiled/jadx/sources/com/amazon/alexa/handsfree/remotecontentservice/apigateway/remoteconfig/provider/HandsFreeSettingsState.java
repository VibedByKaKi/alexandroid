package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.provider;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum HandsFreeSettingsState {
    INACTIVE(0),
    ACTIVE(1),
    REMOTELY_DISABLED(2),
    LOCALLY_DISABLED(3);

    private int mValue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnStateChangedListener {
        void onStateChanged(HandsFreeSettingsState handsFreeSettingsState);
    }

    HandsFreeSettingsState(int i) {
        this.mValue = i;
    }

    public static HandsFreeSettingsState get(int i) {
        for (HandsFreeSettingsState handsFreeSettingsState : values()) {
            if (handsFreeSettingsState.mValue == i) {
                return handsFreeSettingsState;
            }
        }
        throw new NoSuchElementException(i + " does not have a HandsFreeSettingsState representation");
    }

    public int getValue() {
        return this.mValue;
    }

    public boolean isEnabled() {
        return this == ACTIVE || this == INACTIVE;
    }

    public boolean isRemotelyDisabled() {
        return this == REMOTELY_DISABLED;
    }
}
