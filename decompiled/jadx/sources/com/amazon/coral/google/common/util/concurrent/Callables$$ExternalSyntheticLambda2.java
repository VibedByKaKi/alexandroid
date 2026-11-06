package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.base.Supplier;
import com.amazon.coral.google.common.collect.ImmutableCollection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Callables$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Callables$$ExternalSyntheticLambda2(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Callables.lambda$threadRenaming$3((Supplier) this.f$0, (Runnable) this.f$1);
                break;
            default:
                ((AggregateFuture) this.f$0).lambda$init$1((ImmutableCollection) this.f$1);
                break;
        }
    }
}
