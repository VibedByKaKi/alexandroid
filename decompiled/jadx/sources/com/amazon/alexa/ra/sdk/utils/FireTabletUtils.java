package com.amazon.alexa.ra.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class FireTabletUtils {
    private static final String AMAZON_MANUFACTURER = "Amazon";
    private static final String GEMINI_APPLICATION_NAME = "com.amazon.alexa.multimodal.gemini";

    @VisibleForTesting
    static final String KIDS_EDITION_DEVICE_SYSTEM_FEATURE = "com.amazon.software.forces_child_onboarding";

    @VisibleForTesting
    static final String SETTINGS_KEY_FOS_USER_ROLE = "USER_ROLE";

    @VisibleForTesting
    static final String SETTINGS_KEY_KH_USER_ROLE = "prefer_user_account_age_group";

    @VisibleForTesting
    static final String SYSTEM_UI_VOICE_CHROME_FEATURE_NAME = "com.amazon.alexa.systemui.chrome";
    private static final String TAG = "FireTabletUtils";

    @VisibleForTesting
    static final String USER_ROLE_FOS_CHILD = "CHILD";

    @VisibleForTesting
    static final String USER_ROLE_KH_CHILD = "child";
    public static Boolean shouldGrootBeEnabled;

    private FireTabletUtils() {
    }

    public static boolean hasSystemUiVoiceChromeFeature(Context context) {
        if (!isKHTablet() || isChildProfile(context) || isKidsEditionDevice(context)) {
            return false;
        }
        return context.getPackageManager().hasSystemFeature(SYSTEM_UI_VOICE_CHROME_FEATURE_NAME);
    }

    public static boolean isChildProfile(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return USER_ROLE_FOS_CHILD.equals(Settings.Secure.getString(contentResolver, SETTINGS_KEY_FOS_USER_ROLE)) || "child".equalsIgnoreCase(Settings.Secure.getString(contentResolver, SETTINGS_KEY_KH_USER_ROLE));
    }

    public static boolean isFireOS() {
        return "Amazon".equals(Build.MANUFACTURER);
    }

    public static boolean isGeminiAvailable(Context context) {
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

    public static boolean isKHTablet() {
        return isFireOS() && Build.VERSION.SDK_INT >= 35;
    }

    public static boolean isKidsEditionDevice(Context context) {
        return context.getPackageManager().hasSystemFeature(KIDS_EDITION_DEVICE_SYSTEM_FEATURE);
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
