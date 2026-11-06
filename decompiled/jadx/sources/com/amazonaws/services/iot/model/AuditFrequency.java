package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum AuditFrequency {
    DAILY("DAILY"),
    WEEKLY("WEEKLY"),
    BIWEEKLY("BIWEEKLY"),
    MONTHLY("MONTHLY");

    private static final Map<String, AuditFrequency> enumMap;
    private String value;

    static {
        AuditFrequency auditFrequency = DAILY;
        AuditFrequency auditFrequency2 = WEEKLY;
        AuditFrequency auditFrequency3 = BIWEEKLY;
        AuditFrequency auditFrequency4 = MONTHLY;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("DAILY", auditFrequency);
        hashMap.put("WEEKLY", auditFrequency2);
        hashMap.put("BIWEEKLY", auditFrequency3);
        hashMap.put("MONTHLY", auditFrequency4);
    }

    AuditFrequency(String str) {
        this.value = str;
    }

    public static AuditFrequency fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, AuditFrequency> map = enumMap;
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
