package com.amazon.alexa.ra.sdk.metrics;

import android.util.Log;
import com.amazon.alexa.ra.common.metrics.CoreUiEventMetadataKey;
import com.amazon.alexa.ra.common.metrics.CoreUiEventName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService$finishTimer$3", f = "MetricEventProcessingService.kt", i = {0, 1}, l = {207, 169}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nMetricEventProcessingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetricEventProcessingService.kt\ncom/amazon/alexa/ra/sdk/metrics/MetricEventProcessingService$finishTimer$3\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,201:1\n120#2,10:202\n*S KotlinDebug\n*F\n+ 1 MetricEventProcessingService.kt\ncom/amazon/alexa/ra/sdk/metrics/MetricEventProcessingService$finishTimer$3\n*L\n167#1:202,10\n*E\n"})
/* loaded from: classes19.dex */
public final class MetricEventProcessingService$finishTimer$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final /* synthetic */ Map<CoreUiEventMetadataKey, Object> $customMetadata;
    final /* synthetic */ CoreUiEventName $eventName;
    final /* synthetic */ String $eventSource;
    final /* synthetic */ long $finishTimestamp;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MetricEventProcessingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricEventProcessingService$finishTimer$3(MetricEventProcessingService metricEventProcessingService, CoreUiEventName coreUiEventName, long j, String str, Map<CoreUiEventMetadataKey, ? extends Object> map, Continuation<? super MetricEventProcessingService$finishTimer$3> continuation) {
        super(2, continuation);
        this.this$0 = metricEventProcessingService;
        this.$eventName = coreUiEventName;
        this.$finishTimestamp = j;
        this.$eventSource = str;
        this.$customMetadata = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$2$lambda$1() {
        String str;
        str = MetricEventProcessingService.TAG;
        return Log.e(str, "Can not find start time stamp corresponding to the event, ignoring recording the timer metric");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MetricEventProcessingService$finishTimer$3(this.this$0, this.$eventName, this.$finishTimestamp, this.$eventSource, this.$customMetadata, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((MetricEventProcessingService$finishTimer$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r14.label
            r1 = 2
            r2 = 1
            r8 = 0
            if (r0 == 0) goto L47
            if (r0 == r2) goto L2a
            if (r0 != r1) goto L23
            java.lang.Object r0 = r14.L$2
            com.amazon.alexa.ra.common.metrics.CoreUiEventName r0 = (com.amazon.alexa.ra.common.metrics.CoreUiEventName) r0
            java.lang.Object r1 = r14.L$1
            com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService r1 = (com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService) r1
            java.lang.Object r2 = r14.L$0
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L20
            goto L9f
        L20:
            r0 = move-exception
            goto Lb9
        L23:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r0)
            r0 = 0
            return r0
        L2a:
            long r2 = r14.J$0
            java.lang.Object r0 = r14.L$4
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r4 = r14.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r14.L$2
            com.amazon.alexa.ra.common.metrics.CoreUiEventName r5 = (com.amazon.alexa.ra.common.metrics.CoreUiEventName) r5
            java.lang.Object r9 = r14.L$1
            com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService r9 = (com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService) r9
            java.lang.Object r10 = r14.L$0
            kotlinx.coroutines.sync.Mutex r10 = (kotlinx.coroutines.sync.Mutex) r10
            kotlin.ResultKt.throwOnFailure(r15)
            r13 = r5
            r5 = r0
            r0 = r13
            goto L74
        L47:
            kotlin.ResultKt.throwOnFailure(r15)
            com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService r0 = r14.this$0
            kotlinx.coroutines.sync.Mutex r0 = com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService.access$getTimerMutex$p(r0)
            com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService r9 = r14.this$0
            com.amazon.alexa.ra.common.metrics.CoreUiEventName r5 = r14.$eventName
            long r3 = r14.$finishTimestamp
            java.lang.String r10 = r14.$eventSource
            java.util.Map<com.amazon.alexa.ra.common.metrics.CoreUiEventMetadataKey, java.lang.Object> r11 = r14.$customMetadata
            r14.L$0 = r0
            r14.L$1 = r9
            r14.L$2 = r5
            r14.L$3 = r10
            r14.L$4 = r11
            r14.J$0 = r3
            r14.label = r2
            java.lang.Object r2 = r0.lock(r8, r14)
            if (r2 != r7) goto L6f
            goto L9a
        L6f:
            r2 = r3
            r4 = r10
            r10 = r0
            r0 = r5
            r5 = r11
        L74:
            java.util.Map r11 = com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService.access$getTimerTrackingMap$p(r9)     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r11 = r11.get(r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.Throwable -> Lac
            if (r11 == 0) goto Laf
            long r11 = r11.longValue()     // Catch: java.lang.Throwable -> Lac
            long r2 = r2 - r11
            r14.L$0 = r10     // Catch: java.lang.Throwable -> Lac
            r14.L$1 = r9     // Catch: java.lang.Throwable -> Lac
            r14.L$2 = r0     // Catch: java.lang.Throwable -> Lac
            r14.L$3 = r8     // Catch: java.lang.Throwable -> Lac
            r14.L$4 = r8     // Catch: java.lang.Throwable -> Lac
            r14.label = r1     // Catch: java.lang.Throwable -> Lac
            r6 = r14
            r1 = r0
            r0 = r9
            java.lang.Object r2 = r0.processLatencyEvent(r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> Lac
            if (r2 != r7) goto L9b
        L9a:
            return r7
        L9b:
            r2 = r1
            r1 = r0
            r0 = r2
            r2 = r10
        L9f:
            java.util.Map r1 = com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService.access$getTimerTrackingMap$p(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto Lb5
            goto Lb0
        Lac:
            r0 = move-exception
            r2 = r10
            goto Lb9
        Laf:
            r2 = r10
        Lb0:
            com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService$finishTimer$3$$ExternalSyntheticLambda0 r0 = new com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService$finishTimer$3$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
        Lb5:
            r2.unlock(r8)
            return r0
        Lb9:
            r2.unlock(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.sdk.metrics.MetricEventProcessingService$finishTimer$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, (Continuation<Object>) continuation);
    }
}
