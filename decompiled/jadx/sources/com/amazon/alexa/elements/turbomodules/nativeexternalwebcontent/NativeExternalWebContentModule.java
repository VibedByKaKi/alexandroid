package com.amazon.alexa.elements.turbomodules.nativeexternalwebcontent;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeNativeExternalWebContentSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "NativeExternalWebContentModule")
/* loaded from: classes17.dex */
public class NativeExternalWebContentModule extends NativeNativeExternalWebContentSpec {
    public static final String NAME = "NativeExternalWebContentModule";
    private final NativeExternalWebContentAPI nativeExternalWebContentAPI;

    public NativeExternalWebContentModule(ReactApplicationContext reactApplicationContext, NativeExternalWebContentAPI nativeExternalWebContentAPI) {
        super(reactApplicationContext);
        this.nativeExternalWebContentAPI = nativeExternalWebContentAPI;
        nativeExternalWebContentAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeExternalWebContentSpec
    @ReactMethod
    public void closeExternalWebViews(Promise promise) {
        this.nativeExternalWebContentAPI.closeExternalWebViews(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeExternalWebContentSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "NativeExternalWebContentModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeExternalWebContentSpec
    @ReactMethod
    public void launchExternalURL(ReadableMap readableMap, Promise promise) {
        this.nativeExternalWebContentAPI.launchExternalURL(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNativeExternalWebContentSpec
    @ReactMethod
    public void launchThirdPartyURL(ReadableMap readableMap, Promise promise) {
        this.nativeExternalWebContentAPI.launchThirdPartyURL(readableMap, promise);
    }
}
