package com.amazon.apl.android;

import android.view.Choreographer;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.IClock;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLChoreographer implements IClock, Choreographer.FrameCallback {
    private final WeakReference<IClock.IClockCallback> delegateRef;
    Boolean running;
    Boolean scheduled;

    public APLChoreographer(IClock.IClockCallback iClockCallback) {
        Boolean bool = Boolean.FALSE;
        this.running = bool;
        this.scheduled = bool;
        this.delegateRef = new WeakReference<>(iClockCallback);
    }

    @Override // com.amazon.apl.android.IClock
    @UiThread
    public void cleanup() {
        stop();
        this.delegateRef.clear();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IClock.IClockCallback iClockCallback = this.delegateRef.get();
        if (iClockCallback == null) {
            stop();
            return;
        }
        this.scheduled = Boolean.FALSE;
        iClockCallback.onTick(j);
        scheduleNextFrame();
    }

    @VisibleForTesting
    public void scheduleNextFrame() {
        if (this.scheduled.booleanValue() || !this.running.booleanValue()) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(this);
        this.scheduled = Boolean.TRUE;
    }

    @Override // com.amazon.apl.android.IClock
    @UiThread
    public void start() {
        if (this.running.booleanValue()) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        this.running = bool;
        this.scheduled = bool;
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // com.amazon.apl.android.IClock
    @UiThread
    public void stop() {
        Boolean bool = Boolean.FALSE;
        this.running = bool;
        if (this.scheduled.booleanValue()) {
            Choreographer.getInstance().removeFrameCallback(this);
            this.scheduled = bool;
        }
    }
}
