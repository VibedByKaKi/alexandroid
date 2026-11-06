package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeCommsDeviceManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CommsDeviceManagerModule";

    public NativeCommsDeviceManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void callDevice(String str, String str2, String str3, String str4, String str5, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "CommsDeviceManagerModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void makeAllDevicesCall(String str, String str2, String str3, String str4, @Nullable String str5, Promise promise);
}
