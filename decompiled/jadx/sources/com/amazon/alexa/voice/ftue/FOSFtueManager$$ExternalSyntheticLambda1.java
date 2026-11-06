package com.amazon.alexa.voice.ftue;

import com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.OnPermissionResultReceivedListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class FOSFtueManager$$ExternalSyntheticLambda1 implements OnPermissionResultReceivedListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FOSFtueManager$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.OnPermissionResultReceivedListener
    public final void onPermissionResultReceived() {
        switch (this.$r8$classId) {
            case 0:
                FOSFtueManager.lambda$getOnPermissionResultReceivedListener$1();
                break;
            default:
                LegacyFtueManager.lambda$getOnPermissionResultReceivedListener$1();
                break;
        }
    }
}
