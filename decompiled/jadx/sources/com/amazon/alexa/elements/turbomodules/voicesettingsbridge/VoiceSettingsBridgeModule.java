package com.amazon.alexa.elements.turbomodules.voicesettingsbridge;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeVoiceSettingsBridgeSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "VoiceSettingsBridgeModule")
/* loaded from: classes17.dex */
public class VoiceSettingsBridgeModule extends NativeVoiceSettingsBridgeSpec {
    public static final String NAME = "VoiceSettingsBridgeModule";
    private final VoiceSettingsBridgeAPI voiceSettingsBridgeAPI;

    public VoiceSettingsBridgeModule(ReactApplicationContext reactApplicationContext, VoiceSettingsBridgeAPI voiceSettingsBridgeAPI) {
        super(reactApplicationContext);
        this.voiceSettingsBridgeAPI = voiceSettingsBridgeAPI;
        voiceSettingsBridgeAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeVoiceSettingsBridgeSpec
    @ReactMethod
    public void getHandsfreeSettingsInfo(Promise promise) {
        this.voiceSettingsBridgeAPI.getHandsfreeSettingsInfo(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeVoiceSettingsBridgeSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "VoiceSettingsBridgeModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeVoiceSettingsBridgeSpec
    @ReactMethod
    public void getNavigationApps(Promise promise) {
        this.voiceSettingsBridgeAPI.getNavigationApps(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeVoiceSettingsBridgeSpec
    @ReactMethod
    public void hasMinimumPermission(Promise promise) {
        this.voiceSettingsBridgeAPI.hasMinimumPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeVoiceSettingsBridgeSpec
    @ReactMethod
    public void isHandsfreeSupported(Promise promise) {
        this.voiceSettingsBridgeAPI.isHandsfreeSupported(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeVoiceSettingsBridgeSpec
    @ReactMethod
    public void isVoiceAllowed(Promise promise) {
        this.voiceSettingsBridgeAPI.isVoiceAllowed(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeVoiceSettingsBridgeSpec
    @ReactMethod
    public void setHandsfreeSettingsEnabled(boolean z, Promise promise) {
        this.voiceSettingsBridgeAPI.setHandsfreeSettingsEnabled(z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeVoiceSettingsBridgeSpec
    @ReactMethod
    public void setNavigationApp(String str, Promise promise) {
        this.voiceSettingsBridgeAPI.setNavigationApp(str, promise);
    }
}
