package com.amazon.deecomms.common;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsInternal$$ExternalSyntheticLambda3 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CommsInternal f$0;

    public /* synthetic */ CommsInternal$$ExternalSyntheticLambda3(CommsInternal commsInternal, int i) {
        this.$r8$classId = i;
        this.f$0 = commsInternal;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        CommsInternal commsInternal = this.f$0;
        switch (i) {
            case 0:
                commsInternal.lambda$subscribeToStartupCompleteEvent$5(message);
                break;
            default:
                commsInternal.lambda$subscribeForConversationUpdateEvent$8(message);
                break;
        }
    }
}
