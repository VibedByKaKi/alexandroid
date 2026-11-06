package com.amazonaws.services.logs.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum Distribution {
    Random("Random"),
    ByLogStream("ByLogStream");

    private static final Map<String, Distribution> enumMap;
    private String value;

    static {
        Distribution distribution = Random;
        Distribution distribution2 = ByLogStream;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("Random", distribution);
        hashMap.put("ByLogStream", distribution2);
    }

    Distribution(String str) {
        this.value = str;
    }

    public static Distribution fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, Distribution> map = enumMap;
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
