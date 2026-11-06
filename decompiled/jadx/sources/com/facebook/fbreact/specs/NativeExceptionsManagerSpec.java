package com.facebook.fbreact.specs;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ExceptionsManager";

    public NativeExceptionsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "ExceptionsManager";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void reportFatalException(String str, ReadableArray readableArray, double d);

    @DoNotStrip
    @ReactMethod
    public abstract void reportSoftException(String str, ReadableArray readableArray, double d);

    @DoNotStrip
    @ReactMethod
    public void dismissRedbox() {
    }

    @DoNotStrip
    @ReactMethod
    public void reportException(ReadableMap readableMap) {
    }
}
