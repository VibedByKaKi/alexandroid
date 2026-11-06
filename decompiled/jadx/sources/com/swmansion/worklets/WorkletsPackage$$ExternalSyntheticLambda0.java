package com.swmansion.worklets;

import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.runtime.CoreReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.th3rdwave.safeareacontext.SafeAreaContextPackage;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class WorkletsPackage$$ExternalSyntheticLambda0 implements ReactModuleInfoProvider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HashMap f$0;

    public /* synthetic */ WorkletsPackage$$ExternalSyntheticLambda0(HashMap hashMap, int i) {
        this.$r8$classId = i;
        this.f$0 = hashMap;
    }

    @Override // com.facebook.react.module.model.ReactModuleInfoProvider
    public final Map getReactModuleInfos() {
        Map lambda$getReactModuleInfoProvider$0;
        Map fallbackForMissingClass$lambda$0;
        Map lambda$getReactModuleInfoProvider$02;
        Map reactModuleInfoProvider$lambda$0;
        Map fallbackForMissingClass$lambda$19;
        int i = this.$r8$classId;
        HashMap hashMap = this.f$0;
        switch (i) {
            case 0:
                lambda$getReactModuleInfoProvider$0 = WorkletsPackage.lambda$getReactModuleInfoProvider$0(hashMap);
                return lambda$getReactModuleInfoProvider$0;
            case 1:
                fallbackForMissingClass$lambda$0 = CoreReactPackage.fallbackForMissingClass$lambda$0(hashMap);
                return fallbackForMissingClass$lambda$0;
            case 2:
                lambda$getReactModuleInfoProvider$02 = ReanimatedPackage.lambda$getReactModuleInfoProvider$0(hashMap);
                return lambda$getReactModuleInfoProvider$02;
            case 3:
                reactModuleInfoProvider$lambda$0 = SafeAreaContextPackage.getReactModuleInfoProvider$lambda$0(hashMap);
                return reactModuleInfoProvider$lambda$0;
            default:
                fallbackForMissingClass$lambda$19 = MainReactPackage.fallbackForMissingClass$lambda$19((LinkedHashMap) hashMap);
                return fallbackForMissingClass$lambda$19;
        }
    }
}
