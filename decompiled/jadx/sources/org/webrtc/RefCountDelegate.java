package org.webrtc;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);

    @Nullable
    private final Runnable releaseCallback;

    public RefCountDelegate(@Nullable Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        Runnable runnable;
        int decrementAndGet = this.refCount.decrementAndGet();
        if (decrementAndGet < 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("release() called on an object with refcount < 1");
        } else {
            if (decrementAndGet != 0 || (runnable = this.releaseCallback) == null) {
                return;
            }
            runnable.run();
        }
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        if (this.refCount.incrementAndGet() >= 2) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("retain() called on an object with refcount < 1");
    }

    public boolean safeRetain() {
        int i = this.refCount.get();
        while (i != 0) {
            if (this.refCount.weakCompareAndSet(i, i + 1)) {
                return true;
            }
            i = this.refCount.get();
        }
        return false;
    }
}
