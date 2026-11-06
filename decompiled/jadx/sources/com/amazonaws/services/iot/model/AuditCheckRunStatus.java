package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum AuditCheckRunStatus {
    IN_PROGRESS("IN_PROGRESS"),
    WAITING_FOR_DATA_COLLECTION("WAITING_FOR_DATA_COLLECTION"),
    CANCELED("CANCELED"),
    COMPLETED_COMPLIANT("COMPLETED_COMPLIANT"),
    COMPLETED_NON_COMPLIANT("COMPLETED_NON_COMPLIANT"),
    FAILED("FAILED");

    private static final Map<String, AuditCheckRunStatus> enumMap;
    private String value;

    static {
        AuditCheckRunStatus auditCheckRunStatus = IN_PROGRESS;
        AuditCheckRunStatus auditCheckRunStatus2 = WAITING_FOR_DATA_COLLECTION;
        AuditCheckRunStatus auditCheckRunStatus3 = CANCELED;
        AuditCheckRunStatus auditCheckRunStatus4 = COMPLETED_COMPLIANT;
        AuditCheckRunStatus auditCheckRunStatus5 = COMPLETED_NON_COMPLIANT;
        AuditCheckRunStatus auditCheckRunStatus6 = FAILED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("IN_PROGRESS", auditCheckRunStatus);
        hashMap.put("WAITING_FOR_DATA_COLLECTION", auditCheckRunStatus2);
        hashMap.put("CANCELED", auditCheckRunStatus3);
        hashMap.put("COMPLETED_COMPLIANT", auditCheckRunStatus4);
        hashMap.put("COMPLETED_NON_COMPLIANT", auditCheckRunStatus5);
        hashMap.put("FAILED", auditCheckRunStatus6);
    }

    AuditCheckRunStatus(String str) {
        this.value = str;
    }

    public static AuditCheckRunStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, AuditCheckRunStatus> map = enumMap;
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
