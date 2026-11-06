package com.amazon.alexa.voice.ui.onedesign.util.image;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
abstract class CancellableRunnable implements Runnable {
    private volatile boolean cancelled = false;

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        onCancelled();
    }

    public abstract void onCancelled();

    @Override // java.lang.Runnable
    public abstract void run();
}
