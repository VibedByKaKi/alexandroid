package com.amazon.comms.calling.service;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface CallListener {
    void onAccepted(Call call);

    void onEarlyMedia(Call call);

    void onError(Call call, ErrorCode errorCode, int i, String str);

    void onHangup(Call call, HangupReason hangupReason);

    void onMediaDTMFResponse(Call call, boolean z, String str);

    void onReconnect(Call call, boolean z, boolean z2, String str);

    void onRemoteParticipantUpdated(Call call);

    void onRinging(Call call);

    void onSignalingDTMFResponse(Call call, int i, String str);
}
