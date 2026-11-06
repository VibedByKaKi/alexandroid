package com.amazon.alexa.client.metrics.minerva;

import android.util.Pair;
import com.amazon.minerva.client.thirdparty.api.MetricEvent;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MinervaMetricsFactory {
    private static final String MSHOP_GROUP_ID = "tltmuitq";
    private static final String MSHOP_SCHEMA_ID = "wcnh/2/03330400";
    private static final String MSHOP_SERVICE_NAME = "a4a_sdk_metrics_service_name";
    private static final String SAMPLE_APP_GROUP_ID = "w520kqf0";
    private static final String SAMPLE_APP_SCHEMA_ID = "e8lp/2/03330400";
    private static final String SAMPLE_APP_SERVICE_NAME = "SampleApp_alexaservice";
    private final HashMap<String, Pair<String, String>> metricSchemaMap;

    @Inject
    public MinervaMetricsFactory() {
        HashMap<String, Pair<String, String>> hashMap = new HashMap<>();
        this.metricSchemaMap = hashMap;
        hashMap.put(MSHOP_SERVICE_NAME, new Pair<>(MSHOP_GROUP_ID, MSHOP_SCHEMA_ID));
        hashMap.put(SAMPLE_APP_SERVICE_NAME, new Pair<>(SAMPLE_APP_GROUP_ID, SAMPLE_APP_SCHEMA_ID));
    }

    public MetricEvent createMinervaMetricEvent(String str) {
        Pair<String, String> pair = this.metricSchemaMap.get(str);
        return pair != null ? new MetricEvent((String) pair.first, (String) pair.second) : new MetricEvent(SAMPLE_APP_GROUP_ID, SAMPLE_APP_SCHEMA_ID);
    }
}
