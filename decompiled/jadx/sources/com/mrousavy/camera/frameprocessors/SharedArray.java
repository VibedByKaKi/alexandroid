package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import dalvik.annotation.optimization.FastNative;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class SharedArray {

    @DoNotStrip
    @Keep
    private final HybridData mHybridData;

    public SharedArray(VisionCameraProxy visionCameraProxy, int i) {
        this.mHybridData = initHybrid(visionCameraProxy, i);
    }

    @FastNative
    private native HybridData initHybrid(VisionCameraProxy visionCameraProxy, int i);

    @FastNative
    private native HybridData initHybrid(VisionCameraProxy visionCameraProxy, ByteBuffer byteBuffer);

    @FastNative
    public native ByteBuffer getByteBuffer();

    @FastNative
    public native int getSize();

    @DoNotStrip
    @Keep
    private SharedArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public SharedArray(VisionCameraProxy visionCameraProxy, ByteBuffer byteBuffer) {
        this.mHybridData = initHybrid(visionCameraProxy, byteBuffer);
    }
}
