package com.bugsnag.android.internal;

import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import com.dee.app.metrics.MetricsConstants;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J(\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0012\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019J\f\u0010\u001a\u001a\u00020\u0010*\u00020\u0003H\u0002R\u0016\u0010\u0007\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/internal/BackgroundTaskService;", "", "errorExecutor", "Ljava/util/concurrent/ExecutorService;", "sessionExecutor", "ioExecutor", "internalReportExecutor", "defaultExecutor", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "getDefaultExecutor$bugsnag_android_core_release", "()Ljava/util/concurrent/ExecutorService;", "getErrorExecutor$bugsnag_android_core_release", "getInternalReportExecutor$bugsnag_android_core_release", "getIoExecutor$bugsnag_android_core_release", "getSessionExecutor$bugsnag_android_core_release", "shutdown", "", "submitTask", "Ljava/util/concurrent/Future;", "taskType", "Lcom/bugsnag/android/internal/TaskType;", "runnable", "Ljava/lang/Runnable;", ExifInterface.GPS_DIRECTION_TRUE, "callable", "Ljava/util/concurrent/Callable;", "awaitTerminationSafe", "SafeFuture", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class BackgroundTaskService {

    @NotNull
    private final ExecutorService defaultExecutor;

    @NotNull
    private final ExecutorService errorExecutor;

    @NotNull
    private final ExecutorService internalReportExecutor;

    @NotNull
    private final ExecutorService ioExecutor;

    @NotNull
    private final ExecutorService sessionExecutor;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TaskType.ERROR_REQUEST.ordinal()] = 1;
            iArr[TaskType.SESSION_REQUEST.ordinal()] = 2;
            iArr[TaskType.IO.ordinal()] = 3;
            iArr[TaskType.INTERNAL_REPORT.ordinal()] = 4;
            iArr[TaskType.DEFAULT.ordinal()] = 5;
        }
    }

    public /* synthetic */ BackgroundTaskService(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, ExecutorService executorService5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BackgroundTaskServiceKt.createExecutor("Bugsnag Error thread", TaskType.ERROR_REQUEST, true) : executorService, (i & 2) != 0 ? BackgroundTaskServiceKt.createExecutor("Bugsnag Session thread", TaskType.SESSION_REQUEST, true) : executorService2, (i & 4) != 0 ? BackgroundTaskServiceKt.createExecutor("Bugsnag IO thread", TaskType.IO, true) : executorService3, (i & 8) != 0 ? BackgroundTaskServiceKt.createExecutor("Bugsnag Internal Report thread", TaskType.INTERNAL_REPORT, false) : executorService4, (i & 16) != 0 ? BackgroundTaskServiceKt.createExecutor("Bugsnag Default thread", TaskType.DEFAULT, false) : executorService5);
    }

    private final void awaitTerminationSafe(ExecutorService executorService) {
        try {
            executorService.awaitTermination(1500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: getDefaultExecutor$bugsnag_android_core_release, reason: from getter */
    public final ExecutorService getDefaultExecutor() {
        return this.defaultExecutor;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: getErrorExecutor$bugsnag_android_core_release, reason: from getter */
    public final ExecutorService getErrorExecutor() {
        return this.errorExecutor;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: getInternalReportExecutor$bugsnag_android_core_release, reason: from getter */
    public final ExecutorService getInternalReportExecutor() {
        return this.internalReportExecutor;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: getIoExecutor$bugsnag_android_core_release, reason: from getter */
    public final ExecutorService getIoExecutor() {
        return this.ioExecutor;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: getSessionExecutor$bugsnag_android_core_release, reason: from getter */
    public final ExecutorService getSessionExecutor() {
        return this.sessionExecutor;
    }

    public final void shutdown() {
        this.internalReportExecutor.shutdownNow();
        this.defaultExecutor.shutdownNow();
        this.errorExecutor.shutdown();
        this.sessionExecutor.shutdown();
        this.ioExecutor.shutdown();
        awaitTerminationSafe(this.errorExecutor);
        awaitTerminationSafe(this.sessionExecutor);
        awaitTerminationSafe(this.ioExecutor);
    }

    @NotNull
    public final <T> Future<T> submitTask(@NotNull TaskType taskType, @NotNull Callable<T> callable) throws RejectedExecutionException {
        taskType.getClass();
        callable.getClass();
        FutureTask futureTask = new FutureTask(callable);
        int i = WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()];
        if (i == 1) {
            this.errorExecutor.execute(futureTask);
        } else if (i == 2) {
            this.sessionExecutor.execute(futureTask);
        } else if (i == 3) {
            this.ioExecutor.execute(futureTask);
        } else if (i == 4) {
            this.internalReportExecutor.execute(futureTask);
        } else if (i == 5) {
            this.defaultExecutor.execute(futureTask);
        }
        return new SafeFuture(futureTask, taskType);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\r\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ \u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0002\u0010\u0013J\t\u0010\u0014\u001a\u00020\tH\u0096\u0001J\t\u0010\u0015\u001a\u00020\tH\u0096\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/internal/BackgroundTaskService$SafeFuture;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Future;", "delegate", "Ljava/util/concurrent/FutureTask;", "taskType", "Lcom/bugsnag/android/internal/TaskType;", "(Ljava/util/concurrent/FutureTask;Lcom/bugsnag/android/internal/TaskType;)V", "cancel", "", "p0", "ensureTaskGetSafe", "", MetricsConstants.Method.CACHE_GET, "()Ljava/lang/Object;", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isCancelled", "isDone", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class SafeFuture<V> implements Future<V> {
        private final FutureTask<V> delegate;
        private final TaskType taskType;

        public SafeFuture(@NotNull FutureTask<V> futureTask, @NotNull TaskType taskType) {
            futureTask.getClass();
            taskType.getClass();
            this.delegate = futureTask;
            this.taskType = taskType;
        }

        private final void ensureTaskGetSafe() {
            if (this.delegate.isDone()) {
                return;
            }
            Thread currentThread = Thread.currentThread();
            currentThread.getClass();
            if (BackgroundTaskServiceKt.getTaskType(currentThread) == this.taskType) {
                this.delegate.run();
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean p0) {
            return this.delegate.cancel(p0);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            ensureTaskGetSafe();
            return this.delegate.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegate.isDone();
        }

        @Override // java.util.concurrent.Future
        public V get(long timeout, @Nullable TimeUnit unit) {
            ensureTaskGetSafe();
            return this.delegate.get(timeout, unit);
        }
    }

    @NotNull
    public final Future<?> submitTask(@NotNull TaskType taskType, @NotNull Runnable runnable) throws RejectedExecutionException {
        taskType.getClass();
        runnable.getClass();
        Callable<Object> callable = Executors.callable(runnable);
        callable.getClass();
        return submitTask(taskType, callable);
    }

    public BackgroundTaskService(@NotNull ExecutorService executorService, @NotNull ExecutorService executorService2, @NotNull ExecutorService executorService3, @NotNull ExecutorService executorService4, @NotNull ExecutorService executorService5) {
        executorService.getClass();
        executorService2.getClass();
        executorService3.getClass();
        executorService4.getClass();
        executorService5.getClass();
        this.errorExecutor = executorService;
        this.sessionExecutor = executorService2;
        this.ioExecutor = executorService3;
        this.internalReportExecutor = executorService4;
        this.defaultExecutor = executorService5;
    }

    public BackgroundTaskService() {
        this(null, null, null, null, null, 31, null);
    }
}
