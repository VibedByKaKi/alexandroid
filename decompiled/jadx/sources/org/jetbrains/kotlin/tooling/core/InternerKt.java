package org.jetbrains.kotlin.tooling.core;

import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.tooling.core.InternerImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0005"}, d2 = {"Interner", "Lorg/jetbrains/kotlin/tooling/core/Interner;", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/util/concurrent/locks/Lock;", "WeakInterner", "kotlin-tooling-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class InternerKt {
    @NotNull
    public static final Interner Interner(@Nullable Lock lock) {
        return new InternerImpl(new InternerImpl.Store.Strong(), lock);
    }

    public static /* synthetic */ Interner Interner$default(Lock lock, int i, Object obj) {
        if ((i & 1) != 0) {
            lock = null;
        }
        return Interner(lock);
    }

    @NotNull
    public static final Interner WeakInterner(@Nullable Lock lock) {
        return new InternerImpl(new InternerImpl.Store.Weak(), lock);
    }

    public static /* synthetic */ Interner WeakInterner$default(Lock lock, int i, Object obj) {
        if ((i & 1) != 0) {
            lock = null;
        }
        return WeakInterner(lock);
    }
}
