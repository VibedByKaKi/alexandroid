package com.amazon.alexa.ra.common.metrics;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0002\u0010\u000bJ2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH¦@¢\u0006\u0002\u0010\u000fJ<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH¦@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0012J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0002\u0010\u0013J*\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH¦@¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H¦@¢\u0006\u0002\u0010\u0017J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0002\u0010\u0018JH\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH¦@¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ@\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH¦@¢\u0006\u0002\u0010\u0010¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/common/metrics/MetricEventProcessingApi;", "", "processLatencyEvent", "", "eventName", "Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;", "latency", "", "(Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eventSource", "", "(Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customMetadata", "", "Lcom/amazon/alexa/ra/common/metrics/CoreUiEventMetadataKey;", "(Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;JLjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;JLjava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processOccurrenceEvent", "(Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "occurrenceCount", "", "(Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "interactionType", "Lcom/amazon/alexa/ra/common/metrics/CoreUiInteractionType;", "(Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;ILjava/lang/String;Ljava/util/Map;Lcom/amazon/alexa/ra/common/metrics/CoreUiInteractionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTimer", "startTimestamp", "finishTimer", "finishTimestamp", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface MetricEventProcessingApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object finishTimer$default(MetricEventProcessingApi metricEventProcessingApi, CoreUiEventName coreUiEventName, long j, String str, Map map, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: finishTimer");
            return null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        return metricEventProcessingApi.finishTimer(coreUiEventName, j, str2, map, continuation);
    }

    static /* synthetic */ Object processOccurrenceEvent$default(MetricEventProcessingApi metricEventProcessingApi, CoreUiEventName coreUiEventName, int i, String str, Map map, CoreUiInteractionType coreUiInteractionType, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: processOccurrenceEvent");
            return null;
        }
        if ((i2 & 16) != 0) {
            coreUiInteractionType = null;
        }
        return metricEventProcessingApi.processOccurrenceEvent(coreUiEventName, i, str, map, coreUiInteractionType, continuation);
    }

    @Nullable
    Object finishTimer(@NotNull CoreUiEventName coreUiEventName, long j, @Nullable String str, @NotNull Map<CoreUiEventMetadataKey, ? extends Object> map, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object processLatencyEvent(@NotNull CoreUiEventName coreUiEventName, long j, @Nullable String str, @NotNull Map<CoreUiEventMetadataKey, ? extends Object> map, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object processLatencyEvent(@NotNull CoreUiEventName coreUiEventName, long j, @Nullable String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object processLatencyEvent(@NotNull CoreUiEventName coreUiEventName, long j, @NotNull Map<CoreUiEventMetadataKey, ? extends Object> map, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object processLatencyEvent(@NotNull CoreUiEventName coreUiEventName, long j, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object processOccurrenceEvent(@NotNull CoreUiEventName coreUiEventName, int i, @Nullable String str, @NotNull Map<CoreUiEventMetadataKey, ? extends Object> map, @Nullable CoreUiInteractionType coreUiInteractionType, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object processOccurrenceEvent(@NotNull CoreUiEventName coreUiEventName, int i, @Nullable String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object processOccurrenceEvent(@NotNull CoreUiEventName coreUiEventName, int i, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object processOccurrenceEvent(@NotNull CoreUiEventName coreUiEventName, @Nullable String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object processOccurrenceEvent(@NotNull CoreUiEventName coreUiEventName, @NotNull Map<CoreUiEventMetadataKey, ? extends Object> map, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object processOccurrenceEvent(@NotNull CoreUiEventName coreUiEventName, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object startTimer(@NotNull CoreUiEventName coreUiEventName, long j, @NotNull Continuation<? super Unit> continuation);
}
