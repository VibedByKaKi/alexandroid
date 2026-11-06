package com.amazon.alexa.elements.turbomodules.keystore;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeKeystoreManagerSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "KeystoreManager")
/* loaded from: classes17.dex */
public class KeystoreManagerNativeModule extends NativeKeystoreManagerSpec {
    public static final String NAME = "KeystoreManager";
    private KeystoreManagerAPI keystoreManagerAPI;

    public KeystoreManagerNativeModule(ReactApplicationContext reactApplicationContext, KeystoreManagerAPI keystoreManagerAPI) {
        super(reactApplicationContext);
        this.keystoreManagerAPI = keystoreManagerAPI;
        keystoreManagerAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeKeystoreManagerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "KeystoreManager";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeKeystoreManagerSpec
    @ReactMethod
    public void handleKeystoreOperation(@NonNull String str, @NonNull String str2, @NonNull Promise promise) {
        this.keystoreManagerAPI.handleKeystoreOperation(str, str2, promise);
    }
}
