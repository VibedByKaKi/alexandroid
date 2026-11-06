package com.amazon.alexa.elements.turbomodules.devicestateservice;

import com.amazon.alexa.elements.turbomodules.dialog.DialogPackage$$ExternalSyntheticLambda0;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DeviceStateServicePackage extends TurboReactPackage {
    private final DeviceStateServiceAPI deviceStateServiceAPI;

    public DeviceStateServicePackage(DeviceStateServiceAPI deviceStateServiceAPI) {
        this.deviceStateServiceAPI = deviceStateServiceAPI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put("DeviceStateServiceModule", new ReactModuleInfo("DeviceStateServiceModule", "DeviceStateServiceModule", false, false, false, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("DeviceStateServiceModule")) {
            return new DeviceStateServiceModule(reactApplicationContext, this.deviceStateServiceAPI);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new DialogPackage$$ExternalSyntheticLambda0(3);
    }
}
