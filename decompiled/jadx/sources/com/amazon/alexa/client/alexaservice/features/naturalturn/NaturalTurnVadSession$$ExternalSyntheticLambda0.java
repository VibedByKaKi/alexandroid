package com.amazon.alexa.client.alexaservice.features.naturalturn;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class NaturalTurnVadSession$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NaturalTurnVadSession f$0;

    public /* synthetic */ NaturalTurnVadSession$$ExternalSyntheticLambda0(NaturalTurnVadSession naturalTurnVadSession, int i) {
        this.$r8$classId = i;
        this.f$0 = naturalTurnVadSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        NaturalTurnVadSession naturalTurnVadSession = this.f$0;
        switch (i) {
            case 0:
                naturalTurnVadSession.resetInactivityTimer();
                break;
            default:
                naturalTurnVadSession.onInactivityTimeout();
                break;
        }
    }
}
