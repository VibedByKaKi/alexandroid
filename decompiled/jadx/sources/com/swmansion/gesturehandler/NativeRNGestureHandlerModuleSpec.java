package com.swmansion.gesturehandler;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class NativeRNGestureHandlerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGestureHandlerModule";

    public NativeRNGestureHandlerModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void attachGestureHandler(double d, double d2, double d3);

    @DoNotStrip
    @ReactMethod
    public abstract void createGestureHandler(String str, double d, ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void dropGestureHandler(double d);

    @DoNotStrip
    @ReactMethod
    public abstract void flushOperations();

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNGestureHandlerModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void handleClearJSResponder();

    @DoNotStrip
    @ReactMethod
    public abstract void handleSetJSResponder(double d, boolean z);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean install();

    @DoNotStrip
    @ReactMethod
    public abstract void updateGestureHandler(double d, ReadableMap readableMap);
}
