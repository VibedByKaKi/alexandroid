package com.mapbox.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¨\u0006\u0007"}, d2 = {"schedule", "", "Lcom/mapbox/common/Scheduler;", "options", "Lcom/mapbox/common/TaskOptions;", "task", "Lkotlin/Function0;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class SchedulerUtilitiesKt {
    public static final void schedule(@NotNull Scheduler scheduler, @NotNull TaskOptions taskOptions, @NotNull final Function0<Unit> function0) {
        scheduler.getClass();
        taskOptions.getClass();
        function0.getClass();
        scheduler.schedule(new Task() { // from class: com.mapbox.common.SchedulerUtilitiesKt$schedule$1
            @Override // com.mapbox.common.Task
            public void run() {
                function0.invoke();
            }
        }, taskOptions);
    }

    public static /* synthetic */ void schedule$default(Scheduler scheduler, TaskOptions taskOptions, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            taskOptions = new TaskOptions(0L, TaskPriority.DEFAULT);
        }
        schedule(scheduler, taskOptions, function0);
    }
}
