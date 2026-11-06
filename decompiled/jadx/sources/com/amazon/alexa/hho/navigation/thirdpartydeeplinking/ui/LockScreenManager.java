package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.ui;

import android.app.KeyguardManager;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class LockScreenManager {
    private final KeyguardManager keyguardManager;

    @Inject
    public LockScreenManager(KeyguardManager keyguardManager) {
        this.keyguardManager = keyguardManager;
    }

    public static boolean isOnLockScreen(KeyguardManager keyguardManager) {
        return keyguardManager != null && keyguardManager.isKeyguardLocked();
    }

    public boolean isOnLockScreen() {
        return isOnLockScreen(this.keyguardManager);
    }
}
