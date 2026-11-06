package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MoreExecutors$$ExternalSyntheticLambda0 implements Executor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Executor f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MoreExecutors$$ExternalSyntheticLambda0(Executor executor, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = executor;
        this.f$1 = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.$r8$classId) {
            case 0:
                MoreExecutors.lambda$rejectionPropagatingExecutor$0(this.f$0, (AbstractFuture) this.f$1, runnable);
                break;
            default:
                MoreExecutors.lambda$renamingDecorator$0(this.f$0, (Supplier) this.f$1, runnable);
                break;
        }
    }
}
