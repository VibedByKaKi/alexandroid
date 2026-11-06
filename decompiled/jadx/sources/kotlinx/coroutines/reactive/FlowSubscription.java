package kotlinx.coroutines.reactive;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.CancellableKt;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalCoroutinesApi
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0002J\u000e\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\r\u001a\u00020\u000eX\u0082\u0004R\u0017\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00110\u0010X\u0082\u0004R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/reactive/FlowSubscription;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/reactivestreams/Subscription;", "Lkotlinx/coroutines/AbstractCoroutine;", "", "flow", "Lkotlinx/coroutines/flow/Flow;", "subscriber", "Lorg/reactivestreams/Subscriber;", "context", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lorg/reactivestreams/Subscriber;Lkotlin/coroutines/CoroutineContext;)V", "requested", "Lkotlinx/atomicfu/AtomicLong;", "producer", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlin/coroutines/Continuation;", "cancellationRequested", "", "createInitialContinuation", "flowProcessing", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumeFlow", "cancel", MissingTokenPull.TRIGGER_REQUEST, "n", "", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription\n+ 2 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,269:1\n159#2:270\n*S KotlinDebug\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription\n*L\n208#1:270\n*E\n"})
/* loaded from: classes10.dex */
public final class FlowSubscription<T> extends AbstractCoroutine<Unit> implements Subscription {
    private volatile boolean cancellationRequested;

    @JvmField
    @NotNull
    public final Flow<T> flow;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;

    @JvmField
    @NotNull
    public final Subscriber<? super T> subscriber;
    private static final /* synthetic */ AtomicLongFieldUpdater requested$volatile$FU = AtomicLongFieldUpdater.newUpdater(FlowSubscription.class, "requested$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater producer$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(FlowSubscription.class, Object.class, "producer$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public FlowSubscription(@NotNull Flow<? extends T> flow, @NotNull Subscriber<? super T> subscriber, @NotNull CoroutineContext coroutineContext) {
        super(coroutineContext, false, true);
        this.flow = flow;
        this.subscriber = subscriber;
        this.producer$volatile = createInitialContinuation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object consumeFlow(Continuation<? super Unit> continuation) {
        Object collect = this.flow.collect(new FlowCollector(this) { // from class: kotlinx.coroutines.reactive.FlowSubscription$consumeFlow$2
            final /* synthetic */ FlowSubscription<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t, Continuation<? super Unit> continuation2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
                this.this$0.subscriber.onNext(t);
                atomicLongFieldUpdater = FlowSubscription.requested$volatile$FU;
                long decrementAndGet = atomicLongFieldUpdater.decrementAndGet(this.this$0);
                FlowSubscription<T> flowSubscription = this.this$0;
                if (decrementAndGet > 0) {
                    JobKt.ensureActive(flowSubscription.getCoroutineContext());
                    return Unit.INSTANCE;
                }
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation2), 1);
                cancellableContinuationImpl.initCancellability();
                atomicReferenceFieldUpdater = FlowSubscription.producer$volatile$FU;
                atomicReferenceFieldUpdater.set(flowSubscription, cancellableContinuationImpl);
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation2);
                }
                return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    private final Continuation<Unit> createInitialContinuation() {
        final CoroutineContext coroutineContext = getCoroutineContext();
        return new Continuation<Unit>() { // from class: kotlinx.coroutines.reactive.FlowSubscription$createInitialContinuation$$inlined$Continuation$1
            @Override // kotlin.coroutines.Continuation
            /* renamed from: getContext, reason: from getter */
            public CoroutineContext get$context() {
                return CoroutineContext.this;
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object result) {
                CancellableKt.startCoroutineCancellable(new FlowSubscription$createInitialContinuation$1$1(this), this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|14|15))|7|(0)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r4.getCoroutineContext(), r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flowProcessing(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r0 = (kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r0 = new kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.reactive.FlowSubscription r4 = (kotlinx.coroutines.reactive.FlowSubscription) r4
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2d
            goto L44
        L2d:
            r5 = move-exception
            goto L55
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L36:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r4.consumeFlow(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L44
            return r1
        L44:
            org.reactivestreams.Subscriber<? super T> r5 = r4.subscriber     // Catch: java.lang.Throwable -> L4a
            r5.onComplete()     // Catch: java.lang.Throwable -> L4a
            goto L52
        L4a:
            r5 = move-exception
            kotlin.coroutines.CoroutineContext r4 = r4.getCoroutineContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r4, r5)
        L52:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L55:
            boolean r0 = r4.cancellationRequested
            if (r0 == 0) goto L65
            boolean r0 = r4.isActive()
            if (r0 != 0) goto L65
            java.util.concurrent.CancellationException r0 = r4.getCancellationException()
            if (r5 == r0) goto L76
        L65:
            org.reactivestreams.Subscriber<? super T> r0 = r4.subscriber     // Catch: java.lang.Throwable -> L6b
            r0.onError(r5)     // Catch: java.lang.Throwable -> L6b
            goto L76
        L6b:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r5, r0)
            kotlin.coroutines.CoroutineContext r4 = r4.getCoroutineContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r4, r5)
        L76:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.FlowSubscription.flowProcessing(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ long getAndUpdate$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Long> function1) {
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
        while (true) {
            long j = atomicLongFieldUpdater2.get(obj);
            Object obj2 = obj;
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (atomicLongFieldUpdater3.compareAndSet(obj2, j, function1.invoke(Long.valueOf(j)).longValue())) {
                return j;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            obj = obj2;
        }
    }

    private final /* synthetic */ Object getProducer$volatile() {
        return this.producer$volatile;
    }

    private final /* synthetic */ long getRequested$volatile() {
        return this.requested$volatile;
    }

    private final /* synthetic */ void setProducer$volatile(Object obj) {
        this.producer$volatile = obj;
    }

    private final /* synthetic */ void setRequested$volatile(long j) {
        this.requested$volatile = j;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public void cancel() {
        this.cancellationRequested = true;
        cancel((CancellationException) null);
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n) {
        long j;
        FlowSubscription<T> flowSubscription;
        Continuation continuation;
        if (n <= 0) {
            return;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = requested$volatile$FU;
        while (true) {
            j = atomicLongFieldUpdater.get(this);
            long j2 = j + n;
            if (j2 <= 0) {
                j2 = Long.MAX_VALUE;
            }
            flowSubscription = this;
            if (atomicLongFieldUpdater.compareAndSet(flowSubscription, j, j2)) {
                break;
            } else {
                this = flowSubscription;
            }
        }
        if (j <= 0) {
            do {
                continuation = (Continuation) producer$volatile$FU.getAndSet(flowSubscription, null);
            } while (continuation == null);
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m25294constructorimpl(Unit.INSTANCE));
        }
    }
}
