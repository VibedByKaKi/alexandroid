package com.amazon.alexa.voice.ui.onedesign.remarkable.component;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ConversationComponent$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConversationComponent f$0;

    public /* synthetic */ ConversationComponent$$ExternalSyntheticLambda0(ConversationComponent conversationComponent, int i) {
        this.$r8$classId = i;
        this.f$0 = conversationComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ConversationComponent conversationComponent = this.f$0;
        switch (i) {
            case 0:
                conversationComponent.lambda$show$2();
                break;
            case 1:
                conversationComponent.lambda$hide$3();
                break;
            case 2:
                conversationComponent.lambda$scrollToEnd$5();
                break;
            default:
                conversationComponent.smoothScrollToBottom();
                break;
        }
    }
}
