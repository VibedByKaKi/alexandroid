package com.amazon.alexa.client.metrics.core;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ConditionalMetricsConnector implements MetricsConnector {
    private MetricsConnector conditionalConnector = null;
    private final GetConnector getConnector;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface GetConnector {
        MetricsConnector get();
    }

    public ConditionalMetricsConnector(@NonNull GetConnector getConnector) {
        this.getConnector = getConnector;
    }

    private MetricsConnector getConnector() {
        if (this.conditionalConnector == null) {
            this.conditionalConnector = this.getConnector.get();
        }
        return this.conditionalConnector;
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public void beginSession() {
        getConnector().beginSession();
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public void endSession() {
        getConnector().endSession();
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public void pauseSession() {
        getConnector().pauseSession();
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public void recordEvent(AlexaMetricsEvent alexaMetricsEvent) {
        getConnector().recordEvent(alexaMetricsEvent);
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public void resumeSession() {
        getConnector().resumeSession();
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public void shutdown() {
        getConnector().shutdown();
    }
}
