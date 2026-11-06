package com.amazon.apl.android.utils;

import android.content.Context;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AccessibilitySettingsUtil {
    private static final AccessibilitySettingsUtil INSTANCE = new AccessibilitySettingsUtil();
    private static final String TAG = "AccessibilitySttngsUtl";
    private static Method sIsHighTextContrastEnabledMethod;

    static {
        extractHighContrastMethod();
    }

    @VisibleForTesting
    public AccessibilitySettingsUtil() {
    }

    private static void extractHighContrastMethod() {
        try {
            sIsHighTextContrastEnabledMethod = AccessibilityManager.class.getMethod("isHighTextContrastEnabled", null);
        } catch (NoSuchMethodException unused) {
            Log.e(TAG, "isHighTextContrastEnabled not found in AccessibilityManager");
        }
    }

    private AccessibilityManager getAccessibilityManager(Context context) {
        Object systemService = context.getSystemService("accessibility");
        if (systemService instanceof AccessibilityManager) {
            return (AccessibilityManager) systemService;
        }
        return null;
    }

    public static AccessibilitySettingsUtil getInstance() {
        return INSTANCE;
    }

    public float getFontScale(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public boolean isHighContrast(Context context) {
        AccessibilityManager accessibilityManager = getAccessibilityManager(context);
        if (accessibilityManager == null) {
            return false;
        }
        try {
            Object invoke = sIsHighTextContrastEnabledMethod.invoke(accessibilityManager, null);
            if (invoke != null && (invoke instanceof Boolean)) {
                return ((Boolean) invoke).booleanValue();
            }
        } catch (Exception e) {
            Log.e(TAG, "isHighTextContrastEnabled invoked with an exception", e);
        }
        return false;
    }

    public boolean isScreenReaderEnabled(Context context) {
        AccessibilityManager accessibilityManager = getAccessibilityManager(context);
        if (accessibilityManager == null) {
            return false;
        }
        return accessibilityManager.isEnabled();
    }
}
