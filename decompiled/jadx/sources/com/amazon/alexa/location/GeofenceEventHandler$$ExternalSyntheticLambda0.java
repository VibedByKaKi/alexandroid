package com.amazon.alexa.location;

import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class GeofenceEventHandler$$ExternalSyntheticLambda0 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GeofenceEventHandler f$0;
    public final /* synthetic */ MobilyticsMetricsTimer f$1;

    public /* synthetic */ GeofenceEventHandler$$ExternalSyntheticLambda0(GeofenceEventHandler geofenceEventHandler, MobilyticsMetricsTimer mobilyticsMetricsTimer, int i) {
        this.$r8$classId = i;
        this.f$0 = geofenceEventHandler;
        this.f$1 = mobilyticsMetricsTimer;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$reportGeoFenceStatusToALS$6(this.f$1);
                break;
            default:
                this.f$0.lambda$processGeofenceSyncEvent$3(this.f$1);
                break;
        }
    }
}
