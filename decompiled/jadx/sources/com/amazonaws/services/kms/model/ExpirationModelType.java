package com.amazonaws.services.kms.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ExpirationModelType {
    KEY_MATERIAL_EXPIRES("KEY_MATERIAL_EXPIRES"),
    KEY_MATERIAL_DOES_NOT_EXPIRE("KEY_MATERIAL_DOES_NOT_EXPIRE");

    private static final Map<String, ExpirationModelType> enumMap;
    private String value;

    static {
        ExpirationModelType expirationModelType = KEY_MATERIAL_EXPIRES;
        ExpirationModelType expirationModelType2 = KEY_MATERIAL_DOES_NOT_EXPIRE;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("KEY_MATERIAL_EXPIRES", expirationModelType);
        hashMap.put("KEY_MATERIAL_DOES_NOT_EXPIRE", expirationModelType2);
    }

    ExpirationModelType(String str) {
        this.value = str;
    }

    public static ExpirationModelType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ExpirationModelType> map = enumMap;
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
