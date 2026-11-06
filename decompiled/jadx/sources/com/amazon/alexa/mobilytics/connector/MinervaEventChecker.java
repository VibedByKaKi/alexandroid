package com.amazon.alexa.mobilytics.connector;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazon.minerva.client.common.api.MetricEvent;
import com.amazon.minerva.client.common.api.Predefined;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MinervaEventChecker {
    private static final int BOOLEAN_BYTES = 1;
    private static final int DOUBLE_BYTES = 8;

    @VisibleForTesting
    static final int HEADER_BYTES = 128;
    private static final int LONG_BYTES = 8;

    @VisibleForTesting
    static final int MAX_EVENT_BYTES = 4096;

    @VisibleForTesting
    static final int MAX_VALUE_BYTES = 512;

    @VisibleForTesting
    static final String OVERFLOW_MARKER = "larger_than_limit";
    private static final String TAG = Log.tag((Class<?>) MinervaEventChecker.class);

    @VisibleForTesting
    static final String TRUNCATION_MARKER = "...[T]";

    @Nullable
    private final String channelNameKey;
    private long cumulativeBytes;

    @NonNull
    private final MetricEvent metricEvent;
    private boolean overflowed = false;

    public MinervaEventChecker(@NonNull MetricEvent metricEvent, @Nullable String str) {
        this.metricEvent = metricEvent;
        this.channelNameKey = str;
        this.cumulativeBytes = 128L;
        if (str != null) {
            this.cumulativeBytes = utf8Len(str) + utf8Len(OVERFLOW_MARKER) + 128;
        }
    }

    private boolean checkBudget(long j) {
        long j2 = this.cumulativeBytes;
        if (j2 + j > 4096) {
            markOverflowed();
            return false;
        }
        this.cumulativeBytes = j2 + j;
        return true;
    }

    private void markOverflowed() {
        this.overflowed = true;
        Log.w(TAG, "Minerva event exceeded per-event size cap; overflow marker stamped, event may be dropped by Minerva.");
        String str = this.channelNameKey;
        if (str != null) {
            this.metricEvent.addString(str, OVERFLOW_MARKER);
        }
    }

    private void markOverflowedIfExceeded() {
        if (this.overflowed || this.cumulativeBytes <= 4096) {
            return;
        }
        markOverflowed();
    }

    @VisibleForTesting
    public static String truncateIfNeeded(@NonNull String str) {
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        if (bytes.length <= 512) {
            return str;
        }
        int length = 512 - TRUNCATION_MARKER.getBytes(charset).length;
        while (length > 0 && (bytes[length] & 192) == 128) {
            length--;
        }
        return new String(bytes, 0, length, StandardCharsets.UTF_8).concat(TRUNCATION_MARKER);
    }

    private static long utf8Len(@NonNull String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > 127) {
                return str.getBytes(StandardCharsets.UTF_8).length;
            }
        }
        return length;
    }

    public void addBoolean(@NonNull String str, boolean z) {
        if (!this.overflowed && checkBudget(utf8Len(str) + 1)) {
            this.metricEvent.addBoolean(str, z);
        }
    }

    public void addDouble(@NonNull String str, double d) {
        if (!this.overflowed && checkBudget(utf8Len(str) + 8)) {
            this.metricEvent.addDouble(str, d);
        }
    }

    public void addLong(@NonNull String str, long j) {
        if (!this.overflowed && checkBudget(utf8Len(str) + 8)) {
            this.metricEvent.addLong(str, j);
        }
    }

    public void addLongUnchecked(@NonNull String str, long j) {
        this.cumulativeBytes = utf8Len(str) + 8 + this.cumulativeBytes;
        this.metricEvent.addLong(str, j);
        markOverflowedIfExceeded();
    }

    public void addPredefined(@NonNull Predefined predefined) {
        if (!this.overflowed && checkBudget(utf8Len(predefined.getKey()) + 32)) {
            this.metricEvent.addPredefined(predefined);
        }
    }

    public void addPredefinedUnchecked(@NonNull Predefined predefined) {
        this.cumulativeBytes = utf8Len(predefined.getKey()) + 32 + this.cumulativeBytes;
        this.metricEvent.addPredefined(predefined);
        markOverflowedIfExceeded();
    }

    public void addStringUnchecked(@NonNull String str, @Nullable String str2) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        this.cumulativeBytes = utf8Len(str) + utf8Len(str2) + this.cumulativeBytes;
        this.metricEvent.addString(str, str2);
        markOverflowedIfExceeded();
    }

    @NonNull
    public MetricEvent metricEvent() {
        return this.metricEvent;
    }

    public boolean overflowed() {
        return this.overflowed;
    }

    public void safeAddString(@NonNull String str, @Nullable String str2) {
        if (this.overflowed || str2 == null || str2.isEmpty()) {
            return;
        }
        String truncateIfNeeded = truncateIfNeeded(str2);
        if (checkBudget(utf8Len(str) + utf8Len(truncateIfNeeded))) {
            this.metricEvent.addString(str, truncateIfNeeded);
        }
    }
}
