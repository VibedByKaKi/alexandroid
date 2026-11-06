package com.amazon.blueshift.bluefront.android.metrics;

import com.amazonaws.cognito.clientcontext.datacollection.DataRecordKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum MetricKey {
    TOTAL_REQUEST_TIME("TotalRequestTime"),
    CONNECTION_TIME("ConnectionTime"),
    ENDPOINT_TO_RESPONSE_TIME("EndpointToResponseTime"),
    TIME_TO_START_PROCESSING_AUDIO("StartListeningToStartProcessingAudioTime"),
    REQUEST_CANCELLED("RequestCancelled"),
    CONNECTION_FAILED("ConnectionFailed"),
    AUTOMATIC_ENDPOINTING_USED("AutomaticEndpointingUsed"),
    REQUEST_FAILED("RequestFailed"),
    REQUEST_RETURNED_WITH_ERROR("RequestReturnedWithError"),
    CLIENT_NAME("ClientName"),
    REQUEST_ID("RequestId"),
    NETWORK_TYPE(DataRecordKey.NETWORK_TYPE),
    APP_VERSION("AppVersion"),
    CARRIER(DataRecordKey.NETWORK_OPERATOR),
    LIBRARY_VERSION("LibraryVersion"),
    LOCALE("Locale");

    private final String mMetricName;

    MetricKey(String str) {
        this.mMetricName = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mMetricName;
    }
}
