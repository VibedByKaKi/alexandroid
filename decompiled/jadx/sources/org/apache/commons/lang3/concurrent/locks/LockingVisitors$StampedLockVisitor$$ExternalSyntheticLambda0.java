package org.apache.commons.lang3.concurrent.locks;

import java.util.concurrent.locks.StampedLock;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class LockingVisitors$StampedLockVisitor$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StampedLock f$0;

    public /* synthetic */ LockingVisitors$StampedLockVisitor$$ExternalSyntheticLambda0(StampedLock stampedLock, int i) {
        this.$r8$classId = i;
        this.f$0 = stampedLock;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.$r8$classId;
        StampedLock stampedLock = this.f$0;
        switch (i) {
            case 0:
                return stampedLock.asReadLock();
            default:
                return stampedLock.asWriteLock();
        }
    }
}
