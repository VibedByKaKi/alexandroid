package com.dee.app.data.reactnative.bridges;

import androidx.annotation.Nullable;
import com.dee.app.data.api.ElementLocalStorage;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ElementLocalStorageModule extends ReactContextBaseJavaModule {
    private ElementLocalStorageDelegate delegate;
    private String moduleName;

    public ElementLocalStorageModule(ReactApplicationContext reactApplicationContext, ElementLocalStorage elementLocalStorage, String str) {
        super(reactApplicationContext);
        this.moduleName = str;
        this.delegate = new ElementLocalStorageDelegate(elementLocalStorage);
    }

    @ReactMethod
    public void clear(String str, Promise promise) {
        this.delegate.clear(str, promise);
    }

    @ReactMethod
    public void get(String str, ReadableMap readableMap, Promise promise) {
        this.delegate.get(str, readableMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        return this.delegate.getConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.moduleName;
    }

    @ReactMethod
    public void put(String str, String str2, ReadableMap readableMap, Promise promise) {
        this.delegate.put(str, str2, readableMap, promise);
    }

    @ReactMethod
    public void remove(String str, Promise promise) {
        this.delegate.remove(str, promise);
    }
}
