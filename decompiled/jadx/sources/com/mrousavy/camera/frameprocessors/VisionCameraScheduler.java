package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.mapbox.maps.NativeMapImpl$$ExternalSyntheticLambda2;
import com.mrousavy.camera.core.CameraQueues;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class VisionCameraScheduler {

    @DoNotStrip
    @Keep
    private final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    @DoNotStrip
    private void scheduleTrigger() {
        CameraQueues.INSTANCE.getVideoQueue().getHandler().post(new NativeMapImpl$$ExternalSyntheticLambda2(this, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void trigger();
}
