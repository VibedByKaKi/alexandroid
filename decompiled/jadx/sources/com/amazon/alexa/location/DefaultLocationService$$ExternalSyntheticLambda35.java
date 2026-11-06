package com.amazon.alexa.location;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultLocationService$$ExternalSyntheticLambda35 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultLocationService f$0;
    public final /* synthetic */ TriggeringGeofenceInfo f$1;

    public /* synthetic */ DefaultLocationService$$ExternalSyntheticLambda35(DefaultLocationService defaultLocationService, TriggeringGeofenceInfo triggeringGeofenceInfo, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultLocationService;
        this.f$1 = triggeringGeofenceInfo;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        ObservableSource lambda$sendTriggerEvent$20;
        ObservableSource lambda$integrateRetryTriggerGeofence$24;
        switch (this.$r8$classId) {
            case 0:
                lambda$sendTriggerEvent$20 = this.f$0.lambda$sendTriggerEvent$20(this.f$1, (LocationNetworkServiceConfig) obj);
                return lambda$sendTriggerEvent$20;
            default:
                lambda$integrateRetryTriggerGeofence$24 = this.f$0.lambda$integrateRetryTriggerGeofence$24(this.f$1, (Throwable) obj);
                return lambda$integrateRetryTriggerGeofence$24;
        }
    }
}
