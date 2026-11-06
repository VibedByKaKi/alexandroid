package com.amazon.rtvi.capabilityagent.avs;

import com.amazon.alexa.api.compat.model.ApiCallFailure;
import com.amazon.rtvi.capabilityagent.avs.RTVIEventSender;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class RTVIEventSender$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RTVIEventSender.DeliveryTracker f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ RTVIEventSender$$ExternalSyntheticLambda1(RTVIEventSender.DeliveryTracker deliveryTracker, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = deliveryTracker;
        this.f$1 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit sendViaCompat$lambda$5;
        Unit sendViaCompat$lambda$4$lambda$3;
        Unit onFailure$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                sendViaCompat$lambda$5 = RTVIEventSender.sendViaCompat$lambda$5(this.f$0, (Exception) this.f$1);
                return sendViaCompat$lambda$5;
            case 1:
                sendViaCompat$lambda$4$lambda$3 = RTVIEventSender.sendViaCompat$lambda$4$lambda$3(this.f$0, (RTVIEventSender) this.f$1);
                return sendViaCompat$lambda$4$lambda$3;
            default:
                onFailure$lambda$1 = RTVIEventSender$sendViaCompat$1.onFailure$lambda$1(this.f$0, (ApiCallFailure) this.f$1);
                return onFailure$lambda$1;
        }
    }
}
