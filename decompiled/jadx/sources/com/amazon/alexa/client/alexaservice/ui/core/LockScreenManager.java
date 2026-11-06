package com.amazon.alexa.client.alexaservice.ui.core;

import android.app.KeyguardManager;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LockScreenManager {
    private final KeyguardManager keyguardManager;

    @Inject
    public LockScreenManager(KeyguardManager keyguardManager) {
        this.keyguardManager = keyguardManager;
    }

    public static boolean isDeviceLocked(KeyguardManager keyguardManager) {
        if (keyguardManager == null) {
            return false;
        }
        return keyguardManager.isDeviceLocked();
    }

    public static boolean isDeviceSecure(KeyguardManager keyguardManager) {
        if (keyguardManager == null) {
            return false;
        }
        return keyguardManager.isDeviceSecure();
    }

    public boolean isSwipeLocked() {
        return this.keyguardManager.isKeyguardLocked() && !isDeviceSecure();
    }

    public boolean isDeviceLocked() {
        return isDeviceLocked(this.keyguardManager);
    }

    public boolean isDeviceSecure() {
        return isDeviceSecure(this.keyguardManager);
    }
}
