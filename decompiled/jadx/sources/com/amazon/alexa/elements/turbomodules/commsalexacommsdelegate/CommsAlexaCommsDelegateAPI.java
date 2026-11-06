package com.amazon.alexa.elements.turbomodules.commsalexacommsdelegate;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CommsAlexaCommsDelegateAPI {
    void getCommsAllowed(Promise promise);

    void getCommsEnabledToggle(Promise promise);

    void getDeviceSerialNumber(Promise promise);

    void getProvisionStatus(Promise promise);

    void identityUpdated(ReadableMap readableMap, Promise promise);

    void setCommsEnabledToggle(boolean z, Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void setReactNativeInitialized(Promise promise);

    void shouldShowComms(Promise promise);
}
