package com.amazon.alexa.elements.turbomodules.storage;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeElementsLocalStorageSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsLocalStorage")
/* loaded from: classes17.dex */
public class ElementsLocalStorageModule extends NativeElementsLocalStorageSpec {
    public static final String NAME = "ElementsLocalStorage";
    private ElementsLocalStorageAPI elementsLocalStorageAPI;

    public ElementsLocalStorageModule(ReactApplicationContext reactApplicationContext, ElementsLocalStorageAPI elementsLocalStorageAPI) {
        super(reactApplicationContext);
        this.elementsLocalStorageAPI = elementsLocalStorageAPI;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsLocalStorageSpec
    @ReactMethod
    public void clear(@Nullable String str, Promise promise) {
        this.elementsLocalStorageAPI.clear(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsLocalStorageSpec
    @ReactMethod
    public void get(String str, ReadableMap readableMap, Promise promise) {
        this.elementsLocalStorageAPI.get(str, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsLocalStorageSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsLocalStorage";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsLocalStorageSpec
    @ReactMethod
    public void put(String str, String str2, ReadableMap readableMap, Promise promise) {
        this.elementsLocalStorageAPI.put(str, str2, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsLocalStorageSpec
    @ReactMethod
    public void remove(String str, Promise promise) {
        this.elementsLocalStorageAPI.remove(str, promise);
    }
}
