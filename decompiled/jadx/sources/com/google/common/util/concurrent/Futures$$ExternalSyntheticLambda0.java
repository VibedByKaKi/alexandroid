package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.Futures;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Futures$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ Futures$$ExternalSyntheticLambda0(AggregateFuture aggregateFuture, int i, ListenableFuture listenableFuture) {
        this.f$0 = aggregateFuture;
        this.f$2 = i;
        this.f$1 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Futures.InCompletionOrderState.access$300((Futures.InCompletionOrderState) this.f$0, (ImmutableList) this.f$1, this.f$2);
                break;
            default:
                ((AggregateFuture) this.f$0).lambda$init$0(this.f$2, (ListenableFuture) this.f$1);
                break;
        }
    }

    public /* synthetic */ Futures$$ExternalSyntheticLambda0(Futures.InCompletionOrderState inCompletionOrderState, ImmutableList immutableList, int i) {
        this.f$0 = inCompletionOrderState;
        this.f$1 = immutableList;
        this.f$2 = i;
    }
}
