package com.amazon.deecomms.calling.ui.ep;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class OutgoingEnhancedProcessingVideoCallFragment$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OutgoingEnhancedProcessingVideoCallFragment f$0;

    public /* synthetic */ OutgoingEnhancedProcessingVideoCallFragment$$ExternalSyntheticLambda0(OutgoingEnhancedProcessingVideoCallFragment outgoingEnhancedProcessingVideoCallFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = outgoingEnhancedProcessingVideoCallFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        OutgoingEnhancedProcessingVideoCallFragment outgoingEnhancedProcessingVideoCallFragment = this.f$0;
        switch (i) {
            case 0:
                outgoingEnhancedProcessingVideoCallFragment.lambda$showCallControls$0(view);
                break;
            default:
                outgoingEnhancedProcessingVideoCallFragment.lambda$activateCallControls$1(view);
                break;
        }
    }
}
