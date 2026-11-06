package com.amazon.alexa.location;

import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultLocationService$$ExternalSyntheticLambda24 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultLocationService f$0;
    public final /* synthetic */ MobilyticsMetricsCounter f$1;
    public final /* synthetic */ MobilyticsMetricsCounter f$2;

    public /* synthetic */ DefaultLocationService$$ExternalSyntheticLambda24(DefaultLocationService defaultLocationService, MobilyticsMetricsCounter mobilyticsMetricsCounter, MobilyticsMetricsCounter mobilyticsMetricsCounter2, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultLocationService;
        this.f$1 = mobilyticsMetricsCounter;
        this.f$2 = mobilyticsMetricsCounter2;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$triggerGeofence$14(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$sendTriggerEvent$23(this.f$1, this.f$2);
                break;
        }
    }
}
