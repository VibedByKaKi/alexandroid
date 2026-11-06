package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1", f = "LiveTranscriptOverlay.kt", i = {}, l = {195, 200}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes18.dex */
public final class LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $followTail$delegate;
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1(ScrollState scrollState, MutableState<Boolean> mutableState, Continuation<? super LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$followTail$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1(this.$scrollState, this.$followTail$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r1.collect(r3, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r7)
            goto L54
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r6)
            r6 = 0
            return r6
        L19:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L31
        L1d:
            kotlin.ResultKt.throwOnFailure(r7)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r7 = r6.$followTail$delegate
            com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt.access$LiveTranscriptOverlay$lambda$9(r7, r3)
            androidx.compose.foundation.ScrollState r7 = r6.$scrollState
            r6.label = r3
            r1 = 0
            java.lang.Object r7 = com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt.access$followTailScroll(r7, r1, r6)
            if (r7 != r0) goto L31
            goto L53
        L31:
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef
            r7.<init>()
            androidx.compose.foundation.ScrollState r1 = r6.$scrollState
            com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$$ExternalSyntheticLambda0 r3 = new com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$$ExternalSyntheticLambda0
            r4 = 0
            r3.<init>(r1, r4)
            kotlinx.coroutines.flow.Flow r1 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r3)
            com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2 r3 = new com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2
            androidx.compose.foundation.ScrollState r4 = r6.$scrollState
            androidx.compose.runtime.MutableState<java.lang.Boolean> r5 = r6.$followTail$delegate
            r3.<init>(r4, r7, r5)
            r6.label = r2
            java.lang.Object r6 = r1.collect(r3, r6)
            if (r6 != r0) goto L54
        L53:
            return r0
        L54:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ MutableState<Boolean> $followTail$delegate;
        final /* synthetic */ Ref.IntRef $parkedAt;
        final /* synthetic */ ScrollState $scrollState;

        public AnonymousClass2(ScrollState scrollState, Ref.IntRef intRef, MutableState<Boolean> mutableState) {
            this.$scrollState = scrollState;
            this.$parkedAt = intRef;
            this.$followTail$delegate = mutableState;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(int r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2$emit$1 r0 = (com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2$emit$1 r0 = new com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L34
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.L$0
                com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2 r4 = (com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1.AnonymousClass2) r4
                kotlin.ResultKt.throwOnFailure(r6)
                goto L70
            L2d:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
                r4 = 0
                return r4
            L34:
                kotlin.ResultKt.throwOnFailure(r6)
                androidx.compose.foundation.ScrollState r6 = r4.$scrollState
                int r6 = r6.getValue()
                kotlin.jvm.internal.Ref$IntRef r2 = r4.$parkedAt
                int r2 = r2.element
                int r2 = r2 + (-4)
                if (r6 >= r2) goto L4c
                androidx.compose.runtime.MutableState<java.lang.Boolean> r6 = r4.$followTail$delegate
                r2 = 0
                com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt.access$LiveTranscriptOverlay$lambda$9(r6, r2)
                goto L5b
            L4c:
                androidx.compose.foundation.ScrollState r6 = r4.$scrollState
                int r6 = r6.getValue()
                int r2 = r5 + (-4)
                if (r6 < r2) goto L5b
                androidx.compose.runtime.MutableState<java.lang.Boolean> r6 = r4.$followTail$delegate
                com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt.access$LiveTranscriptOverlay$lambda$9(r6, r3)
            L5b:
                androidx.compose.runtime.MutableState<java.lang.Boolean> r6 = r4.$followTail$delegate
                boolean r6 = com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt.access$LiveTranscriptOverlay$lambda$8(r6)
                if (r6 == 0) goto L7a
                androidx.compose.foundation.ScrollState r6 = r4.$scrollState
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt.access$followTailScroll(r6, r5, r0)
                if (r5 != r1) goto L70
                return r1
            L70:
                kotlin.jvm.internal.Ref$IntRef r5 = r4.$parkedAt
                androidx.compose.foundation.ScrollState r4 = r4.$scrollState
                int r4 = r4.getValue()
                r5.element = r4
            L7a:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1.AnonymousClass2.emit(int, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
        }
    }
}
