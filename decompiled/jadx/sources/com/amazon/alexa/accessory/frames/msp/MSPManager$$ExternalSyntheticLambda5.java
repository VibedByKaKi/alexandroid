package com.amazon.alexa.accessory.frames.msp;

import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MSPManager$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MSPManager f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ CompletableFuture f$2;

    public /* synthetic */ MSPManager$$ExternalSyntheticLambda5(MSPManager mSPManager, String str, CompletableFuture completableFuture, int i) {
        this.$r8$classId = i;
        this.f$0 = mSPManager;
        this.f$1 = str;
        this.f$2 = completableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getEnabledMSP$6(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$getPreferredMSP$5(this.f$1, this.f$2);
                break;
        }
    }
}
