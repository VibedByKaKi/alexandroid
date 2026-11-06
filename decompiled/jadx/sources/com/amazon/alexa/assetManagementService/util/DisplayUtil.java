package com.amazon.alexa.assetManagementService.util;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class DisplayUtil {
    private DisplayUtil() {
    }

    public static String determineCurrentResolution(Context context) {
        int i = context.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        return (120 > i || i >= 160) ? (160 > i || i >= 240) ? (240 > i || i >= 320) ? (320 > i || i >= 480) ? (480 > i || i >= 640) ? i >= 640 ? "xxxhdpi" : "default" : "xxhdpi" : "xhdpi" : "hdpi" : "mdpi" : "ldpi";
    }
}
