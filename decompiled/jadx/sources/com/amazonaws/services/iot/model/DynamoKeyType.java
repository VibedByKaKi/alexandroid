package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum DynamoKeyType {
    STRING("STRING"),
    NUMBER("NUMBER");

    private static final Map<String, DynamoKeyType> enumMap;
    private String value;

    static {
        DynamoKeyType dynamoKeyType = STRING;
        DynamoKeyType dynamoKeyType2 = NUMBER;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("STRING", dynamoKeyType);
        hashMap.put("NUMBER", dynamoKeyType2);
    }

    DynamoKeyType(String str) {
        this.value = str;
    }

    public static DynamoKeyType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, DynamoKeyType> map = enumMap;
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
