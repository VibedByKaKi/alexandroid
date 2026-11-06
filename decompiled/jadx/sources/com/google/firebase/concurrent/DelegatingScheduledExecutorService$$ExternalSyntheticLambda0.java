package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class DelegatingScheduledExecutorService$$ExternalSyntheticLambda0 implements DelegatingScheduledFuture.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DelegatingScheduledExecutorService f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ TimeUnit f$3;

    public /* synthetic */ DelegatingScheduledExecutorService$$ExternalSyntheticLambda0(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j, TimeUnit timeUnit, int i) {
        this.$r8$classId = i;
        this.f$0 = delegatingScheduledExecutorService;
        this.f$1 = obj;
        this.f$2 = j;
        this.f$3 = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        ScheduledFuture lambda$schedule$2;
        ScheduledFuture lambda$schedule$5;
        switch (this.$r8$classId) {
            case 0:
                lambda$schedule$2 = this.f$0.lambda$schedule$2((Runnable) this.f$1, this.f$2, this.f$3, completer);
                return lambda$schedule$2;
            default:
                lambda$schedule$5 = this.f$0.lambda$schedule$5((Callable) this.f$1, this.f$2, this.f$3, completer);
                return lambda$schedule$5;
        }
    }
}
