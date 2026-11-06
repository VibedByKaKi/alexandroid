package com.amazon.common;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class BoundObject {
    private long nativeHandle = 0;

    public final void bind(long j) {
        this.nativeHandle = j;
        NativeBinding.register(this);
    }

    public final long getNativeHandle() {
        return this.nativeHandle;
    }

    public final boolean isBound() {
        return this.nativeHandle != 0;
    }
}
