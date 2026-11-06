package com.dee.app.data.reactnative;

import com.dee.app.data.api.ElementLocalStorage;
import com.dee.app.data.reactnative.bridges.ElementLocalStorageModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ElementsDataLocalStorage extends ElementLocalStorageModule {
    public static final int VERSION_NUMBER = 1;

    public ElementsDataLocalStorage(ReactApplicationContext reactApplicationContext, ElementLocalStorage elementLocalStorage) {
        super(reactApplicationContext, elementLocalStorage, "NativeLocalStorage");
    }

    @Override // com.dee.app.data.reactnative.bridges.ElementLocalStorageModule
    @ReactMethod
    public void clear(String str, Promise promise) {
        super.clear(str, promise);
    }

    @Override // com.dee.app.data.reactnative.bridges.ElementLocalStorageModule
    @ReactMethod
    public void get(String str, ReadableMap readableMap, Promise promise) {
        super.get(str, readableMap, promise);
    }

    @Override // com.dee.app.data.reactnative.bridges.ElementLocalStorageModule
    @ReactMethod
    public void put(String str, String str2, ReadableMap readableMap, Promise promise) {
        super.put(str, str2, readableMap, promise);
    }

    @Override // com.dee.app.data.reactnative.bridges.ElementLocalStorageModule
    @ReactMethod
    public void remove(String str, Promise promise) {
        super.remove(str, promise);
    }
}
