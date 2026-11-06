package com.amazon.alexa.accessory.camera;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSession;
import com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSessionController;
import com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSessionFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class AccessoryAutoCaptureSessionController implements AutoCaptureSessionController {
    private final AutoCaptureCallback autoCaptureCallback;
    private AutoCaptureSessionFactory autoCaptureSessionFactory;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AutoCaptureCallback {
        void startAutoCaptureSession(AutoCaptureSession autoCaptureSession);

        void stopAutoCaptureSession(AutoCaptureSession autoCaptureSession);
    }

    public AccessoryAutoCaptureSessionController(AutoCaptureCallback autoCaptureCallback) {
        Preconditions.notNull(autoCaptureCallback, "autoCaptureCallback");
        this.autoCaptureCallback = autoCaptureCallback;
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSessionController
    public AutoCaptureSessionFactory getAutoCaptureSessionFactory() {
        return this.autoCaptureSessionFactory;
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSessionController
    public void initialize(AutoCaptureSessionFactory autoCaptureSessionFactory) {
        Preconditions.notNull(autoCaptureSessionFactory, "autoCaptureSessionFactory");
        this.autoCaptureSessionFactory = autoCaptureSessionFactory;
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSessionController
    public void startAutoCaptureSession(AutoCaptureSession autoCaptureSession) {
        Preconditions.notNull(autoCaptureSession, "autoCaptureSession");
        this.autoCaptureCallback.startAutoCaptureSession(autoCaptureSession);
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSessionController
    public void stopAutoCaptureSession(AutoCaptureSession autoCaptureSession) {
        Preconditions.notNull(autoCaptureSession, "autoCaptureSession");
        this.autoCaptureCallback.stopAutoCaptureSession(autoCaptureSession);
    }
}
