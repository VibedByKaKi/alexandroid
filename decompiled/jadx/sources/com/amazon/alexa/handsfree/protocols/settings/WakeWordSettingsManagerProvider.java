package com.amazon.alexa.handsfree.protocols.settings;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class WakeWordSettingsManagerProvider {
    private static final String TAG = "WakeWordSettingsManagerProvider";
    private WakeWordSettingsManager mWakeWordSettingsManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InstanceHolder {
        private static final WakeWordSettingsManagerProvider INSTANCE = new WakeWordSettingsManagerProvider();

        private InstanceHolder() {
        }
    }

    @VisibleForTesting
    public WakeWordSettingsManagerProvider() {
    }

    public static WakeWordSettingsManagerProvider getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public WakeWordSettingsManager get() {
        WakeWordSettingsManager wakeWordSettingsManager = this.mWakeWordSettingsManager;
        if (wakeWordSettingsManager != null) {
            return wakeWordSettingsManager;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("WakeWordSettingsManager wasn't initialized.");
        return null;
    }

    public synchronized void initialize(@NonNull WakeWordSettingsManager wakeWordSettingsManager) {
        this.mWakeWordSettingsManager = wakeWordSettingsManager;
    }
}
