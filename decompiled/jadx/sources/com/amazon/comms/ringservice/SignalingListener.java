package com.amazon.comms.ringservice;

import com.amazon.comms.ringservice.Signaling;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SignalingListener {
    void onConnected(long j);

    void onConnectionError(int i, String str);

    void onNewChannel(Signaling.Channel channel, Signaling.Message message);

    void onNewChannelError(Signaling.MessageError messageError, Signaling.MessageErrorInfo messageErrorInfo);

    void onPublishError(int i, String str);
}
