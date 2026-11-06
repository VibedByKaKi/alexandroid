package com.amazonaws.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract class MetricCollector {
    public static final MetricCollector NONE = new MetricCollector() { // from class: com.amazonaws.metrics.MetricCollector.1
        @Override // com.amazonaws.metrics.MetricCollector
        public RequestMetricCollector getRequestMetricCollector() {
            return RequestMetricCollector.NONE;
        }

        @Override // com.amazonaws.metrics.MetricCollector
        public ServiceMetricCollector getServiceMetricCollector() {
            return ServiceMetricCollector.NONE;
        }

        @Override // com.amazonaws.metrics.MetricCollector
        public boolean isEnabled() {
            return false;
        }

        @Override // com.amazonaws.metrics.MetricCollector
        public boolean start() {
            return true;
        }

        @Override // com.amazonaws.metrics.MetricCollector
        public boolean stop() {
            return true;
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {
        MetricCollector getInstance();
    }

    public abstract RequestMetricCollector getRequestMetricCollector();

    public abstract ServiceMetricCollector getServiceMetricCollector();

    public abstract boolean isEnabled();

    public abstract boolean start();

    public abstract boolean stop();
}
