package com.amazon.rtcmedia.webrtc;

import com.amazon.rtcmedia.util.ViewDirection;
import com.amazon.rtcmedia.webrtc.WebRTCAndroidSession;
import java.util.List;
import java.util.Map;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;
import org.webrtc.StatsReport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface WebRTCAndroidSessionInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PeerClientListener {
        void onCameraFailure(String str, String str2);

        void onCameraOpening(String str, boolean z);

        void onFirstFrameRendered(String str, ViewDirection viewDirection);

        void onFrameResolutionChanged(String str, ViewDirection viewDirection, int i, int i2, int i3);

        void onIceCandidate(String str, IceCandidate iceCandidate);

        void onIceCandidatesRemoved(String str, IceCandidate[] iceCandidateArr);

        void onIceConnected(String str);

        void onIceDisconnected(String str);

        void onIceFailed(String str);

        void onIceGatheringDone(String str, String str2, boolean z);

        void onLocalDescriptionCreated(String str, String str2, boolean z);

        void onLocalDescriptionSet(String str, String str2, boolean z);

        void onPeerConnectionClosed(String str);

        void onPeerConnectionError(String str, String str2);

        void onPeerConnectionStatsReady(String str, StatsReport[] statsReportArr);

        void onRemoteDescriptionSet(String str, String str2, boolean z);

        void onSignalingDone(String str);

        void onVideoEffectAbort(String str);

        void onVideoEffectTransition(String str, String str2);
    }

    void addRemoteIceCandidate(IceCandidate iceCandidate);

    void createAnswer();

    void createOffer();

    void disableRemoteVideoFrost();

    void enableRemoteVideoFrost(float f, float f2);

    void fetchStats();

    long getVideoFrameTimeStamp();

    void initialize(WebRTCAndroidSession.PeerConnectionParameters peerConnectionParameters, String str, boolean z);

    void initializeVideoEffectPipeline();

    void processRemoteAnswer(String str, SessionDescription.Type type);

    void processRemoteOffer(String str);

    void removeRemoteIceCandidates(IceCandidate[] iceCandidateArr);

    void resetRemoteDescription();

    void restartIce(List<PeerConnection.IceServer> list, boolean z);

    void sendVideoEffectCommand(String str);

    void setLocalAnswer(String str);

    void setLocalAudioEnabled(boolean z);

    void setLocalOffer(String str);

    void setLocalVideoEnabled(boolean z);

    void setMediaConstraints(Map<String, Integer> map);

    void setRemoteAudioEnabled(boolean z);

    void setRemoteMediaCapability(boolean z, boolean z2);

    void setRemoteVideoEnabled(boolean z);

    void shutdown();

    void stopVideoEffectPipeline();

    void switchCamera();

    void updateBitrateConstraint(int i);

    void updateResolutionFrameRateConstraint(int i, int i2, int i3);

    void warmUp(WebRTCAndroidSession.PeerConnectionParameters peerConnectionParameters, String str);
}
