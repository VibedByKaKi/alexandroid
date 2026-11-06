package com.amazon.leapfrogmapgl.indoor;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NativeIndoorViewManager$$ExternalSyntheticLambda42 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ double f$0;
    public final /* synthetic */ double f$1;
    public final /* synthetic */ double f$2;

    public /* synthetic */ NativeIndoorViewManager$$ExternalSyntheticLambda42(double d, double d2, double d3, int i) {
        this.$r8$classId = i;
        this.f$0 = d;
        this.f$1 = d2;
        this.f$2 = d3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit publishFitZooms$lambda$66;
        Unit enterIndoorGroundLevel$lambda$49;
        switch (this.$r8$classId) {
            case 0:
                publishFitZooms$lambda$66 = NativeIndoorViewManager.publishFitZooms$lambda$66(this.f$0, this.f$1, this.f$2);
                return publishFitZooms$lambda$66;
            default:
                enterIndoorGroundLevel$lambda$49 = NativeIndoorViewManager.enterIndoorGroundLevel$lambda$49(this.f$0, this.f$1, this.f$2);
                return enterIndoorGroundLevel$lambda$49;
        }
    }
}
