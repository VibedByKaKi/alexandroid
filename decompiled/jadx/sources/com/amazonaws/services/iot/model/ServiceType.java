package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ServiceType {
    DATA("DATA"),
    CREDENTIAL_PROVIDER("CREDENTIAL_PROVIDER"),
    JOBS("JOBS");

    private static final Map<String, ServiceType> enumMap;
    private String value;

    static {
        ServiceType serviceType = DATA;
        ServiceType serviceType2 = CREDENTIAL_PROVIDER;
        ServiceType serviceType3 = JOBS;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("DATA", serviceType);
        hashMap.put("CREDENTIAL_PROVIDER", serviceType2);
        hashMap.put("JOBS", serviceType3);
    }

    ServiceType(String str) {
        this.value = str;
    }

    public static ServiceType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ServiceType> map = enumMap;
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
