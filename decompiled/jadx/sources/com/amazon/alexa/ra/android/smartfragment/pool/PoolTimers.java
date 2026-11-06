package com.amazon.alexa.ra.android.smartfragment.pool;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0007J\b\u0010\u0011\u001a\u00020\rH\u0007J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bJ\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/pool/PoolTimers;", "", "destroyDelayMs", "", "<init>", "(J)V", "handler", "Landroid/os/Handler;", "pendingDestroys", "", "", "Ljava/lang/Runnable;", "scheduleDestroy", "", "bridgeId", "action", "cancelDestroy", "cancelAllDestroys", "scheduleWatchdog", "delayMs", "cancelWatchdog", "watchdog", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPoolTimers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PoolTimers.kt\ncom/amazon/alexa/ra/android/smartfragment/pool/PoolTimers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1#2:83\n1869#3,2:84\n*S KotlinDebug\n*F\n+ 1 PoolTimers.kt\ncom/amazon/alexa/ra/android/smartfragment/pool/PoolTimers\n*L\n55#1:84,2\n*E\n"})
/* loaded from: classes18.dex */
public final class PoolTimers {
    public static final int $stable = 8;
    private final long destroyDelayMs;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private final Map<String, Runnable> pendingDestroys = new LinkedHashMap();

    public PoolTimers(long j) {
        this.destroyDelayMs = j;
    }

    @MainThread
    public final void cancelAllDestroys() {
        Iterator<T> it2 = this.pendingDestroys.values().iterator();
        while (it2.hasNext()) {
            this.handler.removeCallbacks((Runnable) it2.next());
        }
        this.pendingDestroys.clear();
    }

    @MainThread
    public final void cancelDestroy(@NotNull String bridgeId) {
        bridgeId.getClass();
        Runnable remove = this.pendingDestroys.remove(bridgeId);
        if (remove != null) {
            this.handler.removeCallbacks(remove);
        }
    }

    public final void cancelWatchdog(@Nullable Runnable watchdog) {
        if (watchdog != null) {
            this.handler.removeCallbacks(watchdog);
        }
    }

    @MainThread
    public final void scheduleDestroy(@NotNull String bridgeId, @NotNull Runnable action) {
        bridgeId.getClass();
        action.getClass();
        cancelDestroy(bridgeId);
        this.pendingDestroys.put(bridgeId, action);
        this.handler.postDelayed(action, this.destroyDelayMs);
    }

    @NotNull
    public final Runnable scheduleWatchdog(long delayMs, @NotNull Runnable action) {
        action.getClass();
        this.handler.postDelayed(action, delayMs);
        return action;
    }
}
