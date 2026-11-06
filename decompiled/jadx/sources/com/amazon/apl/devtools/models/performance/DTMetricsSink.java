package com.amazon.apl.devtools.models.performance;

import android.os.Handler;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.RootContext$$ExternalSyntheticLambda2;
import com.amazon.apl.android.metrics.APLWellknownMetricsSink;
import com.amazon.apl.android.metrics.MetricsEvent;
import com.amazon.apl.android.utils.MetricInfo;
import com.amazon.apl.devtools.util.DependencyContainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DTMetricsSink extends APLWellknownMetricsSink implements IMetricsService {
    private static final String TAG = "DTMetricsSink";
    private final List<MetricInfo> mCompletedMetrics;
    private final Handler mDTHandler;

    public DTMetricsSink() {
        this(DependencyContainer.getInstance().getTargetCatalog().getHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$metricPublished$0(MetricsEvent metricsEvent) {
        super.metricPublished(metricsEvent);
    }

    @Override // com.amazon.apl.devtools.models.performance.IMetricsService
    public void clearMetrics() {
        this.mCompletedMetrics.clear();
    }

    @Override // com.amazon.apl.android.metrics.APLWellknownMetricsSink
    public void counterPublished(String str, long j, Map<String, String> map) {
        this.mCompletedMetrics.add(new MetricInfo(str, j));
    }

    @Override // com.amazon.apl.android.metrics.APLWellknownMetricsSink, com.amazon.apl.android.metrics.IMetricsSink
    public void metricPublished(MetricsEvent metricsEvent) {
        this.mDTHandler.post(new RootContext$$ExternalSyntheticLambda2(this, metricsEvent, 7));
    }

    @Override // com.amazon.apl.devtools.models.performance.IMetricsService
    public List<MetricInfo> retrieveMetrics() {
        logAndReset();
        return this.mCompletedMetrics;
    }

    @Override // com.amazon.apl.android.metrics.APLWellknownMetricsSink
    public void segmentPublished(String str, long j, Map<String, String> map) {
        this.mCompletedMetrics.add(new MetricInfo(str, j / 1.0E9d));
    }

    @Override // com.amazon.apl.android.metrics.APLWellknownMetricsSink
    public void timerPublished(String str, long j, Map<String, String> map) {
        this.mCompletedMetrics.add(new MetricInfo(str, j / 1.0E9d));
    }

    @VisibleForTesting
    public DTMetricsSink(Handler handler) {
        super(-1L);
        this.mDTHandler = handler;
        this.mCompletedMetrics = new ArrayList();
    }
}
