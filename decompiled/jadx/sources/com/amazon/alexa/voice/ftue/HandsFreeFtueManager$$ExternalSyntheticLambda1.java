package com.amazon.alexa.voice.ftue;

import com.amazon.alexa.voice.ui.onedesign.ftue.primer.VoicePermissionGrantedListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HandsFreeFtueManager$$ExternalSyntheticLambda1 implements VoicePermissionGrantedListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ HandsFreeFtueManager$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.primer.VoicePermissionGrantedListener
    public final void onVoicePermissionGranted() {
        switch (this.$r8$classId) {
            case 0:
                HandsFreeFtueManager.lambda$getVoicePermissionGrantedListener$1();
                break;
            case 1:
                BottomSheetFtueManager.lambda$getVoicePermissionGrantedListener$1();
                break;
            default:
                HandsFreeWithoutHintsFtueManager.lambda$getVoicePermissionGrantedListener$1();
                break;
        }
    }
}
