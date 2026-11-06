package com.facebook.react.runtime;

import com.facebook.react.bridge.NativeMap;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactInstance$$ExternalSyntheticLambda2 implements UIConstantsProviderBinding.ConstantsForViewManagerProvider, UIConstantsProviderBinding.ConstantsProvider {
    public final /* synthetic */ ReactInstance f$0;
    public final /* synthetic */ HashMap f$1;

    public /* synthetic */ ReactInstance$$ExternalSyntheticLambda2(ReactInstance reactInstance, HashMap hashMap) {
        this.f$0 = reactInstance;
        this.f$1 = hashMap;
    }

    @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsProvider
    public NativeMap getConstants() {
        NativeMap _init_$lambda$2;
        _init_$lambda$2 = ReactInstance._init_$lambda$2(this.f$0, this.f$1);
        return _init_$lambda$2;
    }

    @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsForViewManagerProvider
    public NativeMap getConstantsForViewManager(String str) {
        NativeMap _init_$lambda$1;
        _init_$lambda$1 = ReactInstance._init_$lambda$1(this.f$0, this.f$1, str);
        return _init_$lambda$1;
    }
}
