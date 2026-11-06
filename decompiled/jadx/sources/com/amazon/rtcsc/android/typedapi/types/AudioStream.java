package com.amazon.rtcsc.android.typedapi.types;

import com.amazon.rtcsc.android.typedapi.constants.MediaDirection;
import com.amazon.rtcsc.android.typedapi.constants.RtcpMuxPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AudioStream {
    private final String direction;
    private final String rtcpMuxPolicy;

    public AudioStream(MediaDirection mediaDirection, RtcpMuxPolicy rtcpMuxPolicy) {
        this.direction = mediaDirection.name();
        this.rtcpMuxPolicy = rtcpMuxPolicy.name();
    }

    public String getDirection() {
        return this.direction;
    }

    public String getRtcpMuxPolicy() {
        return this.rtcpMuxPolicy;
    }

    public AudioStream(MediaDirection mediaDirection) {
        this.direction = mediaDirection.name();
        this.rtcpMuxPolicy = null;
    }
}
