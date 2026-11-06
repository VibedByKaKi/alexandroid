package com.amazonaws.services.kms.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum DataKeySpec {
    AES_256("AES_256"),
    AES_128("AES_128");

    private static final Map<String, DataKeySpec> enumMap;
    private String value;

    static {
        DataKeySpec dataKeySpec = AES_256;
        DataKeySpec dataKeySpec2 = AES_128;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("AES_256", dataKeySpec);
        hashMap.put("AES_128", dataKeySpec2);
    }

    DataKeySpec(String str) {
        this.value = str;
    }

    public static DataKeySpec fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, DataKeySpec> map = enumMap;
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
