package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.ClosingFuture;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Callables$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Callables$$ExternalSyntheticLambda3(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Callables.lambda$threadRenaming$1((Supplier) this.f$0, (Runnable) this.f$1);
                break;
            case 1:
                ((AggregateFuture) this.f$0).lambda$init$1((ImmutableCollection) this.f$1);
                break;
            case 2:
                ((ClosingFuture) this.f$0).lambda$finishToValueAndCloser$0((ClosingFuture.ValueAndCloserConsumer) this.f$1);
                break;
            default:
                ((BlockingQueue) this.f$0).add((ListenableFuture) this.f$1);
                break;
        }
    }
}
