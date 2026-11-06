package com.mapbox.common;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"asDispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lcom/mapbox/common/Scheduler;", "asExecutor", "Ljava/util/concurrent/Executor;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class SchedulerExecutorDispatcherKt {
    @NotNull
    public static final ExecutorCoroutineDispatcher asDispatcher(@NotNull Scheduler scheduler) {
        scheduler.getClass();
        return new SchedulerExecutorDispatcher(asExecutor(scheduler));
    }

    @NotNull
    public static final Executor asExecutor(@NotNull final Scheduler scheduler) {
        scheduler.getClass();
        return new Executor() { // from class: com.mapbox.common.SchedulerExecutorDispatcherKt$asExecutor$1
            @Override // java.util.concurrent.Executor
            public void execute(@Nullable final Runnable command) {
                Scheduler.this.schedule(new Task() { // from class: com.mapbox.common.SchedulerExecutorDispatcherKt$asExecutor$1$execute$1
                    @Override // com.mapbox.common.Task
                    public void run() {
                        Runnable runnable = command;
                        runnable.getClass();
                        runnable.run();
                    }
                }, new TaskOptions(0L, TaskPriority.DEFAULT));
            }
        };
    }
}
