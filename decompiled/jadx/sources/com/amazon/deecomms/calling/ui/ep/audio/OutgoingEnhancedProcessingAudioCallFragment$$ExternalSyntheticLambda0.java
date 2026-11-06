package com.amazon.deecomms.calling.ui.ep.audio;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class OutgoingEnhancedProcessingAudioCallFragment$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OutgoingEnhancedProcessingAudioCallFragment f$0;

    public /* synthetic */ OutgoingEnhancedProcessingAudioCallFragment$$ExternalSyntheticLambda0(OutgoingEnhancedProcessingAudioCallFragment outgoingEnhancedProcessingAudioCallFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = outgoingEnhancedProcessingAudioCallFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        OutgoingEnhancedProcessingAudioCallFragment outgoingEnhancedProcessingAudioCallFragment = this.f$0;
        switch (i) {
            case 0:
                outgoingEnhancedProcessingAudioCallFragment.lambda$activateCallControls$0(view);
                break;
            case 1:
                outgoingEnhancedProcessingAudioCallFragment.lambda$activateCallControls$1(view);
                break;
            default:
                outgoingEnhancedProcessingAudioCallFragment.lambda$showDialpad$2(view);
                break;
        }
    }
}
