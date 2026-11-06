package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0005H¤@¢\u0006\u0002\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "()V", "didRun", "Lkotlinx/coroutines/CompletableDeferred;", "", "runMutex", "Lkotlinx/coroutines/sync/Mutex;", "awaitComplete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doRun", "runIfNeeded", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n*L\n495#1:539,10\n*E\n"})
/* loaded from: classes13.dex */
public abstract class RunOnce {

    @NotNull
    private final Mutex runMutex = MutexKt.Mutex$default(false, 1, null);

    @NotNull
    private final CompletableDeferred<Unit> didRun = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    @Nullable
    public final Object awaitComplete(@NotNull Continuation<? super Unit> continuation) {
        Object await = this.didRun.await(continuation);
        return await == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : Unit.INSTANCE;
    }

    @Nullable
    public abstract Object doRun(@NotNull Continuation<? super Unit> continuation);

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0066, code lost:
    
        if (r8.lock(null, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #1 {all -> 0x0077, blocks: (B:25:0x0069, B:27:0x0071, B:30:0x007c), top: B:24:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0077, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0077, blocks: (B:25:0x0069, B:27:0x0071, B:30:0x007c), top: B:24:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runIfNeeded(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.RunOnce$runIfNeeded$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce$runIfNeeded$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.RunOnce r0 = (androidx.datastore.core.RunOnce) r0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r8 = move-exception
            goto L96
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r7)
            r7 = 0
            return r7
        L3e:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.RunOnce r2 = (androidx.datastore.core.RunOnce) r2
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r2
            goto L69
        L4c:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.CompletableDeferred<kotlin.Unit> r8 = r7.didRun
            boolean r8 = r8.isCompleted()
            if (r8 == 0) goto L5a
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L5a:
            kotlinx.coroutines.sync.Mutex r8 = r7.runMutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r8.lock(r5, r0)
            if (r2 != r1) goto L69
            goto L88
        L69:
            kotlinx.coroutines.CompletableDeferred<kotlin.Unit> r2 = r7.didRun     // Catch: java.lang.Throwable -> L77
            boolean r2 = r2.isCompleted()     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L7c
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L77
            r8.unlock(r5)
            return r7
        L77:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            goto L96
        L7c:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L77
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L77
            r0.label = r3     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r7.doRun(r0)     // Catch: java.lang.Throwable -> L77
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            r0 = r7
            r7 = r8
        L8b:
            kotlinx.coroutines.CompletableDeferred<kotlin.Unit> r8 = r0.didRun     // Catch: java.lang.Throwable -> L35
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L35
            r8.complete(r0)     // Catch: java.lang.Throwable -> L35
            r7.unlock(r5)
            return r0
        L96:
            r7.unlock(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.RunOnce.runIfNeeded(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
