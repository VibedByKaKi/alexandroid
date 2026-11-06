package com.amazon.appmanager.lib.metrics;

import android.content.Context;
import com.amazon.maft.metrics.PreloadMetrics;
import com.amazon.maft.metrics.PreloadMetricsFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpMaftPreloadMetricsFactory implements PreloadMetricsFactory {
    public NoOpMaftPreloadMetricsFactory() {
    }

    @Override // com.amazon.maft.metrics.PreloadMetricsFactory
    public PreloadMetrics newPreloadMetrics(String... strArr) {
        return new PreloadMetrics() { // from class: com.amazon.appmanager.lib.metrics.NoOpMaftPreloadMetricsFactory.1
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
        };
    }

    public NoOpMaftPreloadMetricsFactory(Context context) {
    }

    public void flush() {
    }

    public void shutdown() {
    }
}
