package com.amazon.alexa.elements.turbomodules.deviceinformation;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeDeviceInformationSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "DeviceInformationModule")
/* loaded from: classes17.dex */
public class DeviceInformationModule extends NativeDeviceInformationSpec {
    public static final String NAME = "DeviceInformationModule";
    private final DeviceInformationAPI deviceInformationAPI;

    public DeviceInformationModule(ReactApplicationContext reactApplicationContext, DeviceInformationAPI deviceInformationAPI) {
        super(reactApplicationContext);
        this.deviceInformationAPI = deviceInformationAPI;
        deviceInformationAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceInformationSpec
    @ReactMethod
    public void get(Promise promise) {
        this.deviceInformationAPI.get(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceInformationSpec
    @ReactMethod
    public void getDeviceInfo(Promise promise) {
        this.deviceInformationAPI.getDeviceInfo(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceInformationSpec
    @ReactMethod
    public void getDevicePartnerInfo(Promise promise) {
        this.deviceInformationAPI.getDevicePartnerInfo(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceInformationSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "DeviceInformationModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceInformationSpec
    public Map<String, Object> getTypedExportedConstants() {
        return this.deviceInformationAPI.getConstants();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceInformationSpec
    @ReactMethod
    public void navigateToAlexaSettingOnFireOS(Promise promise) {
        this.deviceInformationAPI.navigateToAlexaSettingOnFireOS(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceInformationSpec
    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDeviceInformationSpec
    @ReactMethod
    public void removeListeners(double d) {
    }
}
