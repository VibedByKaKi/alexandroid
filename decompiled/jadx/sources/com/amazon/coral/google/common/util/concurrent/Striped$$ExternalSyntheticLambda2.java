package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.base.Supplier;
import com.amazon.coral.google.common.util.concurrent.Striped;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Striped$$ExternalSyntheticLambda2 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Striped$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.coral.google.common.base.Supplier, java.util.function.Supplier
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return new Striped.WeakSafeReadWriteLock();
            case 1:
                return new Striped.PaddedLock();
            case 2:
                return Striped.lambda$lazyWeakLock$0();
            default:
                return new ReentrantReadWriteLock();
        }
    }
}
