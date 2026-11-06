package com.amazon.comms.ringservice.webrtc;

import org.webrtc.DecoderMetricsSink;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface DecoderMetricsSinkRouter extends DecoderMetricsSink {
    void registerToReceiveEvents(DecoderMetricsSink decoderMetricsSink);

    void unregisterToReceiveEvents(DecoderMetricsSink decoderMetricsSink);
}
