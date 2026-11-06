package org.apache.commons.lang3.time;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.apache.commons.lang3.function.FailableRunnable;
import org.apache.commons.lang3.function.FailableSupplier;
import org.apache.commons.lang3.tuple.ImmutablePair;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StopWatch {
    private static final long NANO_2_MILLIS = 1000000;
    private final String message;
    private State runningState;
    private SplitState splitState;
    private final List<Split> splits;
    private Instant startInstant;
    private long startTimeNanos;
    private Instant stopInstant;
    private long stopTimeNanos;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Split extends ImmutablePair<String, Duration> {
        public Split(String str, Duration duration) {
            super(str, duration);
        }

        public Duration getDuration() {
            return getRight();
        }

        public String getLabel() {
            return getLeft();
        }

        @Override // org.apache.commons.lang3.tuple.Pair
        public String toString() {
            return "Split [" + getLabel() + ", " + getDuration() + "])";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SplitState {
        SPLIT,
        UNSPLIT
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        RUNNING { // from class: org.apache.commons.lang3.time.StopWatch.State.1
            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStarted() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStopped() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isSuspended() {
                return false;
            }
        },
        STOPPED { // from class: org.apache.commons.lang3.time.StopWatch.State.2
            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStarted() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStopped() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isSuspended() {
                return false;
            }
        },
        SUSPENDED { // from class: org.apache.commons.lang3.time.StopWatch.State.3
            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStarted() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStopped() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isSuspended() {
                return true;
            }
        },
        UNSTARTED { // from class: org.apache.commons.lang3.time.StopWatch.State.4
            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStarted() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStopped() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isSuspended() {
                return false;
            }
        };

        public abstract boolean isStarted();

        public abstract boolean isStopped();

        public abstract boolean isSuspended();
    }

    public StopWatch(String str) {
        this.runningState = State.UNSTARTED;
        this.splitState = SplitState.UNSPLIT;
        this.splits = new ArrayList();
        this.message = str;
    }

    public static StopWatch create() {
        return new StopWatch();
    }

    public static StopWatch createStarted() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        return stopWatch;
    }

    private long nanosToMillis(long j) {
        return j / 1000000;
    }

    private void startResume() {
        if (isStopped()) {
            start();
        } else if (isSuspended()) {
            resume();
        }
    }

    public String formatSplitTime() {
        return DurationFormatUtils.formatDurationHMS(getSplitDuration().toMillis());
    }

    public String formatTime() {
        return DurationFormatUtils.formatDurationHMS(getTime());
    }

    public <T> T get(Supplier<T> supplier) {
        startResume();
        try {
            return supplier.get();
        } finally {
            suspend();
        }
    }

    public Duration getDuration() {
        return Duration.ofNanos(getNanoTime());
    }

    public String getMessage() {
        return this.message;
    }

    public long getNanoTime() {
        int ordinal = this.runningState.ordinal();
        if (ordinal == 0) {
            return System.nanoTime() - this.startTimeNanos;
        }
        if (ordinal == 1 || ordinal == 2) {
            return this.stopTimeNanos - this.startTimeNanos;
        }
        if (ordinal == 3) {
            return 0L;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Illegal running state has occurred.");
        return 0L;
    }

    public Duration getSplitDuration() {
        return Duration.ofNanos(getSplitNanoTime());
    }

    public long getSplitNanoTime() {
        if (this.splitState == SplitState.SPLIT) {
            return ((Split) ErrorUtils$$ExternalSyntheticOutline0.m(this.splits, 1)).getRight().toNanos();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Stopwatch must be split to get the split time.");
        return 0L;
    }

    @Deprecated
    public long getSplitTime() {
        return nanosToMillis(getSplitNanoTime());
    }

    public List<Split> getSplits() {
        return Collections.unmodifiableList(this.splits);
    }

    public Instant getStartInstant() {
        if (this.runningState != State.UNSTARTED) {
            return this.startInstant;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Stopwatch has not been started");
        return null;
    }

    @Deprecated
    public long getStartTime() {
        return getStartInstant().toEpochMilli();
    }

    public Instant getStopInstant() {
        if (this.runningState != State.UNSTARTED) {
            return this.stopInstant;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Stopwatch has not been started");
        return null;
    }

    @Deprecated
    public long getStopTime() {
        return getStopInstant().toEpochMilli();
    }

    public <T, E extends Throwable> T getT(FailableSupplier<T, E> failableSupplier) throws Throwable {
        startResume();
        try {
            return failableSupplier.get();
        } finally {
            suspend();
        }
    }

    public long getTime(TimeUnit timeUnit) {
        return timeUnit.convert(getNanoTime(), TimeUnit.NANOSECONDS);
    }

    public boolean isStarted() {
        return this.runningState.isStarted();
    }

    public boolean isStopped() {
        return this.runningState.isStopped();
    }

    public boolean isSuspended() {
        return this.runningState.isSuspended();
    }

    public void reset() {
        this.runningState = State.UNSTARTED;
        this.splitState = SplitState.UNSPLIT;
        this.splits.clear();
    }

    public void resume() {
        if (this.runningState != State.SUSPENDED) {
            Single$$ExternalSyntheticBUOutline0.m$2("Stopwatch must be suspended to resume.");
            return;
        }
        this.startTimeNanos = (System.nanoTime() - this.stopTimeNanos) + this.startTimeNanos;
        this.runningState = State.RUNNING;
    }

    public void run(Runnable runnable) {
        startResume();
        try {
            runnable.run();
        } finally {
            suspend();
        }
    }

    public <E extends Throwable> void runT(FailableRunnable<E> failableRunnable) throws Throwable {
        startResume();
        try {
            failableRunnable.run();
        } finally {
            suspend();
        }
    }

    public void split() {
        if (this.runningState != State.RUNNING) {
            Single$$ExternalSyntheticBUOutline0.m$2("Stopwatch is not running.");
            return;
        }
        this.stopTimeNanos = System.nanoTime();
        this.splitState = SplitState.SPLIT;
        this.splits.add(new Split(String.valueOf(this.splits.size()), Duration.ofNanos(this.stopTimeNanos - this.startTimeNanos)));
    }

    public void start() {
        State state = this.runningState;
        if (state == State.STOPPED) {
            Single$$ExternalSyntheticBUOutline0.m$2("Stopwatch must be reset before being restarted.");
            return;
        }
        if (state != State.UNSTARTED) {
            Single$$ExternalSyntheticBUOutline0.m$2("Stopwatch already started.");
            return;
        }
        this.startTimeNanos = System.nanoTime();
        this.startInstant = Instant.now();
        this.runningState = State.RUNNING;
        this.splits.clear();
    }

    public void stop() {
        State state = this.runningState;
        State state2 = State.RUNNING;
        if (state != state2 && state != State.SUSPENDED) {
            Single$$ExternalSyntheticBUOutline0.m$2("Stopwatch is not running.");
            return;
        }
        if (state == state2) {
            this.stopTimeNanos = System.nanoTime();
            this.stopInstant = Instant.now();
        }
        this.runningState = State.STOPPED;
    }

    public void suspend() {
        if (this.runningState != State.RUNNING) {
            Single$$ExternalSyntheticBUOutline0.m$2("Stopwatch must be running to suspend.");
            return;
        }
        this.stopTimeNanos = System.nanoTime();
        this.stopInstant = Instant.now();
        this.runningState = State.SUSPENDED;
    }

    public String toSplitString() {
        String objects = Objects.toString(this.message, "");
        String formatSplitTime = formatSplitTime();
        return objects.isEmpty() ? formatSplitTime : a$$ExternalSyntheticOutline0.m$1(objects, " ", formatSplitTime);
    }

    public String toString() {
        String objects = Objects.toString(this.message, "");
        String formatTime = formatTime();
        return objects.isEmpty() ? formatTime : a$$ExternalSyntheticOutline0.m$1(objects, " ", formatTime);
    }

    public void unsplit() {
        if (this.splitState != SplitState.SPLIT) {
            Single$$ExternalSyntheticBUOutline0.m$2("Stopwatch has not been split.");
            return;
        }
        this.splitState = SplitState.UNSPLIT;
        this.splits.remove(r2.size() - 1);
    }

    public long getTime() {
        return nanosToMillis(getNanoTime());
    }

    public StopWatch() {
        this(null);
    }

    public void split(String str) {
        if (this.runningState == State.RUNNING) {
            this.stopTimeNanos = System.nanoTime();
            this.splitState = SplitState.SPLIT;
            this.splits.add(new Split(str, Duration.ofNanos(this.stopTimeNanos - this.startTimeNanos)));
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Stopwatch is not running.");
    }
}
