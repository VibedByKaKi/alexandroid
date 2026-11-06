package com.amazon.apl.android.scenegraph;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLScenegraph {
    private final long mNativeHandle;

    public APLScenegraph(long j) {
        this.mNativeHandle = j;
    }

    private native void nApplyUpdates(long j);

    private native long nGetTop(long j);

    public void applyUpdates() {
        nApplyUpdates(this.mNativeHandle);
    }

    public long getTop() {
        return nGetTop(this.mNativeHandle);
    }
}
