package com.amazon.alexa.elements.turbomodules.carrierconfigurationbridge;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCarrierConfigurationBridgeSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CarrierConfigurationBridgeModule")
/* loaded from: classes17.dex */
public class CarrierConfigurationBridgeModule extends NativeCarrierConfigurationBridgeSpec {
    public static final String NAME = "CarrierConfigurationBridgeModule";
    private final CarrierConfigurationBridgeAPI carrierConfigurationBridgeAPI;

    public CarrierConfigurationBridgeModule(ReactApplicationContext reactApplicationContext, CarrierConfigurationBridgeAPI carrierConfigurationBridgeAPI) {
        super(reactApplicationContext);
        this.carrierConfigurationBridgeAPI = carrierConfigurationBridgeAPI;
        carrierConfigurationBridgeAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCarrierConfigurationBridgeSpec
    @ReactMethod
    public void getIsoCountryCode(Promise promise) {
        this.carrierConfigurationBridgeAPI.getIsoCountryCode(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCarrierConfigurationBridgeSpec
    @ReactMethod
    public void getMobileCountryCode(Promise promise) {
        this.carrierConfigurationBridgeAPI.getMobileCountryCode(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCarrierConfigurationBridgeSpec
    @ReactMethod
    public void getMobileNetworkCode(Promise promise) {
        this.carrierConfigurationBridgeAPI.getMobileNetworkCode(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCarrierConfigurationBridgeSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CarrierConfigurationBridgeModule";
    }
}
