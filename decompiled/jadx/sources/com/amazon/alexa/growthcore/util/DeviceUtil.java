package com.amazon.alexa.growthcore.util;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.growthcore.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class DeviceUtil {
    private DeviceUtil() {
    }

    public static int getOrientation(@NonNull Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static boolean isRtl(@NonNull Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static boolean isTablet(@NonNull Context context) {
        return context.getResources().getBoolean(R.bool.isTablet);
    }
}
