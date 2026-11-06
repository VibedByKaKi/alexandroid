package com.amazon.commscore.api.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AlexaCommsCoreMetricsService {
    @NonNull
    CounterMetric createCounter(@NonNull String str, @Nullable String str2, @NonNull String str3, @Nullable Map<String, Object> map);

    @NonNull
    CounterMetric createCounter(@NonNull String str, @Nullable String str2, @Nullable Map<String, Object> map);

    @NonNull
    InteractionMetric createInteractionMetric(@NonNull String str, @NonNull InteractionMetricType interactionMetricType, @NonNull String str2, @NonNull String str3, @Nullable Map<String, Object> map);

    @NonNull
    InteractionMetric createInteractionMetric(@NonNull String str, @NonNull InteractionMetricType interactionMetricType, @NonNull String str2, @Nullable Map<String, Object> map);

    @NonNull
    OperationalMetric createOperationalMetric(@NonNull String str, @NonNull OperationalMetricType operationalMetricType, @Nullable String str2, @NonNull String str3, @Nullable Map<String, Object> map);

    @NonNull
    OperationalMetric createOperationalMetric(@NonNull String str, @NonNull OperationalMetricType operationalMetricType, @Nullable String str2, @Nullable Map<String, Object> map);

    @NonNull
    TimerMetric createTimer(@NonNull String str, @Nullable String str2, long j, boolean z, @Nullable Map<String, Object> map);

    @NonNull
    TimerMetric createTimer(@NonNull String str, @Nullable String str2, @NonNull String str3, long j, boolean z, @Nullable Map<String, Object> map);

    @NonNull
    TimerMetric createTimer(@NonNull String str, @Nullable String str2, @NonNull String str3, @Nullable Map<String, Object> map);

    @NonNull
    TimerMetric createTimer(@NonNull String str, @Nullable String str2, @Nullable Map<String, Object> map);

    void recordCounter(@NonNull CounterMetric counterMetric);

    void recordCriticalEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable Throwable th);

    void recordCriticalEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable Throwable th);

    void recordInfoEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable Throwable th);

    void recordInfoEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable Throwable th);

    void recordInteractionMetric(@NonNull InteractionMetric interactionMetric);

    void recordOccurrence(@NonNull String str, @Nullable String str2, @NonNull String str3, boolean z, @Nullable Map<String, Object> map);

    void recordOccurrence(@NonNull String str, @Nullable String str2, boolean z, @Nullable Map<String, Object> map);

    void recordOperationalMetric(@NonNull OperationalMetric operationalMetric);

    void recordTimer(@NonNull TimerMetric timerMetric);

    void recordTimer(@NonNull String str);

    void recordWarningEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable Throwable th);

    void recordWarningEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable Throwable th);
}
