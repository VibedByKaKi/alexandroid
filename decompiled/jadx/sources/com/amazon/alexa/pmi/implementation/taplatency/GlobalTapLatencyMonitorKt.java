package com.amazon.alexa.pmi.implementation.taplatency;

import android.util.Log;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"TAP_LATENCY_TAG", "", "TAP_LATENCY_WEBLAB_NAMESPACE", "LAST_RENDER_WEBLAB_FEATURE", "LAST_RENDER_TREATMENT", "NANOS_PER_MS", "", "NANOS_PER_MS_LONG", "", "NOOP_TIMEOUT_MS", "logTapLatency", "", "name", "valueMs", "span", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class GlobalTapLatencyMonitorKt {

    @NotNull
    public static final String LAST_RENDER_TREATMENT = "T1";

    @NotNull
    public static final String LAST_RENDER_WEBLAB_FEATURE = "ALEXA_MOBILE_LAST_RENDER_LATENCY_ANDROID";
    public static final double NANOS_PER_MS = 1000000.0d;
    public static final long NANOS_PER_MS_LONG = 1000000;
    public static final long NOOP_TIMEOUT_MS = 1500;

    @NotNull
    public static final String TAP_LATENCY_TAG = "GlobalTapProbe";

    @NotNull
    public static final String TAP_LATENCY_WEBLAB_NAMESPACE = "ALEXA_MOBILE_PERFORMANCE";

    public static final void logTapLatency(@NotNull String str, double d, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        Log.i(TAP_LATENCY_TAG, String.format("[PERF PROFILE] %s = %.0f ms (%s)", Arrays.copyOf(new Object[]{str, Double.valueOf(d), str2}, 3)));
    }
}
