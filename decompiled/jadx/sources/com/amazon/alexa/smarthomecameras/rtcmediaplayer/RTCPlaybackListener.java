package com.amazon.alexa.smarthomecameras.rtcmediaplayer;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.rtcsc.interfaces.RtcscDataChannelState;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0004\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H&J$\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00072\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u001dH&¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/rtcmediaplayer/RTCPlaybackListener;", "", "onPrepared", "", "onFirstFrameRendered", "onError", "errorCode", "", "message", "onCompletion", "onVideoSizeChanged", "width", "", "height", "onSpeakerStateChanged", "enabled", "", "onMicrophoneStateChanged", "onDataMessageReceived", "onDataChannelStateChange", "state", "Lcom/amazon/rtcsc/interfaces/RtcscDataChannelState;", "onVideoFrameTimestampReceived", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "timestamp", "", "onMetricsReceived", "sourceName", "metrics", "", "", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface RTCPlaybackListener {
    void onCompletion();

    void onDataChannelStateChange(@NotNull RtcscDataChannelState state);

    void onDataMessageReceived(@NotNull String message);

    void onError(@NotNull String errorCode, @Nullable String message);

    void onFirstFrameRendered();

    void onMetricsReceived(@NotNull String sourceName, @NotNull Map<String, ? extends Number> metrics);

    void onMicrophoneStateChanged(boolean enabled);

    void onPrepared();

    void onSpeakerStateChanged(boolean enabled);

    void onVideoFrameTimestampReceived(@NotNull String sessionId, long timestamp);

    void onVideoSizeChanged(int width, int height);
}
