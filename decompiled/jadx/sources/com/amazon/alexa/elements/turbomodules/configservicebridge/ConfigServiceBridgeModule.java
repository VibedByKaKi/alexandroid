package com.amazon.alexa.elements.turbomodules.configservicebridge;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeConfigServiceBridgeSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ConfigServiceBridgeModule")
/* loaded from: classes17.dex */
public class ConfigServiceBridgeModule extends NativeConfigServiceBridgeSpec {
    public static final String NAME = "ConfigServiceBridgeModule";
    private final ConfigServiceBridgeAPI configServiceBridgeAPI;

    public ConfigServiceBridgeModule(ReactApplicationContext reactApplicationContext, ConfigServiceBridgeAPI configServiceBridgeAPI) {
        super(reactApplicationContext);
        this.configServiceBridgeAPI = configServiceBridgeAPI;
        configServiceBridgeAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeConfigServiceBridgeSpec
    @ReactMethod
    public void getConfig(String str, String str2, ReadableMap readableMap, Promise promise) {
        this.configServiceBridgeAPI.getConfig(str, str2, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeConfigServiceBridgeSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ConfigServiceBridgeModule";
    }
}
