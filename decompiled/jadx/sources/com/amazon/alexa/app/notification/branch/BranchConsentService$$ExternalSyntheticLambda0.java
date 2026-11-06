package com.amazon.alexa.app.notification.branch;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class BranchConsentService$$ExternalSyntheticLambda0 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BranchConsentService$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    public final void handle(Message message) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((BranchConsentService) obj).onConsentDecision(message);
                break;
            default:
                ((BranchHighValueActionService) obj).onHighValueEvent(message);
                break;
        }
    }
}
