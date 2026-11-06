package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.amazon.comms.config.util.DeviceConfigConstants;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
class CommsHardwareVideoCodecUtils {
    private static final List<String> H264_HW_EXCEPTION_MODELS = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    private static final String TAG = "CommsHardwareVideoCodecUtils";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.webrtc.CommsHardwareVideoCodecUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoCodecMimeType;

        static {
            int[] iArr = new int[VideoCodecMimeType.values().length];
            $SwitchMap$org$webrtc$VideoCodecMimeType = iArr;
            try {
                iArr[VideoCodecMimeType.VP8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$VideoCodecMimeType[VideoCodecMimeType.VP9.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$VideoCodecMimeType[VideoCodecMimeType.H264.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static MediaCodecInfo findCodecForMimeType(VideoCodecMimeType videoCodecMimeType, Predicate<MediaCodecInfo> predicate, boolean z) {
        int i = 0;
        while (true) {
            MediaCodecInfo mediaCodecInfo = null;
            if (i >= MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.e(TAG, "Cannot retrieve decoder codec info", e);
            }
            if (mediaCodecInfo != null && ((!z || mediaCodecInfo.isEncoder()) && ((z || !mediaCodecInfo.isEncoder()) && isSupportedVideoCodec(mediaCodecInfo, videoCodecMimeType, predicate, z)))) {
                return mediaCodecInfo;
            }
            i++;
        }
    }

    private static boolean isCodecSupportedByPredicate(MediaCodecInfo mediaCodecInfo, Predicate<MediaCodecInfo> predicate) {
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    private static boolean isHWEncoderSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        int i = AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType[videoCodecMimeType.ordinal()];
        if (i == 1) {
            return isHWEncoderSupportedInCurrentSdkVp8(mediaCodecInfo);
        }
        if (i == 2) {
            return isHWEncoderSupportedInCurrentSdkVp9(mediaCodecInfo);
        }
        if (i != 3) {
            return false;
        }
        return isHWEncoderSupportedInCurrentSdkH264(mediaCodecInfo);
    }

    private static boolean isHWEncoderSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        return name.startsWith(DeviceConfigConstants.QCOM_PREFIX) || name.startsWith("OMX.Exynos.");
    }

    private static boolean isHWEncoderSupportedInCurrentSdkVp8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith(DeviceConfigConstants.QCOM_PREFIX) || name.startsWith("OMX.Exynos.") || name.startsWith("OMX.Intel.");
    }

    private static boolean isHWEncoderSupportedInCurrentSdkVp9(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith(DeviceConfigConstants.QCOM_PREFIX) || name.startsWith("OMX.Exynos.");
    }

    public static boolean isSupportedVideoCodec(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType, Predicate<MediaCodecInfo> predicate, boolean z) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType)) {
            return false;
        }
        if (z) {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) == null) {
                return false;
            }
            return isHWEncoderSupportedInCurrentSdk(mediaCodecInfo, videoCodecMimeType) || isCodecSupportedByPredicate(mediaCodecInfo, predicate);
        }
        if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) == null) {
            return false;
        }
        return isCodecSupportedByPredicate(mediaCodecInfo, predicate);
    }
}
