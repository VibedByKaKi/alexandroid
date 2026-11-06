package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeCommsAlexaCommsDelegateSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CommsAlexaCommsDelegateModule";

    public NativeCommsAlexaCommsDelegateSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getCommsAllowed(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getCommsEnabledToggle(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getDeviceSerialNumber(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "CommsAlexaCommsDelegateModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getProvisionStatus(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void identityUpdated(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setCommsEnabledToggle(boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setReactNativeInitialized(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void shouldShowComms(Promise promise);
}
