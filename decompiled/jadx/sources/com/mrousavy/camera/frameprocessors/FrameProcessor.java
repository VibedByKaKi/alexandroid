package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import dalvik.annotation.optimization.FastNative;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class FrameProcessor {

    @DoNotStrip
    @Keep
    private final HybridData mHybridData;

    @DoNotStrip
    @Keep
    public FrameProcessor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @FastNative
    public native void call(Frame frame);
}
