package com.amazonaws.services.iot.model;

import com.amazon.devicesetupservice.scap.v1.BleConnectionPriority;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ConfidenceLevel {
    LOW(BleConnectionPriority.LOW),
    MEDIUM("MEDIUM"),
    HIGH(BleConnectionPriority.HIGH);

    private static final Map<String, ConfidenceLevel> enumMap;
    private String value;

    static {
        ConfidenceLevel confidenceLevel = LOW;
        ConfidenceLevel confidenceLevel2 = MEDIUM;
        ConfidenceLevel confidenceLevel3 = HIGH;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put(BleConnectionPriority.LOW, confidenceLevel);
        hashMap.put("MEDIUM", confidenceLevel2);
        hashMap.put(BleConnectionPriority.HIGH, confidenceLevel3);
    }

    ConfidenceLevel(String str) {
        this.value = str;
    }

    public static ConfidenceLevel fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ConfidenceLevel> map = enumMap;
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
