package com.amazon.comms.calling.foundation.metrics.providers;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/providers/CallingMetricsValues;", "", "<init>", "()V", "VIDEO", "", "AUDIO", "UNKNOWN", CallingMetricsValues.DROPIN, "A2A", "ALEXA", CallingMetricsValues.REMOTE, CallingMetricsValues.LOCAL, "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallingMetricsValues {

    @NotNull
    public static final String A2A = "A2A";

    @NotNull
    public static final String ALEXA = "ALEXA";

    @NotNull
    public static final String AUDIO = "AUDIO";

    @NotNull
    public static final String DROPIN = "DROPIN";

    @NotNull
    public static final CallingMetricsValues INSTANCE = new CallingMetricsValues();

    @NotNull
    public static final String LOCAL = "LOCAL";

    @NotNull
    public static final String REMOTE = "REMOTE";

    @NotNull
    public static final String UNKNOWN = "UNKNOWN";

    @NotNull
    public static final String VIDEO = "VIDEO";

    private CallingMetricsValues() {
    }
}
