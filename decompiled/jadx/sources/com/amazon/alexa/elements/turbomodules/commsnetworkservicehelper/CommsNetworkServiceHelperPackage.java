package com.amazon.alexa.elements.turbomodules.commsnetworkservicehelper;

import cl.json.RNSharePackage$$ExternalSyntheticLambda0;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CommsNetworkServiceHelperPackage extends TurboReactPackage {
    private final CommsNetworkServiceHelperAPI commsNetworkServiceHelperAPI;

    public CommsNetworkServiceHelperPackage(CommsNetworkServiceHelperAPI commsNetworkServiceHelperAPI) {
        this.commsNetworkServiceHelperAPI = commsNetworkServiceHelperAPI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommsNetworkServiceHelperModule", new ReactModuleInfo("CommsNetworkServiceHelperModule", "CommsNetworkServiceHelperModule", false, false, false, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("CommsNetworkServiceHelperModule")) {
            return new CommsNetworkServiceHelperModule(reactApplicationContext, this.commsNetworkServiceHelperAPI);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new RNSharePackage$$ExternalSyntheticLambda0(26);
    }
}
