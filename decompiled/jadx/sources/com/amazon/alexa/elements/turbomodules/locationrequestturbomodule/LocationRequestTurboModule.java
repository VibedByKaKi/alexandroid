package com.amazon.alexa.elements.turbomodules.locationrequestturbomodule;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeLocationRequestModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "LocationRequestTurboModule")
/* loaded from: classes17.dex */
public class LocationRequestTurboModule extends NativeLocationRequestModuleSpec {
    public static final String NAME = "LocationRequestTurboModule";
    private final LocationRequestTurboModuleAPI locationRequestTurboModuleAPI;

    public LocationRequestTurboModule(ReactApplicationContext reactApplicationContext, LocationRequestTurboModuleAPI locationRequestTurboModuleAPI) {
        super(reactApplicationContext);
        this.locationRequestTurboModuleAPI = locationRequestTurboModuleAPI;
        locationRequestTurboModuleAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLocationRequestModuleSpec
    @ReactMethod
    public void getMostRecentLocation(Promise promise) {
        this.locationRequestTurboModuleAPI.getMostRecentLocation(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLocationRequestModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "LocationRequestTurboModule";
    }
}
