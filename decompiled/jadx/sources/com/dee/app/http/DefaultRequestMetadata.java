package com.dee.app.http;

import com.dee.app.http.CoralService;
import com.dee.app.metrics.MetricDescriptor;
import com.dee.app.metrics.MetricsTimer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DefaultRequestMetadata implements CoralService.Request.Metadata {
    private String domain;
    private MetricDescriptor metricDescriptor;
    private String metricsSource;
    private MetricsTimer metricsTimer;
    private String operationName;

    @Override // com.dee.app.http.CoralService.Request.Metadata
    public String getDomain() {
        return this.domain;
    }

    @Override // com.dee.app.http.CoralService.Request.Metadata
    public MetricDescriptor getMetricDescriptor() {
        return this.metricDescriptor;
    }

    @Override // com.dee.app.http.CoralService.Request.Metadata
    public String getMetricsSource() {
        return this.metricsSource;
    }

    @Override // com.dee.app.http.CoralService.Request.Metadata
    public MetricsTimer getMetricsTimer() {
        return this.metricsTimer;
    }

    @Override // com.dee.app.http.CoralService.Request.Metadata
    public String getOperationName() {
        return this.operationName;
    }

    @Override // com.dee.app.http.CoralService.Request.Metadata
    public DefaultRequestMetadata setDomain(String str) {
        this.domain = str;
        return this;
    }

    @Override // com.dee.app.http.CoralService.Request.Metadata
    public DefaultRequestMetadata setMetricDescriptor(MetricDescriptor metricDescriptor) {
        this.metricDescriptor = metricDescriptor;
        return this;
    }

    @Override // com.dee.app.http.CoralService.Request.Metadata
    public DefaultRequestMetadata setMetricsSource(String str) {
        this.metricsSource = str;
        return this;
    }

    @Override // com.dee.app.http.CoralService.Request.Metadata
    public DefaultRequestMetadata setMetricsTimer(MetricsTimer metricsTimer) {
        this.metricsTimer = metricsTimer;
        return this;
    }

    @Override // com.dee.app.http.CoralService.Request.Metadata
    public DefaultRequestMetadata setOperationName(String str) {
        this.operationName = str;
        return this;
    }
}
