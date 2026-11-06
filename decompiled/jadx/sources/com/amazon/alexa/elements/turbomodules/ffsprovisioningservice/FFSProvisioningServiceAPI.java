package com.amazon.alexa.elements.turbomodules.ffsprovisioningservice;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface FFSProvisioningServiceAPI {
    void chooseDevice(String str, String str2);

    void deviceNetworkDebugTunnel(double d, double d2, String str);

    void discoverDevices();

    void getCustomerProvisioneesSetupStatus();

    void provisionDevice(String str, String str2, String str3, boolean z);

    void provisionDeviceV2(ReadableMap readableMap);

    void refreshAvailableNetworks();

    void setAutoDiscovery(String str, String str2, Promise promise);

    void setBarcodeData(String str, Promise promise);

    void setDeviceFilter(String str, Promise promise);

    void setLumaDiscovery(String str, Promise promise);

    void setProductFilter(String str, Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void startAutoDiscovery();

    void stopAutoDiscovery();

    void terminateSetup();

    default void requestDeviceCellularIds() {
    }

    default void requestEsimStatus() {
    }

    default void setEsimActivationCode(String str, String str2) {
    }
}
