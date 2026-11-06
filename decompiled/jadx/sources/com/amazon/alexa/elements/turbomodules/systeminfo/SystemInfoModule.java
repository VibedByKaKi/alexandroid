package com.amazon.alexa.elements.turbomodules.systeminfo;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "SystemInfoModule")
/* loaded from: classes17.dex */
public class SystemInfoModule extends NativeSystemInfoSpec {
    public static final String NAME = "SystemInfoModule";
    private final SystemInfoAPI systemInfoAPI;

    public SystemInfoModule(ReactApplicationContext reactApplicationContext, SystemInfoAPI systemInfoAPI) {
        super(reactApplicationContext);
        this.systemInfoAPI = systemInfoAPI;
        systemInfoAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void addListener(String str) {
        this.systemInfoAPI.addListener(str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void connectToBTClassic(String str, String str2, Promise promise) {
        this.systemInfoAPI.connectToBTClassic(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void getAvailableMapApps(Promise promise) {
        this.systemInfoAPI.getAvailableMapApps(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void getBluetoothPermission(Promise promise) {
        this.systemInfoAPI.getBluetoothPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void getBluetoothStatus(Promise promise) {
        this.systemInfoAPI.getBluetoothStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void getIsiOSVersionAtLeast(String str, String str2, Promise promise) {
        this.systemInfoAPI.getIsiOSVersionAtLeast(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "SystemInfoModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    public Map<String, Object> getTypedExportedConstants() {
        return this.systemInfoAPI.getConstants();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void navigateToBluetoothSettings(Promise promise) {
        this.systemInfoAPI.navigateToBluetoothSettings(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void pauseTestSound(Promise promise) {
        this.systemInfoAPI.pauseTestSound(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void playTestSound(Promise promise) {
        this.systemInfoAPI.playTestSound(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void removeListeners(double d) {
        this.systemInfoAPI.removeListeners(d);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void setDefaultLatency(double d, Promise promise) {
        this.systemInfoAPI.setDefaultLatency(d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void setTestSoundLooping(boolean z) {
        this.systemInfoAPI.setTestSoundLooping(z);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void showBluetoothAccessoryPicker(String str, Promise promise) {
        this.systemInfoAPI.showBluetoothAccessoryPicker(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void showBluetoothAccessoryPickerForResult(String str, Promise promise) {
        this.systemInfoAPI.showBluetoothAccessoryPickerForResult(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void startCalibration(Promise promise) {
        this.systemInfoAPI.startCalibration(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemInfoSpec
    @ReactMethod
    public void stopCalibration(Promise promise) {
        this.systemInfoAPI.stopCalibration(promise);
    }
}
