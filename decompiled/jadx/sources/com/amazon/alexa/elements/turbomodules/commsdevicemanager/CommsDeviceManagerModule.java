package com.amazon.alexa.elements.turbomodules.commsdevicemanager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.elements.turbomodules.NativeCommsDeviceManagerSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsDeviceManagerModule")
/* loaded from: classes17.dex */
public class CommsDeviceManagerModule extends NativeCommsDeviceManagerSpec {
    public static final String NAME = "CommsDeviceManagerModule";
    private final CommsDeviceManagerAPI commsDeviceManagerAPI;

    public CommsDeviceManagerModule(ReactApplicationContext reactApplicationContext, CommsDeviceManagerAPI commsDeviceManagerAPI) {
        super(reactApplicationContext);
        this.commsDeviceManagerAPI = commsDeviceManagerAPI;
        commsDeviceManagerAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsDeviceManagerSpec
    @ReactMethod
    public void callDevice(String str, String str2, String str3, String str4, String str5, Promise promise) {
        this.commsDeviceManagerAPI.callDevice(str, str2, str3, str4, str5, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsDeviceManagerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsDeviceManagerModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsDeviceManagerSpec
    @ReactMethod
    public void makeAllDevicesCall(String str, String str2, String str3, String str4, @Nullable String str5, Promise promise) {
        this.commsDeviceManagerAPI.makeAllDevicesCall(str, str2, str3, str4, str5, promise);
    }
}
