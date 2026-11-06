package com.mapbox.common.module.cronet;

import com.mapbox.common.Scheduler;
import com.mapbox.common.Task;
import com.mapbox.common.TaskOptions;
import com.mapbox.common.TaskPriority;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mapbox/common/module/cronet/CronetTimeout;", "", "sequencedScheduler", "Lcom/mapbox/common/Scheduler;", "timeoutSeconds", "", "action", "Lcom/mapbox/common/Task;", "(Lcom/mapbox/common/Scheduler;JLcom/mapbox/common/Task;)V", "deadline", "Ljava/util/concurrent/atomic/AtomicLong;", "timeout", "weakTimeout", "Lcom/mapbox/common/module/cronet/CronetTimeout$WeakReferenceCronetTimeout;", "cancel", "", "resetDeadline", "run", "scheduleCallback", "options", "Lcom/mapbox/common/TaskOptions;", "start", "Companion", "WeakReferenceCronetTimeout", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class CronetTimeout {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    private static final TaskOptions DEFAULT_TIMEOUT_TASK_OPTIONS = new TaskOptions(60000, TaskPriority.DEFAULT);

    @NotNull
    private final Task action;

    @NotNull
    private AtomicLong deadline;

    @NotNull
    private final Scheduler sequencedScheduler;
    private final long timeout;

    @NotNull
    private final WeakReferenceCronetTimeout weakTimeout;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/common/module/cronet/CronetTimeout$WeakReferenceCronetTimeout;", "Lcom/mapbox/common/Task;", "target", "Lcom/mapbox/common/module/cronet/CronetTimeout;", "(Lcom/mapbox/common/module/cronet/CronetTimeout;)V", "weakTarget", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "run", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class WeakReferenceCronetTimeout implements Task {

        @NotNull
        private final WeakReference<CronetTimeout> weakTarget;

        public WeakReferenceCronetTimeout(@NotNull CronetTimeout cronetTimeout) {
            cronetTimeout.getClass();
            this.weakTarget = new WeakReference<>(cronetTimeout);
        }

        @Override // com.mapbox.common.Task
        public void run() {
            CronetTimeout cronetTimeout = this.weakTarget.get();
            if (cronetTimeout != null) {
                cronetTimeout.run();
            }
        }
    }

    public CronetTimeout(@NotNull Scheduler scheduler, long j, @NotNull Task task) {
        scheduler.getClass();
        task.getClass();
        this.sequencedScheduler = scheduler;
        this.action = task;
        this.deadline = new AtomicLong(-1L);
        this.timeout = j * 1000;
        this.weakTimeout = new WeakReferenceCronetTimeout(this);
    }

    private final void scheduleCallback(TaskOptions options) {
        this.sequencedScheduler.schedule(this.weakTimeout, options);
    }

    public final void cancel() {
        this.deadline.set(-1L);
    }

    public final void resetDeadline() {
        long nowMilliseconds;
        AtomicLong atomicLong = this.deadline;
        nowMilliseconds = CronetTimeoutKt.nowMilliseconds();
        atomicLong.set(nowMilliseconds + this.timeout);
    }

    public final void run() {
        long nowMilliseconds;
        long j = this.deadline.get();
        if (j == -1) {
            return;
        }
        nowMilliseconds = CronetTimeoutKt.nowMilliseconds();
        if (j <= nowMilliseconds) {
            this.action.run();
        } else {
            scheduleCallback(new TaskOptions(j - nowMilliseconds, TaskPriority.DEFAULT));
        }
    }

    public final void start() {
        resetDeadline();
        long j = this.timeout;
        TaskOptions taskOptions = DEFAULT_TIMEOUT_TASK_OPTIONS;
        if (j != taskOptions.getDelay()) {
            taskOptions = new TaskOptions(this.timeout, TaskPriority.DEFAULT);
        }
        scheduleCallback(taskOptions);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/module/cronet/CronetTimeout$Companion;", "", "()V", "DEFAULT_TIMEOUT_TASK_OPTIONS", "Lcom/mapbox/common/TaskOptions;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
