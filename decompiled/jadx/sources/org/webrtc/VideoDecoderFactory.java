package org.webrtc;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface VideoDecoderFactory {
    @Nullable
    @CalledByNative
    default VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return createDecoder(videoCodecInfo.getName());
    }

    @CalledByNative
    default VideoCodecInfo[] getSupportedCodecs() {
        return new VideoCodecInfo[0];
    }

    @Nullable
    @Deprecated
    default VideoDecoder createDecoder(String str) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }
}
