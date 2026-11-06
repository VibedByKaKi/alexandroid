package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class SelfBargeInObserver$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelfBargeInObserver f$0;
    public final /* synthetic */ DialogRequestIdentifier f$1;

    public /* synthetic */ SelfBargeInObserver$$ExternalSyntheticLambda4(SelfBargeInObserver selfBargeInObserver, DialogRequestIdentifier dialogRequestIdentifier, int i) {
        this.$r8$classId = i;
        this.f$0 = selfBargeInObserver;
        this.f$1 = dialogRequestIdentifier;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$on$4(this.f$1);
                break;
            default:
                this.f$0.lambda$on$5(this.f$1);
                break;
        }
    }
}
