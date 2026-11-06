package com.bugsnag.android.performance.internal.processing;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u00012\u00020\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0096\u0002¨\u0006\u0006"}, d2 = {"Lcom/bugsnag/android/performance/internal/processing/ScheduledAction;", "Ljava/util/concurrent/Delayed;", "Ljava/lang/Runnable;", "compareTo", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ScheduledAction extends Delayed, Runnable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int compareTo(@NotNull ScheduledAction scheduledAction, @NotNull Delayed delayed) {
            delayed.getClass();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long delay = scheduledAction.getDelay(timeUnit);
            long delay2 = delayed.getDelay(timeUnit);
            if (delay < delay2) {
                return -1;
            }
            return delay > delay2 ? 1 : 0;
        }
    }

    int compareTo(@NotNull Delayed other);
}
