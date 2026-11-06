package com.amazon.alexa.handsfree.audio;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class AlexaExperienceHelper {
    private static final String GEMINI_APPLICATION_NAME = "com.amazon.alexa.multimodal.gemini";
    private static final String TAG = "AlexaExperienceHelper";

    private AlexaExperienceHelper() {
    }

    public static boolean isGeminiAvailable(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.amazon.alexa.multimodal.gemini", 0);
            if (applicationInfo == null) {
                return false;
            }
            boolean z = (applicationInfo.flags & 129) != 0;
            if (z) {
                return z;
            }
            Log.w(TAG, "Gemini package found but is not a system app, ignoring");
            return z;
        } catch (PackageManager.NameNotFoundException e) {
            Log.i(TAG, "Gemini apk is not installed: " + e);
            return false;
        }
    }
}
