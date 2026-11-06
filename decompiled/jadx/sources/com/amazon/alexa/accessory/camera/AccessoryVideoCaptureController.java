package com.amazon.alexa.accessory.camera;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.speechapi.camera.VideoCaptureController;
import com.amazon.alexa.accessory.speechapi.camera.VideoCaptureSession;
import com.amazon.alexa.accessory.speechapi.camera.VideoCaptureSessionFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class AccessoryVideoCaptureController implements VideoCaptureController {
    private final VideoCallback alexaVideoCaptureCallback;
    private VideoCaptureSessionFactory videoCaptureSessionFactory;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VideoCallback {
        void startCapture(VideoCaptureSession videoCaptureSession);

        void stopCapture(VideoCaptureSession videoCaptureSession);
    }

    public AccessoryVideoCaptureController(VideoCallback videoCallback) {
        Preconditions.notNull(videoCallback, "alexaVideoCaptureCallback");
        this.alexaVideoCaptureCallback = videoCallback;
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.VideoCaptureController
    public VideoCaptureSessionFactory getVideoCaptureSessionFactory() {
        return this.videoCaptureSessionFactory;
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.VideoCaptureController
    public void initialize(VideoCaptureSessionFactory videoCaptureSessionFactory) {
        Preconditions.notNull(videoCaptureSessionFactory, "videoCaptureSessionFactory");
        this.videoCaptureSessionFactory = videoCaptureSessionFactory;
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.VideoCaptureController
    public void startCapture(VideoCaptureSession videoCaptureSession) {
        Preconditions.notNull(videoCaptureSession, "videoCaptureSession");
        this.alexaVideoCaptureCallback.startCapture(videoCaptureSession);
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.VideoCaptureController
    public void stopCapture(VideoCaptureSession videoCaptureSession) {
        Preconditions.notNull(videoCaptureSession, "videoCaptureSession");
        this.alexaVideoCaptureCallback.stopCapture(videoCaptureSession);
    }
}
