package com.amazon.alexa.voice.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class FireTabletUtils {
    public static final String ALEXA_AVAILABILITY = "alexa_availability";
    public static final String ALEXA_ENABLED_SETTINGS_KEY = "alexa_enabled";
    private static final String AMAZON_MANUFACTURER = "Amazon";
    private static final String GEMINI_APPLICATION_NAME = "com.amazon.alexa.multimodal.gemini";
    private static final String TAG = "FireTabletUtils";
    public static Boolean shouldGrootBeEnabled;

    private FireTabletUtils() {
    }

    public static boolean isAlexaAvailable(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "alexa_availability", 0) == 0;
    }

    public static boolean isAlexaEnabled(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), ALEXA_ENABLED_SETTINGS_KEY, 0) == 1;
    }

    public static boolean isFireOS() {
        return "Amazon".equals(Build.MANUFACTURER);
    }

    private static boolean isGeminiAvailable(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.amazon.alexa.multimodal.gemini", 0);
            if (applicationInfo == null) {
                return false;
            }
            boolean z = (applicationInfo.flags & 129) != 0;
            if (!z) {
                Log.w(TAG, "Gemini package found but is not a system app, ignoring");
            }
            return z;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i(TAG, "Gemini not installed");
            return false;
        }
    }

    @ChecksSdkIntAtLeast(api = 35)
    public static boolean isKHTablet() {
        return isFireOS() && Build.VERSION.SDK_INT >= 35;
    }

    public static boolean shouldGrootBeEnabled(boolean z, boolean z2) {
        if (shouldGrootBeEnabled == null) {
            shouldGrootBeEnabled = Boolean.valueOf(z && !z2);
        }
        return shouldGrootBeEnabled.booleanValue();
    }

    public static boolean shouldGrootBeEnabled(Context context) {
        return shouldGrootBeEnabled(isFireOS(), isGeminiAvailable(context));
    }
}
