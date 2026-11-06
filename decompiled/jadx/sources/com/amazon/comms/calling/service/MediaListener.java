package com.amazon.comms.calling.service;

import com.amazon.comms.calling.service.Call;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface MediaListener {
    void onCameraSwitchDone(boolean z);

    void onCameraSwitchError(String str);

    void onDtmfTonesSent(Call call, String str, int i, int i2);

    void onFirstFrameReceived(Call.Side side);

    void onFirstFrameRendered(Call.Side side);

    void onLocalFrameResolutionChanged(int i, int i2, int i3);

    void onMediaStatsUpdated(Call call);

    void onMediaStatusUpdated(Call call, Call.Side side, MediaStatus mediaStatus, MediaStateChangeTrigger mediaStateChangeTrigger);

    void onRemoteFrameResolutionChanged(int i, int i2, int i3);

    void onVideoEffectChanged(Call call);
}
