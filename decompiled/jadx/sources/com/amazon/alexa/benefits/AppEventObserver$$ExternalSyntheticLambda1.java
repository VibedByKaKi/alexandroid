package com.amazon.alexa.benefits;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AppEventObserver$$ExternalSyntheticLambda1 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AppEventObserver f$0;

    public /* synthetic */ AppEventObserver$$ExternalSyntheticLambda1(AppEventObserver appEventObserver, int i) {
        this.$r8$classId = i;
        this.f$0 = appEventObserver;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    public final void handle(Message message) {
        int i = this.$r8$classId;
        AppEventObserver appEventObserver = this.f$0;
        switch (i) {
            case 0:
                appEventObserver.lambda$registerSignOutObserver$3(message);
                break;
            case 1:
                appEventObserver.lambda$registerBetaStatusChangeObserver$5(message);
                break;
            default:
                appEventObserver.lambda$registerProfileSelectionAttempt$1(message);
                break;
        }
    }
}
