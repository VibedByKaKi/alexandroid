package com.amazon.photos.autosave.internal.metrics;

import com.amazon.clouddrive.android.core.interfaces.ClientMetric;
import com.amazon.clouddrive.android.core.interfaces.MetricRecordingType;
import com.amazon.clouddrive.android.core.interfaces.Metrics;
import com.amazon.photos.uploader.UploadCompleter$$ExternalSyntheticLambda1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ-\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010J%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/photos/autosave/internal/metrics/MetricsHelper;", "", "metrics", "Lcom/amazon/clouddrive/android/core/interfaces/Metrics;", "(Lcom/amazon/clouddrive/android/core/interfaces/Metrics;)V", "logMetricWithCount", "", "tag", "", "metric", "count", "", "logMetricWithCount$AndroidPhotosAutosave_release", "logMetricWithCountAndTimer", "timer", "", "logMetricWithCountAndTimer$AndroidPhotosAutosave_release", "logMetricWithTimer", "logMetricWithTimer$AndroidPhotosAutosave_release", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MetricsHelper {

    @NotNull
    private final Metrics metrics;

    public MetricsHelper(@NotNull Metrics metrics) {
        metrics.getClass();
        this.metrics = metrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logMetricWithCount$lambda$0(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logMetricWithCountAndTimer$lambda$2(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logMetricWithCountAndTimer$lambda$3(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logMetricWithTimer$lambda$1(String str) {
        str.getClass();
        return str;
    }

    public final void logMetricWithCount$AndroidPhotosAutosave_release(@NotNull String tag, @NotNull String metric, int count) {
        tag.getClass();
        metric.getClass();
        this.metrics.recordCustomMetric(tag, new ClientMetric().addCounter(new UploadCompleter$$ExternalSyntheticLambda1(metric, 5), count).withTagName(tag), new MetricRecordingType[0]);
    }

    public final void logMetricWithCountAndTimer$AndroidPhotosAutosave_release(@NotNull String tag, @NotNull String metric, int count, double timer) {
        tag.getClass();
        metric.getClass();
        this.metrics.recordCustomMetric(tag, new ClientMetric().addCounter(new UploadCompleter$$ExternalSyntheticLambda1(metric, 3), count).addTimer(new UploadCompleter$$ExternalSyntheticLambda1(metric, 4), timer).withTagName(tag), new MetricRecordingType[0]);
    }

    public final void logMetricWithTimer$AndroidPhotosAutosave_release(@NotNull String tag, @NotNull String metric, double timer) {
        tag.getClass();
        metric.getClass();
        this.metrics.recordCustomMetric(tag, new ClientMetric().addTimer(new UploadCompleter$$ExternalSyntheticLambda1(metric, 2), timer).withTagName(tag), new MetricRecordingType[0]);
    }
}
