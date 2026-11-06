package com.amazon.alexa.elements.turbomodules.commsrouting;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsRoutingSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsRoutingModule")
/* loaded from: classes17.dex */
public class CommsRoutingModule extends NativeCommsRoutingSpec {
    public static final String NAME = "CommsRoutingModule";
    private final CommsRoutingAPI commsRoutingAPI;

    public CommsRoutingModule(ReactApplicationContext reactApplicationContext, CommsRoutingAPI commsRoutingAPI) {
        super(reactApplicationContext);
        this.commsRoutingAPI = commsRoutingAPI;
        commsRoutingAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsRoutingSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsRoutingModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsRoutingSpec
    @ReactMethod
    public void route(String str, ReadableMap readableMap, Promise promise) {
        this.commsRoutingAPI.route(str, readableMap, promise);
    }
}
