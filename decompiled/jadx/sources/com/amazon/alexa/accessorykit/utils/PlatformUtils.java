package com.amazon.alexa.accessorykit.utils;

import android.os.Build;
import com.amazon.alexa.accessory.internal.util.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class PlatformUtils {
    private static final String TAG = "PlatformUtils";

    private PlatformUtils() {
    }

    public static boolean isFireOS() {
        boolean equals = "Amazon".equals(Build.MANUFACTURER);
        Logger.d("%s Is Fire OS :: %b", TAG, Boolean.valueOf(equals));
        return equals;
    }
}
