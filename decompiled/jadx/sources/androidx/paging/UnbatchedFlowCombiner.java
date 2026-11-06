package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003Be\u0012[\u0010\u0004\u001aW\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ#\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001dR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000Rh\u0010\u0004\u001aW\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0013R\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/paging/UnbatchedFlowCombiner;", "T1", "T2", "", "send", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "t1", "t2", "Landroidx/paging/CombineSource;", "updateFrom", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function4;)V", "initialDispatched", "Lkotlinx/coroutines/CompletableDeferred;", JoinPoint.SYNCHRONIZATION_LOCK, "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/jvm/functions/Function4;", "valueReceived", "", "[Lkotlinx/coroutines/CompletableDeferred;", "values", "[Ljava/lang/Object;", "onNext", "index", "", "value", "(ILjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/UnbatchedFlowCombiner\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n107#2,8:225\n116#2:237\n115#2:238\n12744#3,2:233\n18987#3,2:235\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/paging/UnbatchedFlowCombiner\n*L\n196#1:225,8\n196#1:237\n196#1:238\n197#1:233,2\n200#1:235,2\n*E\n"})
/* loaded from: classes14.dex */
public final class UnbatchedFlowCombiner<T1, T2> {

    @NotNull
    private final CompletableDeferred<Unit> initialDispatched;

    @NotNull
    private final Mutex lock;

    @NotNull
    private final Function4<T1, T2, CombineSource, Continuation<? super Unit>, Object> send;

    @NotNull
    private final CompletableDeferred<Unit>[] valueReceived;

    @NotNull
    private final Object[] values;

    /* JADX WARN: Multi-variable type inference failed */
    public UnbatchedFlowCombiner(@NotNull Function4<? super T1, ? super T2, ? super CombineSource, ? super Continuation<? super Unit>, ? extends Object> function4) {
        Object obj;
        function4.getClass();
        this.send = function4;
        this.initialDispatched = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.lock = MutexKt.Mutex$default(false, 1, null);
        CompletableDeferred<Unit>[] completableDeferredArr = new CompletableDeferred[2];
        for (int i = 0; i < 2; i++) {
            completableDeferredArr[i] = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        }
        this.valueReceived = completableDeferredArr;
        Object[] objArr = new Object[2];
        for (int i2 = 0; i2 < 2; i2++) {
            obj = FlowExtKt.NULL;
            objArr[i2] = obj;
        }
        this.values = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0079, code lost:
    
        if (r15.await(r0) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:27:0x009d, B:29:0x00a4, B:34:0x00b7, B:36:0x00bf, B:38:0x00c9, B:43:0x00ce, B:44:0x00d8, B:50:0x00d3, B:51:0x00d6, B:31:0x00ae), top: B:26:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:27:0x009d, B:29:0x00a4, B:34:0x00b7, B:36:0x00bf, B:38:0x00c9, B:43:0x00ce, B:44:0x00d8, B:50:0x00d3, B:51:0x00d6, B:31:0x00ae), top: B:26:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:27:0x009d, B:29:0x00a4, B:34:0x00b7, B:36:0x00bf, B:38:0x00c9, B:43:0x00ce, B:44:0x00d8, B:50:0x00d3, B:51:0x00d6, B:31:0x00ae), top: B:26:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onNext(int r13, @org.jetbrains.annotations.Nullable java.lang.Object r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.UnbatchedFlowCombiner.onNext(int, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
