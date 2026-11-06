package com.amazon.alexa.voice.ui.onedesign.remarkable.component;

import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationBubbleItem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ConversationComponent$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConversationComponent f$0;
    public final /* synthetic */ ConversationBubbleItem f$1;

    public /* synthetic */ ConversationComponent$$ExternalSyntheticLambda3(ConversationComponent conversationComponent, ConversationBubbleItem conversationBubbleItem, int i) {
        this.$r8$classId = i;
        this.f$0 = conversationComponent;
        this.f$1 = conversationBubbleItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$remove$1(this.f$1);
                break;
            default:
                this.f$0.lambda$add$0(this.f$1);
                break;
        }
    }
}
