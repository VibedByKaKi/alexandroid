package com.amazon.alexa.elements.turbomodules.ffsprovisioningservice;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "FFSProvisioningServiceModule")
/* loaded from: classes17.dex */
public class FFSProvisioningServiceModule extends NativeFFSProvisioningServiceSpec {
    public static final String NAME = "FFSProvisioningServiceModule";
    private final FFSProvisioningServiceAPI fFSProvisioningServiceAPI;

    public FFSProvisioningServiceModule(ReactApplicationContext reactApplicationContext, FFSProvisioningServiceAPI fFSProvisioningServiceAPI) {
        super(reactApplicationContext);
        this.fFSProvisioningServiceAPI = fFSProvisioningServiceAPI;
        fFSProvisioningServiceAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void chooseDevice(String str, String str2) {
        this.fFSProvisioningServiceAPI.chooseDevice(str, str2);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void deviceNetworkDebugTunnel(double d, double d2, String str) {
        this.fFSProvisioningServiceAPI.deviceNetworkDebugTunnel(d, d2, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void discoverDevices() {
        this.fFSProvisioningServiceAPI.discoverDevices();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void getCustomerProvisioneesSetupStatus() {
        this.fFSProvisioningServiceAPI.getCustomerProvisioneesSetupStatus();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "FFSProvisioningServiceModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void provisionDevice(String str, String str2, String str3, boolean z) {
        this.fFSProvisioningServiceAPI.provisionDevice(str, str2, str3, z);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void provisionDeviceV2(ReadableMap readableMap) {
        this.fFSProvisioningServiceAPI.provisionDeviceV2(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void refreshAvailableNetworks() {
        this.fFSProvisioningServiceAPI.refreshAvailableNetworks();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void requestDeviceCellularIds() {
        this.fFSProvisioningServiceAPI.requestDeviceCellularIds();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void requestEsimStatus() {
        this.fFSProvisioningServiceAPI.requestEsimStatus();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void setAutoDiscovery(String str, String str2, Promise promise) {
        this.fFSProvisioningServiceAPI.setAutoDiscovery(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void setBarcodeData(String str, Promise promise) {
        this.fFSProvisioningServiceAPI.setBarcodeData(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void setDeviceFilter(String str, Promise promise) {
        this.fFSProvisioningServiceAPI.setDeviceFilter(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void setEsimActivationCode(String str, String str2) {
        this.fFSProvisioningServiceAPI.setEsimActivationCode(str, str2);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void setLumaDiscovery(String str, Promise promise) {
        this.fFSProvisioningServiceAPI.setLumaDiscovery(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void setProductFilter(String str, Promise promise) {
        this.fFSProvisioningServiceAPI.setProductFilter(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void startAutoDiscovery() {
        this.fFSProvisioningServiceAPI.startAutoDiscovery();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void stopAutoDiscovery() {
        this.fFSProvisioningServiceAPI.stopAutoDiscovery();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeFFSProvisioningServiceSpec
    @ReactMethod
    public void terminateSetup() {
        this.fFSProvisioningServiceAPI.terminateSetup();
    }
}
