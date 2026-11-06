package com.amazon.alexa.accessory.repositories.camera;

import com.amazon.alexa.accessory.protocol.Camera;
import com.amazon.alexa.accessory.repositories.Producer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface CameraProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleCaptureImage(Camera.CameraActionInitiator cameraActionInitiator, Producer.Result<Camera.CameraActionResponse> result);

        void handleGetAllCameraConfigurations(Producer.Result<Camera.GetCameraConfigurationsResponse> result);

        void handleGetAllCameraSettings(Producer.Result<Camera.GetCameraSettingsResponse> result);

        void handleGetCameraConfiguration(int i, Producer.Result<Camera.GetCameraConfigurationsResponse> result);

        void handleGetCameraSettings(int i, Producer.Result<Camera.GetCameraSettingsResponse> result);

        void handleSetCameraSettings(List<Camera.CameraSettings> list, Producer.Result<Camera.SetCameraSettingsResponse> result);

        void handleStartAutoCaptureSession(Camera.CameraActionInitiator cameraActionInitiator, Producer.Result<Camera.CameraActionResponse> result);

        void handleStartVideoCapture(Camera.CameraActionInitiator cameraActionInitiator, Producer.Result<Camera.CameraActionResponse> result);

        void handleStopAutoCaptureSession(Camera.CameraActionInitiator cameraActionInitiator, Producer.Result<Camera.CameraActionResponse> result);

        void handleStopVideoCapture(Camera.CameraActionInitiator cameraActionInitiator, String str, Producer.Result<Camera.CameraActionResponse> result);
    }
}
