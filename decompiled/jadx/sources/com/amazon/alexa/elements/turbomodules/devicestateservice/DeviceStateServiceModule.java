package com.amazon.alexa.elements.turbomodules.devicestateservice;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeDeviceStateServiceSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "DeviceStateServiceModule")
/* loaded from: classes17.dex */
public class DeviceStateServiceModule extends NativeDeviceStateServiceSpec {
    public static final String NAME = "DeviceStateServiceModule";
    private final DeviceStateServiceAPI deviceStateServiceAPI;

    public DeviceStateServiceModule(ReactApplicationContext reactApplicationContext, DeviceStateServiceAPI deviceStateServiceAPI) {
        super(reactApplicationContext);
        this.deviceStateServiceAPI = deviceStateServiceAPI;
        deviceStateServiceAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceStateServiceSpec
    @ReactMethod
    public void getBluetoothState(Promise promise) {
        this.deviceStateServiceAPI.getBluetoothState(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceStateServiceSpec
    @ReactMethod
    public void getGPSLocationState(Promise promise) {
        this.deviceStateServiceAPI.getGPSLocationState(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceStateServiceSpec
    @ReactMethod
    public void getInternetState(Promise promise) {
        this.deviceStateServiceAPI.getInternetState(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceStateServiceSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "DeviceStateServiceModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceStateServiceSpec
    @ReactMethod
    public void getNotificationState(Promise promise) {
        this.deviceStateServiceAPI.getNotificationState(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceStateServiceSpec
    @ReactMethod
    public void requestBluetoothEnable(Promise promise) {
        this.deviceStateServiceAPI.requestBluetoothEnable(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceStateServiceSpec
    @ReactMethod
    public void requestBluetoothEnablePhoneId(Promise promise) {
        this.deviceStateServiceAPI.requestBluetoothEnablePhoneId(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceStateServiceSpec
    @ReactMethod
    public void requestGPSLocationEnable(Promise promise) {
        this.deviceStateServiceAPI.requestGPSLocationEnable(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceStateServiceSpec
    @ReactMethod
    public void requestInternetEnable(Promise promise) {
        this.deviceStateServiceAPI.requestInternetEnable(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceStateServiceSpec
    @ReactMethod
    public void requestNotificationEnable(Promise promise) {
        this.deviceStateServiceAPI.requestNotificationEnable(promise);
    }
}
