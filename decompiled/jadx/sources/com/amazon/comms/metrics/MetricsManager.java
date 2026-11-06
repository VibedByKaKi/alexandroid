package com.amazon.comms.metrics;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MetricsManager {
    private static final MetricsDestination[] TAC_DEFAULT_METRIC_DESTINATION = {MetricsDestination.MINERVA};
    private final String mDomainName;
    private final Map<String, UnifiedMetricEvent> mUnifiedMetricEvents;
    private final UnifiedMetricsFactory mUnifiedMetricsFactory;

    public MetricsManager(Context context, String str) {
        this.mUnifiedMetricsFactory = UnifiedMetricsFactoryImpl.getInstance();
        this.mDomainName = str;
        this.mUnifiedMetricEvents = new HashMap();
    }

    private UnifiedMetricEvent getOrCreateMetricEvent(String str) {
        if (!hasMetricEvent(str)) {
            this.mUnifiedMetricEvents.put(str, this.mUnifiedMetricsFactory.createMetricEvent(this.mDomainName, str));
        }
        return this.mUnifiedMetricEvents.get(str);
    }

    private boolean hasMetricEvent(String str) {
        return this.mUnifiedMetricEvents.containsKey(str);
    }

    public void addCounter(String str, String str2) {
        getOrCreateMetricEvent(str).addCounter(str2, 0.0d);
    }

    public void addMetadata(String str, String str2, String str3) {
        getOrCreateMetricEvent(str).addMetadata(str2, str3);
    }

    public void addTimer(String str, String str2) {
        getOrCreateMetricEvent(str).addTimer(str2, 0.0d);
    }

    public UnifiedMetricEvent createMetricEvent(String str) {
        return getOrCreateMetricEvent(str);
    }

    public String getMetricManagerDomainName() {
        return this.mDomainName;
    }

    public void incrementCounter(String str, String str2, double d) {
        getOrCreateMetricEvent(str).incrementCounter(str2, d);
    }

    public void record(String str, MetricsMetadataProvider metricsMetadataProvider, MetricsDestination[] metricsDestinationArr) {
        if (hasMetricEvent(str)) {
            UnifiedMetricEvent orCreateMetricEvent = getOrCreateMetricEvent(str);
            HashMap hashMap = new HashMap();
            metricsMetadataProvider.provideMetricsMetadata(str, hashMap);
            for (Map.Entry entry : hashMap.entrySet()) {
                orCreateMetricEvent.addMetadata((String) entry.getKey(), (String) entry.getValue());
            }
            for (MetricsDestination metricsDestination : metricsDestinationArr) {
                this.mUnifiedMetricsFactory.record(orCreateMetricEvent, metricsDestination);
            }
        }
    }

    public void removeCounter(String str, String str2) {
        if (hasMetricEvent(str)) {
            getOrCreateMetricEvent(str).removeCounter(str2);
        }
    }

    public void removeTimer(String str, String str2) {
        if (hasMetricEvent(str)) {
            getOrCreateMetricEvent(str).removeTimer(str2);
        }
    }

    public void startTimer(String str, String str2) {
        getOrCreateMetricEvent(str).startTimer(str2);
    }

    public void stopTimer(String str, String str2) {
        if (hasMetricEvent(str)) {
            getOrCreateMetricEvent(str).stopTimer(str2);
        }
    }

    public void incrementCounter(String str, String str2) {
        incrementCounter(str, str2, 1.0d);
    }

    public MetricsManager(UnifiedMetricsFactory unifiedMetricsFactory, String str) {
        this.mUnifiedMetricsFactory = unifiedMetricsFactory;
        this.mDomainName = str;
        this.mUnifiedMetricEvents = new HashMap();
    }

    public void record(String str, MetricsDestination[] metricsDestinationArr) {
        if (hasMetricEvent(str)) {
            UnifiedMetricEvent orCreateMetricEvent = getOrCreateMetricEvent(str);
            for (MetricsDestination metricsDestination : metricsDestinationArr) {
                this.mUnifiedMetricsFactory.record(orCreateMetricEvent, metricsDestination);
            }
        }
    }

    public void record(String str, MetricsMetadataProvider metricsMetadataProvider) {
        record(str, metricsMetadataProvider, TAC_DEFAULT_METRIC_DESTINATION);
    }

    public void record(String str) {
        record(str, TAC_DEFAULT_METRIC_DESTINATION);
    }
}
