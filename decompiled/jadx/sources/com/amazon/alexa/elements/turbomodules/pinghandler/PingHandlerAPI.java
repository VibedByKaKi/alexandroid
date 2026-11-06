package com.amazon.alexa.elements.turbomodules.pinghandler;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface PingHandlerAPI {
    void ping(ReadableMap readableMap);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);
}
