package com.amazon.apl.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.common.BoundObject;
import com.amazon.common.Consumer;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Vector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Action extends BoundObject {
    private final WeakReference<Consumer<Action>> onDestroy;

    @NonNull
    private final Vector<Runnable> terminateCallbacks;

    @Nullable
    private Runnable thenCallback;

    public Action(long j, @Nullable Consumer<Action> consumer) {
        this.terminateCallbacks = new Vector<>();
        bind(j);
        nInit(getNativeHandle());
        this.onDestroy = new WeakReference<>(consumer);
    }

    private void destroy() {
        this.terminateCallbacks.clear();
        this.thenCallback = null;
        Consumer<Action> consumer = this.onDestroy.get();
        if (consumer != null) {
            consumer.accept(this);
            this.onDestroy.clear();
        }
    }

    private native void nInit(long j);

    private static native boolean nIsPending(long j);

    private static native boolean nIsResolved(long j);

    private static native boolean nIsTerminated(long j);

    private void onTerminate() {
        Iterator<Runnable> it2 = this.terminateCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        destroy();
    }

    private void onThen() {
        Runnable runnable = this.thenCallback;
        if (runnable != null) {
            runnable.run();
        }
        destroy();
    }

    public void addTerminateCallback(Runnable runnable) {
        this.terminateCallbacks.add(runnable);
    }

    public boolean isPending() {
        return nIsPending(getNativeHandle());
    }

    public boolean isResolved() {
        return nIsResolved(getNativeHandle());
    }

    public boolean isTerminated() {
        return nIsTerminated(getNativeHandle());
    }

    public void then(Runnable runnable) {
        this.thenCallback = runnable;
    }

    public Action(long j) {
        this(j, null);
    }
}
