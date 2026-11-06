package com.amazon.alexa.handsfree.devices;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FireTabletUtils {
    public static final String ALEXA_AVAILABILITY = "alexa_availability";
    private static final String AMAZON_MANUFACTURER = "Amazon";
    public static final String GEMINI_APPLICATION_NAME = "com.amazon.alexa.multimodal.gemini";
    private static final String TAG = "FireTabletUtils";

    private FireTabletUtils() {
    }

    public static boolean isAlexaAvailable(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "alexa_availability", 0) == 0;
    }

    public static boolean isFireOS() {
        return "Amazon".equals(Build.MANUFACTURER);
    }

    private static boolean isGeminiAvailable(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(GEMINI_APPLICATION_NAME, 0);
            if (applicationInfo == null) {
                return false;
            }
            boolean z = (applicationInfo.flags & 129) != 0;
            if (!z) {
                Log.w(TAG, "Gemini package found but is not a system app, ignoring");
            }
            return z;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean isVoiceAppSupported(Context context) {
        return isFireOS() && !isGeminiAvailable(context);
    }
}
