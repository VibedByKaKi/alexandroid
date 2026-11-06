package com.amazon.alexa.accessory.frames.greeting;

import com.amazon.alexa.accessory.frames.greeting.BudGreetingManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class BudGreetingManager$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BudGreetingManager.AnonymousClass1 f$0;

    public /* synthetic */ BudGreetingManager$1$$ExternalSyntheticLambda0(BudGreetingManager.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BudGreetingManager.AnonymousClass1 anonymousClass1 = this.f$0;
        switch (i) {
            case 0:
                anonymousClass1.lambda$onAudioPlaybackInterrupted$4();
                break;
            case 1:
                anonymousClass1.lambda$onAudioPlaybackCompleted$1();
                break;
            case 2:
                anonymousClass1.lambda$onAudioPlaybackInterrupted$5();
                break;
            default:
                anonymousClass1.lambda$onAudioPlaybackCompleted$0();
                break;
        }
    }
}
