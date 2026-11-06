package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.compat.model.AlexaAutoCaptureSessionStopReason;
import com.amazon.alexa.api.compat.model.AlexaCameraCaptureError;
import com.amazon.alexa.api.compat.model.AlexaCameraCaptureInitiator;
import com.amazon.alexa.api.compat.model.AlexaVideoCaptureStopReason;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/api/compat/CameraConversions;", "", "<init>", "()V", "toVoxSdk", "Lcom/amazon/alexa/api/AlexaCameraCaptureInitiator;", AlexaMetricsConstants.AssistantSdkDimensions.INITIATOR, "Lcom/amazon/alexa/api/compat/model/AlexaCameraCaptureInitiator;", "Lcom/amazon/alexa/api/AlexaCameraCaptureError;", "error", "Lcom/amazon/alexa/api/compat/model/AlexaCameraCaptureError;", "Lcom/amazon/alexa/api/AlexaVideoCaptureStopReason;", "reason", "Lcom/amazon/alexa/api/compat/model/AlexaVideoCaptureStopReason;", "Lcom/amazon/alexa/api/AlexaAutoCaptureSessionStopReason;", "Lcom/amazon/alexa/api/compat/model/AlexaAutoCaptureSessionStopReason;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CameraConversions {

    @NotNull
    public static final CameraConversions INSTANCE = new CameraConversions();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[AlexaCameraCaptureInitiator.values().length];
            try {
                iArr[AlexaCameraCaptureInitiator.GESTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlexaCameraCaptureInitiator.VOICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlexaCameraCaptureInitiator.AUTO_CAPTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlexaCameraCaptureError.values().length];
            try {
                iArr2[AlexaCameraCaptureError.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AlexaCameraCaptureError.CAMERA_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AlexaCameraCaptureError.OVERHEAT_PROTECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AlexaCameraCaptureError.PRIVACY_MODE_ON.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AlexaCameraCaptureError.DEVICE_POWER_LOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AlexaCameraCaptureError.DEVICE_STORAGE_FULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AlexaCameraCaptureError.CAMERA_BLOCKED.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AlexaCameraCaptureError.SHUTTER_CLOSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AlexaCameraCaptureError.PERMISSION_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AlexaCameraCaptureError.CAMERA_IN_USE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[AlexaCameraCaptureError.CAMERA_UNAVAILABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AlexaVideoCaptureStopReason.values().length];
            try {
                iArr3[AlexaVideoCaptureStopReason.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[AlexaVideoCaptureStopReason.LOCAL_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[AlexaVideoCaptureStopReason.CLOUD_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[AlexaVideoCaptureStopReason.PRIVACY_MODE_ON.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[AlexaVideoCaptureStopReason.OVERHEAT_PROTECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[AlexaVideoCaptureStopReason.DEVICE_POWER_LOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[AlexaVideoCaptureStopReason.CAMERA_FAILURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[AlexaVideoCaptureStopReason.DEVICE_STORAGE_FULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[AlexaVideoCaptureStopReason.CAMERA_BLOCKED.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[AlexaVideoCaptureStopReason.SHUTTER_CLOSED.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AlexaAutoCaptureSessionStopReason.values().length];
            try {
                iArr4[AlexaAutoCaptureSessionStopReason.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[AlexaAutoCaptureSessionStopReason.USER_LOCAL_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[AlexaAutoCaptureSessionStopReason.CLOUD_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[AlexaAutoCaptureSessionStopReason.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[AlexaAutoCaptureSessionStopReason.DEVICE_DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[AlexaAutoCaptureSessionStopReason.PRIVACY_MODE_ON.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[AlexaAutoCaptureSessionStopReason.ASSET_CAPTURE_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[AlexaAutoCaptureSessionStopReason.LOCAL_INTERRUPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private CameraConversions() {
    }

    @NotNull
    public final com.amazon.alexa.api.AlexaCameraCaptureError toVoxSdk(@NotNull AlexaCameraCaptureError error) {
        error.getClass();
        switch (WhenMappings.$EnumSwitchMapping$1[error.ordinal()]) {
            case 1:
                return com.amazon.alexa.api.AlexaCameraCaptureError.UNKNOWN;
            case 2:
                return com.amazon.alexa.api.AlexaCameraCaptureError.CAMERA_FAILURE;
            case 3:
                return com.amazon.alexa.api.AlexaCameraCaptureError.OVERHEAT_PROTECTION;
            case 4:
                return com.amazon.alexa.api.AlexaCameraCaptureError.PRIVACY_MODE_ON;
            case 5:
                return com.amazon.alexa.api.AlexaCameraCaptureError.DEVICE_POWER_LOW;
            case 6:
                return com.amazon.alexa.api.AlexaCameraCaptureError.DEVICE_STORAGE_FULL;
            case 7:
                return com.amazon.alexa.api.AlexaCameraCaptureError.CAMERA_BLOCKED;
            case 8:
                return com.amazon.alexa.api.AlexaCameraCaptureError.SHUTTER_CLOSED;
            case 9:
                return com.amazon.alexa.api.AlexaCameraCaptureError.PERMISSION_ERROR;
            case 10:
                return com.amazon.alexa.api.AlexaCameraCaptureError.CAMERA_IN_USE;
            case 11:
                return com.amazon.alexa.api.AlexaCameraCaptureError.CAMERA_UNAVAILABLE;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }

    @NotNull
    public final com.amazon.alexa.api.AlexaCameraCaptureInitiator toVoxSdk(@NotNull AlexaCameraCaptureInitiator initiator) {
        initiator.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[initiator.ordinal()];
        if (i == 1) {
            return com.amazon.alexa.api.AlexaCameraCaptureInitiator.GESTURE;
        }
        if (i == 2) {
            return com.amazon.alexa.api.AlexaCameraCaptureInitiator.VOICE;
        }
        if (i == 3) {
            return com.amazon.alexa.api.AlexaCameraCaptureInitiator.AUTO_CAPTURE;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public final com.amazon.alexa.api.AlexaVideoCaptureStopReason toVoxSdk(@NotNull AlexaVideoCaptureStopReason reason) {
        reason.getClass();
        switch (WhenMappings.$EnumSwitchMapping$2[reason.ordinal()]) {
            case 1:
                return com.amazon.alexa.api.AlexaVideoCaptureStopReason.UNKNOWN;
            case 2:
                return com.amazon.alexa.api.AlexaVideoCaptureStopReason.LOCAL_STOP;
            case 3:
                return com.amazon.alexa.api.AlexaVideoCaptureStopReason.CLOUD_STOP;
            case 4:
                return com.amazon.alexa.api.AlexaVideoCaptureStopReason.PRIVACY_MODE_ON;
            case 5:
                return com.amazon.alexa.api.AlexaVideoCaptureStopReason.OVERHEAT_PROTECTION;
            case 6:
                return com.amazon.alexa.api.AlexaVideoCaptureStopReason.DEVICE_POWER_LOW;
            case 7:
                return com.amazon.alexa.api.AlexaVideoCaptureStopReason.CAMERA_FAILURE;
            case 8:
                return com.amazon.alexa.api.AlexaVideoCaptureStopReason.DEVICE_STORAGE_FULL;
            case 9:
                return com.amazon.alexa.api.AlexaVideoCaptureStopReason.CAMERA_BLOCKED;
            case 10:
                return com.amazon.alexa.api.AlexaVideoCaptureStopReason.SHUTTER_CLOSED;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }

    @NotNull
    public final com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason toVoxSdk(@NotNull AlexaAutoCaptureSessionStopReason reason) {
        reason.getClass();
        switch (WhenMappings.$EnumSwitchMapping$3[reason.ordinal()]) {
            case 1:
                return com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason.UNKNOWN;
            case 2:
                return com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason.USER_LOCAL_STOP;
            case 3:
                return com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason.CLOUD_STOP;
            case 4:
                return com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason.TIMEOUT;
            case 5:
                return com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason.DEVICE_DISCONNECTED;
            case 6:
                return com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason.PRIVACY_MODE_ON;
            case 7:
                return com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason.ASSET_CAPTURE_FAILED;
            case 8:
                return com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason.LOCAL_INTERRUPTION;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }
}
