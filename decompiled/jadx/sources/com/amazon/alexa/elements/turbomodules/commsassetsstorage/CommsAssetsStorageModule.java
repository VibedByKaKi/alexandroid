package com.amazon.alexa.elements.turbomodules.commsassetsstorage;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsAssetsStorageSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsAssetsStorageModule")
/* loaded from: classes17.dex */
public class CommsAssetsStorageModule extends NativeCommsAssetsStorageSpec {
    public static final String NAME = "CommsAssetsStorageModule";
    private final CommsAssetsStorageAPI commsAssetsStorageAPI;

    public CommsAssetsStorageModule(ReactApplicationContext reactApplicationContext, CommsAssetsStorageAPI commsAssetsStorageAPI) {
        super(reactApplicationContext);
        this.commsAssetsStorageAPI = commsAssetsStorageAPI;
        commsAssetsStorageAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsAssetsStorageSpec
    @ReactMethod
    public void getImageByName(String str, Promise promise) {
        this.commsAssetsStorageAPI.getImageByName(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsAssetsStorageSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsAssetsStorageModule";
    }
}
