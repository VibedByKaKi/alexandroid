package com.amazon.alexa.apl.metrics;

import android.os.Bundle;
import com.amazon.alexa.api.AlexaMetadataBundleKey;
import com.amazon.alexa.api.UiEventName;
import com.amazon.apl.android.providers.ITelemetryProvider;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/apl/metrics/MetricsPublisher;", "Lcom/amazon/alexa/apl/metrics/MetricsManager;", "mAPLEventReporter", "Lcom/amazon/alexa/apl/metrics/APLEventReporter;", "(Lcom/amazon/alexa/apl/metrics/APLEventReporter;)V", "formatMetricDataToJson", "Lorg/json/JSONObject;", "metricModel", "Lcom/amazon/alexa/apl/metrics/MetricModel;", "recordAllMetrics", "", "recordSingleMetric", "metricId", "", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public class MetricsPublisher extends MetricsManager {

    @NotNull
    private static final String TAG = "MetricsPublisher";

    @NotNull
    private APLEventReporter mAPLEventReporter;

    @Inject
    public MetricsPublisher(@NotNull APLEventReporter aPLEventReporter) {
        aPLEventReporter.getClass();
        this.mAPLEventReporter = aPLEventReporter;
    }

    private final JSONObject formatMetricDataToJson(MetricModel metricModel) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AlexaMetadataBundleKey.TITLE.name(), metricModel.getName());
        if (metricModel.getMRequestId() != null) {
            jSONObject.put(AlexaMetadataBundleKey.DIALOG_REQUEST_ID.name(), metricModel.getMRequestId());
        }
        if (metricModel.getTelemetryProviderType() == ITelemetryProvider.Type.COUNTER) {
            if (metricModel.getMCounter() == Integer.MIN_VALUE) {
                return null;
            }
            jSONObject.put(AlexaMetadataBundleKey.EVENT_VALUE.name(), metricModel.getMCounter());
            return jSONObject;
        }
        if (metricModel.getTelemetryProviderType() != ITelemetryProvider.Type.TIMER || metricModel.getMLatency() == Long.MIN_VALUE) {
            return null;
        }
        jSONObject.put(AlexaMetadataBundleKey.LATENCY_REALTIME_MS.name(), metricModel.getMLatency());
        return jSONObject;
    }

    @Override // com.amazon.alexa.apl.metrics.MetricsManager
    public void recordAllMetrics() {
        JSONObject formatMetricDataToJson;
        Bundle bundle = new Bundle();
        int size = getMMetrics().size();
        for (int i = 0; i < size; i++) {
            MetricModel metricModel = getMetricModel(i);
            if (metricModel != null && (formatMetricDataToJson = formatMetricDataToJson(metricModel)) != null) {
                formatMetricDataToJson.toString();
                bundle.putString(String.valueOf(i), formatMetricDataToJson.toString());
                metricModel.reset();
            }
        }
        if (bundle.size() > 0) {
            this.mAPLEventReporter.sendEvent(UiEventName.PUBLISH_APL_METRICS, bundle);
        }
    }

    @Override // com.amazon.alexa.apl.metrics.MetricsManager
    public void recordSingleMetric(int metricId) {
        MetricModel metricModel = getMetricModel(metricId);
        if (metricModel == null) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject formatMetricDataToJson = formatMetricDataToJson(metricModel);
        if (formatMetricDataToJson == null) {
            return;
        }
        formatMetricDataToJson.toString();
        bundle.putString(String.valueOf(metricId), formatMetricDataToJson.toString());
        this.mAPLEventReporter.sendEvent(UiEventName.PUBLISH_APL_METRICS, bundle);
        getMMetrics().remove(metricId);
        getMMetricId().remove(metricModel.getName());
    }
}
