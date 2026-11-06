package com.amazon.alexa.elements.turbomodules.menusettingsturbomodule;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeMenuSettingsModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "MenuSettingsTurboModule")
/* loaded from: classes17.dex */
public class MenuSettingsTurboModule extends NativeMenuSettingsModuleSpec {
    public static final String NAME = "MenuSettingsTurboModule";
    private final MenuSettingsTurboModuleAPI menuSettingsTurboModuleAPI;

    public MenuSettingsTurboModule(ReactApplicationContext reactApplicationContext, MenuSettingsTurboModuleAPI menuSettingsTurboModuleAPI) {
        super(reactApplicationContext);
        this.menuSettingsTurboModuleAPI = menuSettingsTurboModuleAPI;
        menuSettingsTurboModuleAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeMenuSettingsModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "MenuSettingsTurboModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeMenuSettingsModuleSpec
    @ReactMethod
    public void removeBadgeForMenuItem(ReadableMap readableMap, Promise promise) {
        this.menuSettingsTurboModuleAPI.removeBadgeForMenuItem(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeMenuSettingsModuleSpec
    @ReactMethod
    public void setBadgeForMenuItem(ReadableMap readableMap, Promise promise) {
        this.menuSettingsTurboModuleAPI.setBadgeForMenuItem(readableMap, promise);
    }
}
