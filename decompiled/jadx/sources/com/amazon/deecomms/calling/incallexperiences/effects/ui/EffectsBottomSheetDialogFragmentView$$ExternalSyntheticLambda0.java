package com.amazon.deecomms.calling.incallexperiences.effects.ui;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class EffectsBottomSheetDialogFragmentView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EffectsBottomSheetDialogFragmentView f$0;

    public /* synthetic */ EffectsBottomSheetDialogFragmentView$$ExternalSyntheticLambda0(EffectsBottomSheetDialogFragmentView effectsBottomSheetDialogFragmentView, int i) {
        this.$r8$classId = i;
        this.f$0 = effectsBottomSheetDialogFragmentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        EffectsBottomSheetDialogFragmentView effectsBottomSheetDialogFragmentView = this.f$0;
        switch (i) {
            case 0:
                effectsBottomSheetDialogFragmentView.lambda$showGrayedOutButton$5();
                break;
            case 1:
                effectsBottomSheetDialogFragmentView.lambda$showButton$4();
                break;
            default:
                effectsBottomSheetDialogFragmentView.lambda$refreshMenu$3();
                break;
        }
    }
}
