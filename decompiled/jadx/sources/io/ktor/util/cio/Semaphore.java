package io.ktor.util.cio;

import io.ktor.util.InternalAPI;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAPI
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lio/ktor/util/cio/Semaphore;", "", "limit", "", "(I)V", "getLimit", "()I", "permits", "Lkotlinx/atomicfu/AtomicInt;", "waiters", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/coroutines/CancellableContinuation;", "", "enter", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leave", "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class Semaphore {
    static final AtomicIntegerFieldUpdater permits$FU = AtomicIntegerFieldUpdater.newUpdater(Semaphore.class, "permits");
    private final int limit;
    volatile int permits;
    private final ConcurrentHashMap<CancellableContinuation<Unit>, Unit> waiters = new ConcurrentHashMap<>();

    public Semaphore(int i) {
        this.limit = i;
        this.permits = i;
        if (i > 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Semaphore limit should be > 0");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object enter(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.util.cio.Semaphore$enter$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.util.cio.Semaphore$enter$1 r0 = (io.ktor.util.cio.Semaphore$enter$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.cio.Semaphore$enter$1 r0 = new io.ktor.util.cio.Semaphore$enter$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$0
            io.ktor.util.cio.Semaphore r5 = (io.ktor.util.cio.Semaphore) r5
            boolean r2 = r6 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L2e
            goto L3e
        L2e:
            kotlin.Result$Failure r6 = (kotlin.Result.Failure) r6
            java.lang.Throwable r5 = r6.exception
            throw r5
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L3a:
            boolean r2 = r6 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L8c
        L3e:
            int r6 = r5.permits
            if (r6 <= 0) goto L4f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = io.ktor.util.cio.Semaphore.permits$FU
            int r4 = r6 + (-1)
            boolean r2 = r2.compareAndSet(r5, r6, r4)
            if (r2 == 0) goto L4f
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L4f:
            r0.L$0 = r5
            r0.I$0 = r6
            r0.label = r3
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r6.<init>(r2, r3)
            java.util.concurrent.ConcurrentHashMap r2 = access$getWaiters$p(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r2.put(r6, r4)
            int r2 = r5.permits
            if (r2 <= 0) goto L7c
            java.util.concurrent.ConcurrentHashMap r2 = access$getWaiters$p(r5)
            java.lang.Object r2 = r2.remove(r6)
            if (r2 == 0) goto L7c
            java.lang.Object r2 = kotlin.Result.m25294constructorimpl(r4)
            r6.resumeWith(r2)
        L7c:
            java.lang.Object r6 = r6.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r2) goto L89
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L89:
            if (r6 != r1) goto L3e
            return r1
        L8c:
            kotlin.Result$Failure r6 = (kotlin.Result.Failure) r6
            java.lang.Throwable r5 = r6.exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.Semaphore.enter(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int getLimit() {
        return this.limit;
    }

    public final void leave() {
        int incrementAndGet = permits$FU.incrementAndGet(this);
        while (incrementAndGet > 0 && !this.waiters.isEmpty()) {
            CancellableContinuation<Unit> nextElement = this.waiters.keys().nextElement();
            if (nextElement != null && this.waiters.remove(nextElement) != null) {
                nextElement.resumeWith(Result.m25294constructorimpl(Unit.INSTANCE));
                incrementAndGet = this.permits;
            }
        }
    }
}
