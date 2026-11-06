package com.amazon.alexa.matter.service.request.handlers;

import com.amazon.alexa.matter.eventbus.schema.CommissioningSessionState;
import com.amazon.alexa.matter.eventbus.schema.RequestHeader;
import com.amazon.alexa.matter.service.response.Responder;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class StartCommissioningHandler$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Responder f$0;
    public final /* synthetic */ RequestHeader f$1;

    public /* synthetic */ StartCommissioningHandler$$ExternalSyntheticLambda1(Responder responder, RequestHeader requestHeader, int i) {
        this.$r8$classId = i;
        this.f$0 = responder;
        this.f$1 = requestHeader;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                StartCommissioningHandler.lambda$handle$2(this.f$0, this.f$1, (String) obj);
                break;
            default:
                GetCommissioningSessionStateHandler.lambda$handle$0(this.f$0, this.f$1, (CommissioningSessionState) obj);
                break;
        }
    }
}
