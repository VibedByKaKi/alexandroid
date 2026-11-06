package com.amazon.alexa.assistant.capability.conversation;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ConversationCapabilityAgent$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ ConversationCapabilityAgent f$1;

    public /* synthetic */ ConversationCapabilityAgent$$ExternalSyntheticLambda0(String str, ConversationCapabilityAgent conversationCapabilityAgent, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = conversationCapabilityAgent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit sendUserEvent$lambda$25;
        Unit sendInvokeOperation$lambda$29;
        switch (this.$r8$classId) {
            case 0:
                sendUserEvent$lambda$25 = ConversationCapabilityAgent.sendUserEvent$lambda$25(this.f$0, this.f$1, (Result) obj);
                return sendUserEvent$lambda$25;
            default:
                sendInvokeOperation$lambda$29 = ConversationCapabilityAgent.sendInvokeOperation$lambda$29(this.f$0, this.f$1, (Result) obj);
                return sendInvokeOperation$lambda$29;
        }
    }
}
