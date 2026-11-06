package com.amazon.alexa.voice.ui.onedesign.tta;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class TtaScreenController$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TtaScreenController f$0;

    public /* synthetic */ TtaScreenController$$ExternalSyntheticLambda7(TtaScreenController ttaScreenController, int i) {
        this.$r8$classId = i;
        this.f$0 = ttaScreenController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        TtaScreenController ttaScreenController = this.f$0;
        switch (i) {
            case 0:
                ttaScreenController.lambda$showKeyboard$9();
                break;
            case 1:
                ttaScreenController.lambda$scrollConversationToEnd$11();
                break;
            default:
                ttaScreenController.lambda$hideKeyboard$10();
                break;
        }
    }
}
