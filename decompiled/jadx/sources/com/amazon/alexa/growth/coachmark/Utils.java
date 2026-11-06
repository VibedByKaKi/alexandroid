package com.amazon.alexa.growth.coachmark;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Utils {
    private Utils() {
    }

    public static void dispatchEvent(View view, String str, WritableMap writableMap) {
        ((RCTEventEmitter) ((ReactContext) view.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), str, writableMap);
    }

    public static String generateMetricEventName(String[] strArr) {
        return joinStrings(strArr, ".");
    }

    public static Activity getActivityFromView(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The anchorView's Context is not an Activity.");
        return null;
    }

    public static boolean isDebuggable(Context context) {
        return (context == null || context.getApplicationContext() == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static boolean isScreenReaderEnabled(Context context) {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                return !accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String joinStrings(String[] strArr, String str) {
        if (strArr == null || strArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
            if (i != strArr.length - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
