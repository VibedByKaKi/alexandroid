package com.mapbox.common.location;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class BaseLocationProvider$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BaseLocationProvider$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BaseLocationProvider.notifyLocationUpdate$lambda$2$lambda$1$lambda$0((LocationObserver) this.f$0, (List) this.f$1);
                break;
            default:
                LocationUpdatesReceiver.onReceive$lambda$2((Intent) this.f$0, (BroadcastReceiver.PendingResult) this.f$1);
                break;
        }
    }
}
