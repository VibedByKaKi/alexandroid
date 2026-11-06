package com.amazon.alexa.elements.turbomodules.voicesettingsbridge;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.imagepicker.ImagePickerPackage$$ExternalSyntheticLambda0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoiceSettingsBridgePackage extends TurboReactPackage {
    private final VoiceSettingsBridgeAPI voiceSettingsBridgeAPI;

    public VoiceSettingsBridgePackage(VoiceSettingsBridgeAPI voiceSettingsBridgeAPI) {
        this.voiceSettingsBridgeAPI = voiceSettingsBridgeAPI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put("VoiceSettingsBridgeModule", new ReactModuleInfo("VoiceSettingsBridgeModule", "VoiceSettingsBridgeModule", false, false, false, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("VoiceSettingsBridgeModule")) {
            return new VoiceSettingsBridgeModule(reactApplicationContext, this.voiceSettingsBridgeAPI);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ImagePickerPackage$$ExternalSyntheticLambda0(11);
    }
}
