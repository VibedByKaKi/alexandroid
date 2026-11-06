package io.ktor.util;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import org.aspectj.lang.JoinPoint;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAPI
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/ktor/util/Lock;", "", "()V", "mutex", "Ljava/util/concurrent/locks/ReentrantLock;", JoinPoint.SYNCHRONIZATION_LOCK, "", JoinPoint.SYNCHRONIZATION_UNLOCK, "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class Lock {
    private final ReentrantLock mutex = new ReentrantLock();

    public final void lock() {
        this.mutex.lock();
    }

    public final void unlock() {
        this.mutex.unlock();
    }
}
