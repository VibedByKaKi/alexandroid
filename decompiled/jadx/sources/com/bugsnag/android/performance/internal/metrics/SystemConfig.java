package com.bugsnag.android.performance.internal.metrics;

import android.system.Os;
import android.system.OsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/performance/internal/metrics/SystemConfig;", "", "()V", "_clockTickHz", "", "clockTickHz", "getClockTickHz", "()D", "numCores", "", "getNumCores", "()I", "configure", "", "numProcessorCores", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCpuMetricsSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CpuMetricsSource.kt\ncom/bugsnag/android/performance/internal/metrics/SystemConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
/* loaded from: classes6.dex */
public final class SystemConfig {

    @NotNull
    public static final SystemConfig INSTANCE;
    private static double _clockTickHz;
    private static final int numCores;

    static {
        SystemConfig systemConfig = new SystemConfig();
        INSTANCE = systemConfig;
        _clockTickHz = 100.0d;
        _clockTickHz = Os.sysconf(OsConstants._SC_CLK_TCK);
        numCores = systemConfig.numProcessorCores();
    }

    private SystemConfig() {
    }

    private final int numProcessorCores() {
        return Math.max((int) Os.sysconf(OsConstants._SC_NPROCESSORS_CONF), 1);
    }

    public final double getClockTickHz() {
        return _clockTickHz;
    }

    public final int getNumCores() {
        return numCores;
    }

    public final void configure() {
    }
}
