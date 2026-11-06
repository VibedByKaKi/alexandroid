package com.amazon.alexa.accessory.frames.greeting;

import com.amazon.alexa.accessory.frames.greeting.BudGreetingManager;
import java.io.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class BudGreetingManager$1$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BudGreetingManager.AnonymousClass1 f$0;
    public final /* synthetic */ File f$1;

    public /* synthetic */ BudGreetingManager$1$$ExternalSyntheticLambda3(BudGreetingManager.AnonymousClass1 anonymousClass1, File file, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
        this.f$1 = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onAudioPlaybackError$3(this.f$1);
                break;
            default:
                this.f$0.lambda$onAudioPlaybackError$2(this.f$1);
                break;
        }
    }
}
