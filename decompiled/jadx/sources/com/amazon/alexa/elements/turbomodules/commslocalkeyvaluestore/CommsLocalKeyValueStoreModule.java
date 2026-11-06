package com.amazon.alexa.elements.turbomodules.commslocalkeyvaluestore;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsLocalKeyValueStoreSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsLocalKeyValueStoreModule")
/* loaded from: classes17.dex */
public class CommsLocalKeyValueStoreModule extends NativeCommsLocalKeyValueStoreSpec {
    public static final String NAME = "CommsLocalKeyValueStoreModule";
    private final CommsLocalKeyValueStoreAPI commsLocalKeyValueStoreAPI;

    public CommsLocalKeyValueStoreModule(ReactApplicationContext reactApplicationContext, CommsLocalKeyValueStoreAPI commsLocalKeyValueStoreAPI) {
        super(reactApplicationContext);
        this.commsLocalKeyValueStoreAPI = commsLocalKeyValueStoreAPI;
        commsLocalKeyValueStoreAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalKeyValueStoreSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsLocalKeyValueStoreModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalKeyValueStoreSpec
    @ReactMethod
    public void getValue(String str, Promise promise) {
        this.commsLocalKeyValueStoreAPI.getValue(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalKeyValueStoreSpec
    @ReactMethod
    public void getValues(ReadableArray readableArray, Promise promise) {
        this.commsLocalKeyValueStoreAPI.getValues(readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalKeyValueStoreSpec
    @ReactMethod
    public void setBooleanValue(String str, boolean z, Promise promise) {
        this.commsLocalKeyValueStoreAPI.setBooleanValue(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalKeyValueStoreSpec
    @ReactMethod
    public void setStringValue(String str, String str2, Promise promise) {
        this.commsLocalKeyValueStoreAPI.setStringValue(str, str2, promise);
    }
}
