package com.amazon.alexa.client.alexaservice.features.camera.video;

import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaCamera;
import com.amazon.alexa.api.AlexaVideoCaptureController;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.features.camera.payload.SessionId;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VideoCaptureSession {
    private static final String TAG = "VideoCaptureSession";
    private final AlexaCamera alexaCamera;
    private final VideoCaptureSessionCallbacks callbacks;
    private final AlexaClientEventBus eventBus;
    private final SessionId sessionId;

    public VideoCaptureSession(SessionId sessionId, AlexaClientEventBus alexaClientEventBus, @Nullable AlexaCamera alexaCamera, @Nullable VideoCaptureSessionCallbacks videoCaptureSessionCallbacks) {
        Preconditions.notNull(sessionId, "sessionId cannot be null");
        Preconditions.notNull(alexaClientEventBus, "eventBus cannot be null");
        this.alexaCamera = alexaCamera;
        this.eventBus = alexaClientEventBus;
        this.sessionId = sessionId;
        this.callbacks = videoCaptureSessionCallbacks;
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            VideoCaptureSession videoCaptureSession = (VideoCaptureSession) obj;
            if (Objects.equals(this.alexaCamera, videoCaptureSession.alexaCamera) && Objects.equals(this.sessionId, videoCaptureSession.sessionId)) {
                return true;
            }
        }
        return false;
    }

    public SessionId getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return Objects.hash(this.alexaCamera, this.sessionId);
    }

    public boolean start() {
        AlexaCamera alexaCamera = this.alexaCamera;
        if (alexaCamera == null) {
            Log.e(TAG, "Failed to start video capture session, no camera available");
            return false;
        }
        AlexaVideoCaptureController videoCaptureController = alexaCamera.getVideoCaptureController();
        if (videoCaptureController == null) {
            Log.w(TAG, "Attempting to start video capture on an unsupported camera");
            return false;
        }
        videoCaptureController.startCapture(this.callbacks);
        return true;
    }

    public boolean stop() {
        AlexaCamera alexaCamera = this.alexaCamera;
        if (alexaCamera == null) {
            Log.e(TAG, "Failed to stop video capture session, no camera available");
            return false;
        }
        AlexaVideoCaptureController videoCaptureController = alexaCamera.getVideoCaptureController();
        if (videoCaptureController == null) {
            Log.w(TAG, "Attempting to stop video capture on an unsupported camera");
            return false;
        }
        videoCaptureController.stopCapture(this.callbacks);
        return true;
    }

    public String toString() {
        return "VideoCaptureSession{alexaCamera=" + this.alexaCamera + ", sessionId=" + this.sessionId + AbstractJsonLexerKt.END_OBJ;
    }

    public VideoCaptureSession(SessionId sessionId, AlexaClientEventBus alexaClientEventBus, @Nullable AlexaCamera alexaCamera) {
        this(sessionId, alexaClientEventBus, alexaCamera, VideoCaptureSessionCallbacksFactory.createNewSessionCallbacks(sessionId, alexaCamera, alexaClientEventBus));
    }
}
