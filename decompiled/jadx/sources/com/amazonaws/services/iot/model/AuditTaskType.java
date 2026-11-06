package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum AuditTaskType {
    ON_DEMAND_AUDIT_TASK("ON_DEMAND_AUDIT_TASK"),
    SCHEDULED_AUDIT_TASK("SCHEDULED_AUDIT_TASK");

    private static final Map<String, AuditTaskType> enumMap;
    private String value;

    static {
        AuditTaskType auditTaskType = ON_DEMAND_AUDIT_TASK;
        AuditTaskType auditTaskType2 = SCHEDULED_AUDIT_TASK;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ON_DEMAND_AUDIT_TASK", auditTaskType);
        hashMap.put("SCHEDULED_AUDIT_TASK", auditTaskType2);
    }

    AuditTaskType(String str) {
        this.value = str;
    }

    public static AuditTaskType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, AuditTaskType> map = enumMap;
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
