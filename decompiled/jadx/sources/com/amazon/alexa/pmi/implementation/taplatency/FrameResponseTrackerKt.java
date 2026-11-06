package com.amazon.alexa.pmi.implementation.taplatency;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"evaluateFrame", "Lcom/amazon/alexa/pmi/implementation/taplatency/FrameOutcome;", "tapUpTimeMs", "", "vsyncNanos", "drawNanos", "inputNanos", "totalNanos", "isReactNative", "", "NON_QUALIFYING", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class FrameResponseTrackerKt {

    @NotNull
    private static final FrameOutcome NON_QUALIFYING = new FrameOutcome(false, 0.0d);

    @NotNull
    public static final FrameOutcome evaluateFrame(long j, long j2, long j3, long j4, long j5, boolean z) {
        return j2 <= 1000000 * j ? NON_QUALIFYING : j3 <= 0 ? NON_QUALIFYING : (z || j4 > 0) ? new FrameOutcome(true, ((j2 + j5) / 1000000.0d) - j) : NON_QUALIFYING;
    }
}
