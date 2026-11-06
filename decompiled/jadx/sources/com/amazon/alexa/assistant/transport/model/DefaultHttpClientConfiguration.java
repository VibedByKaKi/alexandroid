package com.amazon.alexa.assistant.transport.model;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/DefaultHttpClientConfiguration;", "Lcom/amazon/alexa/assistant/transport/model/HttpClientConfiguration;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultHttpClientConfiguration extends HttpClientConfiguration {
    public DefaultHttpClientConfiguration() {
        super(null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultHttpClientConfiguration)) {
            return false;
        }
        DefaultHttpClientConfiguration defaultHttpClientConfiguration = (DefaultHttpClientConfiguration) other;
        return getConnectionTimeoutMs() == defaultHttpClientConfiguration.getConnectionTimeoutMs() && getReadTimeoutMs() == defaultHttpClientConfiguration.getReadTimeoutMs() && getWriteTimeoutMs() == defaultHttpClientConfiguration.getWriteTimeoutMs() && getPingIntervalMs() == defaultHttpClientConfiguration.getPingIntervalMs() && getMaxIdleConnections() == defaultHttpClientConfiguration.getMaxIdleConnections() && getKeepAliveDurationMs() == defaultHttpClientConfiguration.getKeepAliveDurationMs();
    }

    public int hashCode() {
        return Long.hashCode(getKeepAliveDurationMs()) + ((getMaxIdleConnections() + ((Long.hashCode(getPingIntervalMs()) + ((Long.hashCode(getWriteTimeoutMs()) + ((Long.hashCode(getReadTimeoutMs()) + (Long.hashCode(getConnectionTimeoutMs()) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
