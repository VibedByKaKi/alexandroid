package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum FieldType {
    Number("Number"),
    String("String"),
    Boolean("Boolean");

    private static final Map<String, FieldType> enumMap;
    private String value;

    static {
        FieldType fieldType = Number;
        FieldType fieldType2 = String;
        FieldType fieldType3 = Boolean;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("Number", fieldType);
        hashMap.put("String", fieldType2);
        hashMap.put("Boolean", fieldType3);
    }

    FieldType(String str) {
        this.value = str;
    }

    public static FieldType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, FieldType> map = enumMap;
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
