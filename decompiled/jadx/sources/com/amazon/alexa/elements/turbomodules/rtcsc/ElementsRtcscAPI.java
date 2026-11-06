package com.amazon.alexa.elements.turbomodules.rtcsc;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ElementsRtcscAPI {
    void acceptSession(String str, Promise promise);

    void disconnectSession(String str, String str2, Promise promise);

    void registerAppClientListener(String str, Promise promise);

    void registerDataChannelListener(String str, Promise promise);

    void sendData(String str, String str2, byte[] bArr, boolean z, Promise promise);

    void setLocalVideoState(String str, boolean z, Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void signalReadyForSession(String str, String str2, String str3, Promise promise);

    void unregisterDataChannelListener(String str, Promise promise);
}
