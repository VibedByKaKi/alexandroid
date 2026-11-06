package com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ConversationOrchestrator$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConversationOrchestrator f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ ConversationOrchestrator$$ExternalSyntheticLambda6(ConversationOrchestrator conversationOrchestrator, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = conversationOrchestrator;
        this.f$1 = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ConversationOrchestrator.resume$lambda$13(this.f$0, this.f$1);
                break;
            default:
                ConversationOrchestrator.close$lambda$12(this.f$0, this.f$1);
                break;
        }
    }
}
