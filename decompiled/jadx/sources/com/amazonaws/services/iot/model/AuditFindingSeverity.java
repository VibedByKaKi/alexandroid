package com.amazonaws.services.iot.model;

import com.amazon.devicesetupservice.scap.v1.BleConnectionPriority;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum AuditFindingSeverity {
    CRITICAL("CRITICAL"),
    HIGH(BleConnectionPriority.HIGH),
    MEDIUM("MEDIUM"),
    LOW(BleConnectionPriority.LOW);

    private static final Map<String, AuditFindingSeverity> enumMap;
    private String value;

    static {
        AuditFindingSeverity auditFindingSeverity = CRITICAL;
        AuditFindingSeverity auditFindingSeverity2 = HIGH;
        AuditFindingSeverity auditFindingSeverity3 = MEDIUM;
        AuditFindingSeverity auditFindingSeverity4 = LOW;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("CRITICAL", auditFindingSeverity);
        hashMap.put(BleConnectionPriority.HIGH, auditFindingSeverity2);
        hashMap.put("MEDIUM", auditFindingSeverity3);
        hashMap.put(BleConnectionPriority.LOW, auditFindingSeverity4);
    }

    AuditFindingSeverity(String str) {
        this.value = str;
    }

    public static AuditFindingSeverity fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, AuditFindingSeverity> map = enumMap;
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
