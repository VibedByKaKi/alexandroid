package com.amazon.identity.auth.device.api;

import android.content.Context;
import com.amazon.identity.auth.device.framework.IsolatedModeSwitcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MAPIsolationManager {
    public static synchronized boolean clientDrivenSwitchAppToIsolatedMode(Context context) {
        boolean clientDrivenSwitchAppToIsolatedMode;
        synchronized (MAPIsolationManager.class) {
            clientDrivenSwitchAppToIsolatedMode = IsolatedModeSwitcher.clientDrivenSwitchAppToIsolatedMode(context);
        }
        return clientDrivenSwitchAppToIsolatedMode;
    }

    public static synchronized boolean clientDrivenSwitchAppToSSOMode(Context context) {
        boolean clientDrivenSwitchAppToSSOMode;
        synchronized (MAPIsolationManager.class) {
            clientDrivenSwitchAppToSSOMode = IsolatedModeSwitcher.clientDrivenSwitchAppToSSOMode(context);
        }
        return clientDrivenSwitchAppToSSOMode;
    }

    public static synchronized boolean isAppInIsolatedMode(Context context) {
        boolean isAppInIsolatedMode;
        synchronized (MAPIsolationManager.class) {
            isAppInIsolatedMode = IsolatedModeSwitcher.isAppInIsolatedMode(context);
        }
        return isAppInIsolatedMode;
    }

    public static synchronized boolean isAppInSealedIsolationMode(Context context) {
        boolean isAppInSealedIsolatedMode;
        synchronized (MAPIsolationManager.class) {
            isAppInSealedIsolatedMode = IsolatedModeSwitcher.isAppInSealedIsolatedMode(context);
        }
        return isAppInSealedIsolatedMode;
    }
}
