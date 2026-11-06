package com.amazon.alexa.ra.core.metrics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/TouchUserPerceivedLatencyMetricsProcessorApi;", "", "startTouchTracking", "", "startTimestamp", "", "referrer", "", "touchDestination", "Lcom/amazon/alexa/ra/core/metrics/TouchDestination;", "touchSource", "Lcom/amazon/alexa/ra/core/metrics/TouchSource;", "stopTouchTracking", "endTimestamp", "stopActiveTouchTracking", "cancelActiveTouchTracking", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface TouchUserPerceivedLatencyMetricsProcessorApi {
    void cancelActiveTouchTracking();

    void startTouchTracking(long startTimestamp, @NotNull String referrer, @NotNull TouchDestination touchDestination);

    void startTouchTracking(long startTimestamp, @NotNull String referrer, @NotNull TouchSource touchSource);

    void stopActiveTouchTracking(long endTimestamp);

    void stopTouchTracking(long endTimestamp, @NotNull TouchDestination touchDestination);
}
