package com.amazon.alexa.elements.turbomodules.pinghandler;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativePingHandlerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "PingHandlerModule")
/* loaded from: classes17.dex */
public class PingHandlerModule extends NativePingHandlerSpec {
    public static final String NAME = "PingHandlerModule";
    private final PingHandlerAPI pingHandlerAPI;

    public PingHandlerModule(ReactApplicationContext reactApplicationContext, PingHandlerAPI pingHandlerAPI) {
        super(reactApplicationContext);
        this.pingHandlerAPI = pingHandlerAPI;
        pingHandlerAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePingHandlerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "PingHandlerModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePingHandlerSpec
    @ReactMethod
    public void ping(ReadableMap readableMap) {
        this.pingHandlerAPI.ping(readableMap);
    }
}
