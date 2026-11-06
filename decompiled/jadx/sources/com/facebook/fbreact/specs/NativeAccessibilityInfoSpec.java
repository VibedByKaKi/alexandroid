package com.facebook.fbreact.specs;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AccessibilityInfo";

    public NativeAccessibilityInfoSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void announceForAccessibility(String str);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "AccessibilityInfo";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void isReduceMotionEnabled(Callback callback);

    @DoNotStrip
    @ReactMethod
    public abstract void isTouchExplorationEnabled(Callback callback);

    @DoNotStrip
    @ReactMethod
    public abstract void setAccessibilityFocus(double d);

    @DoNotStrip
    @ReactMethod
    public void isAccessibilityServiceEnabled(Callback callback) {
    }

    @DoNotStrip
    @ReactMethod
    public void isGrayscaleEnabled(Callback callback) {
    }

    @DoNotStrip
    @ReactMethod
    public void isHighTextContrastEnabled(Callback callback) {
    }

    @DoNotStrip
    @ReactMethod
    public void isInvertColorsEnabled(Callback callback) {
    }

    @DoNotStrip
    @ReactMethod
    public void getRecommendedTimeoutMillis(double d, Callback callback) {
    }
}
