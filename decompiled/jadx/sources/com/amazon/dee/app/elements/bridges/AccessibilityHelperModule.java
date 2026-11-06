package com.amazon.dee.app.elements.bridges;

import android.app.Activity;
import android.view.View;
import com.amazon.dee.app.core.R;
import com.amazon.dee.app.services.logging.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "AccessibilityHelper")
/* loaded from: classes3.dex */
public class AccessibilityHelperModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "AccessibilityHelper";
    private static final String TAG = Log.tag((Class<?>) AccessibilityHelperModule.class);

    public AccessibilityHelperModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AccessibilityHelper";
    }

    @ReactMethod
    public void read(String str) {
        View findViewById;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (findViewById = currentActivity.findViewById(R.id.rn_container)) == null) {
            return;
        }
        try {
            findViewById.announceForAccessibility(str);
        } catch (IndexOutOfBoundsException e) {
            Log.w(TAG, "announceForAccessibility retrying (" + str + "): " + e);
            try {
                findViewById.announceForAccessibility(str);
            } catch (IndexOutOfBoundsException e2) {
                Log.w(TAG, "announceForAccessibility failed (" + str + "): " + e2);
            }
        }
    }
}
