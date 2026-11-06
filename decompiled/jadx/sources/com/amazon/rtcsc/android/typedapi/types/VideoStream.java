package com.amazon.rtcsc.android.typedapi.types;

import com.amazon.rtcsc.android.typedapi.constants.MediaDirection;
import com.amazon.rtcsc.android.typedapi.constants.RtcpMuxPolicy;
import com.amazon.rtcsc.android.typedapi.constants.VideoSourceType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class VideoStream {
    private final String direction;
    private final int obscuredDurationMillis;
    private final String rtcpMuxPolicy;
    private final VideoSource source;
    private final Boolean startObscured;

    public VideoStream(MediaDirection mediaDirection, RtcpMuxPolicy rtcpMuxPolicy, Boolean bool, int i, VideoSourceType videoSourceType) {
        this.direction = mediaDirection.name();
        this.rtcpMuxPolicy = rtcpMuxPolicy.name();
        this.source = new VideoSource(videoSourceType);
        this.startObscured = bool;
        this.obscuredDurationMillis = i;
    }

    public String getDirection() {
        return this.direction;
    }

    public int getObscuredDurationMillis() {
        return this.obscuredDurationMillis;
    }

    public String getRtcpMuxPolicy() {
        return this.rtcpMuxPolicy;
    }

    public VideoSource getSource() {
        return this.source;
    }

    public Boolean getStartObscured() {
        return this.startObscured;
    }

    public VideoStream(MediaDirection mediaDirection, RtcpMuxPolicy rtcpMuxPolicy) {
        this.direction = mediaDirection.name();
        this.rtcpMuxPolicy = rtcpMuxPolicy.name();
        this.source = null;
        this.startObscured = null;
        this.obscuredDurationMillis = -1;
    }

    public VideoStream(MediaDirection mediaDirection) {
        this.direction = mediaDirection.name();
        this.rtcpMuxPolicy = null;
        this.source = null;
        this.startObscured = null;
        this.obscuredDurationMillis = -1;
    }
}
