package com.amazon.alexa.elements.turbomodules.commsalexacommsdelegate;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsAlexaCommsDelegateSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsAlexaCommsDelegateModule")
/* loaded from: classes17.dex */
public class CommsAlexaCommsDelegateModule extends NativeCommsAlexaCommsDelegateSpec {
    public static final String NAME = "CommsAlexaCommsDelegateModule";
    private final CommsAlexaCommsDelegateAPI commsAlexaCommsDelegateAPI;

    public CommsAlexaCommsDelegateModule(ReactApplicationContext reactApplicationContext, CommsAlexaCommsDelegateAPI commsAlexaCommsDelegateAPI) {
        super(reactApplicationContext);
        this.commsAlexaCommsDelegateAPI = commsAlexaCommsDelegateAPI;
        commsAlexaCommsDelegateAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsAlexaCommsDelegateSpec
    @ReactMethod
    public void getCommsAllowed(Promise promise) {
        this.commsAlexaCommsDelegateAPI.getCommsAllowed(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsAlexaCommsDelegateSpec
    @ReactMethod
    public void getCommsEnabledToggle(Promise promise) {
        this.commsAlexaCommsDelegateAPI.getCommsEnabledToggle(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsAlexaCommsDelegateSpec
    @ReactMethod
    public void getDeviceSerialNumber(Promise promise) {
        this.commsAlexaCommsDelegateAPI.getDeviceSerialNumber(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsAlexaCommsDelegateSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsAlexaCommsDelegateModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsAlexaCommsDelegateSpec
    @ReactMethod
    public void getProvisionStatus(Promise promise) {
        this.commsAlexaCommsDelegateAPI.getProvisionStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsAlexaCommsDelegateSpec
    @ReactMethod
    public void identityUpdated(ReadableMap readableMap, Promise promise) {
        this.commsAlexaCommsDelegateAPI.identityUpdated(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsAlexaCommsDelegateSpec
    @ReactMethod
    public void setCommsEnabledToggle(boolean z, Promise promise) {
        this.commsAlexaCommsDelegateAPI.setCommsEnabledToggle(z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsAlexaCommsDelegateSpec
    @ReactMethod
    public void setReactNativeInitialized(Promise promise) {
        this.commsAlexaCommsDelegateAPI.setReactNativeInitialized(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsAlexaCommsDelegateSpec
    @ReactMethod
    public void shouldShowComms(Promise promise) {
        this.commsAlexaCommsDelegateAPI.shouldShowComms(promise);
    }
}
