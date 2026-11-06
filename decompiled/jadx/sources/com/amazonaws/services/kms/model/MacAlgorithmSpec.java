package com.amazonaws.services.kms.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum MacAlgorithmSpec {
    HMAC_SHA_224("HMAC_SHA_224"),
    HMAC_SHA_256("HMAC_SHA_256"),
    HMAC_SHA_384("HMAC_SHA_384"),
    HMAC_SHA_512("HMAC_SHA_512");

    private static final Map<String, MacAlgorithmSpec> enumMap;
    private String value;

    static {
        MacAlgorithmSpec macAlgorithmSpec = HMAC_SHA_224;
        MacAlgorithmSpec macAlgorithmSpec2 = HMAC_SHA_256;
        MacAlgorithmSpec macAlgorithmSpec3 = HMAC_SHA_384;
        MacAlgorithmSpec macAlgorithmSpec4 = HMAC_SHA_512;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("HMAC_SHA_224", macAlgorithmSpec);
        hashMap.put("HMAC_SHA_256", macAlgorithmSpec2);
        hashMap.put("HMAC_SHA_384", macAlgorithmSpec3);
        hashMap.put("HMAC_SHA_512", macAlgorithmSpec4);
    }

    MacAlgorithmSpec(String str) {
        this.value = str;
    }

    public static MacAlgorithmSpec fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, MacAlgorithmSpec> map = enumMap;
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
