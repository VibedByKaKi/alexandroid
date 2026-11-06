package com.bugsnag.android.performance.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/performance/internal/AbstractTask;", "Lcom/bugsnag/android/performance/internal/Task;", "()V", "<set-?>", "Lcom/bugsnag/android/performance/internal/Worker;", "worker", "getWorker", "()Lcom/bugsnag/android/performance/internal/Worker;", "onAttach", "", "onDetach", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractTask implements Task {

    @Nullable
    private Worker worker;

    @Nullable
    public final Worker getWorker() {
        return this.worker;
    }

    @Override // com.bugsnag.android.performance.internal.Task
    public void onAttach(@NotNull Worker worker) {
        worker.getClass();
        this.worker = worker;
    }

    @Override // com.bugsnag.android.performance.internal.Task
    public void onDetach(@NotNull Worker worker) {
        worker.getClass();
        this.worker = worker;
    }
}
