package com.facebook.common.executors;

import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public abstract class StatefulRunnable<T> implements Runnable {
    protected static final int STATE_CANCELLED = 2;
    protected static final int STATE_CREATED = 0;
    protected static final int STATE_FAILED = 4;
    protected static final int STATE_FINISHED = 3;
    protected static final int STATE_STARTED = 1;
    protected final AtomicInteger mState = new AtomicInteger(0);

    public void cancel() {
        if (this.mState.compareAndSet(0, 2)) {
            onCancellation();
        }
    }

    @Nullable
    public abstract T getResult() throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.mState.compareAndSet(0, 1)) {
            try {
                T result = getResult();
                this.mState.set(3);
                try {
                    onSuccess(result);
                } finally {
                    disposeResult(result);
                }
            } catch (Exception e) {
                this.mState.set(4);
                onFailure(e);
            }
        }
    }

    public void onCancellation() {
    }

    public void disposeResult(@Nullable T t) {
    }

    public void onFailure(Exception exc) {
    }

    public void onSuccess(@Nullable T t) {
    }
}
