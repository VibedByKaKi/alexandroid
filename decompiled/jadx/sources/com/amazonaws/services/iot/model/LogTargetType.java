package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum LogTargetType {
    DEFAULT("DEFAULT"),
    THING_GROUP("THING_GROUP"),
    CLIENT_ID("CLIENT_ID"),
    SOURCE_IP("SOURCE_IP"),
    PRINCIPAL_ID("PRINCIPAL_ID");

    private static final Map<String, LogTargetType> enumMap;
    private String value;

    static {
        LogTargetType logTargetType = DEFAULT;
        LogTargetType logTargetType2 = THING_GROUP;
        LogTargetType logTargetType3 = CLIENT_ID;
        LogTargetType logTargetType4 = SOURCE_IP;
        LogTargetType logTargetType5 = PRINCIPAL_ID;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("DEFAULT", logTargetType);
        hashMap.put("THING_GROUP", logTargetType2);
        hashMap.put("CLIENT_ID", logTargetType3);
        hashMap.put("SOURCE_IP", logTargetType4);
        hashMap.put("PRINCIPAL_ID", logTargetType5);
    }

    LogTargetType(String str) {
        this.value = str;
    }

    public static LogTargetType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, LogTargetType> map = enumMap;
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
