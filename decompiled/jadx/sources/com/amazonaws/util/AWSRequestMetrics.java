package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricType;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public class AWSRequestMetrics {
    protected final TimingInfo timingInfo;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Field implements RequestMetricType {
        AWSErrorCode,
        AWSRequestID,
        BytesProcessed,
        ClientExecuteTime,
        CredentialsRequestTime,
        Exception,
        HttpRequestTime,
        RedirectLocation,
        RequestMarshallTime,
        RequestSigningTime,
        ResponseProcessingTime,
        RequestCount,
        RetryCount,
        HttpClientRetryCount,
        HttpClientSendRequestTime,
        HttpClientReceiveResponseTime,
        RetryPauseTime,
        ServiceEndpoint,
        ServiceName,
        StatusCode
    }

    public AWSRequestMetrics() {
        this.timingInfo = TimingInfo.startTiming();
    }

    public List<Object> getProperty(String str) {
        return Collections.EMPTY_LIST;
    }

    public final TimingInfo getTimingInfo() {
        return this.timingInfo;
    }

    public boolean isEnabled() {
        return false;
    }

    public void addProperty(String str, Object obj) {
    }

    public void endEvent(String str) {
    }

    public void incrementCounter(String str) {
    }

    public void setCounter(String str, long j) {
    }

    public void startEvent(String str) {
    }

    public List<Object> getProperty(MetricType metricType) {
        return Collections.EMPTY_LIST;
    }

    public AWSRequestMetrics(TimingInfo timingInfo) {
        this.timingInfo = timingInfo;
    }

    public void log() {
    }

    public void endEvent(MetricType metricType) {
    }

    public void incrementCounter(MetricType metricType) {
    }

    public void startEvent(MetricType metricType) {
    }

    public void addProperty(MetricType metricType, Object obj) {
    }

    public void setCounter(MetricType metricType, long j) {
    }
}
