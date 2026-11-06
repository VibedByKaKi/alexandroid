package com.amazon.alexa.elements.turbomodules.biometrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeBiometricsSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "Biometrics")
/* loaded from: classes17.dex */
public class BiometricsModule extends NativeBiometricsSpec {
    public static final String NAME = "Biometrics";
    private final BiometricsAPI biometricsAPI;

    public BiometricsModule(ReactApplicationContext reactApplicationContext, BiometricsAPI biometricsAPI) {
        super(reactApplicationContext);
        this.biometricsAPI = biometricsAPI;
        biometricsAPI.setContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBiometricsSpec
    @ReactMethod
    public void authenticateWithOptions(String str, String str2, Boolean bool, Promise promise) {
        this.biometricsAPI.authenticateWithOptions(str, str2, bool, promise, getCurrentActivity());
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBiometricsSpec
    @ReactMethod
    public void canAuthenticate(Boolean bool, Promise promise) {
        this.biometricsAPI.canAuthenticate(bool, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBiometricsSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "Biometrics";
    }
}
