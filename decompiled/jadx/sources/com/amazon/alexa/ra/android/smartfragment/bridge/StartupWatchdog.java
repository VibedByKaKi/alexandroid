package com.amazon.alexa.ra.android.smartfragment.bridge;

import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda6;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nJ\u0006\u0010\u0011\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/StartupWatchdog;", "", "scheduler", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/WatchdogScheduler;", "metrics", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics;", "<init>", "(Lcom/amazon/alexa/ra/android/smartfragment/bridge/WatchdogScheduler;Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics;)V", JoinPoint.SYNCHRONIZATION_LOCK, "cancelPending", "Lkotlin/Function0;", "", "arm", "timeoutMs", "", "onTimeout", "", "cancel", "fire", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStartupWatchdog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupWatchdog.kt\ncom/amazon/alexa/ra/android/smartfragment/bridge/StartupWatchdog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
/* loaded from: classes18.dex */
public final class StartupWatchdog {
    public static final int $stable = 8;

    @Nullable
    private Function0<Unit> cancelPending;

    @NotNull
    private final Object lock;

    @NotNull
    private final BridgeMetrics metrics;

    @NotNull
    private final WatchdogScheduler scheduler;

    public StartupWatchdog(@NotNull WatchdogScheduler watchdogScheduler, @NotNull BridgeMetrics bridgeMetrics) {
        watchdogScheduler.getClass();
        bridgeMetrics.getClass();
        this.scheduler = watchdogScheduler;
        this.metrics = bridgeMetrics;
        this.lock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit arm$lambda$0(StartupWatchdog startupWatchdog, Function0 function0) {
        startupWatchdog.fire(function0);
        return Unit.INSTANCE;
    }

    private final void fire(Function0<Boolean> onTimeout) {
        synchronized (this.lock) {
            this.cancelPending = null;
            Unit unit = Unit.INSTANCE;
        }
        if (onTimeout.invoke().booleanValue()) {
            this.metrics.count("SmartFragment.Bridge.StartupTimeout");
        }
    }

    public final void arm(long timeoutMs, @NotNull Function0<Boolean> onTimeout) {
        onTimeout.getClass();
        cancel();
        Function0<Unit> schedule = this.scheduler.schedule(timeoutMs, new Recomposer$$ExternalSyntheticLambda6(this, onTimeout, 24));
        synchronized (this.lock) {
            this.cancelPending = schedule;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void cancel() {
        Function0<Unit> function0;
        synchronized (this.lock) {
            function0 = this.cancelPending;
            this.cancelPending = null;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }
}
