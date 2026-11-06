package com.amazon.alexa.matter.eventbus.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum CommissioningSessionStage {
    AWAITING_ATTESTATION_FAILURE_BYPASS,
    AWAITING_COMMISSIONING_FINALIZATION,
    AWAITING_NETWORK_CREDENTIALS,
    CASE,
    DEVICE_DISCOVERED,
    DISCOVERING_DEVICE,
    NETWORK_PROVISIONING,
    PASE,
    PERFORMING_COMMISSIONEE_ATTESTATION;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.matter.eventbus.schema.CommissioningSessionStage$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CommissioningSessionStage;

        static {
            int[] iArr = new int[CommissioningSessionStage.values().length];
            $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CommissioningSessionStage = iArr;
            try {
                iArr[CommissioningSessionStage.AWAITING_ATTESTATION_FAILURE_BYPASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CommissioningSessionStage[CommissioningSessionStage.AWAITING_COMMISSIONING_FINALIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CommissioningSessionStage[CommissioningSessionStage.AWAITING_NETWORK_CREDENTIALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CommissioningSessionStage[CommissioningSessionStage.CASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CommissioningSessionStage[CommissioningSessionStage.DEVICE_DISCOVERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CommissioningSessionStage[CommissioningSessionStage.DISCOVERING_DEVICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CommissioningSessionStage[CommissioningSessionStage.NETWORK_PROVISIONING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CommissioningSessionStage[CommissioningSessionStage.PASE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CommissioningSessionStage[CommissioningSessionStage.PERFORMING_COMMISSIONEE_ATTESTATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @JsonCreator
    public static CommissioningSessionStage forValue(String str) throws IOException {
        if (str.equals("AwaitingAttestationFailureBypass")) {
            return AWAITING_ATTESTATION_FAILURE_BYPASS;
        }
        if (str.equals("AwaitingCommissioningFinalization")) {
            return AWAITING_COMMISSIONING_FINALIZATION;
        }
        if (str.equals("AwaitingNetworkCredentials")) {
            return AWAITING_NETWORK_CREDENTIALS;
        }
        if (str.equals("CASE")) {
            return CASE;
        }
        if (str.equals("DeviceDiscovered")) {
            return DEVICE_DISCOVERED;
        }
        if (str.equals("DiscoveringDevice")) {
            return DISCOVERING_DEVICE;
        }
        if (str.equals("NetworkProvisioning")) {
            return NETWORK_PROVISIONING;
        }
        if (str.equals("PASE")) {
            return PASE;
        }
        if (str.equals("PerformingCommissioneeAttestation")) {
            return PERFORMING_COMMISSIONEE_ATTESTATION;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot deserialize CommissioningSessionStage");
        return null;
    }

    @JsonValue
    public String toValue() {
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$matter$eventbus$schema$CommissioningSessionStage[ordinal()]) {
            case 1:
                return "AwaitingAttestationFailureBypass";
            case 2:
                return "AwaitingCommissioningFinalization";
            case 3:
                return "AwaitingNetworkCredentials";
            case 4:
                return "CASE";
            case 5:
                return "DeviceDiscovered";
            case 6:
                return "DiscoveringDevice";
            case 7:
                return "NetworkProvisioning";
            case 8:
                return "PASE";
            case 9:
                return "PerformingCommissioneeAttestation";
            default:
                return null;
        }
    }
}
