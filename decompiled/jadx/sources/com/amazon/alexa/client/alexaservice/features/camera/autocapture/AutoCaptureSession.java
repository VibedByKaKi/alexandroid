package com.amazon.alexa.client.alexaservice.features.camera.autocapture;

import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaAutoCaptureSessionController;
import com.amazon.alexa.api.AlexaCamera;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.features.camera.payload.SessionId;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AutoCaptureSession {
    private static final String TAG = "AutoCaptureSession";
    private final AlexaCamera alexaCamera;
    private final AutoCaptureSessionCallbacks callbacks;
    private final AlexaClientEventBus eventBus;
    private final SessionId sessionId;

    public AutoCaptureSession(SessionId sessionId, AlexaClientEventBus alexaClientEventBus, @Nullable AlexaCamera alexaCamera, @Nullable AutoCaptureSessionCallbacks autoCaptureSessionCallbacks) {
        Preconditions.notNull(sessionId, "sessionId cannot be null");
        Preconditions.notNull(alexaClientEventBus, "eventBus cannot be null");
        this.alexaCamera = alexaCamera;
        this.eventBus = alexaClientEventBus;
        this.sessionId = sessionId;
        this.callbacks = autoCaptureSessionCallbacks;
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            AutoCaptureSession autoCaptureSession = (AutoCaptureSession) obj;
            if (Objects.equals(this.alexaCamera, autoCaptureSession.alexaCamera) && Objects.equals(this.sessionId, autoCaptureSession.sessionId)) {
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
            Log.e(TAG, "Failed to start auto capture session, no camera available");
            return false;
        }
        AlexaAutoCaptureSessionController autoCaptureSessionController = alexaCamera.getAutoCaptureSessionController();
        if (autoCaptureSessionController == null) {
            Log.w(TAG, "Attempting to start auto capture on an unsupported camera");
            return false;
        }
        autoCaptureSessionController.startSession(this.callbacks);
        return true;
    }

    public boolean stop() {
        AlexaCamera alexaCamera = this.alexaCamera;
        if (alexaCamera == null) {
            Log.e(TAG, "Failed to stop auto capture session, no camera available");
            return false;
        }
        AlexaAutoCaptureSessionController autoCaptureSessionController = alexaCamera.getAutoCaptureSessionController();
        if (autoCaptureSessionController == null) {
            Log.w(TAG, "Attempting to stop auto capture on an unsupported camera");
            return false;
        }
        autoCaptureSessionController.stopSession(this.callbacks);
        return true;
    }

    public String toString() {
        return "AutoCaptureSession{alexaCamera=" + this.alexaCamera + ", sessionId=" + this.sessionId + AbstractJsonLexerKt.END_OBJ;
    }

    public AutoCaptureSession(SessionId sessionId, AlexaClientEventBus alexaClientEventBus, @Nullable AlexaCamera alexaCamera) {
        this(sessionId, alexaClientEventBus, alexaCamera, AutoCaptureSessionCallbacksFactory.createNewSessionCallbacks(sessionId, alexaCamera, alexaClientEventBus));
    }
}
