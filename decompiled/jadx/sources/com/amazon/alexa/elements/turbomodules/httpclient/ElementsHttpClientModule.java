package com.amazon.alexa.elements.turbomodules.httpclient;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeElementsHttpClientSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsHttpClient")
/* loaded from: classes17.dex */
public class ElementsHttpClientModule extends NativeElementsHttpClientSpec {
    public static final String NAME = "ElementsHttpClient";
    private ElementsHttpClientAPI elementsHttpClientAPI;

    public ElementsHttpClientModule(ReactApplicationContext reactApplicationContext, ElementsHttpClientAPI elementsHttpClientAPI) {
        super(reactApplicationContext);
        this.elementsHttpClientAPI = elementsHttpClientAPI;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsHttpClientSpec
    @ReactMethod
    public void getAsStream(String str, ReadableMap readableMap, Promise promise) {
        try {
            this.elementsHttpClientAPI.getAsStream(str, readableMap, (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class));
            promise.resolve(null);
        } catch (IOException e) {
            promise.reject(e);
        }
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsHttpClientSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsHttpClient";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsHttpClientSpec
    @ReactMethod
    public void request(String str, String str2, ReadableMap readableMap, Promise promise) {
        this.elementsHttpClientAPI.request(str, str2, readableMap, promise);
    }
}
