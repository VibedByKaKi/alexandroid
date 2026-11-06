package com.amazon.alexa.accessory.speechapi.voicesdk.mapper;

import com.amazon.alexa.accessory.speechapi.naturalturndetection.NaturalTurnDetectionSessionDeniedReason;
import com.amazon.alexa.accessory.speechapi.naturalturndetection.NaturalTurnDetectionSessionError;
import com.amazon.alexa.accessory.speechapi.naturalturndetection.NaturalTurnDetectionSessionState;
import com.amazon.alexa.api.compat.model.NaturalTurnSessionDeniedReason;
import com.amazon.alexa.api.compat.model.NaturalTurnSessionError;
import com.amazon.alexa.api.compat.model.NaturalTurnSessionState;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/mapper/NaturalTurnApiModelMapper;", "", "<init>", "()V", "convertToNaturalTurnSessionState", "Lcom/amazon/alexa/api/compat/model/NaturalTurnSessionState;", "state", "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionState;", "convertToNaturalTurnSessionError", "Lcom/amazon/alexa/api/compat/model/NaturalTurnSessionError;", "error", "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionError;", "convertToNaturalTurnDetectionSessionDeniedReason", "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionDeniedReason;", "reason", "Lcom/amazon/alexa/api/compat/model/NaturalTurnSessionDeniedReason;", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class NaturalTurnApiModelMapper {

    @NotNull
    public static final NaturalTurnApiModelMapper INSTANCE = new NaturalTurnApiModelMapper();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[NaturalTurnDetectionSessionState.values().length];
            try {
                iArr[NaturalTurnDetectionSessionState.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NaturalTurnDetectionSessionState.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NaturalTurnDetectionSessionState.MUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NaturalTurnDetectionSessionError.Type.values().length];
            try {
                iArr2[NaturalTurnDetectionSessionError.Type.INSUFFICIENT_RESOURCES.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NaturalTurnDetectionSessionError.Type.INVALID_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NaturalTurnDetectionSessionError.Type.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NaturalTurnSessionDeniedReason.values().length];
            try {
                iArr3[NaturalTurnSessionDeniedReason.PROVIDER_NOT_REGISTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[NaturalTurnSessionDeniedReason.ANOTHER_SESSION_ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[NaturalTurnSessionDeniedReason.FEATURE_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NaturalTurnSessionDeniedReason.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private NaturalTurnApiModelMapper() {
    }

    @NotNull
    public final NaturalTurnDetectionSessionDeniedReason convertToNaturalTurnDetectionSessionDeniedReason(@NotNull NaturalTurnSessionDeniedReason reason) {
        reason.getClass();
        int i = WhenMappings.$EnumSwitchMapping$2[reason.ordinal()];
        if (i == 1) {
            return new NaturalTurnDetectionSessionDeniedReason(NaturalTurnDetectionSessionDeniedReason.Reason.PROVIDER_NOT_REGISTERED, null, null, 6, null);
        }
        if (i == 2) {
            return new NaturalTurnDetectionSessionDeniedReason(NaturalTurnDetectionSessionDeniedReason.Reason.ANOTHER_SESSION_ACTIVE, null, null, 6, null);
        }
        if (i == 3) {
            return new NaturalTurnDetectionSessionDeniedReason(NaturalTurnDetectionSessionDeniedReason.Reason.UNKNOWN, reason.name(), null, 4, null);
        }
        if (i == 4) {
            return new NaturalTurnDetectionSessionDeniedReason(NaturalTurnDetectionSessionDeniedReason.Reason.UNKNOWN, null, null, 6, null);
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public final NaturalTurnSessionError convertToNaturalTurnSessionError(@NotNull NaturalTurnDetectionSessionError error) {
        error.getClass();
        int i = WhenMappings.$EnumSwitchMapping$1[error.getType().ordinal()];
        if (i == 1) {
            return NaturalTurnSessionError.INSUFFICIENT_RESOURCES;
        }
        if (i == 2) {
            return NaturalTurnSessionError.INVALID_STATE;
        }
        if (i == 3) {
            return NaturalTurnSessionError.UNKNOWN;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public final NaturalTurnSessionState convertToNaturalTurnSessionState(@NotNull NaturalTurnDetectionSessionState state) {
        state.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            return NaturalTurnSessionState.INACTIVE;
        }
        if (i == 2) {
            return NaturalTurnSessionState.ACTIVE;
        }
        if (i == 3) {
            return NaturalTurnSessionState.MUTED;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
