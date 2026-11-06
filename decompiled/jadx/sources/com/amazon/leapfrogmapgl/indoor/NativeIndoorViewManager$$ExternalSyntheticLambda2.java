package com.amazon.leapfrogmapgl.indoor;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NativeIndoorViewManager$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NativeIndoorViewManager f$0;
    public final /* synthetic */ IndoorMapViewHandle f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ NativeIndoorViewManager$$ExternalSyntheticLambda2(NativeIndoorViewManager nativeIndoorViewManager, IndoorMapViewHandle indoorMapViewHandle, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = nativeIndoorViewManager;
        this.f$1 = indoorMapViewHandle;
        this.f$2 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit applyMapNavigationJson$lambda$75;
        Unit performFloorPillFlyOutAndIn$lambda$4;
        Unit performFloorPillFlyOutAndIn$lambda$7$lambda$6;
        Unit applyMapNavigationJson$lambda$74$lambda$73$lambda$72;
        Unit applyMapNavigationJson$lambda$78;
        Unit applyMapNavigationJson$lambda$79;
        switch (this.$r8$classId) {
            case 0:
                applyMapNavigationJson$lambda$75 = NativeIndoorViewManager.applyMapNavigationJson$lambda$75(this.f$0, this.f$1, this.f$2);
                return applyMapNavigationJson$lambda$75;
            case 1:
                performFloorPillFlyOutAndIn$lambda$4 = NativeIndoorViewManager.performFloorPillFlyOutAndIn$lambda$4(this.f$0, this.f$1, this.f$2);
                return performFloorPillFlyOutAndIn$lambda$4;
            case 2:
                performFloorPillFlyOutAndIn$lambda$7$lambda$6 = NativeIndoorViewManager.performFloorPillFlyOutAndIn$lambda$7$lambda$6(this.f$0, this.f$1, this.f$2);
                return performFloorPillFlyOutAndIn$lambda$7$lambda$6;
            case 3:
                applyMapNavigationJson$lambda$74$lambda$73$lambda$72 = NativeIndoorViewManager.applyMapNavigationJson$lambda$74$lambda$73$lambda$72(this.f$0, this.f$1, this.f$2);
                return applyMapNavigationJson$lambda$74$lambda$73$lambda$72;
            case 4:
                applyMapNavigationJson$lambda$78 = NativeIndoorViewManager.applyMapNavigationJson$lambda$78(this.f$0, this.f$1, this.f$2);
                return applyMapNavigationJson$lambda$78;
            default:
                applyMapNavigationJson$lambda$79 = NativeIndoorViewManager.applyMapNavigationJson$lambda$79(this.f$0, this.f$1, this.f$2);
                return applyMapNavigationJson$lambda$79;
        }
    }
}
