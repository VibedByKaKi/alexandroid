package com.amazon.alexa.smarthomecameras.session;

import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.AlexaLatencyMetadata;
import com.amazon.alexa.smarthomecameras.model.EntityId;
import com.amazon.alexa.smarthomecameras.model.SessionId;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface CameraSessionManager {
    void deregisterSessionListener(EntityId entityId, CameraSessionListener cameraSessionListener);

    void didBackground();

    void disconnectSession(EntityId entityId, String str);

    @Nullable
    SessionId getActiveSessionId();

    void onCameraConnectionFailed(@Nonnull String str, @Nonnull String str2, @Nonnull String str3, @Nullable String str4);

    void onRequestStartLiveViewFailed(@Nonnull String str, @Nonnull String str2, @Nullable String str3);

    void onStartLiveViewReceived(@Nullable AlexaLatencyMetadata alexaLatencyMetadata);

    void registerSessionListener(EntityId entityId, CameraSessionListener cameraSessionListener);

    void requestSessionForDevice(EntityId entityId, String str, String str2);

    void sendData(EntityId entityId, String str);

    void sessionEnded(String str, String str2);

    void teardown();
}
