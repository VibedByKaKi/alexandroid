package com.amazon.alexa.assistant.transport.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/HttpClientConfiguration;", "", "<init>", "()V", "connectionTimeoutMs", "", "getConnectionTimeoutMs", "()J", "readTimeoutMs", "getReadTimeoutMs", "writeTimeoutMs", "getWriteTimeoutMs", "pingIntervalMs", "getPingIntervalMs", "maxIdleConnections", "", "getMaxIdleConnections", "()I", "keepAliveDurationMs", "getKeepAliveDurationMs", "Lcom/amazon/alexa/assistant/transport/model/AVSHttpClientConfiguration;", "Lcom/amazon/alexa/assistant/transport/model/DAVSHttpClientConfiguration;", "Lcom/amazon/alexa/assistant/transport/model/DefaultHttpClientConfiguration;", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class HttpClientConfiguration {
    private final long connectionTimeoutMs;
    private final long keepAliveDurationMs;
    private final int maxIdleConnections;
    private final long pingIntervalMs;
    private final long readTimeoutMs;
    private final long writeTimeoutMs;

    private HttpClientConfiguration() {
        this.connectionTimeoutMs = 10000L;
        this.readTimeoutMs = 10000L;
        this.writeTimeoutMs = 10000L;
        this.maxIdleConnections = 5;
        this.keepAliveDurationMs = 300000L;
    }

    public long getConnectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    public long getKeepAliveDurationMs() {
        return this.keepAliveDurationMs;
    }

    public int getMaxIdleConnections() {
        return this.maxIdleConnections;
    }

    public long getPingIntervalMs() {
        return this.pingIntervalMs;
    }

    public long getReadTimeoutMs() {
        return this.readTimeoutMs;
    }

    public long getWriteTimeoutMs() {
        return this.writeTimeoutMs;
    }

    public /* synthetic */ HttpClientConfiguration(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
