package com.amazon.alexa.voice.model;

import com.amazon.alexa.voice.model.DefaultVoiceService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class DefaultVoiceService$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultVoiceService.AnonymousClass1 f$0;

    public /* synthetic */ DefaultVoiceService$1$$ExternalSyntheticLambda0(DefaultVoiceService.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        DefaultVoiceService.AnonymousClass1 anonymousClass1 = this.f$0;
        switch (i) {
            case 0:
                anonymousClass1.lambda$onUserReadyForVoice$0();
                break;
            default:
                anonymousClass1.lambda$onNoUserReadyForVoice$1();
                break;
        }
    }
}
