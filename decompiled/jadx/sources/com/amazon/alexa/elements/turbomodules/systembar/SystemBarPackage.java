package com.amazon.alexa.elements.turbomodules.systembar;

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
public class SystemBarPackage extends TurboReactPackage {
    private final SystemBarAPI systemBarAPI;

    public SystemBarPackage(SystemBarAPI systemBarAPI) {
        this.systemBarAPI = systemBarAPI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put("SystemBarModule", new ReactModuleInfo("SystemBarModule", "SystemBarModule", false, false, false, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("SystemBarModule")) {
            return new SystemBarModule(reactApplicationContext, this.systemBarAPI);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ImagePickerPackage$$ExternalSyntheticLambda0(8);
    }
}
