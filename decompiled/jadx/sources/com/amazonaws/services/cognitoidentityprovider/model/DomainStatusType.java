package com.amazonaws.services.cognitoidentityprovider.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum DomainStatusType {
    CREATING("CREATING"),
    DELETING("DELETING"),
    UPDATING("UPDATING"),
    ACTIVE("ACTIVE"),
    FAILED("FAILED");

    private static final Map<String, DomainStatusType> enumMap;
    private String value;

    static {
        DomainStatusType domainStatusType = CREATING;
        DomainStatusType domainStatusType2 = DELETING;
        DomainStatusType domainStatusType3 = UPDATING;
        DomainStatusType domainStatusType4 = ACTIVE;
        DomainStatusType domainStatusType5 = FAILED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("CREATING", domainStatusType);
        hashMap.put("DELETING", domainStatusType2);
        hashMap.put("UPDATING", domainStatusType3);
        hashMap.put("ACTIVE", domainStatusType4);
        hashMap.put("FAILED", domainStatusType5);
    }

    DomainStatusType(String str) {
        this.value = str;
    }

    public static DomainStatusType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, DomainStatusType> map = enumMap;
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
