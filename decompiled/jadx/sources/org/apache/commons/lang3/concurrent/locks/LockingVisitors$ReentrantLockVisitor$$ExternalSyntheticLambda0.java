package org.apache.commons.lang3.concurrent.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;
import org.apache.commons.lang3.concurrent.locks.LockingVisitors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class LockingVisitors$ReentrantLockVisitor$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReentrantLock f$0;

    public /* synthetic */ LockingVisitors$ReentrantLockVisitor$$ExternalSyntheticLambda0(ReentrantLock reentrantLock, int i) {
        this.$r8$classId = i;
        this.f$0 = reentrantLock;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Lock lambda$new$0;
        Lock lambda$new$1;
        Lock lambda$setLock$0;
        Lock lambda$setLock$1;
        int i = this.$r8$classId;
        ReentrantLock reentrantLock = this.f$0;
        switch (i) {
            case 0:
                lambda$new$0 = LockingVisitors.ReentrantLockVisitor.lambda$new$0(reentrantLock);
                return lambda$new$0;
            case 1:
                lambda$new$1 = LockingVisitors.ReentrantLockVisitor.lambda$new$1(reentrantLock);
                return lambda$new$1;
            case 2:
                lambda$setLock$0 = LockingVisitors.ReentrantLockVisitor.Builder.lambda$setLock$0(reentrantLock);
                return lambda$setLock$0;
            default:
                lambda$setLock$1 = LockingVisitors.ReentrantLockVisitor.Builder.lambda$setLock$1(reentrantLock);
                return lambda$setLock$1;
        }
    }
}
