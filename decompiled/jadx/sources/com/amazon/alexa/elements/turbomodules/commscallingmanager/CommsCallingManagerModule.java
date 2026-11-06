package com.amazon.alexa.elements.turbomodules.commscallingmanager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.elements.turbomodules.NativeCommsCallingManagerSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsCallingManagerModule")
/* loaded from: classes17.dex */
public class CommsCallingManagerModule extends NativeCommsCallingManagerSpec {
    public static final String NAME = "CommsCallingManagerModule";
    private final CommsCallingManagerAPI commsCallingManagerAPI;

    public CommsCallingManagerModule(ReactApplicationContext reactApplicationContext, CommsCallingManagerAPI commsCallingManagerAPI) {
        super(reactApplicationContext);
        this.commsCallingManagerAPI = commsCallingManagerAPI;
        commsCallingManagerAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsCallingManagerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsCallingManagerModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsCallingManagerSpec
    @ReactMethod
    public void makeDropInCall(ReadableMap readableMap, String str, String str2, boolean z, String str3, @Nullable String str4, Promise promise) {
        this.commsCallingManagerAPI.makeDropInCall(readableMap, str, str2, z, str3, str4, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsCallingManagerSpec
    @ReactMethod
    public void showEndCallScreenOnError(ReadableMap readableMap, String str, String str2, String str3, @Nullable String str4, Promise promise) {
        this.commsCallingManagerAPI.showEndCallScreenOnError(readableMap, str, str2, str3, str4, promise);
    }
}
