package com.amazon.alexa.biloba.storage;

import com.amazon.alexa.biloba.generated.models.EmergencyContact;
import com.amazon.alexa.biloba.generated.models.EmergencySettingsResponse;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CommsStore$$ExternalSyntheticLambda0 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CommsStore f$0;
    public final /* synthetic */ MobilyticsMetricsTimer f$1;

    public /* synthetic */ CommsStore$$ExternalSyntheticLambda0(CommsStore commsStore, MobilyticsMetricsTimer mobilyticsMetricsTimer, int i) {
        this.$r8$classId = i;
        this.f$0 = commsStore;
        this.f$1 = mobilyticsMetricsTimer;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$requestEmergencySettings$2(this.f$1, (EmergencySettingsResponse) obj);
                break;
            default:
                this.f$0.lambda$requestEmergencyContact$0(this.f$1, (EmergencyContact) obj);
                break;
        }
    }
}
