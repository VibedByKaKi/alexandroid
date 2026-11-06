package com.amazonaws.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract class ServiceMetricCollector {
    public static final ServiceMetricCollector NONE = new ServiceMetricCollector() { // from class: com.amazonaws.metrics.ServiceMetricCollector.1
        @Override // com.amazonaws.metrics.ServiceMetricCollector
        public boolean isEnabled() {
            return false;
        }

        @Override // com.amazonaws.metrics.ServiceMetricCollector
        public void collectByteThroughput(ByteThroughputProvider byteThroughputProvider) {
        }

        @Override // com.amazonaws.metrics.ServiceMetricCollector
        public void collectLatency(ServiceLatencyProvider serviceLatencyProvider) {
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {
        ServiceMetricCollector getServiceMetricCollector();
    }

    public abstract void collectByteThroughput(ByteThroughputProvider byteThroughputProvider);

    public abstract void collectLatency(ServiceLatencyProvider serviceLatencyProvider);

    public boolean isEnabled() {
        return true;
    }
}
