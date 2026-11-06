package com.amazonaws.services.kms.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum EncryptionAlgorithmSpec {
    SYMMETRIC_DEFAULT("SYMMETRIC_DEFAULT"),
    RSAES_OAEP_SHA_1("RSAES_OAEP_SHA_1"),
    RSAES_OAEP_SHA_256("RSAES_OAEP_SHA_256"),
    SM2PKE("SM2PKE");

    private static final Map<String, EncryptionAlgorithmSpec> enumMap;
    private String value;

    static {
        EncryptionAlgorithmSpec encryptionAlgorithmSpec = SYMMETRIC_DEFAULT;
        EncryptionAlgorithmSpec encryptionAlgorithmSpec2 = RSAES_OAEP_SHA_1;
        EncryptionAlgorithmSpec encryptionAlgorithmSpec3 = RSAES_OAEP_SHA_256;
        EncryptionAlgorithmSpec encryptionAlgorithmSpec4 = SM2PKE;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("SYMMETRIC_DEFAULT", encryptionAlgorithmSpec);
        hashMap.put("RSAES_OAEP_SHA_1", encryptionAlgorithmSpec2);
        hashMap.put("RSAES_OAEP_SHA_256", encryptionAlgorithmSpec3);
        hashMap.put("SM2PKE", encryptionAlgorithmSpec4);
    }

    EncryptionAlgorithmSpec(String str) {
        this.value = str;
    }

    public static EncryptionAlgorithmSpec fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, EncryptionAlgorithmSpec> map = enumMap;
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
