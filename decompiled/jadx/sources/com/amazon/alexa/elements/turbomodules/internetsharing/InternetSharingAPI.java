package com.amazon.alexa.elements.turbomodules.internetsharing;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface InternetSharingAPI {
    void addListener(String str);

    void getState(Promise promise);

    void initialize(ReactApplicationContext reactApplicationContext);

    void invalidate();

    void isNanAvailable(Promise promise);

    void removeListeners(double d);

    void setReactContext(ReactApplicationContext reactApplicationContext);

    void startSharing(String str, String str2, String str3, Promise promise);

    void stopSharing(Promise promise);
}
