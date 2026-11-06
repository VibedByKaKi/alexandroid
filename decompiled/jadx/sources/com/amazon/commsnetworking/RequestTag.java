package com.amazon.commsnetworking;

import androidx.annotation.NonNull;
import com.amazon.commsnetworking.metrics.MetricMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RequestTag {
    private MetricMetadata metricMetadata;
    private String requestId;

    public RequestTag(@NonNull String str, @NonNull MetricMetadata metricMetadata) {
        this.requestId = str;
        this.metricMetadata = metricMetadata;
    }

    public String getMetricName() {
        return this.metricMetadata.getMetricName();
    }

    public String getMetricOwnerId() {
        return this.metricMetadata.getMetricOwnerId();
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSource() {
        return this.metricMetadata.getSource();
    }

    public boolean includeCommsNetworkingPrefix() {
        return this.metricMetadata.includeCommsNetworkingPrefix();
    }

    public void setRequestId(@NonNull String str) {
        this.requestId = str;
    }
}
