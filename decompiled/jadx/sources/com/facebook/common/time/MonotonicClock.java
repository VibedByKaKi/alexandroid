package com.facebook.common.time;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public interface MonotonicClock {
    static MonotonicClock of(Clock clock) {
        return new MonotonicClockWrapper(clock, 0);
    }

    @DoNotStrip
    default long now() {
        return nowNanos() / 1000000;
    }

    @DoNotStrip
    long nowNanos();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MonotonicClockWrapper implements MonotonicClock {
        private long mLast;
        private final Clock provider;

        private MonotonicClockWrapper(Clock clock) {
            this.provider = clock;
            this.mLast = clock.now();
        }

        @Override // com.facebook.common.time.MonotonicClock
        public long now() {
            long max = Math.max(this.mLast, this.provider.now());
            this.mLast = max;
            return max;
        }

        @Override // com.facebook.common.time.MonotonicClock
        public long nowNanos() {
            return TimeUnit.MILLISECONDS.toNanos(now());
        }

        public /* synthetic */ MonotonicClockWrapper(Clock clock, int i) {
            this(clock);
        }
    }
}
