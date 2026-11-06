package com.amazon.alexa.elements.turbomodules.logging;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ElementsLoggingAPI {
    Map<String, Object> getConstants();

    void log(String str, String str2);

    void processLatencyEvent(ReadableMap readableMap, Promise promise);
}
