package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Striped;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Striped$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Striped$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        Lock lambda$lazyWeakLock$0;
        switch (this.$r8$classId) {
            case 0:
                return new Striped.WeakSafeReadWriteLock();
            case 1:
                return new Striped.PaddedLock();
            case 2:
                lambda$lazyWeakLock$0 = Striped.lambda$lazyWeakLock$0();
                return lambda$lazyWeakLock$0;
            default:
                return new ReentrantReadWriteLock();
        }
    }
}
