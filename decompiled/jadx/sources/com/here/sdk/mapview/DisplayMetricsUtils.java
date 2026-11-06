package com.here.sdk.mapview;

import android.os.Build;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class DisplayMetricsUtils {
    public static double extractDpi(DisplayMetrics displayMetrics) {
        return (Build.VERSION.SDK_INT <= 32 || !isRunningOnEmulator()) ? displayMetrics.ydpi : displayMetrics.densityDpi;
    }

    private static boolean isRunningOnEmulator() {
        return Build.MODEL.startsWith("sdk_gphone");
    }
}
