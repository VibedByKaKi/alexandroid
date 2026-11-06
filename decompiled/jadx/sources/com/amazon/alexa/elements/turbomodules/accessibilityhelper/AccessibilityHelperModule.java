package com.amazon.alexa.elements.turbomodules.accessibilityhelper;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeAccessibilityHelperSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "AccessibilityHelperModule")
/* loaded from: classes17.dex */
public class AccessibilityHelperModule extends NativeAccessibilityHelperSpec {
    public static final String NAME = "AccessibilityHelperModule";
    private final AccessibilityHelperAPI accessibilityHelperAPI;

    public AccessibilityHelperModule(ReactApplicationContext reactApplicationContext, AccessibilityHelperAPI accessibilityHelperAPI) {
        super(reactApplicationContext);
        this.accessibilityHelperAPI = accessibilityHelperAPI;
        accessibilityHelperAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAccessibilityHelperSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "AccessibilityHelperModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAccessibilityHelperSpec
    @ReactMethod
    public void read(String str) {
        this.accessibilityHelperAPI.read(str);
    }
}
