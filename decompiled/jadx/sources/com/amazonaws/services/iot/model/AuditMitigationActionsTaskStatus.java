package com.amazonaws.services.iot.model;

import com.amazon.clouddrive.model.ResumeState;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum AuditMitigationActionsTaskStatus {
    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED(ResumeState.COMPLETED),
    FAILED("FAILED"),
    CANCELED("CANCELED");

    private static final Map<String, AuditMitigationActionsTaskStatus> enumMap;
    private String value;

    static {
        AuditMitigationActionsTaskStatus auditMitigationActionsTaskStatus = IN_PROGRESS;
        AuditMitigationActionsTaskStatus auditMitigationActionsTaskStatus2 = COMPLETED;
        AuditMitigationActionsTaskStatus auditMitigationActionsTaskStatus3 = FAILED;
        AuditMitigationActionsTaskStatus auditMitigationActionsTaskStatus4 = CANCELED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("IN_PROGRESS", auditMitigationActionsTaskStatus);
        hashMap.put(ResumeState.COMPLETED, auditMitigationActionsTaskStatus2);
        hashMap.put("FAILED", auditMitigationActionsTaskStatus3);
        hashMap.put("CANCELED", auditMitigationActionsTaskStatus4);
    }

    AuditMitigationActionsTaskStatus(String str) {
        this.value = str;
    }

    public static AuditMitigationActionsTaskStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, AuditMitigationActionsTaskStatus> map = enumMap;
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
