package org.webrtc;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface VideoEncoderFactory {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VideoEncoderSelector {
        @Nullable
        @CalledByNative("VideoEncoderSelector")
        VideoCodecInfo onAvailableBitrate(int i);

        @CalledByNative("VideoEncoderSelector")
        void onCurrentEncoder(VideoCodecInfo videoCodecInfo);

        @Nullable
        @CalledByNative("VideoEncoderSelector")
        VideoCodecInfo onEncoderBroken();
    }

    @Nullable
    @CalledByNative
    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    default VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    @CalledByNative
    default VideoCodecInfo[] getImplementations() {
        return getSupportedCodecs();
    }

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs();
}
