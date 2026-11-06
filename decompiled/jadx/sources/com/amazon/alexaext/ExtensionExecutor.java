package com.amazon.alexaext;

import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class ExtensionExecutor extends BoundObject {
    protected boolean mIsPaused = false;

    public ExtensionExecutor() {
        bind(nCreate());
    }

    private native long nCreate();

    private native void nExecuteTasks(long j);

    private synchronized void onTaskAddedInternal() {
        if (this.mIsPaused) {
            return;
        }
        onTaskAdded();
    }

    public void executeTasks() {
        nExecuteTasks(getNativeHandle());
    }

    public synchronized void pause() {
        this.mIsPaused = true;
    }

    public synchronized void resume() {
        this.mIsPaused = false;
        onTaskAdded();
    }

    public void onTaskAdded() {
    }
}
