package com.amazon.alexa.elements.turbomodules.keystore;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface KeystoreManagerAPI {
    default void handleKeystoreOperation(@NonNull String str, @NonNull String str2, @NonNull Promise promise) {
        promise.resolve(null);
    }

    void setReactContext(@NonNull ReactApplicationContext reactApplicationContext);
}
