package com.amazon.alexa.elements.turbomodules.deviceinformation;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface DeviceInformationAPI {
    void get(Promise promise);

    Map<String, Object> getConstants();

    void getDeviceInfo(Promise promise);

    void getDevicePartnerInfo(Promise promise);

    void navigateToAlexaSettingOnFireOS(Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);
}
