package com.bugsnag.android.performance.internal;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\r\u0010\u000f\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/bugsnag/android/performance/internal/BugsnagClock;", "", "()V", "NANOS_IN_MILLIS", "", "bootTimeNano", "getBootTimeNano$bugsnag_android_performance_release$annotations", "getBootTimeNano$bugsnag_android_performance_release", "()J", "currentUnixNanoTime", "elapsedNanosToUnixTime", "elapsedRealtimeNanos", "fromDate", "date", "Ljava/util/Date;", "safeBootTimeNanos", "safeBootTimeNanos$bugsnag_android_performance_release", "toDate", "unixNanoTimeToElapsedRealtime", "unixNanoTime", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BugsnagClock {

    @NotNull
    public static final BugsnagClock INSTANCE;
    private static final long NANOS_IN_MILLIS = 1000000;
    private static final long bootTimeNano;

    static {
        BugsnagClock bugsnagClock = new BugsnagClock();
        INSTANCE = bugsnagClock;
        bootTimeNano = bugsnagClock.safeBootTimeNanos$bugsnag_android_performance_release();
    }

    private BugsnagClock() {
    }

    public final long currentUnixNanoTime() {
        return elapsedNanosToUnixTime(SystemClock.elapsedRealtimeNanos());
    }

    public final long elapsedNanosToUnixTime(long elapsedRealtimeNanos) {
        return elapsedRealtimeNanos + bootTimeNano;
    }

    public final long fromDate(@NotNull Date date) {
        date.getClass();
        return unixNanoTimeToElapsedRealtime(date.getTime() * 1000000);
    }

    public final long getBootTimeNano$bugsnag_android_performance_release() {
        return bootTimeNano;
    }

    @VisibleForTesting
    public final long safeBootTimeNanos$bugsnag_android_performance_release() {
        try {
            long epochMilli = (SystemClock.currentGnssTimeClock().instant().toEpochMilli() + r6.getNano()) - SystemClock.elapsedRealtimeNanos();
            if (epochMilli > 0) {
                return epochMilli;
            }
        } catch (Exception unused) {
        }
        return Math.max((System.currentTimeMillis() * 1000000) - SystemClock.elapsedRealtimeNanos(), 0L);
    }

    @NotNull
    public final Date toDate() {
        return new Date(currentUnixNanoTime() / 1000000);
    }

    public final long unixNanoTimeToElapsedRealtime(long unixNanoTime) {
        return unixNanoTime - bootTimeNano;
    }

    @VisibleForTesting
    public static /* synthetic */ void getBootTimeNano$bugsnag_android_performance_release$annotations() {
    }
}
