package com.amazon.alexa.pmi.implementation.pmi;

import com.amazon.alexa.pmi.TimelineExitCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/pmi/ConsoleMetrics;", "Lcom/amazon/alexa/pmi/implementation/pmi/MetricsRecording;", "<init>", "()V", "recordMetric", "", "name", "", "startTimeMs", "", "durationMs", "exitCode", "Lcom/amazon/alexa/pmi/TimelineExitCode;", "ownerIdentifier", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ConsoleMetrics implements MetricsRecording {
    @Override // com.amazon.alexa.pmi.implementation.pmi.MetricsRecording
    public void recordMetric(@NotNull String name, long startTimeMs, long durationMs, @NotNull TimelineExitCode exitCode, @NotNull String ownerIdentifier) {
        name.getClass();
        exitCode.getClass();
        ownerIdentifier.getClass();
        exitCode.name();
    }
}
