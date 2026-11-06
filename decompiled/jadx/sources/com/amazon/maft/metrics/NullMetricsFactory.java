package com.amazon.maft.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class NullMetricsFactory implements MetricsFactory {
    @Override // com.amazon.maft.metrics.MetricsFactory
    public NullPmetMetrics newPmetMetrics(String str) {
        return new NullPmetMetrics();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NullPmetMetrics implements PmetMetrics {
        @Override // com.amazon.maft.metrics.PmetMetrics
        public PmetMetrics addCustomerId() {
            return this;
        }

        @Override // com.amazon.maft.metrics.PmetMetrics
        public PmetMetrics addDeviceId() {
            return this;
        }

        @Override // com.amazon.maft.metrics.PmetMetrics
        public PmetMetrics addDeviceType() {
            return this;
        }

        @Override // com.amazon.maft.metrics.PmetMetrics
        public void record() {
        }

        @Override // com.amazon.maft.metrics.PmetMetrics
        public PmetMetrics addCount(String str, double d) {
            return this;
        }

        @Override // com.amazon.maft.metrics.PmetMetrics
        public PmetMetrics addProperty(String str, String str2) {
            return this;
        }

        @Override // com.amazon.maft.metrics.PmetMetrics
        public PmetMetrics addTime(String str, double d) {
            return this;
        }
    }
}
