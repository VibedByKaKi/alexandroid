package com.amazon.leapfrogmapgl.indoor;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NativeIndoorViewManager$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ NativeIndoorViewManager$$ExternalSyntheticLambda9(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit applyDemoActors$lambda$83;
        Unit applyTimeOfDayTo$lambda$94;
        Unit applyDebugCommand$lambda$43;
        Unit enterIndoorGroundLevel$lambda$48;
        Unit sceneUpdateJson$lambda$93;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                applyDemoActors$lambda$83 = NativeIndoorViewManager.applyDemoActors$lambda$83(str);
                return applyDemoActors$lambda$83;
            case 1:
                applyTimeOfDayTo$lambda$94 = NativeIndoorViewManager.applyTimeOfDayTo$lambda$94(str);
                return applyTimeOfDayTo$lambda$94;
            case 2:
                applyDebugCommand$lambda$43 = NativeIndoorViewManager.applyDebugCommand$lambda$43(str);
                return applyDebugCommand$lambda$43;
            case 3:
                enterIndoorGroundLevel$lambda$48 = NativeIndoorViewManager.enterIndoorGroundLevel$lambda$48(str);
                return enterIndoorGroundLevel$lambda$48;
            default:
                sceneUpdateJson$lambda$93 = NativeIndoorViewManager.setSceneUpdateJson$lambda$93(str);
                return sceneUpdateJson$lambda$93;
        }
    }
}
