package com.amazon.deecomms.calling.ui.ep;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ActiveEnhancedProcessingVideoCallFragment$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActiveEnhancedProcessingVideoCallFragment f$0;

    public /* synthetic */ ActiveEnhancedProcessingVideoCallFragment$$ExternalSyntheticLambda0(ActiveEnhancedProcessingVideoCallFragment activeEnhancedProcessingVideoCallFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = activeEnhancedProcessingVideoCallFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ActiveEnhancedProcessingVideoCallFragment activeEnhancedProcessingVideoCallFragment = this.f$0;
        switch (i) {
            case 0:
                activeEnhancedProcessingVideoCallFragment.showCallButtonView();
                break;
            default:
                activeEnhancedProcessingVideoCallFragment.lambda$initiateCallControlsButtonAnimation$9();
                break;
        }
    }
}
