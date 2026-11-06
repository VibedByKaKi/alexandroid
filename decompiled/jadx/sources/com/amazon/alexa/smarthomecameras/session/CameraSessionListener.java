package com.amazon.alexa.smarthomecameras.session;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.smarthomecameras.model.SessionId;
import com.amazon.rtcsc.interfaces.RtcscMediaType;
import com.amazon.rtcsc.interfaces.RtcscSide;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface CameraSessionListener {
    void onError(String str, String str2);

    void onFirstFrameRendered(SessionId sessionId, VideoRendererSide videoRendererSide);

    void onFrameResolutionChanged(SessionId sessionId, int i, int i2);

    void onLiveViewFailed(@NonNull String str, @Nullable String str2, @Nullable String str3);

    void onMediaConnectionStateChanged(SessionId sessionId, MediaConnectionState mediaConnectionState);

    void onMediaStatusChanged(String str, RtcscSide rtcscSide, RtcscMediaType rtcscMediaType, boolean z);

    void onSessionConnected(SessionId sessionId);

    void onSessionDisconnected(SessionId sessionId);

    void onSessionStateChanged(SessionId sessionId, CameraSessionState cameraSessionState);
}
