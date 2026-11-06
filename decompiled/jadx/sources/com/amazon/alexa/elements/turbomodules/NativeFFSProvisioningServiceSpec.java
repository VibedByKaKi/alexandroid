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
public abstract class NativeFFSProvisioningServiceSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FFSProvisioningServiceModule";

    public NativeFFSProvisioningServiceSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void chooseDevice(String str, String str2);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceNetworkDebugTunnel(double d, double d2, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void discoverDevices();

    @DoNotStrip
    @ReactMethod
    public abstract void getCustomerProvisioneesSetupStatus();

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "FFSProvisioningServiceModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void provisionDevice(String str, String str2, String str3, boolean z);

    @DoNotStrip
    @ReactMethod
    public abstract void provisionDeviceV2(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void refreshAvailableNetworks();

    @DoNotStrip
    @ReactMethod
    public abstract void requestDeviceCellularIds();

    @DoNotStrip
    @ReactMethod
    public abstract void requestEsimStatus();

    @DoNotStrip
    @ReactMethod
    public abstract void setAutoDiscovery(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setBarcodeData(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setDeviceFilter(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setEsimActivationCode(String str, String str2);

    @DoNotStrip
    @ReactMethod
    public abstract void setLumaDiscovery(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setProductFilter(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void startAutoDiscovery();

    @DoNotStrip
    @ReactMethod
    public abstract void stopAutoDiscovery();

    @DoNotStrip
    @ReactMethod
    public abstract void terminateSetup();
}
