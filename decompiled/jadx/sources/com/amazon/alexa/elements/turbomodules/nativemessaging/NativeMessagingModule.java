package com.amazon.alexa.elements.turbomodules.nativemessaging;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeNativeMessagingSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "NativeMessagingModule")
/* loaded from: classes17.dex */
public class NativeMessagingModule extends NativeNativeMessagingSpec {
    public static final String NAME = "NativeMessagingModule";
    private final NativeMessagingAPI nativeMessagingAPI;

    public NativeMessagingModule(ReactApplicationContext reactApplicationContext, NativeMessagingAPI nativeMessagingAPI) {
        super(reactApplicationContext);
        this.nativeMessagingAPI = nativeMessagingAPI;
        nativeMessagingAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeMessagingSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "NativeMessagingModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeMessagingSpec
    @ReactMethod
    public void send(ReadableMap readableMap, Promise promise) {
        this.nativeMessagingAPI.send(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeMessagingSpec
    @ReactMethod
    public void updateMessagingController(Promise promise) {
        this.nativeMessagingAPI.updateMessagingController(promise);
    }
}
