package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum DomainType {
    ENDPOINT("ENDPOINT"),
    AWS_MANAGED("AWS_MANAGED"),
    CUSTOMER_MANAGED("CUSTOMER_MANAGED");

    private static final Map<String, DomainType> enumMap;
    private String value;

    static {
        DomainType domainType = ENDPOINT;
        DomainType domainType2 = AWS_MANAGED;
        DomainType domainType3 = CUSTOMER_MANAGED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ENDPOINT", domainType);
        hashMap.put("AWS_MANAGED", domainType2);
        hashMap.put("CUSTOMER_MANAGED", domainType3);
    }

    DomainType(String str) {
        this.value = str;
    }

    public static DomainType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, DomainType> map = enumMap;
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
