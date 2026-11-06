package com.amazon.apl.android.sgcontent;

import com.amazon.apl.android.utils.ColorUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Shadow {
    public long mNativeHandle;

    public Shadow(long j) {
        this.mNativeHandle = j;
    }

    private static native int nGetColor(long j);

    private static native float[] nGetOffset(long j);

    private static native float nGetRadius(long j);

    public int getColor() {
        return ColorUtils.toARGB(nGetColor(this.mNativeHandle));
    }

    public float[] getOffset() {
        return nGetOffset(this.mNativeHandle);
    }

    public float getRadius() {
        return nGetRadius(this.mNativeHandle);
    }
}
