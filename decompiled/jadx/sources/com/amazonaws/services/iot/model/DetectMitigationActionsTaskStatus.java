package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum DetectMitigationActionsTaskStatus {
    IN_PROGRESS("IN_PROGRESS"),
    SUCCESSFUL("SUCCESSFUL"),
    FAILED("FAILED"),
    CANCELED("CANCELED");

    private static final Map<String, DetectMitigationActionsTaskStatus> enumMap;
    private String value;

    static {
        DetectMitigationActionsTaskStatus detectMitigationActionsTaskStatus = IN_PROGRESS;
        DetectMitigationActionsTaskStatus detectMitigationActionsTaskStatus2 = SUCCESSFUL;
        DetectMitigationActionsTaskStatus detectMitigationActionsTaskStatus3 = FAILED;
        DetectMitigationActionsTaskStatus detectMitigationActionsTaskStatus4 = CANCELED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("IN_PROGRESS", detectMitigationActionsTaskStatus);
        hashMap.put("SUCCESSFUL", detectMitigationActionsTaskStatus2);
        hashMap.put("FAILED", detectMitigationActionsTaskStatus3);
        hashMap.put("CANCELED", detectMitigationActionsTaskStatus4);
    }

    DetectMitigationActionsTaskStatus(String str) {
        this.value = str;
    }

    public static DetectMitigationActionsTaskStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, DetectMitigationActionsTaskStatus> map = enumMap;
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
