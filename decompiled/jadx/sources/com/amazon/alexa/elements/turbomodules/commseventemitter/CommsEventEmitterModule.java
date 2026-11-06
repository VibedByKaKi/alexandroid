package com.amazon.alexa.elements.turbomodules.commseventemitter;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsEventEmitterSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsEventEmitterModule")
/* loaded from: classes17.dex */
public class CommsEventEmitterModule extends NativeCommsEventEmitterSpec {
    public static final String NAME = "CommsEventEmitterModule";
    private final CommsEventEmitterAPI commsEventEmitterAPI;

    public CommsEventEmitterModule(ReactApplicationContext reactApplicationContext, CommsEventEmitterAPI commsEventEmitterAPI) {
        super(reactApplicationContext);
        this.commsEventEmitterAPI = commsEventEmitterAPI;
        commsEventEmitterAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsEventEmitterSpec
    @ReactMethod
    public void addListener(String str) {
        this.commsEventEmitterAPI.addListener(str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsEventEmitterSpec
    @ReactMethod
    public void checkMapProfileConnection(String str) {
        this.commsEventEmitterAPI.checkMapProfileConnection(str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsEventEmitterSpec
    @ReactMethod
    public void getBluetoothAuthorizationStatus(Promise promise) {
        this.commsEventEmitterAPI.getBluetoothAuthorizationStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsEventEmitterSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsEventEmitterModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsEventEmitterSpec
    @ReactMethod
    public void isDeviceBonded(String str, Promise promise) {
        this.commsEventEmitterAPI.isDeviceBonded(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsEventEmitterSpec
    @ReactMethod
    public void removeListeners(double d) {
        this.commsEventEmitterAPI.removeListeners(d);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsEventEmitterSpec
    @ReactMethod
    public void startBluetoothDevicePairing(String str, String str2, Promise promise) {
        this.commsEventEmitterAPI.startBluetoothDevicePairing(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsEventEmitterSpec
    @ReactMethod
    public void startMapPermissionWatch(String str) {
        this.commsEventEmitterAPI.startMapPermissionWatch(str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsEventEmitterSpec
    @ReactMethod
    public void stopMapPermissionWatch() {
        this.commsEventEmitterAPI.stopMapPermissionWatch();
    }
}
