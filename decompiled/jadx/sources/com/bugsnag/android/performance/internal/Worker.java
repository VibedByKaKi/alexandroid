package com.bugsnag.android.performance.internal;

import com.amazon.alexa.routing.data.RouteName;
import com.bugsnag.android.performance.Logger;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0006\u0010\u0018\u001a\u00020\u0013J\u0010\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\fJ\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u0006\u0010\u001c\u001a\u00020\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bugsnag/android/performance/internal/Worker;", "Ljava/lang/Runnable;", RouteName.STARTUP, "Lkotlin/Function0;", "", "Lcom/bugsnag/android/performance/internal/Task;", "(Lkotlin/jvm/functions/Function0;)V", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/util/concurrent/locks/ReentrantLock;", "runner", "Ljava/lang/Thread;", "running", "", "tasks", "wakeIsPending", "wakeWorker", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "attachTasks", "", "detachWorkers", "run", "runFixedTasks", "runStartupTasks", "start", "stop", "waitForTermination", "waitForWorkOrWakeup", "wake", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Worker.kt\ncom/bugsnag/android/performance/internal/Worker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1855#2,2:172\n1855#2,2:174\n*S KotlinDebug\n*F\n+ 1 Worker.kt\ncom/bugsnag/android/performance/internal/Worker\n*L\n112#1:172,2\n122#1:174,2\n*E\n"})
/* loaded from: classes6.dex */
public final class Worker implements Runnable {

    @NotNull
    private final ReentrantLock lock;

    @Nullable
    private Thread runner;
    private volatile boolean running;

    @NotNull
    private Function0<? extends List<? extends Task>> startup;
    private List<? extends Task> tasks;
    private boolean wakeIsPending;
    private final Condition wakeWorker;

    public Worker(@NotNull Function0<? extends List<? extends Task>> function0) {
        function0.getClass();
        this.startup = function0;
        ReentrantLock reentrantLock = new ReentrantLock(false);
        this.lock = reentrantLock;
        this.wakeWorker = reentrantLock.newCondition();
    }

    private final void attachTasks() {
        List<? extends Task> list = this.tasks;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tasks");
            list = null;
        }
        for (Task task : list) {
            try {
                task.onAttach(this);
            } catch (Exception e) {
                Logger.INSTANCE.w("unhandled exception while attempting to attach worker " + task, e);
            }
        }
    }

    private final void detachWorkers() {
        List<? extends Task> list = this.tasks;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tasks");
            list = null;
        }
        for (Task task : list) {
            try {
                task.onDetach(this);
            } catch (Exception e) {
                Logger.INSTANCE.w("unhandled exception while attempting to detach worker " + task, e);
            }
        }
    }

    private final boolean runFixedTasks() {
        List<? extends Task> list = this.tasks;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tasks");
            list = null;
        }
        boolean z = true;
        for (Task task : list) {
            try {
                if (task.execute()) {
                    z = false;
                }
            } catch (Exception e) {
                Logger.INSTANCE.w("unhandled exception in a worker task: " + task, e);
            }
        }
        return z;
    }

    private final void runStartupTasks() {
        this.tasks = this.startup.invoke();
        this.startup = new Function0<List<? extends Task>>() { // from class: com.bugsnag.android.performance.internal.Worker$runStartupTasks$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends Task> invoke() {
                return CollectionsKt.emptyList();
            }
        };
    }

    public static /* synthetic */ void stop$default(Worker worker, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        worker.stop(z);
    }

    private final void waitForWorkOrWakeup() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.wakeIsPending) {
                try {
                    this.wakeWorker.await(InternalDebug.INSTANCE.getWorkerSleepMs(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
            }
            this.wakeIsPending = false;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        runStartupTasks();
        attachTasks();
        while (this.running) {
            try {
                if (runFixedTasks()) {
                    waitForWorkOrWakeup();
                }
            } finally {
                detachWorkers();
            }
        }
    }

    public final synchronized void start() {
        if (this.running) {
            return;
        }
        this.running = true;
        Thread thread = new Thread(this, "Bugsnag Performance");
        thread.setDaemon(true);
        thread.start();
        this.runner = thread;
    }

    public final synchronized void stop(boolean waitForTermination) {
        if (this.running) {
            this.running = false;
            Thread thread = this.runner;
            if (thread != null) {
                thread.interrupt();
            }
            if (waitForTermination) {
                try {
                    Thread thread2 = this.runner;
                    if (thread2 != null) {
                        thread2.join();
                    }
                } finally {
                    this.runner = null;
                }
            }
        }
    }

    public final void wake() {
        if (this.running) {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                this.wakeIsPending = true;
                this.wakeWorker.signalAll();
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Worker() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ Worker(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0<List<? extends Task>>() { // from class: com.bugsnag.android.performance.internal.Worker.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends Task> invoke() {
                return CollectionsKt.emptyList();
            }
        } : function0);
    }
}
