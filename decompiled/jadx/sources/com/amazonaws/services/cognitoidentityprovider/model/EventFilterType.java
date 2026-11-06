package com.amazonaws.services.cognitoidentityprovider.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum EventFilterType {
    SIGN_IN("SIGN_IN"),
    PASSWORD_CHANGE("PASSWORD_CHANGE"),
    SIGN_UP("SIGN_UP");

    private static final Map<String, EventFilterType> enumMap;
    private String value;

    static {
        EventFilterType eventFilterType = SIGN_IN;
        EventFilterType eventFilterType2 = PASSWORD_CHANGE;
        EventFilterType eventFilterType3 = SIGN_UP;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("SIGN_IN", eventFilterType);
        hashMap.put("PASSWORD_CHANGE", eventFilterType2);
        hashMap.put("SIGN_UP", eventFilterType3);
    }

    EventFilterType(String str) {
        this.value = str;
    }

    public static EventFilterType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, EventFilterType> map = enumMap;
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
