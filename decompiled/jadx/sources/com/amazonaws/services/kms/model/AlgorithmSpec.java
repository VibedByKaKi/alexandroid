package com.amazonaws.services.kms.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum AlgorithmSpec {
    RSAES_PKCS1_V1_5("RSAES_PKCS1_V1_5"),
    RSAES_OAEP_SHA_1("RSAES_OAEP_SHA_1"),
    RSAES_OAEP_SHA_256("RSAES_OAEP_SHA_256");

    private static final Map<String, AlgorithmSpec> enumMap;
    private String value;

    static {
        AlgorithmSpec algorithmSpec = RSAES_PKCS1_V1_5;
        AlgorithmSpec algorithmSpec2 = RSAES_OAEP_SHA_1;
        AlgorithmSpec algorithmSpec3 = RSAES_OAEP_SHA_256;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("RSAES_PKCS1_V1_5", algorithmSpec);
        hashMap.put("RSAES_OAEP_SHA_1", algorithmSpec2);
        hashMap.put("RSAES_OAEP_SHA_256", algorithmSpec3);
    }

    AlgorithmSpec(String str) {
        this.value = str;
    }

    public static AlgorithmSpec fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, AlgorithmSpec> map = enumMap;
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
