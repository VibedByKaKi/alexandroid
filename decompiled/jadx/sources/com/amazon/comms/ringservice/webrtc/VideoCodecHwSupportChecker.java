package com.amazon.comms.ringservice.webrtc;

import android.media.MediaCodecInfo;
import org.webrtc.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface VideoCodecHwSupportChecker {
    boolean isH264HwDecodeSupported(Predicate<MediaCodecInfo> predicate);

    boolean isH264HwEncodeSupported(Predicate<MediaCodecInfo> predicate);

    boolean isH264OrVp8HwDecodeSupported(Predicate<MediaCodecInfo> predicate);

    boolean isH264OrVp8HwEncodeAndDecodeSupported(Predicate<MediaCodecInfo> predicate);

    boolean isVp8HwDecodeSupported(Predicate<MediaCodecInfo> predicate);

    boolean isVp8HwEncodeSupported(Predicate<MediaCodecInfo> predicate);
}
