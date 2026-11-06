package com.amazon.alexa.pmi.implementation.pmi;

import com.amazon.alexa.pmi.TimelineExitCode;
import com.amazon.latencyinfra.LatencyInfra;
import com.amazon.latencyinfra.TimelineInputArgument;
import com.amazon.latencyinfra.TimelineLatencyAction;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/pmi/MobilyticsRecorder;", "Lcom/amazon/alexa/pmi/implementation/pmi/MetricsRecording;", "latencyInfra", "Lcom/amazon/latencyinfra/LatencyInfra;", "<init>", "(Lcom/amazon/latencyinfra/LatencyInfra;)V", "recordMetric", "", "name", "", "startTimeMs", "", "durationMs", "exitCode", "Lcom/amazon/alexa/pmi/TimelineExitCode;", "ownerIdentifier", "Companion", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MobilyticsRecorder implements MetricsRecording {

    @NotNull
    private static final String METRIC_NAMESPACE_PREFIX = "NativePMI";

    @NotNull
    private final LatencyInfra latencyInfra;

    public MobilyticsRecorder(@NotNull LatencyInfra latencyInfra) {
        latencyInfra.getClass();
        this.latencyInfra = latencyInfra;
    }

    @Override // com.amazon.alexa.pmi.implementation.pmi.MetricsRecording
    public void recordMetric(@NotNull String name, long startTimeMs, long durationMs, @NotNull TimelineExitCode exitCode, @NotNull String ownerIdentifier) {
        name.getClass();
        exitCode.getClass();
        ownerIdentifier.getClass();
        this.latencyInfra.recordTimeline(TimelineLatencyAction.RECORD_TIMELINE_WITH_CACHED_START_AND_END_TIMESTAMP, new TimelineInputArgument.Builder().withTimelineName(name).withNamespace(a$$ExternalSyntheticOutline0.m("NativePMI.", exitCode.name())).withStartTimestamp(Long.valueOf(startTimeMs)).withEndTimestamp(Long.valueOf(startTimeMs + durationMs)).withMobilyticsOwnerId(ownerIdentifier).withMetricsOption(true).withCustomerOption(true).withPerfTestOption(true).withLogOption(true).build());
    }
}
