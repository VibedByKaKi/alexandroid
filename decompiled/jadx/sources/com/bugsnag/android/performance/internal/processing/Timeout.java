package com.bugsnag.android.performance.internal.processing;

import android.os.SystemClock;
import com.bugsnag.android.performance.internal.processing.ScheduledAction;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/performance/internal/processing/Timeout;", "Lcom/bugsnag/android/performance/internal/processing/ScheduledAction;", "relativeMs", "", "getRelativeMs", "()J", "target", "getTarget", "getDelay", "unit", "Ljava/util/concurrent/TimeUnit;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Timeout extends ScheduledAction {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int compareTo(@NotNull Timeout timeout, @NotNull Delayed delayed) {
            delayed.getClass();
            return ScheduledAction.DefaultImpls.compareTo(timeout, delayed);
        }

        public static long getDelay(@NotNull Timeout timeout, @NotNull TimeUnit timeUnit) {
            timeUnit.getClass();
            return timeUnit.convert(timeout.getRelativeMs(), TimeUnit.MILLISECONDS);
        }

        public static long getRelativeMs(@NotNull Timeout timeout) {
            return timeout.getTarget() - SystemClock.elapsedRealtime();
        }
    }

    @Override // java.util.concurrent.Delayed
    long getDelay(@NotNull TimeUnit unit);

    long getRelativeMs();

    long getTarget();
}
