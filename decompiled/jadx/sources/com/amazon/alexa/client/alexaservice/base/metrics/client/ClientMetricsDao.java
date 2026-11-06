package com.amazon.alexa.client.alexaservice.base.metrics.client;

import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ClientMetricsDao {
    List<ClientMetricData> removeAllGenericClientMetrics();

    List<ClientMetricData> removeAllTextClientMetrics();

    List<ClientMetricData> removeAllVoiceClientMetrics();

    List<ClientMetricData> removeTextClientMetrics(DialogTurnIdentifier dialogTurnIdentifier);

    List<ClientMetricData> removeVoiceClientMetrics(DialogTurnIdentifier dialogTurnIdentifier);

    void storeClientMetricData(ClientMetricData clientMetricData, MetricType metricType);

    void teardown();
}
