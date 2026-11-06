package com.here.sdk.mapview;

import android.view.Surface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class NativeSurface {
    public static native long getNativeSurface(Surface surface);

    public static native void releaseNativeSurface(long j);
}
