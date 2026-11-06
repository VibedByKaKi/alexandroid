package com.amazon.photos.discovery.internal.dedupe.filter;

import com.amazon.clouddrive.android.core.interfaces.ClientMetric;
import com.amazon.clouddrive.android.core.interfaces.Logger;
import com.amazon.clouddrive.android.core.interfaces.MetricRecordingType;
import com.amazon.clouddrive.android.core.interfaces.Metrics;
import com.amazon.photos.discovery.metrics.DiscoveryMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/photos/discovery/internal/dedupe/filter/FilterUtils;", "", "metrics", "Lcom/amazon/clouddrive/android/core/interfaces/Metrics;", "logger", "Lcom/amazon/clouddrive/android/core/interfaces/Logger;", "(Lcom/amazon/clouddrive/android/core/interfaces/Metrics;Lcom/amazon/clouddrive/android/core/interfaces/Logger;)V", "recordFilterMetrics", "", "tag", "", "counterMetric", "Lcom/amazon/photos/discovery/metrics/DiscoveryMetrics;", "filteredCount", "", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FilterUtils {

    @NotNull
    private final Logger logger;

    @NotNull
    private final Metrics metrics;

    public FilterUtils(@NotNull Metrics metrics, @NotNull Logger logger) {
        metrics.getClass();
        logger.getClass();
        this.metrics = metrics;
        this.logger = logger;
    }

    public final void recordFilterMetrics(@NotNull String tag, @NotNull DiscoveryMetrics counterMetric, int filteredCount) {
        tag.getClass();
        counterMetric.getClass();
        this.metrics.recordCustomMetric(tag, new ClientMetric().withTagName(tag).addCounter(counterMetric, filteredCount), MetricRecordingType.STANDARD);
        this.logger.i(tag, "Skipped " + filteredCount + " items.");
    }
}
