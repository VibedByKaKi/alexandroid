package com.bugsnag.android.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/internal/TaskTypeThread;", "Ljava/lang/Thread;", "runnable", "Ljava/lang/Runnable;", "name", "", "taskType", "Lcom/bugsnag/android/internal/TaskType;", "(Ljava/lang/Runnable;Ljava/lang/String;Lcom/bugsnag/android/internal/TaskType;)V", "getTaskType", "()Lcom/bugsnag/android/internal/TaskType;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
final class TaskTypeThread extends Thread {

    @NotNull
    private final TaskType taskType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskTypeThread(@NotNull Runnable runnable, @NotNull String str, @NotNull TaskType taskType) {
        super(runnable, str);
        runnable.getClass();
        str.getClass();
        taskType.getClass();
        this.taskType = taskType;
    }

    @NotNull
    public final TaskType getTaskType() {
        return this.taskType;
    }
}
