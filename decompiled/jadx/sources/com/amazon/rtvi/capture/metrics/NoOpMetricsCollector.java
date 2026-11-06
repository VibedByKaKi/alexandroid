package com.amazon.rtvi.capture.metrics;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J(\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016J(\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J(\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016J(\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J(\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016J(\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u001c"}, d2 = {"Lcom/amazon/rtvi/capture/metrics/NoOpMetricsCollector;", "Lcom/amazon/rtvi/capture/metrics/MetricsCollector;", "<init>", "()V", "recordElapsedTimer", "", "metric", "", "subcomponent", "elapsedTimeMs", "", "finish", "", "recordOccurrence", "eventOccurred", "recordTimer", "finishTimer", "incrementCounter", "value", "recordCounter", "recordCriticalEvent", "errorTitle", "error", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "", "autoGenerateStacktrace", "recordWarningEvent", "recordInfoEvent", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NoOpMetricsCollector implements MetricsCollector {

    @NotNull
    public static final NoOpMetricsCollector INSTANCE = new NoOpMetricsCollector();

    private NoOpMetricsCollector() {
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void finishTimer(@NotNull String metric, @NotNull String subcomponent) {
        metric.getClass();
        subcomponent.getClass();
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void incrementCounter(@NotNull String metric, @NotNull String subcomponent, long value) {
        metric.getClass();
        subcomponent.getClass();
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void recordCounter(@NotNull String metric, @NotNull String subcomponent) {
        metric.getClass();
        subcomponent.getClass();
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void recordCriticalEvent(@NotNull String errorTitle, @NotNull String error, @NotNull Throwable exception, @NotNull String subcomponent) {
        errorTitle.getClass();
        error.getClass();
        exception.getClass();
        subcomponent.getClass();
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void recordElapsedTimer(@NotNull String metric, @NotNull String subcomponent, long elapsedTimeMs, boolean finish) {
        metric.getClass();
        subcomponent.getClass();
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void recordInfoEvent(@NotNull String errorTitle, @NotNull String error, @NotNull Throwable exception, @NotNull String subcomponent) {
        errorTitle.getClass();
        error.getClass();
        exception.getClass();
        subcomponent.getClass();
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void recordOccurrence(@NotNull String metric, boolean eventOccurred, @NotNull String subcomponent) {
        metric.getClass();
        subcomponent.getClass();
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void recordTimer(@NotNull String metric, @NotNull String subcomponent, boolean finish) {
        metric.getClass();
        subcomponent.getClass();
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void recordWarningEvent(@NotNull String errorTitle, @NotNull String error, @NotNull Throwable exception, @NotNull String subcomponent) {
        errorTitle.getClass();
        error.getClass();
        exception.getClass();
        subcomponent.getClass();
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void recordCriticalEvent(@NotNull String errorTitle, @NotNull String error, boolean autoGenerateStacktrace, @NotNull String subcomponent) {
        ParcelCompat$$ExternalSyntheticOutline0.m(errorTitle, error, subcomponent);
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void recordInfoEvent(@NotNull String errorTitle, @NotNull String error, boolean autoGenerateStacktrace, @NotNull String subcomponent) {
        ParcelCompat$$ExternalSyntheticOutline0.m(errorTitle, error, subcomponent);
    }

    @Override // com.amazon.rtvi.capture.metrics.MetricsCollector
    public void recordWarningEvent(@NotNull String errorTitle, @NotNull String error, boolean autoGenerateStacktrace, @NotNull String subcomponent) {
        ParcelCompat$$ExternalSyntheticOutline0.m(errorTitle, error, subcomponent);
    }
}
