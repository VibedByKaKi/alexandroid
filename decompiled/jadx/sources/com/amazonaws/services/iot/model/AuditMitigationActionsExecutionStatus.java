package com.amazonaws.services.iot.model;

import com.amazon.clouddrive.model.ResumeState;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum AuditMitigationActionsExecutionStatus {
    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED(ResumeState.COMPLETED),
    FAILED("FAILED"),
    CANCELED("CANCELED"),
    SKIPPED("SKIPPED"),
    PENDING("PENDING");

    private static final Map<String, AuditMitigationActionsExecutionStatus> enumMap;
    private String value;

    static {
        AuditMitigationActionsExecutionStatus auditMitigationActionsExecutionStatus = IN_PROGRESS;
        AuditMitigationActionsExecutionStatus auditMitigationActionsExecutionStatus2 = COMPLETED;
        AuditMitigationActionsExecutionStatus auditMitigationActionsExecutionStatus3 = FAILED;
        AuditMitigationActionsExecutionStatus auditMitigationActionsExecutionStatus4 = CANCELED;
        AuditMitigationActionsExecutionStatus auditMitigationActionsExecutionStatus5 = SKIPPED;
        AuditMitigationActionsExecutionStatus auditMitigationActionsExecutionStatus6 = PENDING;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("IN_PROGRESS", auditMitigationActionsExecutionStatus);
        hashMap.put(ResumeState.COMPLETED, auditMitigationActionsExecutionStatus2);
        hashMap.put("FAILED", auditMitigationActionsExecutionStatus3);
        hashMap.put("CANCELED", auditMitigationActionsExecutionStatus4);
        hashMap.put("SKIPPED", auditMitigationActionsExecutionStatus5);
        hashMap.put("PENDING", auditMitigationActionsExecutionStatus6);
    }

    AuditMitigationActionsExecutionStatus(String str) {
        this.value = str;
    }

    public static AuditMitigationActionsExecutionStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, AuditMitigationActionsExecutionStatus> map = enumMap;
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
