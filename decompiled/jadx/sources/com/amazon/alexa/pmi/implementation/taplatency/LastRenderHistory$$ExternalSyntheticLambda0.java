package com.amazon.alexa.pmi.implementation.taplatency;

import com.amazon.alexa.pmi.implementation.taplatency.LastRenderHistory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LastRenderHistory$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LastRenderHistory.Change f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ LastRenderHistory.WindowTiles f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ LastRenderHistory$$ExternalSyntheticLambda0(LastRenderHistory.Change change, boolean z, LastRenderHistory.WindowTiles windowTiles, long j) {
        this.f$0 = change;
        this.f$1 = z;
        this.f$2 = windowTiles;
        this.f$3 = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean isTileAmbient$lambda$7;
        Unit updateRuns$lambda$3;
        int i = this.$r8$classId;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                isTileAmbient$lambda$7 = LastRenderHistory.isTileAmbient$lambda$7(this.f$0, this.f$1, this.f$2, this.f$3, intValue);
                return Boolean.valueOf(isTileAmbient$lambda$7);
            default:
                updateRuns$lambda$3 = LastRenderHistory.updateRuns$lambda$3(this.f$2, this.f$0, this.f$3, this.f$1, intValue);
                return updateRuns$lambda$3;
        }
    }

    public /* synthetic */ LastRenderHistory$$ExternalSyntheticLambda0(LastRenderHistory.WindowTiles windowTiles, LastRenderHistory.Change change, long j, boolean z) {
        this.f$2 = windowTiles;
        this.f$0 = change;
        this.f$3 = j;
        this.f$1 = z;
    }
}
