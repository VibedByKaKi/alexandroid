package com.amazonaws.services.machinelearning.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum MLModelType {
    REGRESSION("REGRESSION"),
    BINARY("BINARY"),
    MULTICLASS("MULTICLASS");

    private static final Map<String, MLModelType> enumMap;
    private String value;

    static {
        MLModelType mLModelType = REGRESSION;
        MLModelType mLModelType2 = BINARY;
        MLModelType mLModelType3 = MULTICLASS;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("REGRESSION", mLModelType);
        hashMap.put("BINARY", mLModelType2);
        hashMap.put("MULTICLASS", mLModelType3);
    }

    MLModelType(String str) {
        this.value = str;
    }

    public static MLModelType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, MLModelType> map = enumMap;
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
