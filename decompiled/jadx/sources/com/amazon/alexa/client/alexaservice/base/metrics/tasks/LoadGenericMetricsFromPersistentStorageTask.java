package com.amazon.alexa.client.alexaservice.base.metrics.tasks;

import android.util.Log;
import com.amazon.alexa.client.alexaservice.ApiCallIdentifier;
import com.amazon.alexa.client.alexaservice.base.events.ClientMetricEvent;
import com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData;
import com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricsDao;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LoadGenericMetricsFromPersistentStorageTask implements Runnable {
    private static final String TAG = "LoadGenericMetricsFromPersistentStorageTask";
    private final ClientMetricsDao clientMetricsDao;
    private final AlexaClientEventBus eventBus;

    @Inject
    public LoadGenericMetricsFromPersistentStorageTask(AlexaClientEventBus alexaClientEventBus, ClientMetricsDao clientMetricsDao) {
        this.eventBus = alexaClientEventBus;
        this.clientMetricsDao = clientMetricsDao;
    }

    private boolean isLatencyMetric(ClientMetricData clientMetricData) {
        Long latencyMs = clientMetricData.getLatencyMs();
        return latencyMs != null && latencyMs.longValue() >= 0;
    }

    public List<ClientMetricData> getDatabaseRecords() {
        try {
            return this.clientMetricsDao.removeAllGenericClientMetrics();
        } catch (Exception e) {
            Log.e(TAG, "Error occurred while getting generic client metrics from DB ", e);
            return new ArrayList();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        for (ClientMetricData clientMetricData : getDatabaseRecords()) {
            String eventName = clientMetricData.getEventName();
            boolean isLatencyMetric = isLatencyMetric(clientMetricData);
            AlexaClientEventBus alexaClientEventBus = this.eventBus;
            if (isLatencyMetric) {
                alexaClientEventBus.post(ClientMetricEvent.RecordLatencyEvent.create(eventName, clientMetricData.getLatencyMs().longValue()));
            } else {
                alexaClientEventBus.post(ClientMetricEvent.RecordEvent.create(eventName, ApiCallIdentifier.create(clientMetricData.getApiCallId()), clientMetricData.getEventValue()));
            }
        }
    }
}
