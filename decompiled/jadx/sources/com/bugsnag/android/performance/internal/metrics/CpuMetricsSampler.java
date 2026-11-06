package com.bugsnag.android.performance.internal.metrics;

import android.os.SystemClock;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobilytics.configuration.Constants;
import com.bugsnag.android.performance.internal.metrics.ProcStatReader;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/performance/internal/metrics/CpuMetricsSampler;", "", "pid", "", "(I)V", Constants.TIMELINE_ID_KEY, "(II)V", "statFile", "", "(Ljava/lang/String;)V", "previousCpuTime", "", "previousUptime", "stat", "Lcom/bugsnag/android/performance/internal/metrics/ProcStatReader$Stat;", "statReader", "Lcom/bugsnag/android/performance/internal/metrics/ProcStatReader;", "sampleCpuUse", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CpuMetricsSampler {
    private double previousCpuTime;
    private double previousUptime;

    @NotNull
    private final ProcStatReader.Stat stat;

    @NotNull
    private final ProcStatReader statReader;

    public CpuMetricsSampler(@NotNull String str) {
        str.getClass();
        this.statReader = new ProcStatReader(str);
        this.stat = new ProcStatReader.Stat();
    }

    public final double sampleCpuUse() {
        if (!this.statReader.parse(this.stat)) {
            return -1.0d;
        }
        double elapsedRealtime = SystemClock.elapsedRealtime() / 1000.0d;
        double totalCpuTime = this.stat.getTotalCpuTime() / SystemConfig.INSTANCE.getClockTickHz();
        double d = totalCpuTime - this.previousCpuTime;
        double d2 = elapsedRealtime - this.previousUptime;
        this.previousCpuTime = totalCpuTime;
        this.previousUptime = elapsedRealtime;
        double numCores = ((d / d2) * 100.0d) / r4.getNumCores();
        if (Double.isInfinite(numCores) || Double.isNaN(numCores)) {
            return 0.0d;
        }
        return numCores;
    }

    public CpuMetricsSampler(int i) {
        this(a$$ExternalSyntheticOutline0.m(i, "/proc/", "/stat"));
    }

    public CpuMetricsSampler(int i, int i2) {
        this(ErrorUtils$$ExternalSyntheticOutline0.m(i, i2, "/proc/", "/task/", "/stat"));
    }
}
