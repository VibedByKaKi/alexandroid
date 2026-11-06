package com.bugsnag.android;

import androidx.annotation.Nullable;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BugsnagPackage extends TurboReactPackage {
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeBugsnagSpec.NAME)) {
            return new NativeBugsnagImpl(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.bugsnag.android.BugsnagPackage.1
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public Map<String, ReactModuleInfo> getReactModuleInfos() {
                return Collections.singletonMap(NativeBugsnagSpec.NAME, new ReactModuleInfo(NativeBugsnagSpec.NAME, NativeBugsnagSpec.NAME, false, true, false, false, true));
            }
        };
    }
}
