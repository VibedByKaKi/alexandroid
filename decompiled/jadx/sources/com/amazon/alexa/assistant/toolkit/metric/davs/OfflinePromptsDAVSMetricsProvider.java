package com.amazon.alexa.assistant.toolkit.metric.davs;

import com.amazon.alexa.assistant.foundation.metric.model.MetricMetadata;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/metric/davs/OfflinePromptsDAVSMetricsProvider;", "Lcom/amazon/alexa/assistant/toolkit/metric/davs/DAVSMetricsProvider;", "<init>", "()V", "downloadAttemptedMetric", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "downloadFailedMetric", "downloadSucceededMetric", "downloadIgnoredMetric", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OfflinePromptsDAVSMetricsProvider implements DAVSMetricsProvider {

    @NotNull
    public static final OfflinePromptsDAVSMetricsProvider INSTANCE = new OfflinePromptsDAVSMetricsProvider();

    private OfflinePromptsDAVSMetricsProvider() {
    }

    @Override // com.amazon.alexa.assistant.toolkit.metric.davs.DAVSMetricsProvider
    @NotNull
    public MetricMetadata downloadAttemptedMetric() {
        return DAVSPresentationMetrics.BUNDLE_RESOURCE_DOWNLOAD_ATTEMPT.descriptor();
    }

    @Override // com.amazon.alexa.assistant.toolkit.metric.davs.DAVSMetricsProvider
    @NotNull
    public MetricMetadata downloadFailedMetric() {
        return DAVSPresentationMetrics.BUNDLE_RESOURCE_DOWNLOAD_FAILED.descriptor();
    }

    @Override // com.amazon.alexa.assistant.toolkit.metric.davs.DAVSMetricsProvider
    @NotNull
    public MetricMetadata downloadIgnoredMetric() {
        return DAVSPresentationMetrics.BUNDLE_VALIDATION_CACHE_HIT.descriptor();
    }

    @Override // com.amazon.alexa.assistant.toolkit.metric.davs.DAVSMetricsProvider
    @NotNull
    public MetricMetadata downloadSucceededMetric() {
        return DAVSPresentationMetrics.BUNDLE_RESOURCE_DOWNLOAD_SUCCEEDED.descriptor();
    }
}
