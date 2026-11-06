package com.amazon.deecomms.calling.incallexperiences.effects.ui;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CallCaptionBottomSheetDialogFragmentView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CallCaptionBottomSheetDialogFragmentView f$0;

    public /* synthetic */ CallCaptionBottomSheetDialogFragmentView$$ExternalSyntheticLambda0(CallCaptionBottomSheetDialogFragmentView callCaptionBottomSheetDialogFragmentView, int i) {
        this.$r8$classId = i;
        this.f$0 = callCaptionBottomSheetDialogFragmentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CallCaptionBottomSheetDialogFragmentView callCaptionBottomSheetDialogFragmentView = this.f$0;
        switch (i) {
            case 0:
                callCaptionBottomSheetDialogFragmentView.lambda$showButton$3();
                break;
            case 1:
                callCaptionBottomSheetDialogFragmentView.lambda$showGrayedOutButton$4();
                break;
            default:
                callCaptionBottomSheetDialogFragmentView.lambda$refreshMenu$2();
                break;
        }
    }
}
