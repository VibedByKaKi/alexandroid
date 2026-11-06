package com.amazon.maft.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class NoOpPreloadMetricsFactory implements PreloadMetricsFactory {
    @Override // com.amazon.maft.metrics.PreloadMetricsFactory
    public NoOpPreloadMetrics newPreloadMetrics(String... strArr) {
        return new NoOpPreloadMetrics();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NoOpPreloadMetrics implements PreloadMetrics {
        @Override // com.amazon.maft.metrics.PreloadMetrics
        public PreloadMetrics addCustomerId() {
            return this;
        }

        @Override // com.amazon.maft.metrics.PreloadMetrics
        public PreloadMetrics addDeviceId() {
            return this;
        }

        @Override // com.amazon.maft.metrics.PreloadMetrics
        public PreloadMetrics addDeviceType() {
            return this;
        }

        @Override // com.amazon.maft.metrics.PreloadMetrics
        public void record() {
        }

        @Override // com.amazon.maft.metrics.PreloadMetrics
        public PreloadMetrics addCount(String str, double d) {
            return this;
        }

        @Override // com.amazon.maft.metrics.PreloadMetrics
        public PreloadMetrics addProperty(String str, String str2) {
            return this;
        }

        @Override // com.amazon.maft.metrics.PreloadMetrics
        public PreloadMetrics addTime(String str, double d) {
            return this;
        }
    }
}
