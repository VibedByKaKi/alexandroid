package com.amazon.alexa.elements.turbomodules.cache;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeElementsDataCacheSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsDataCache")
/* loaded from: classes17.dex */
public class ElementsDataCacheModule extends NativeElementsDataCacheSpec {
    public static final String NAME = "ElementsDataCache";
    private ElementsDataCacheAPI elementsDataCacheAPI;

    public ElementsDataCacheModule(ReactApplicationContext reactApplicationContext, ElementsDataCacheAPI elementsDataCacheAPI) {
        super(reactApplicationContext);
        this.elementsDataCacheAPI = elementsDataCacheAPI;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsDataCacheSpec
    @ReactMethod
    public void clear(@Nullable String str, Promise promise) {
        this.elementsDataCacheAPI.clear(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsDataCacheSpec
    @ReactMethod
    public void get(String str, ReadableMap readableMap, Promise promise) {
        this.elementsDataCacheAPI.get(str, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsDataCacheSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsDataCache";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsDataCacheSpec
    @ReactMethod
    public void put(String str, String str2, ReadableMap readableMap, Promise promise) {
        this.elementsDataCacheAPI.put(str, str2, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsDataCacheSpec
    @ReactMethod
    public void remove(String str, Promise promise) {
        this.elementsDataCacheAPI.remove(str, promise);
    }
}
