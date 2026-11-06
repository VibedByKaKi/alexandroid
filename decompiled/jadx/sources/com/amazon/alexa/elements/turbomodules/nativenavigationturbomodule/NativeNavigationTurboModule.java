package com.amazon.alexa.elements.turbomodules.nativenavigationturbomodule;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeNativeNavigationModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "NativeNavigationTurboModule")
/* loaded from: classes17.dex */
public class NativeNavigationTurboModule extends NativeNativeNavigationModuleSpec {
    public static final String NAME = "NativeNavigationTurboModule";
    private final NativeNavigationTurboModuleAPI nativeNavigationTurboModuleAPI;

    public NativeNavigationTurboModule(ReactApplicationContext reactApplicationContext, NativeNavigationTurboModuleAPI nativeNavigationTurboModuleAPI) {
        super(reactApplicationContext);
        this.nativeNavigationTurboModuleAPI = nativeNavigationTurboModuleAPI;
        nativeNavigationTurboModuleAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeNavigationModuleSpec
    @ReactMethod
    public void addRoutes(ReadableArray readableArray, Promise promise) {
        this.nativeNavigationTurboModuleAPI.addRoutes(readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeNavigationModuleSpec
    @ReactMethod
    public void chromeOptions(ReadableMap readableMap) {
        this.nativeNavigationTurboModuleAPI.chromeOptions(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeNavigationModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "NativeNavigationTurboModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeNavigationModuleSpec
    @ReactMethod
    public void navigationState(Promise promise) {
        this.nativeNavigationTurboModuleAPI.navigationState(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeNavigationModuleSpec
    @ReactMethod
    public void routeBack(Promise promise) {
        this.nativeNavigationTurboModuleAPI.routeBack(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeNavigationModuleSpec
    @ReactMethod
    public void routeNotify(ReadableMap readableMap) {
        this.nativeNavigationTurboModuleAPI.routeNotify(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeNavigationModuleSpec
    @ReactMethod
    public void routeTo(ReadableMap readableMap, Promise promise) {
        this.nativeNavigationTurboModuleAPI.routeTo(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeNavigationModuleSpec
    @ReactMethod
    public void setRouteState(String str, ReadableMap readableMap, Promise promise) {
        this.nativeNavigationTurboModuleAPI.setRouteState(str, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeNavigationModuleSpec
    @ReactMethod
    public void unregisterRoute(String str, Promise promise) {
        this.nativeNavigationTurboModuleAPI.unregisterRoute(str, promise);
    }
}
