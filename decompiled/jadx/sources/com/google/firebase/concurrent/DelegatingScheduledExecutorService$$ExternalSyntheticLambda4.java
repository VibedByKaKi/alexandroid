package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class DelegatingScheduledExecutorService$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Runnable f$0;
    public final /* synthetic */ DelegatingScheduledFuture.Completer f$1;

    public /* synthetic */ DelegatingScheduledExecutorService$$ExternalSyntheticLambda4(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i) {
        this.$r8$classId = i;
        this.f$0 = runnable;
        this.f$1 = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DelegatingScheduledExecutorService.lambda$schedule$0(this.f$0, this.f$1);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(this.f$0, this.f$1);
                break;
            default:
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(this.f$0, this.f$1);
                break;
        }
    }
}
