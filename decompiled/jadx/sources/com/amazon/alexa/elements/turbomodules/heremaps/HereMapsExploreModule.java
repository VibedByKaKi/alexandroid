package com.amazon.alexa.elements.turbomodules.heremaps;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeHereMapsExploreSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "HereMapsExplore")
/* loaded from: classes17.dex */
public class HereMapsExploreModule extends NativeHereMapsExploreSpec {
    public static final String NAME = "HereMapsExplore";
    private HereMapsExploreAPI hereMapsExploreAPI;

    public HereMapsExploreModule(ReactApplicationContext reactApplicationContext, HereMapsExploreAPI hereMapsExploreAPI) {
        super(reactApplicationContext);
        this.hereMapsExploreAPI = hereMapsExploreAPI;
        hereMapsExploreAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeHereMapsExploreSpec
    @ReactMethod
    public void coordinateForPoint(double d, ReadableMap readableMap, Promise promise) {
        this.hereMapsExploreAPI.coordinateForPoint(d, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeHereMapsExploreSpec
    @ReactMethod
    public void getCamera(double d, Promise promise) {
        this.hereMapsExploreAPI.getCamera(d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeHereMapsExploreSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "HereMapsExplore";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeHereMapsExploreSpec
    @ReactMethod
    public void getSafeAreaInsets(Promise promise) {
        this.hereMapsExploreAPI.getSafeAreaInsets(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeHereMapsExploreSpec
    @ReactMethod
    public void pointForCoordinate(double d, ReadableMap readableMap, Promise promise) {
        this.hereMapsExploreAPI.pointForCoordinate(d, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeHereMapsExploreSpec
    @ReactMethod
    public void setMapScheme(String str, Promise promise) {
        this.hereMapsExploreAPI.setMapScheme(str, promise);
    }
}
