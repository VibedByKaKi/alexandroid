package com.amazon.alexa.pmi.implementation.taplatency;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\u001a$\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\"\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"setBit", "", "words", "bit", "", "value", "", "hasBit", "TTLR_TINY_PX", "TTLR_PERIODIC_MIN_CHANGES", "TTLR_PERIODIC_STOPPED_PERIODS", "", "TTLR_MAX_REGIONS", "TTLR_PERIODIC_MIN_IOU", "TTLR_PERIODIC_MAX_COV", "TTLR_PERIODIC_MIN_PERIOD_MS", "TTLR_PERIODIC_MAX_PERIOD_MS", "TTLR_CONTINUOUS_RUN_MS", "", "TTLR_CONTINUOUS_MAX_GAP_MS", "TTLR_THROTTLED_MAX_GAP_MS", "TTLR_UNCHANGED_BACKOFF_MS", "TTLR_HISTORY_CAPACITY", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class LastRenderHistoryKt {
    public static final long TTLR_CONTINUOUS_MAX_GAP_MS = 350;
    public static final long TTLR_CONTINUOUS_RUN_MS = 1000;
    public static final int TTLR_HISTORY_CAPACITY = 2400;
    public static final int TTLR_MAX_REGIONS = 128;
    public static final double TTLR_PERIODIC_MAX_COV = 0.2d;
    public static final double TTLR_PERIODIC_MAX_PERIOD_MS = 5000.0d;
    public static final int TTLR_PERIODIC_MIN_CHANGES = 4;
    public static final double TTLR_PERIODIC_MIN_IOU = 0.8d;
    public static final double TTLR_PERIODIC_MIN_PERIOD_MS = 100.0d;
    public static final double TTLR_PERIODIC_STOPPED_PERIODS = 1.5d;
    public static final long TTLR_THROTTLED_MAX_GAP_MS = 550;
    public static final int TTLR_TINY_PX = 32;
    public static final long TTLR_UNCHANGED_BACKOFF_MS = 1000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasBit(long[] jArr, int i) {
        int i2;
        if (jArr == null || (i2 = i / 64) >= jArr.length) {
            return false;
        }
        return ((1 << i) & jArr[i2]) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long[] setBit(long[] jArr, int i, boolean z) {
        long j;
        if (!z && (jArr == null || i / 64 >= jArr.length)) {
            return jArr;
        }
        if (jArr == null || i / 64 >= jArr.length) {
            if (jArr == null) {
                jArr = new long[0];
            }
            jArr = Arrays.copyOf(jArr, (i / 64) + 1);
        }
        int i2 = i / 64;
        if (z) {
            j = (1 << i) | jArr[i2];
        } else {
            j = (~(1 << i)) & jArr[i2];
        }
        jArr[i2] = j;
        return jArr;
    }
}
