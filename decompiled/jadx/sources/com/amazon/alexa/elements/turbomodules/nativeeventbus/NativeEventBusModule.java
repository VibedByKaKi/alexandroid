package com.amazon.alexa.elements.turbomodules.nativeeventbus;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeNativeEventBusSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "NativeEventBusModule")
/* loaded from: classes17.dex */
public class NativeEventBusModule extends NativeNativeEventBusSpec {
    public static final String NAME = "NativeEventBusModule";
    private final NativeEventBusAPI nativeEventBusAPI;

    public NativeEventBusModule(ReactApplicationContext reactApplicationContext, NativeEventBusAPI nativeEventBusAPI) {
        super(reactApplicationContext);
        this.nativeEventBusAPI = nativeEventBusAPI;
        nativeEventBusAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeEventBusSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "NativeEventBusModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeEventBusSpec
    @ReactMethod
    public void getTCommStatus(Promise promise) {
        this.nativeEventBusAPI.getTCommStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeEventBusSpec
    @ReactMethod
    public void publish(ReadableMap readableMap, Promise promise) {
        this.nativeEventBusAPI.publish(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeEventBusSpec
    @ReactMethod
    public void subscribe(String str, Promise promise) {
        this.nativeEventBusAPI.subscribe(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeEventBusSpec
    @ReactMethod
    public void unsubscribe(String str, Promise promise) {
        this.nativeEventBusAPI.unsubscribe(str, promise);
    }
}
