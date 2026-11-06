package com.amazon.comms.calling.foundation.metrics.providers;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.comms.calling.foundation.metrics.api.CounterMetric;
import com.amazon.comms.calling.foundation.metrics.api.InteractionMetric;
import com.amazon.comms.calling.foundation.metrics.api.InteractionMetricType;
import com.amazon.comms.calling.foundation.metrics.api.OperationalMetric;
import com.amazon.comms.calling.foundation.metrics.api.OperationalMetricType;
import com.amazon.comms.calling.foundation.metrics.api.TimerMetric;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&J8\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&J8\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&J@\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&JH\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&J8\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u00162\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&J@\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00162\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&J,\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J4\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J,\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J4\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J,\u0010 \u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J4\u0010 \u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000bH&J\u0012\u0010\"\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000bH&J8\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&JB\u0010$\u001a\u0004\u0018\u00010\u00072\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&J8\u0010(\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020)2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&J@\u0010(\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020)2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&¨\u0006*"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/providers/MetricsProvider;", "", "recordOperationalMetric", "", "metric", "Lcom/amazon/comms/calling/foundation/metrics/api/OperationalMetric;", "recordInteractionMetric", "Lcom/amazon/comms/calling/foundation/metrics/api/InteractionMetric;", "createCounter", "Lcom/amazon/comms/calling/foundation/metrics/api/CounterMetric;", "counterName", "", "subComponent", "customEntries", "", "ownerIdentifier", "createTimer", "Lcom/amazon/comms/calling/foundation/metrics/api/TimerMetric;", "timerName", "initialElapsedTime", "", "startTimer", "", "recordOccurrence", "occurrenceName", "eventOccurred", "recordCriticalEvent", "error", "errorTitle", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "", "recordInfoEvent", "recordWarningEvent", "recordCounter", "recordTimer", "removeTimer", "createInteractionMetric", "name", "type", "Lcom/amazon/comms/calling/foundation/metrics/api/InteractionMetricType;", "createOperationalMetric", "Lcom/amazon/comms/calling/foundation/metrics/api/OperationalMetricType;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface MetricsProvider {
    @NotNull
    CounterMetric createCounter(@NotNull String counterName, @Nullable String subComponent, @NotNull String ownerIdentifier, @Nullable Map<String, ? extends Object> customEntries);

    @NotNull
    CounterMetric createCounter(@NotNull String counterName, @Nullable String subComponent, @Nullable Map<String, ? extends Object> customEntries);

    @Nullable
    InteractionMetric createInteractionMetric(@NotNull String name, @NotNull InteractionMetricType type, @Nullable String subComponent, @NotNull String ownerIdentifier, @Nullable Map<String, ? extends Object> customEntries);

    @NotNull
    InteractionMetric createInteractionMetric(@NotNull String name, @NotNull InteractionMetricType type, @Nullable String subComponent, @Nullable Map<String, ? extends Object> customEntries);

    @NotNull
    OperationalMetric createOperationalMetric(@NotNull String name, @NotNull OperationalMetricType type, @Nullable String subComponent, @NotNull String ownerIdentifier, @Nullable Map<String, ? extends Object> customEntries);

    @NotNull
    OperationalMetric createOperationalMetric(@NotNull String name, @NotNull OperationalMetricType type, @Nullable String subComponent, @Nullable Map<String, ? extends Object> customEntries);

    @NotNull
    TimerMetric createTimer(@NotNull String timerName, @Nullable String subComponent, long initialElapsedTime, boolean startTimer, @Nullable Map<String, ? extends Object> customEntries);

    @NotNull
    TimerMetric createTimer(@NotNull String timerName, @Nullable String subComponent, @NotNull String ownerIdentifier, long initialElapsedTime, boolean startTimer, @Nullable Map<String, ? extends Object> customEntries);

    @NotNull
    TimerMetric createTimer(@NotNull String timerName, @Nullable String subComponent, @NotNull String ownerIdentifier, @Nullable Map<String, ? extends Object> customEntries);

    @NotNull
    TimerMetric createTimer(@NotNull String timerName, @Nullable String subComponent, @Nullable Map<String, ? extends Object> customEntries);

    void recordCounter(@NotNull CounterMetric metric);

    void recordCriticalEvent(@NotNull String error, @NotNull String errorTitle, @Nullable String subComponent, @NotNull String ownerIdentifier, @Nullable Throwable exception);

    void recordCriticalEvent(@NotNull String error, @NotNull String errorTitle, @Nullable String subComponent, @Nullable Throwable exception);

    void recordInfoEvent(@NotNull String error, @NotNull String errorTitle, @Nullable String subComponent, @NotNull String ownerIdentifier, @Nullable Throwable exception);

    void recordInfoEvent(@NotNull String error, @NotNull String errorTitle, @Nullable String subComponent, @Nullable Throwable exception);

    void recordInteractionMetric(@NotNull InteractionMetric metric);

    void recordOccurrence(@NotNull String occurrenceName, @Nullable String subComponent, @NotNull String ownerIdentifier, boolean eventOccurred, @Nullable Map<String, ? extends Object> customEntries);

    void recordOccurrence(@NotNull String occurrenceName, @Nullable String subComponent, boolean eventOccurred, @Nullable Map<String, ? extends Object> customEntries);

    void recordOperationalMetric(@NotNull OperationalMetric metric);

    void recordTimer(@Nullable TimerMetric metric);

    void recordTimer(@NotNull String timerName);

    void recordWarningEvent(@NotNull String error, @NotNull String errorTitle, @Nullable String subComponent, @NotNull String ownerIdentifier, @Nullable Throwable exception);

    void recordWarningEvent(@NotNull String error, @NotNull String errorTitle, @Nullable String subComponent, @Nullable Throwable exception);

    void removeTimer(@NotNull String timerName);
}
