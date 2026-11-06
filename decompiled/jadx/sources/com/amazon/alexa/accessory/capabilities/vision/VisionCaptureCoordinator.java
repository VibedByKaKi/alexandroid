package com.amazon.alexa.accessory.capabilities.vision;

import com.amazon.alexa.accessory.io.Source;
import com.amazon.alexa.accessory.protocol.Vision;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface VisionCaptureCoordinator {
    void notifyFrameData(Source source, String str, String str2);

    void notifyFrameMetadata(Source source, String str, String str2);

    void onVisionCapturePaused(Vision.NotifyVisionCapturePaused notifyVisionCapturePaused, String str);

    void onVisionCaptureResumed(Vision.NotifyVisionCaptureResumed notifyVisionCaptureResumed, String str);

    void onVisionCaptureStarted(Vision.NotifyVisionCaptureStarted notifyVisionCaptureStarted, String str);

    void onVisionCaptureStopped(Vision.NotifyVisionCaptureStopped notifyVisionCaptureStopped, String str);
}
