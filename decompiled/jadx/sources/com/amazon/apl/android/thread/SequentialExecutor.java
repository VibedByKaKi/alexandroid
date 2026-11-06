package com.amazon.apl.android.thread;

import androidx.annotation.NonNull;
import com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda0;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.apache.commons.lang3.Functions$$ExternalSyntheticLambda19;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SequentialExecutor implements Executor {
    private Runnable mActiveTask;
    private final Executor mExecutor;
    private final Deque<FutureTask> mTaskQueue = new ArrayDeque();

    public SequentialExecutor(@NonNull Executor executor) {
        Objects.requireNonNull(executor);
        this.mExecutor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$execute$0(Runnable runnable) throws Exception {
        runnable.run();
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$submit$1(Callable callable) throws Exception {
        try {
            return callable.call();
        } finally {
            next();
        }
    }

    private synchronized void next() {
        FutureTask poll = this.mTaskQueue.poll();
        this.mActiveTask = poll;
        if (poll != null) {
            this.mExecutor.execute(poll);
        }
    }

    public void clearTaskQueue() {
        this.mTaskQueue.clear();
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        submit(new Functions$$ExternalSyntheticLambda19(runnable, 22));
    }

    public synchronized <V> Future<V> submit(@NonNull Callable<V> callable) {
        FutureTask futureTask;
        Objects.requireNonNull(callable);
        futureTask = new FutureTask(new ReactHostImpl$$ExternalSyntheticLambda0(this, callable, 10));
        this.mTaskQueue.offer(futureTask);
        if (this.mActiveTask == null) {
            next();
        }
        return futureTask;
    }
}
