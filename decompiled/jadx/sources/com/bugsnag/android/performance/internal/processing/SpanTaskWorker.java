package com.bugsnag.android.performance.internal.processing;

import android.os.SystemClock;
import com.amazon.alexa.ra.core.data.fragments.CardContext;
import com.bugsnag.android.performance.Logger;
import com.bugsnag.android.performance.internal.processing.ScheduledAction;
import com.bugsnag.android.performance.internal.processing.SpanTaskWorker;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0001H\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/performance/internal/processing/SpanTaskWorker;", "Ljava/lang/Runnable;", "Lcom/bugsnag/android/performance/internal/processing/TimeoutExecutor;", "Lcom/bugsnag/android/performance/internal/processing/SamplerExecutor;", "()V", CardContext.ACTIONS, "Ljava/util/concurrent/DelayQueue;", "Lcom/bugsnag/android/performance/internal/processing/ScheduledAction;", "running", "", "thread", "Ljava/lang/Thread;", "addSampler", "", "sampler", "sampleRateMs", "", "cancelTimeout", "timeout", "Lcom/bugsnag/android/performance/internal/processing/Timeout;", "removeSampler", "run", "runTask", "task", "scheduleTimeout", "start", "stop", "Sampler", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SpanTaskWorker implements Runnable, TimeoutExecutor, SamplerExecutor {

    @NotNull
    private final DelayQueue<ScheduledAction> actions = new DelayQueue<>();
    private volatile boolean running;

    @Nullable
    private Thread thread;

    private final void runTask(Runnable task) {
        try {
            task.run();
        } catch (InterruptedException unused) {
        } catch (Exception e) {
            Logger.INSTANCE.w("unhandled exception in span task: " + task, e);
        }
    }

    @Override // com.bugsnag.android.performance.internal.processing.SamplerExecutor
    public void addSampler(@NotNull Runnable sampler, long sampleRateMs) {
        sampler.getClass();
        this.actions.add((DelayQueue<ScheduledAction>) new Sampler(this, sampler, sampleRateMs));
    }

    @Override // com.bugsnag.android.performance.internal.processing.TimeoutExecutor
    public void cancelTimeout(@NotNull Timeout timeout) {
        timeout.getClass();
        this.actions.remove(timeout);
    }

    @Override // com.bugsnag.android.performance.internal.processing.SamplerExecutor
    public void removeSampler(@NotNull final Runnable sampler) {
        sampler.getClass();
        CollectionsKt__MutableCollectionsKt.removeAll(this.actions, new Function1<ScheduledAction, Boolean>() { // from class: com.bugsnag.android.performance.internal.processing.SpanTaskWorker$removeSampler$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(ScheduledAction scheduledAction) {
                return Boolean.valueOf((scheduledAction instanceof SpanTaskWorker.Sampler) && ((SpanTaskWorker.Sampler) scheduledAction).getSampler() == sampler);
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.running) {
            ScheduledAction take = this.actions.take();
            take.getClass();
            runTask(take);
        }
    }

    @Override // com.bugsnag.android.performance.internal.processing.TimeoutExecutor
    public void scheduleTimeout(@NotNull Timeout timeout) {
        timeout.getClass();
        this.actions.add((DelayQueue<ScheduledAction>) timeout);
    }

    public final synchronized void start() {
        if (this.running) {
            return;
        }
        this.running = true;
        Thread thread = new Thread(this, "Bugsnag Span Task Worker");
        this.thread = thread;
        thread.start();
    }

    public final synchronized void stop() {
        try {
            if (this.running) {
                this.running = false;
                Thread thread = this.thread;
                if (thread != null) {
                    thread.interrupt();
                }
                this.thread = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/performance/internal/processing/SpanTaskWorker$Sampler;", "Lcom/bugsnag/android/performance/internal/processing/ScheduledAction;", "sampler", "Ljava/lang/Runnable;", "sampleRateMs", "", "(Lcom/bugsnag/android/performance/internal/processing/SpanTaskWorker;Ljava/lang/Runnable;J)V", "baseTime", "runCount", "getSampleRateMs", "()J", "getSampler", "()Ljava/lang/Runnable;", "getDelay", "unit", "Ljava/util/concurrent/TimeUnit;", "run", "", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Sampler implements ScheduledAction {
        private long baseTime;
        private long runCount;
        private final long sampleRateMs;

        @NotNull
        private final Runnable sampler;
        final /* synthetic */ SpanTaskWorker this$0;

        public Sampler(@NotNull SpanTaskWorker spanTaskWorker, Runnable runnable, long j) {
            runnable.getClass();
            this.this$0 = spanTaskWorker;
            this.sampler = runnable;
            this.sampleRateMs = j;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(@NotNull TimeUnit unit) {
            unit.getClass();
            if (this.runCount == 0) {
                return 0L;
            }
            return unit.convert(((this.runCount * this.sampleRateMs) + this.baseTime) - SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
        }

        public final long getSampleRateMs() {
            return this.sampleRateMs;
        }

        @NotNull
        public final Runnable getSampler() {
            return this.sampler;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.runCount == 0) {
                    this.baseTime = SystemClock.elapsedRealtime();
                }
                this.sampler.run();
                this.runCount++;
                this.this$0.actions.add((DelayQueue) this);
            } catch (Throwable th) {
                this.runCount++;
                this.this$0.actions.add((DelayQueue) this);
                throw th;
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull Delayed delayed) {
            return ScheduledAction.DefaultImpls.compareTo(this, delayed);
        }
    }
}
