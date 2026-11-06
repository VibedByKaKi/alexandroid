package com.amazon.alexa.elements.turbomodules.locationrecoverymodule;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeLocationRecoveryModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "LocationRecoveryTurboModule")
/* loaded from: classes17.dex */
public class LocationRecoveryTurboModule extends NativeLocationRecoveryModuleSpec {
    public static final String NAME = "LocationRecoveryTurboModule";
    private final LocationRecoveryTurboModuleAPI locationRecoveryTurboModuleAPI;

    public LocationRecoveryTurboModule(ReactApplicationContext reactApplicationContext, LocationRecoveryTurboModuleAPI locationRecoveryTurboModuleAPI) {
        super(reactApplicationContext);
        this.locationRecoveryTurboModuleAPI = locationRecoveryTurboModuleAPI;
        locationRecoveryTurboModuleAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLocationRecoveryModuleSpec
    @ReactMethod
    public void getLocationFacts(Promise promise) {
        this.locationRecoveryTurboModuleAPI.getLocationFacts(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLocationRecoveryModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "LocationRecoveryTurboModule";
    }
}
