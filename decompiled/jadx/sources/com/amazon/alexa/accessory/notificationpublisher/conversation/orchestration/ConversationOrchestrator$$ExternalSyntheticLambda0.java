package com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration;

import com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationOrchestrator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ConversationOrchestrator$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ConversationOrchestrator$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ConversationOrchestrator.interrupt$lambda$11((ConversationOrchestrator) obj);
                break;
            default:
                ConversationOrchestrator.FlowTimeout.arm$lambda$0((ConversationOrchestrator.FlowTimeout) obj);
                break;
        }
    }
}
