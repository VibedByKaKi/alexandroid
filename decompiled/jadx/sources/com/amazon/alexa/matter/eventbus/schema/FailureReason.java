package com.amazon.alexa.matter.eventbus.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum FailureReason {
    BLUETOOTH_CONNECTION_FAILURE,
    BLUETOOTH_CONNECTION_LOST,
    CASE_FAILURE,
    COMMISSIONABLE_DISCOVERY_FAILURE,
    DEVICE_UNSUPPORTED,
    HARD_ATTESTATION_FAILURE,
    ILLEGAL_STATE,
    INTERNAL_FAILURE,
    INVALID_NETWORK_CREDENTIALS,
    NETWORK_NOT_FOUND,
    NOC_GENERATION_FAILURE,
    NOC_ISSUANCE_FAILURE,
    NODE_ALREADY_ON_FABRIC,
    OPERATIONAL_DISCOVERY_FAILURE,
    PASE_FAILURE,
    SDK_FAILURE,
    SOFT_ATTESTATION_FAILURE,
    TIMEOUT,
    UNKNOWN;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.matter.eventbus.schema.FailureReason$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason;

        static {
            int[] iArr = new int[FailureReason.values().length];
            $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason = iArr;
            try {
                iArr[FailureReason.BLUETOOTH_CONNECTION_FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.BLUETOOTH_CONNECTION_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.CASE_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.COMMISSIONABLE_DISCOVERY_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.DEVICE_UNSUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.HARD_ATTESTATION_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.ILLEGAL_STATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.INTERNAL_FAILURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.INVALID_NETWORK_CREDENTIALS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.NETWORK_NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.NOC_GENERATION_FAILURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.NOC_ISSUANCE_FAILURE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.NODE_ALREADY_ON_FABRIC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.OPERATIONAL_DISCOVERY_FAILURE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.PASE_FAILURE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.SDK_FAILURE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.SOFT_ATTESTATION_FAILURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.TIMEOUT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[FailureReason.UNKNOWN.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    @JsonCreator
    public static FailureReason forValue(String str) throws IOException {
        if (str.equals("BLUETOOTH_CONNECTION_FAILURE")) {
            return BLUETOOTH_CONNECTION_FAILURE;
        }
        if (str.equals("BLUETOOTH_CONNECTION_LOST")) {
            return BLUETOOTH_CONNECTION_LOST;
        }
        if (str.equals("CASE_FAILURE")) {
            return CASE_FAILURE;
        }
        if (str.equals("COMMISSIONABLE_DISCOVERY_FAILURE")) {
            return COMMISSIONABLE_DISCOVERY_FAILURE;
        }
        if (str.equals("DEVICE_UNSUPPORTED")) {
            return DEVICE_UNSUPPORTED;
        }
        if (str.equals("HARD_ATTESTATION_FAILURE")) {
            return HARD_ATTESTATION_FAILURE;
        }
        if (str.equals("ILLEGAL_STATE")) {
            return ILLEGAL_STATE;
        }
        if (str.equals("INTERNAL_FAILURE")) {
            return INTERNAL_FAILURE;
        }
        if (str.equals("INVALID_NETWORK_CREDENTIALS")) {
            return INVALID_NETWORK_CREDENTIALS;
        }
        if (str.equals("NETWORK_NOT_FOUND")) {
            return NETWORK_NOT_FOUND;
        }
        if (str.equals("NOC_GENERATION_FAILURE")) {
            return NOC_GENERATION_FAILURE;
        }
        if (str.equals("NOC_ISSUANCE_FAILURE")) {
            return NOC_ISSUANCE_FAILURE;
        }
        if (str.equals("NODE_ALREADY_ON_FABRIC")) {
            return NODE_ALREADY_ON_FABRIC;
        }
        if (str.equals("OPERATIONAL_DISCOVERY_FAILURE")) {
            return OPERATIONAL_DISCOVERY_FAILURE;
        }
        if (str.equals("PASE_FAILURE")) {
            return PASE_FAILURE;
        }
        if (str.equals("SDK_FAILURE")) {
            return SDK_FAILURE;
        }
        if (str.equals("SOFT_ATTESTATION_FAILURE")) {
            return SOFT_ATTESTATION_FAILURE;
        }
        if (str.equals("TIMEOUT")) {
            return TIMEOUT;
        }
        if (str.equals("UNKNOWN")) {
            return UNKNOWN;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot deserialize FailureReason");
        return null;
    }

    @JsonValue
    public String toValue() {
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$matter$eventbus$schema$FailureReason[ordinal()]) {
            case 1:
                return "BLUETOOTH_CONNECTION_FAILURE";
            case 2:
                return "BLUETOOTH_CONNECTION_LOST";
            case 3:
                return "CASE_FAILURE";
            case 4:
                return "COMMISSIONABLE_DISCOVERY_FAILURE";
            case 5:
                return "DEVICE_UNSUPPORTED";
            case 6:
                return "HARD_ATTESTATION_FAILURE";
            case 7:
                return "ILLEGAL_STATE";
            case 8:
                return "INTERNAL_FAILURE";
            case 9:
                return "INVALID_NETWORK_CREDENTIALS";
            case 10:
                return "NETWORK_NOT_FOUND";
            case 11:
                return "NOC_GENERATION_FAILURE";
            case 12:
                return "NOC_ISSUANCE_FAILURE";
            case 13:
                return "NODE_ALREADY_ON_FABRIC";
            case 14:
                return "OPERATIONAL_DISCOVERY_FAILURE";
            case 15:
                return "PASE_FAILURE";
            case 16:
                return "SDK_FAILURE";
            case 17:
                return "SOFT_ATTESTATION_FAILURE";
            case 18:
                return "TIMEOUT";
            case 19:
                return "UNKNOWN";
            default:
                return null;
        }
    }
}
