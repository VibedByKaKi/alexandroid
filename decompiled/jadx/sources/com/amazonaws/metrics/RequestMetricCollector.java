package com.amazonaws.metrics;

import com.amazonaws.Request;
import com.amazonaws.Response;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract class RequestMetricCollector {
    public static final RequestMetricCollector NONE = new RequestMetricCollector() { // from class: com.amazonaws.metrics.RequestMetricCollector.1
        @Override // com.amazonaws.metrics.RequestMetricCollector
        public boolean isEnabled() {
            return false;
        }

        @Override // com.amazonaws.metrics.RequestMetricCollector
        public void collectMetrics(Request<?> request, Response<?> response) {
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {
        RequestMetricCollector getRequestMetricCollector();
    }

    public abstract void collectMetrics(Request<?> request, Response<?> response);

    public boolean isEnabled() {
        return true;
    }
}
