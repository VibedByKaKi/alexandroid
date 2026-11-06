package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum MitigationActionType {
    UPDATE_DEVICE_CERTIFICATE("UPDATE_DEVICE_CERTIFICATE"),
    UPDATE_CA_CERTIFICATE("UPDATE_CA_CERTIFICATE"),
    ADD_THINGS_TO_THING_GROUP("ADD_THINGS_TO_THING_GROUP"),
    REPLACE_DEFAULT_POLICY_VERSION("REPLACE_DEFAULT_POLICY_VERSION"),
    ENABLE_IOT_LOGGING("ENABLE_IOT_LOGGING"),
    PUBLISH_FINDING_TO_SNS("PUBLISH_FINDING_TO_SNS");

    private static final Map<String, MitigationActionType> enumMap;
    private String value;

    static {
        MitigationActionType mitigationActionType = UPDATE_DEVICE_CERTIFICATE;
        MitigationActionType mitigationActionType2 = UPDATE_CA_CERTIFICATE;
        MitigationActionType mitigationActionType3 = ADD_THINGS_TO_THING_GROUP;
        MitigationActionType mitigationActionType4 = REPLACE_DEFAULT_POLICY_VERSION;
        MitigationActionType mitigationActionType5 = ENABLE_IOT_LOGGING;
        MitigationActionType mitigationActionType6 = PUBLISH_FINDING_TO_SNS;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("UPDATE_DEVICE_CERTIFICATE", mitigationActionType);
        hashMap.put("UPDATE_CA_CERTIFICATE", mitigationActionType2);
        hashMap.put("ADD_THINGS_TO_THING_GROUP", mitigationActionType3);
        hashMap.put("REPLACE_DEFAULT_POLICY_VERSION", mitigationActionType4);
        hashMap.put("ENABLE_IOT_LOGGING", mitigationActionType5);
        hashMap.put("PUBLISH_FINDING_TO_SNS", mitigationActionType6);
    }

    MitigationActionType(String str) {
        this.value = str;
    }

    public static MitigationActionType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, MitigationActionType> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Cannot create enum from ", str, " value!"));
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
