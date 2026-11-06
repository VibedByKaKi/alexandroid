package com.amazon.alexa.pmi.implementation.taplatency;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/HardwareTapStash;", "", "<init>", "()V", "STASH_MAX_AGE_MS", "", "tapEventTimeMs", "stash", "", "eventTimeMs", "consumeAgeMs", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class HardwareTapStash {

    @NotNull
    public static final HardwareTapStash INSTANCE = new HardwareTapStash();
    private static final long STASH_MAX_AGE_MS = 3000;
    private static volatile long tapEventTimeMs;

    private HardwareTapStash() {
    }

    @JvmStatic
    public static final long consumeAgeMs() {
        long j = tapEventTimeMs;
        tapEventTimeMs = 0L;
        if (j == 0) {
            return -1L;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (0 > uptimeMillis || uptimeMillis >= 3001) {
            return -1L;
        }
        return uptimeMillis;
    }

    @JvmStatic
    public static final void stash(long eventTimeMs) {
        tapEventTimeMs = eventTimeMs;
    }
}
