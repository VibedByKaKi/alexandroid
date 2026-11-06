package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.io.Source;
import com.amazon.alexa.accessory.protocol.Vision;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface VisionCaptureSourceSupplier {
    void notifyFrameData(Source source, String str);

    void notifyFrameMetadata(Source source, String str);

    void onVisionCapturePaused(Vision.NotifyVisionCapturePaused notifyVisionCapturePaused);

    void onVisionCaptureResumed(Vision.NotifyVisionCaptureResumed notifyVisionCaptureResumed);

    void onVisionCaptureStarted(Vision.NotifyVisionCaptureStarted notifyVisionCaptureStarted);

    void onVisionCaptureStopped(Vision.NotifyVisionCaptureStopped notifyVisionCaptureStopped);
}
