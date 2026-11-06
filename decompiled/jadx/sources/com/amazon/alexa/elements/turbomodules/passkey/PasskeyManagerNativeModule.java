package com.amazon.alexa.elements.turbomodules.passkey;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativePasskeyManagerSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "PasskeyManager")
/* loaded from: classes17.dex */
public class PasskeyManagerNativeModule extends NativePasskeyManagerSpec {
    public static final String NAME = "PasskeyManager";
    private PasskeyManagerAPI passkeyManagerAPI;

    public PasskeyManagerNativeModule(ReactApplicationContext reactApplicationContext, PasskeyManagerAPI passkeyManagerAPI) {
        super(reactApplicationContext);
        this.passkeyManagerAPI = passkeyManagerAPI;
        passkeyManagerAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePasskeyManagerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "PasskeyManager";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePasskeyManagerSpec
    @ReactMethod
    public void handlePasskeyOperation(@NonNull String str, @NonNull String str2, @NonNull Promise promise) {
        this.passkeyManagerAPI.handlePasskeyOperation(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePasskeyManagerSpec
    @ReactMethod
    public void passkeyChallenge(@NonNull String str, @NonNull Promise promise) {
        this.passkeyManagerAPI.passkeyChallenge(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePasskeyManagerSpec
    @ReactMethod
    public void passkeyEnrollment(@NonNull String str, @NonNull Promise promise) {
        this.passkeyManagerAPI.passkeyEnrollment(str, promise);
    }
}
