package com.amazon.dee.app.services.metrics;

import android.os.SystemClock;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\nH\u0007J\b\u0010\u000e\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/dee/app/services/metrics/UserPerceivedLatencyService;", "", "<init>", "()V", JoinPoint.SYNCHRONIZATION_LOCK, "delegate", "Lcom/amazon/dee/app/services/metrics/LatencyServiceDelegate;", "pendingColdStartTimestamp", "", "initialize", "", "impl", "initColdStartTimer", "cancelColdStartTimer", "recordColdStartTimer", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserPerceivedLatencyService {

    @Nullable
    private static volatile LatencyServiceDelegate delegate;

    @NotNull
    public static final UserPerceivedLatencyService INSTANCE = new UserPerceivedLatencyService();

    @NotNull
    private static final Object lock = new Object();
    private static long pendingColdStartTimestamp = -1;

    private UserPerceivedLatencyService() {
    }

    @JvmStatic
    public static final void cancelColdStartTimer() {
        synchronized (lock) {
            try {
                LatencyServiceDelegate latencyServiceDelegate = delegate;
                if (latencyServiceDelegate != null) {
                    latencyServiceDelegate.cancelColdStartTimer();
                } else {
                    pendingColdStartTimestamp = -1L;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JvmStatic
    public static final void initColdStartTimer() {
        synchronized (lock) {
            try {
                LatencyServiceDelegate latencyServiceDelegate = delegate;
                if (latencyServiceDelegate != null) {
                    latencyServiceDelegate.initColdStartTimer();
                } else {
                    pendingColdStartTimestamp = SystemClock.elapsedRealtime();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JvmStatic
    public static final void initialize(@NotNull LatencyServiceDelegate impl) {
        impl.getClass();
        synchronized (lock) {
            try {
                delegate = impl;
                long j = pendingColdStartTimestamp;
                if (j >= 0) {
                    pendingColdStartTimestamp = -1L;
                    impl.initColdStartTimer(j);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JvmStatic
    public static final void recordColdStartTimer() {
        LatencyServiceDelegate latencyServiceDelegate = delegate;
        if (latencyServiceDelegate != null) {
            latencyServiceDelegate.recordColdStartTimer();
        }
    }
}
