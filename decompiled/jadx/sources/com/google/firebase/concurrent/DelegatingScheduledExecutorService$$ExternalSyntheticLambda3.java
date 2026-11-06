package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class DelegatingScheduledExecutorService$$ExternalSyntheticLambda3 implements DelegatingScheduledFuture.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DelegatingScheduledExecutorService f$0;
    public final /* synthetic */ Runnable f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ TimeUnit f$4;

    public /* synthetic */ DelegatingScheduledExecutorService$$ExternalSyntheticLambda3(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.$r8$classId = i;
        this.f$0 = delegatingScheduledExecutorService;
        this.f$1 = runnable;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        ScheduledFuture lambda$scheduleAtFixedRate$8;
        ScheduledFuture lambda$scheduleWithFixedDelay$11;
        switch (this.$r8$classId) {
            case 0:
                lambda$scheduleAtFixedRate$8 = this.f$0.lambda$scheduleAtFixedRate$8(this.f$1, this.f$2, this.f$3, this.f$4, completer);
                return lambda$scheduleAtFixedRate$8;
            default:
                lambda$scheduleWithFixedDelay$11 = this.f$0.lambda$scheduleWithFixedDelay$11(this.f$1, this.f$2, this.f$3, this.f$4, completer);
                return lambda$scheduleWithFixedDelay$11;
        }
    }
}
