package com.amazon.alexa.matter.commissioner;

import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MatterSDKCommissioningSession$$ExternalSyntheticLambda3 implements CompletableOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MatterSDKCommissioningSession f$0;

    public /* synthetic */ MatterSDKCommissioningSession$$ExternalSyntheticLambda3(MatterSDKCommissioningSession matterSDKCommissioningSession, int i) {
        this.$r8$classId = i;
        this.f$0 = matterSDKCommissioningSession;
    }

    @Override // io.reactivex.rxjava3.core.CompletableOnSubscribe
    public final void subscribe(CompletableEmitter completableEmitter) {
        int i = this.$r8$classId;
        MatterSDKCommissioningSession matterSDKCommissioningSession = this.f$0;
        switch (i) {
            case 0:
                matterSDKCommissioningSession.lambda$finalizeCommissioning$4(completableEmitter);
                break;
            case 1:
                matterSDKCommissioningSession.lambda$bypassSoftAttestationFailure$1(completableEmitter);
                break;
            default:
                matterSDKCommissioningSession.lambda$startCommissioning$0(completableEmitter);
                break;
        }
    }
}
