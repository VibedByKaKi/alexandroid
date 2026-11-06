package com.amazon.alexa.location.utils;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class DebugUtil {
    private static final String FILENAME_DISABLE_OS_TRIGGER = "alexa_disable_os_geofence";

    private DebugUtil() {
    }

    public static boolean isOsTriggerDisabled(@NonNull Context context) {
        return false;
    }
}
