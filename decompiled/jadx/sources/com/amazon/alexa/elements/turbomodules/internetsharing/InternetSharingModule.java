package com.amazon.alexa.elements.turbomodules.internetsharing;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeInternetSharingSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "InternetSharingModule")
/* loaded from: classes17.dex */
public class InternetSharingModule extends NativeInternetSharingSpec {
    public static final String NAME = "InternetSharingModule";
    private final InternetSharingAPI api;

    public InternetSharingModule(ReactApplicationContext reactApplicationContext, InternetSharingAPI internetSharingAPI) {
        super(reactApplicationContext);
        this.api = internetSharingAPI;
        internetSharingAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeInternetSharingSpec
    @ReactMethod
    public void addListener(String str) {
        this.api.addListener(str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeInternetSharingSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "InternetSharingModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeInternetSharingSpec
    @ReactMethod
    public void getState(Promise promise) {
        this.api.getState(promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.api.initialize(getReactApplicationContext());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.api.invalidate();
        super.invalidate();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeInternetSharingSpec
    @ReactMethod
    public void isNanAvailable(Promise promise) {
        this.api.isNanAvailable(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeInternetSharingSpec
    @ReactMethod
    public void removeListeners(double d) {
        this.api.removeListeners(d);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeInternetSharingSpec
    @ReactMethod
    public void startSharing(String str, String str2, String str3, Promise promise) {
        this.api.startSharing(str, str2, str3, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeInternetSharingSpec
    @ReactMethod
    public void stopSharing(Promise promise) {
        this.api.stopSharing(promise);
    }
}
