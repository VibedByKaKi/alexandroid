package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/*  JADX ERROR: Class process error: OutOfMemoryError
    java.lang.OutOfMemoryError: Java heap space
    	at java.base/java.util.ArrayList.iterator(ArrayList.java:1029)
    	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:111)
    	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
    	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:114)
    	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
    	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
    	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
    */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
public final class CachedPageEventFlow$downstreamFlow$1<T> extends SuspendLambda implements Function2<FlowCollector<? super PageEvent<T>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "it", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<IndexedValue<? extends PageEvent<T>>, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            r0 = new AnonymousClass1(continuation);
            r0.L$0 = obj;
            return r0;
        }

        @Nullable
        public final Object invoke(@Nullable IndexedValue<? extends PageEvent<T>> indexedValue, @Nullable Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(indexedValue, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((IndexedValue) this.L$0) != null);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return invoke((IndexedValue) obj, continuation);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0018\u00010\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "indexedValue", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "emit", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<PageEvent<T>> $$this$flow;
        final /* synthetic */ Ref.IntRef $maxEventIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ref.IntRef intRef, FlowCollector<? super PageEvent<T>> flowCollector) {
            this.$maxEventIndex = intRef;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@org.jetbrains.annotations.Nullable kotlin.collections.IndexedValue<? extends androidx.paging.PageEvent<T>> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1 r0 = (androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1 r0 = new androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L32
                java.lang.Object r4 = r0.L$1
                r5 = r4
                kotlin.collections.IndexedValue r5 = (kotlin.collections.IndexedValue) r5
                java.lang.Object r4 = r0.L$0
                androidx.paging.CachedPageEventFlow$downstreamFlow$1$2 r4 = (androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass2) r4
                kotlin.ResultKt.throwOnFailure(r6)
                goto L5c
            L32:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
                r4 = 0
                return r4
            L39:
                kotlin.ResultKt.throwOnFailure(r6)
                r5.getClass()
                int r6 = r5.getIndex()
                kotlin.jvm.internal.Ref$IntRef r2 = r4.$maxEventIndex
                int r2 = r2.element
                if (r6 <= r2) goto L64
                kotlinx.coroutines.flow.FlowCollector<androidx.paging.PageEvent<T>> r6 = r4.$$this$flow
                java.lang.Object r2 = r5.getValue()
                r0.L$0 = r4
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L5c
                return r1
            L5c:
                kotlin.jvm.internal.Ref$IntRef r4 = r4.$maxEventIndex
                int r5 = r5.getIndex()
                r4.element = r5
            L64:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass2.emit(kotlin.collections.IndexedValue, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((IndexedValue) obj, (Continuation<? super Unit>) continuation);
        }
    }

    public CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow<T> cachedPageEventFlow, Continuation<? super CachedPageEventFlow$downstreamFlow$1> continuation) {
        this.this$0 = cachedPageEventFlow;
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        r0 = new CachedPageEventFlow$downstreamFlow$1(this.this$0, continuation);
        r0.L$0 = obj;
        return r0;
    }

    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super PageEvent<T>> flowCollector, @Nullable Continuation<? super Unit> continuation) {
        return ((CachedPageEventFlow$downstreamFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r1 = this.label;
        if (r1 == 0) {
            ResultKt.throwOnFailure(obj);
            r7 = (FlowCollector) this.L$0;
            r1 = new Ref.IntRef();
            r1.element = Integer.MIN_VALUE;
            r3 = ((CachedPageEventFlow) this.this$0).sharedForDownstream;
            r3 = FlowKt.takeWhile(r3, new AnonymousClass1(null));
            r4 = new AnonymousClass2(r1, r7);
            this.label = 1;
            if (r3.collect(r4, this) == r0) {
                return r0;
            }
        } else {
            if (r1 != 1) {
                Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((FlowCollector) obj, continuation);
    }
}
