package com.amazon.alexa.accessory.speechapi.voicesdk.mapper;

import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.speechapi.camera.CameraActionInitiator;
import com.amazon.alexa.accessory.speechapi.camera.CaptureError;
import com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason;
import com.amazon.alexa.api.AlexaCameraCaptureError;
import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import com.amazon.alexa.api.AlexaVideoCaptureStopReason;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/mapper/CameraApiModelMapper;", "", "<init>", "()V", Constants.LOG_TAG, "", "convertToAlexaCameraCaptureInitiator", "Lcom/amazon/alexa/api/AlexaCameraCaptureInitiator;", "cameraActionInitiator", "Lcom/amazon/alexa/accessory/speechapi/camera/CameraActionInitiator;", "convertToAlexaVideoCaptureStopReason", "Lcom/amazon/alexa/api/AlexaVideoCaptureStopReason;", "convertToAlexaCameraCaptureError", "Lcom/amazon/alexa/api/AlexaCameraCaptureError;", "error", "Lcom/amazon/alexa/accessory/speechapi/camera/CaptureError;", "convertToAlexaAutoCaptureSessionStopReason", "Lcom/amazon/alexa/api/AlexaAutoCaptureSessionStopReason;", "convertCaptureErrorToAutoCaptureStopReason", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CameraApiModelMapper {

    @NotNull
    public static final CameraApiModelMapper INSTANCE = new CameraApiModelMapper();

    @NotNull
    private static final String TAG = "CameraApiModelMapper";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CameraActionInitiator.values().length];
            try {
                iArr[CameraActionInitiator.ACTION_TYPE_ACCESSORY_TAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraActionInitiator.ACTION_TYPE_GATEWAY_TRIGGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraActionInitiator.ACTION_TYPE_ACCESSORY_WAKEWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CameraActionInitiator.ACTION_TYPE_ACCESSORY_TRIGGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CameraActionInitiator.ACTION_TYPE_AUTO_CAPTURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CaptureError.values().length];
            try {
                iArr2[CaptureError.FAILURE_TYPE_CAMERA_OCCLUDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CaptureError.FAILURE_TYPE_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CaptureError.FAILURE_TYPE_CAMERA_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CaptureError.FAILURE_TYPE_INSUFFICIENT_RESOURCES.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CaptureError.FAILURE_TYPE_INSUFFICIENT_STORAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CaptureError.FAILURE_TYPE_DEVICE_TOO_HOT.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CaptureError.FAILURE_TYPE_UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CaptureError.FAILURE_TYPE_PERMISSION_DENIED.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private CameraApiModelMapper() {
    }

    @NotNull
    public final AlexaAutoCaptureSessionStopReason convertCaptureErrorToAutoCaptureStopReason(@NotNull CaptureError error) {
        error.getClass();
        int i = WhenMappings.$EnumSwitchMapping$1[error.ordinal()];
        return i != 4 ? i != 5 ? i != 6 ? AlexaAutoCaptureSessionStopReason.UNKNOWN : AlexaAutoCaptureSessionStopReason.ASSET_CAPTURE_FAILED : AlexaAutoCaptureSessionStopReason.ASSET_CAPTURE_FAILED : AlexaAutoCaptureSessionStopReason.ASSET_CAPTURE_FAILED;
    }

    @NotNull
    public final AlexaAutoCaptureSessionStopReason convertToAlexaAutoCaptureSessionStopReason(@NotNull CameraActionInitiator cameraActionInitiator) {
        cameraActionInitiator.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[cameraActionInitiator.ordinal()];
        if (i == 1) {
            return AlexaAutoCaptureSessionStopReason.USER_LOCAL_STOP;
        }
        if (i == 2) {
            return AlexaAutoCaptureSessionStopReason.CLOUD_STOP;
        }
        if (i == 4) {
            return AlexaAutoCaptureSessionStopReason.TIMEOUT;
        }
        Logger.e("CameraApiModelMapper Unrecognized auto capture stop reason: " + cameraActionInitiator + ", defaulting to USER_LOCAL_STOP");
        return AlexaAutoCaptureSessionStopReason.USER_LOCAL_STOP;
    }

    @NotNull
    public final AlexaCameraCaptureError convertToAlexaCameraCaptureError(@NotNull CaptureError error) {
        error.getClass();
        switch (WhenMappings.$EnumSwitchMapping$1[error.ordinal()]) {
            case 1:
                return AlexaCameraCaptureError.CAMERA_BLOCKED;
            case 2:
                return AlexaCameraCaptureError.CAMERA_FAILURE;
            case 3:
                return AlexaCameraCaptureError.CAMERA_UNAVAILABLE;
            case 4:
                return AlexaCameraCaptureError.CAMERA_FAILURE;
            case 5:
                return AlexaCameraCaptureError.DEVICE_STORAGE_FULL;
            case 6:
                return AlexaCameraCaptureError.OVERHEAT_PROTECTION;
            case 7:
                return AlexaCameraCaptureError.UNKNOWN;
            case 8:
                return AlexaCameraCaptureError.PERMISSION_ERROR;
            default:
                Logger.e("CameraApiModelMapper Unrecognized capture error: " + error + ", defaulting to UNKNOWN");
                return AlexaCameraCaptureError.UNKNOWN;
        }
    }

    @NotNull
    public final AlexaCameraCaptureInitiator convertToAlexaCameraCaptureInitiator(@NotNull CameraActionInitiator cameraActionInitiator) {
        cameraActionInitiator.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[cameraActionInitiator.ordinal()];
        if (i == 1) {
            return AlexaCameraCaptureInitiator.GESTURE;
        }
        if (i == 2) {
            return AlexaCameraCaptureInitiator.VOICE;
        }
        if (i == 3) {
            return AlexaCameraCaptureInitiator.VOICE;
        }
        if (i == 4) {
            return AlexaCameraCaptureInitiator.GESTURE;
        }
        if (i == 5) {
            return AlexaCameraCaptureInitiator.AUTO_CAPTURE;
        }
        Logger.e("CameraApiModelMapper Unrecognized camera action initiator: " + cameraActionInitiator + ", defaulting to GESTURE");
        return AlexaCameraCaptureInitiator.GESTURE;
    }

    @NotNull
    public final AlexaVideoCaptureStopReason convertToAlexaVideoCaptureStopReason(@NotNull CameraActionInitiator cameraActionInitiator) {
        cameraActionInitiator.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[cameraActionInitiator.ordinal()];
        if (i == 1) {
            return AlexaVideoCaptureStopReason.LOCAL_STOP;
        }
        if (i == 2) {
            return AlexaVideoCaptureStopReason.LOCAL_STOP;
        }
        if (i == 3) {
            return AlexaVideoCaptureStopReason.CLOUD_STOP;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Unrecognized video capture stop reason from accessory");
        return null;
    }
}
