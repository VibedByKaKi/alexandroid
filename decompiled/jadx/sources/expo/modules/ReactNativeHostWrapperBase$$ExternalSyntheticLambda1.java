package expo.modules;

import expo.modules.core.interfaces.ReactNativeHostHandler;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ReactNativeHostWrapperBase$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactNativeHostWrapperBase f$0;

    public /* synthetic */ ReactNativeHostWrapperBase$$ExternalSyntheticLambda1(ReactNativeHostWrapperBase reactNativeHostWrapperBase, int i) {
        this.$r8$classId = i;
        this.f$0 = reactNativeHostWrapperBase;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String jSBundleFile$lambda$4;
        String bundleAssetName$lambda$5;
        int i = this.$r8$classId;
        ReactNativeHostWrapperBase reactNativeHostWrapperBase = this.f$0;
        ReactNativeHostHandler reactNativeHostHandler = (ReactNativeHostHandler) obj;
        switch (i) {
            case 0:
                jSBundleFile$lambda$4 = ReactNativeHostWrapperBase.getJSBundleFile$lambda$4(reactNativeHostWrapperBase, reactNativeHostHandler);
                return jSBundleFile$lambda$4;
            default:
                bundleAssetName$lambda$5 = ReactNativeHostWrapperBase.getBundleAssetName$lambda$5(reactNativeHostWrapperBase, reactNativeHostHandler);
                return bundleAssetName$lambda$5;
        }
    }
}
