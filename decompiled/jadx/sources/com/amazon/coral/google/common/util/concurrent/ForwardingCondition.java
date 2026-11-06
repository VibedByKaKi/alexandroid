package com.amazon.coral.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
abstract class ForwardingCondition implements Condition {
    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        return delegate().await(j, timeUnit);
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j) throws InterruptedException {
        return delegate().awaitNanos(j);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        delegate().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) throws InterruptedException {
        return delegate().awaitUntil(date);
    }

    public abstract Condition delegate();

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        delegate().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        delegate().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        delegate().await();
    }
}
