package com.amazonaws.util;

import com.amazonaws.metrics.ServiceMetricType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public enum AWSServiceMetrics implements ServiceMetricType {
    HttpClientGetConnectionTime("HttpClient");

    private final String serviceName;

    AWSServiceMetrics(String str) {
        this.serviceName = str;
    }

    @Override // com.amazonaws.metrics.ServiceMetricType
    public String getServiceName() {
        return this.serviceName;
    }
}
