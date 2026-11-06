package com.amazon.alexa.accessoryclient.client.accessories;

import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class ClientFitnessSessionUpdateOnUpdateProcessedListener$$ExternalSyntheticLambda0 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ClientFitnessSessionUpdateOnUpdateProcessedListener f$0;

    public /* synthetic */ ClientFitnessSessionUpdateOnUpdateProcessedListener$$ExternalSyntheticLambda0(ClientFitnessSessionUpdateOnUpdateProcessedListener clientFitnessSessionUpdateOnUpdateProcessedListener, int i) {
        this.$r8$classId = i;
        this.f$0 = clientFitnessSessionUpdateOnUpdateProcessedListener;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        ClientFitnessSessionUpdateOnUpdateProcessedListener clientFitnessSessionUpdateOnUpdateProcessedListener = this.f$0;
        switch (i) {
            case 0:
                ClientFitnessSessionUpdateOnUpdateProcessedListener.onSuccess$lambda$0(clientFitnessSessionUpdateOnUpdateProcessedListener);
                break;
            default:
                ClientFitnessSessionUpdateOnUpdateProcessedListener.onFailure$lambda$1(clientFitnessSessionUpdateOnUpdateProcessedListener);
                break;
        }
    }
}
