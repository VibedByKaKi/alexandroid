package com.amazon.smrf.runtime;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class NativeVisualContextModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "VisualContext";

    public NativeVisualContextModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getAccessibilityTree(String str);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "VisualContext";
    }
}
