package com.amazon.matter.eventbus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum MatterEventType {
    PAIR_DEVICE_REQUEST("Matter:pairDevice:request"),
    PAIR_DEVICE_RESPONSE_SUCCESS("Matter:pairDevice:response:success"),
    PAIR_DEVICE_RESPONSE_ERROR("Matter:pairDevice:response:error"),
    SCAN_NETWORKS_RESPONSE_SUCCESS("Matter:scanNetworks:response:success"),
    ADD_AND_ENABLE_NETWORK_REQUEST("Matter:addAndEnableWifiNetwork:request"),
    ADD_AND_ENABLE_THREAD_NETWORK_REQUEST("Matter:addAndEnableThreadNetwork:request"),
    ADD_AND_ENABLE_NETWORK_RESPONSE_SUCCESS("Matter:addAndEnableNetwork:response:success"),
    ADD_AND_ENABLE_NETWORK_RESPONSE_ERROR("Matter:addAndEnableNetwork:response:error"),
    COMMISSION_DEVICE_REQUEST("Matter:commissionDevice:request"),
    COMMISSION_DEVICE_RESPONSE_SUCCESS("Matter:commissionDevice:response:success"),
    COMMISSION_DEVICE_RESPONSE_ERROR("Matter:commissionDevice:response:error"),
    MATTER_ATTESTATION_REQUEST("Matter:attestation:request"),
    MATTER_ATTESTATION_RESPONSE("Matter:attestation:response"),
    MATTER_ATTESTATION_USER_DENIED("Matter:attestation:response:userDenied"),
    DCAS_GET_TIMEZONE_REQUEST("Matter:dcasGetTimeZone:request"),
    DCAS_GET_TIMEZONE_RESPONSE_SUCCESS("Matter:dcasGetTimeZone:response:success"),
    DCAS_GET_TIMEZONE_RESPONSE_ERROR("Matter:dcasGetTimeZone:response:error"),
    COMMISSIONING_CLIENT_AVAILABILITY_SUCCESS_RATE("Matter:commissioningClientAvailability:successRate"),
    SUPPRESS_SYSTEM_COMMISSIONING_OVERLAY_SUCCESS_RATE("Matter:suppressSystemCommissioningOverlay:successRate"),
    CONNECT_DEVICE_SUCCESS("Matter:connectDevice:success"),
    CONNECT_DEVICE_ATTEMPT_COUNT_TO_SUCCESS("Matter:connectDevice:attemptCountToSuccess");

    private static final Map<String, MatterEventType> VALUES = new HashMap();
    private final String eventTypeString;

    static {
        for (MatterEventType matterEventType : values()) {
            VALUES.put(matterEventType.toString(), matterEventType);
        }
    }

    MatterEventType(String str) {
        this.eventTypeString = str;
    }

    @NonNull
    public static MatterEventType fromValue(@Nullable String str) {
        MatterEventType matterEventType = VALUES.get(str);
        if (matterEventType != null) {
            return matterEventType;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static Collection<String> getValues() {
        return VALUES.keySet();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.eventTypeString;
    }
}
