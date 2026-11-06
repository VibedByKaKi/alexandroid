package com.amazon.dee.app.core.generated.callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public final class Runnable implements java.lang.Runnable {
    final Listener mListener;
    final int mSourceId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void _internalCallbackRun(int i);
    }

    public Runnable(Listener listener, int i) {
        this.mListener = listener;
        this.mSourceId = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.mListener._internalCallbackRun(this.mSourceId);
    }
}
