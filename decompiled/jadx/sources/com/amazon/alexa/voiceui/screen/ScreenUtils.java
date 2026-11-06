package com.amazon.alexa.voiceui.screen;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.amazon.alexa.utils.device.FireTabletUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ScreenUtils {
    private static final double PHONE_SCREEN_SIZE_THRESHOLD = 7.0d;
    private static final String TAG = "com.amazon.alexa.voiceui.screen.ScreenUtils";
    private static Double deviceScreenSize;
    private static Boolean phoneFormFactor;

    private ScreenUtils() {
    }

    public static double calculateScreenSize(DisplayMetrics displayMetrics) {
        int i;
        if (displayMetrics == null || (i = displayMetrics.densityDpi) == 0) {
            return 0.0d;
        }
        double d = displayMetrics.widthPixels / i;
        double d2 = displayMetrics.heightPixels / i;
        return Math.sqrt((d2 * d2) + (d * d));
    }

    public static double getScreenSize(Context context) {
        Double d = deviceScreenSize;
        if (d != null) {
            return d.doubleValue();
        }
        if (context == null) {
            Log.w(TAG, "Context is null, cannot calculate screen size");
            return 0.0d;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            Log.w(TAG, "WindowManager not available, falling back to 0.0");
            return 0.0d;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        Double valueOf = Double.valueOf(calculateScreenSize(displayMetrics));
        deviceScreenSize = valueOf;
        return valueOf.doubleValue();
    }

    public static boolean isPhoneFormFactor(Context context) {
        if (FireTabletUtils.isFireOS()) {
            return false;
        }
        Boolean bool = phoneFormFactor;
        if (bool != null) {
            return bool.booleanValue();
        }
        phoneFormFactor = Boolean.valueOf(getScreenSize(context) < 7.0d);
        return phoneFormFactor.booleanValue();
    }
}
