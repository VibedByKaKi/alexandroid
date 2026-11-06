package com.amazon.alexa.voice.handsfree.utils;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class KetDeviceCheck {
    private static final String KET_SYSTEM_FEATURE = "com.amazon.software.forces_child_onboarding";

    private KetDeviceCheck() {
    }

    public static boolean isKetDevice(Context context) {
        return context.getPackageManager().hasSystemFeature(KET_SYSTEM_FEATURE);
    }
}
