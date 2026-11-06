package com.amazon.alexa.elements.turbomodules.applanguage;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeAppLanguageModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "AppLanguageModule")
/* loaded from: classes17.dex */
public class AppLanguageModule extends NativeAppLanguageModuleSpec {
    public static final String NAME = "AppLanguageModule";
    private final AppLanguageModuleAPI api;

    public AppLanguageModule(ReactApplicationContext reactApplicationContext, AppLanguageModuleAPI appLanguageModuleAPI) {
        super(reactApplicationContext);
        this.api = appLanguageModuleAPI;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAppLanguageModuleSpec
    @ReactMethod
    public void getCurrentGuiLanguage(Promise promise) {
        this.api.getCurrentGuiLanguage(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAppLanguageModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "AppLanguageModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAppLanguageModuleSpec
    @ReactMethod
    public void setGuiLanguage(String str, Promise promise) {
        this.api.setGuiLanguage(str, promise);
    }
}
