package com.amazon.alexa.voice.ui.onedesign.bottomsheet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class BottomSheetController$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BottomSheetController f$0;

    public /* synthetic */ BottomSheetController$$ExternalSyntheticLambda0(BottomSheetController bottomSheetController, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BottomSheetController bottomSheetController = this.f$0;
        switch (i) {
            case 0:
                bottomSheetController.lambda$showKeyboard$13();
                break;
            case 1:
                bottomSheetController.lambda$showKeyboard$12();
                break;
            case 2:
                bottomSheetController.smoothScrollToBottom();
                break;
            case 3:
                bottomSheetController.lambda$scrollConversationToEnd$16();
                break;
            case 4:
                bottomSheetController.lambda$hideKeyboard$11();
                break;
            default:
                bottomSheetController.lambda$onCreateView$4();
                break;
        }
    }
}
