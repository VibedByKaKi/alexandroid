package com.amazon.alexa.accessory.repositories.vision;

import com.amazon.alexa.accessory.internal.repositories.CompletableResult;
import com.amazon.alexa.accessory.protocol.Vision;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface VisionCaptureProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handlePauseVisionCapture(String str, int i, Producer.Result<Vision.PauseVisionCaptureResponse> result);

        void handleResumeVisionCapture(String str, Producer.Result<Vision.ResumeVisionCaptureResponse> result);

        void handleSendVisionCaptureState(String str, Vision.CaptureState captureState, Producer.Result<CompletableResult.Value> result);

        void handleStartVisionCapture(String str, Vision.CaptureConfiguration captureConfiguration, int i, Producer.Result<Vision.StartVisionCaptureResponse> result);

        void handleStopVisionCapture(String str, Producer.Result<Vision.StopVisionCaptureResponse> result);

        void handleUpdateVisionCaptureConfig(String str, Vision.CaptureConfiguration captureConfiguration, Producer.Result<Vision.UpdateVisionCaptureConfigResponse> result);
    }
}
