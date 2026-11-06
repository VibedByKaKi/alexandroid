package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativePMISpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PMI";

    public NativePMISpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void endTimeline(double d, @Nullable String str);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PMI";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void mark(double d, String str, @Nullable ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double startRootTimeline(ReadableMap readableMap, double d);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    @Nullable
    public abstract Double startTimeline(ReadableMap readableMap, @Nullable Double d);
}
