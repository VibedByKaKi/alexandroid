package com.amazon.alexa.assistant.toolkit.metric.model;

import com.amazon.alexa.assistant.foundation.metric.model.Metric;
import com.amazon.alexa.assistant.foundation.metric.model.MetricInteractionType;
import com.amazon.alexa.assistant.foundation.metric.model.MetricMetadata;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/metric/model/MetricsManager;", "", "addDecorators", "", "decorators", "", "Lcom/amazon/alexa/assistant/toolkit/metric/model/MetricsDecorator;", "record", "metric", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric;", "count", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "time", "value", "", "interaction", "type", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricInteractionType;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface MetricsManager {
    void addDecorators(@NotNull List<? extends MetricsDecorator> decorators);

    void record(@NotNull Metric metric);

    void record(@NotNull MetricMetadata count);

    void record(@NotNull MetricMetadata time, double value);

    void record(@NotNull MetricMetadata interaction, @NotNull MetricInteractionType type);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void record(@NotNull MetricsManager metricsManager, @NotNull MetricMetadata metricMetadata) {
            metricMetadata.getClass();
            metricsManager.record(new Metric.Counter(metricMetadata, 0, 2, (DefaultConstructorMarker) null));
        }

        public static void record(@NotNull MetricsManager metricsManager, @NotNull MetricMetadata metricMetadata, double d) {
            metricMetadata.getClass();
            metricsManager.record(new Metric.Timer(metricMetadata, d));
        }

        public static void record(@NotNull MetricsManager metricsManager, @NotNull MetricMetadata metricMetadata, @NotNull MetricInteractionType metricInteractionType) {
            metricMetadata.getClass();
            metricInteractionType.getClass();
            metricsManager.record(new Metric.Interaction(metricMetadata, metricInteractionType));
        }
    }
}
