package com.amazon.alexa.elements.turbomodules.commscallingmanager;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CommsCallingManagerAPI {
    void makeDropInCall(ReadableMap readableMap, String str, String str2, boolean z, String str3, @Nullable String str4, Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void showEndCallScreenOnError(ReadableMap readableMap, String str, String str2, String str3, @Nullable String str4, Promise promise);
}
