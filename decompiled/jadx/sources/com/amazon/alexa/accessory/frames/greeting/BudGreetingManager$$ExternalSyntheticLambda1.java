package com.amazon.alexa.accessory.frames.greeting;

import java.io.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class BudGreetingManager$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ File f$0;

    public /* synthetic */ BudGreetingManager$$ExternalSyntheticLambda1(File file, int i) {
        this.$r8$classId = i;
        this.f$0 = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        File file = this.f$0;
        switch (i) {
            case 0:
                BudGreetingManager.deleteClips(file);
                break;
            default:
                BudGreetingManager.lambda$deleteBadClip$15(file);
                break;
        }
    }
}
