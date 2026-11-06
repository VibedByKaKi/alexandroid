package com.amazon.alexa.elements.turbomodules.devicestateservice;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface DeviceStateServiceAPI {
    void getBluetoothState(Promise promise);

    void getGPSLocationState(Promise promise);

    void getInternetState(Promise promise);

    void getNotificationState(Promise promise);

    void requestBluetoothEnable(Promise promise);

    void requestBluetoothEnablePhoneId(Promise promise);

    void requestGPSLocationEnable(Promise promise);

    void requestInternetEnable(Promise promise);

    void requestNotificationEnable(Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);
}
