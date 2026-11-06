package com.amazon.alexa.elements.turbomodules.commscvf;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CommsCvfAPI {
    default void installOtpBridge(Promise promise) {
        promise.resolve(Boolean.FALSE);
    }

    void installPhoneNumberBridge(Promise promise);

    void invalidate();

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);
}
