package com.amazon.alexa.elements.turbomodules.commscvf;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsCvfSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsCvfModule")
/* loaded from: classes17.dex */
public class CommsCvfModule extends NativeCommsCvfSpec {
    public static final String NAME = "CommsCvfModule";
    private final CommsCvfAPI api;

    public CommsCvfModule(ReactApplicationContext reactApplicationContext, CommsCvfAPI commsCvfAPI) {
        super(reactApplicationContext);
        this.api = commsCvfAPI;
        commsCvfAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsCvfSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsCvfModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsCvfSpec
    @ReactMethod
    public void installOtpBridge(Promise promise) {
        this.api.installOtpBridge(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsCvfSpec
    @ReactMethod
    public void installPhoneNumberBridge(Promise promise) {
        this.api.installPhoneNumberBridge(promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.api.invalidate();
        super.invalidate();
    }
}
