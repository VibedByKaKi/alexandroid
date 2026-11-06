package com.amazon.alexa.voice.ui.onedesign.bottomsheet;

import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationBubbleItem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class BottomSheetController$$ExternalSyntheticLambda14 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BottomSheetController f$0;
    public final /* synthetic */ ConversationBubbleItem f$1;

    public /* synthetic */ BottomSheetController$$ExternalSyntheticLambda14(BottomSheetController bottomSheetController, ConversationBubbleItem conversationBubbleItem, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetController;
        this.f$1 = conversationBubbleItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$add$9(this.f$1);
                break;
            default:
                this.f$0.lambda$remove$10(this.f$1);
                break;
        }
    }
}
