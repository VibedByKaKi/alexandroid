package com.amazon.alexa.elements.turbomodules.commseventemitter;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CommsEventEmitterAPI {
    void addListener(String str);

    void checkMapProfileConnection(String str);

    void getBluetoothAuthorizationStatus(Promise promise);

    void isDeviceBonded(String str, Promise promise);

    void removeListeners(double d);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void startBluetoothDevicePairing(String str, String str2, Promise promise);

    void startMapPermissionWatch(String str);

    void stopMapPermissionWatch();
}
