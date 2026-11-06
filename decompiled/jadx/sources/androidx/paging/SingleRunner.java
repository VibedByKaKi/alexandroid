package androidx.paging;

import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0003\u000f\u0010\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J9\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/paging/SingleRunner;", "", "cancelPreviousInEqualPriority", "", "(Z)V", "holder", "Landroidx/paging/SingleRunner$Holder;", "runInIsolation", "", "priority", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancelIsolatedRunnerException", "Companion", "Holder", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SingleRunner {
    public static final int DEFAULT_PRIORITY = 0;

    @NotNull
    private final Holder holder;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "runner", "Landroidx/paging/SingleRunner;", "(Landroidx/paging/SingleRunner;)V", "getRunner", "()Landroidx/paging/SingleRunner;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CancelIsolatedRunnerException extends CancellationException {

        @NotNull
        private final SingleRunner runner;

        public CancelIsolatedRunnerException(@NotNull SingleRunner singleRunner) {
            singleRunner.getClass();
            this.runner = singleRunner;
        }

        @NotNull
        public final SingleRunner getRunner() {
            return this.runner;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/paging/SingleRunner$Holder;", "", "singleRunner", "Landroidx/paging/SingleRunner;", "cancelPreviousInEqualPriority", "", "(Landroidx/paging/SingleRunner;Z)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, "Lkotlinx/coroutines/Job;", "previousPriority", "", "onFinish", "", "job", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEnqueue", "priority", "(ILkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSingleRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleRunner.kt\nandroidx/paging/SingleRunner$Holder\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,123:1\n107#2,10:124\n107#2,10:134\n*S KotlinDebug\n*F\n+ 1 SingleRunner.kt\nandroidx/paging/SingleRunner$Holder\n*L\n92#1:124,10\n111#1:134,10\n*E\n"})
    public static final class Holder {
        private final boolean cancelPreviousInEqualPriority;

        @NotNull
        private final Mutex mutex;

        @Nullable
        private Job previous;
        private int previousPriority;

        @NotNull
        private final SingleRunner singleRunner;

        public Holder(@NotNull SingleRunner singleRunner, boolean z) {
            singleRunner.getClass();
            this.singleRunner = singleRunner;
            this.cancelPreviousInEqualPriority = z;
            this.mutex = MutexKt.Mutex$default(false, 1, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:11:0x0052, B:13:0x0056, B:14:0x005b), top: B:10:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object onFinish(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.SingleRunner$Holder$onFinish$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = (androidx.paging.SingleRunner$Holder$onFinish$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = new androidx.paging.SingleRunner$Holder$onFinish$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L38
                java.lang.Object r5 = r0.L$2
                kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
                java.lang.Object r6 = r0.L$1
                kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
                java.lang.Object r0 = r0.L$0
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                kotlin.ResultKt.throwOnFailure(r7)
                r7 = r5
                r5 = r0
                goto L52
            L38:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
                return r4
            L3e:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.sync.Mutex r7 = r5.mutex
                r0.L$0 = r5
                r0.L$1 = r6
                r0.L$2 = r7
                r0.label = r3
                java.lang.Object r0 = r7.lock(r4, r0)
                if (r0 != r1) goto L52
                return r1
            L52:
                kotlinx.coroutines.Job r0 = r5.previous     // Catch: java.lang.Throwable -> L59
                if (r6 != r0) goto L5b
                r5.previous = r4     // Catch: java.lang.Throwable -> L59
                goto L5b
            L59:
                r5 = move-exception
                goto L63
            L5b:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L59
                r7.unlock(r4)
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L63:
                r7.unlock(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.onFinish(kotlinx.coroutines.Job, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
        
            r2.cancel((java.util.concurrent.CancellationException) new androidx.paging.SingleRunner.CancelIsolatedRunnerException(r8.singleRunner));
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x006d, code lost:
        
            if (r11.lock(null, r0) == r1) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0099 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:14:0x00b0, B:31:0x0070, B:33:0x0074, B:35:0x007a, B:38:0x0080, B:43:0x008d, B:45:0x0099), top: B:30:0x0070 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object tryEnqueue(int r9, @org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r11) {
            /*
                Method dump skipped, instructions count: 193
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.tryEnqueue(int, kotlinx.coroutines.Job, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public SingleRunner(boolean z) {
        this.holder = new Holder(this, z);
    }

    public static /* synthetic */ Object runInIsolation$default(SingleRunner singleRunner, int i, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return singleRunner.runInIsolation(i, function1, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.getRunner() != r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        throw r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runInIsolation(int r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.paging.SingleRunner$runInIsolation$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.SingleRunner$runInIsolation$1 r0 = (androidx.paging.SingleRunner$runInIsolation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.SingleRunner$runInIsolation$1 r0 = new androidx.paging.SingleRunner$runInIsolation$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            androidx.paging.SingleRunner r4 = (androidx.paging.SingleRunner) r4
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            goto L50
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            androidx.paging.SingleRunner$runInIsolation$2 r7 = new androidx.paging.SingleRunner$runInIsolation$2     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            r0.L$0 = r4     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            r0.label = r3     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r7, r0)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            if (r4 != r1) goto L50
            return r1
        L4a:
            androidx.paging.SingleRunner r6 = r5.getRunner()
            if (r6 != r4) goto L53
        L50:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L53:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.runInIsolation(int, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public SingleRunner() {
        this(false, 1, null);
    }

    public /* synthetic */ SingleRunner(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
