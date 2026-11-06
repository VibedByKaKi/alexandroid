package com.mapbox.maps;

import com.mapbox.common.experimental.MapboxSupport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class IndoorManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ IndoorManager$$ExternalSyntheticLambda0(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                IndoorManager.setPeer$lambda$0(this.f$0);
                break;
            default:
                MapboxSupport.setPeer$lambda$0(this.f$0);
                break;
        }
    }
}
