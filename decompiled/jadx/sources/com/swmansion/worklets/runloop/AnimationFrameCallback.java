package com.swmansion.worklets.runloop;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class AnimationFrameCallback {

    @DoNotStrip
    private final HybridData mHybridData;

    @DoNotStrip
    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onAnimationFrame(double d);
}
