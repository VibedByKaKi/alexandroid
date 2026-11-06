package com.amazon.alexa.ra.android.smartfragment.bridge;

import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.interfaces.fabric.ReactSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ReactHostBridge$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ReactHostBridge$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit gate$lambda$8;
        boolean startHost$lambda$1;
        JSBundleLoader resolveBundleLoader;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                gate$lambda$8 = ReactHostBridge.gate$lambda$8((ReactSurface) obj);
                return gate$lambda$8;
            case 1:
                startHost$lambda$1 = ReactHostBridge.startHost$lambda$1((ReactHostBridge) obj);
                return Boolean.valueOf(startHost$lambda$1);
            default:
                resolveBundleLoader = ((SandboxReactHostDelegate) obj).resolveBundleLoader();
                return resolveBundleLoader;
        }
    }
}
