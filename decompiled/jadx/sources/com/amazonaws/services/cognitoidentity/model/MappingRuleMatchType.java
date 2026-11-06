package com.amazonaws.services.cognitoidentity.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum MappingRuleMatchType {
    Equals("Equals"),
    Contains("Contains"),
    StartsWith("StartsWith"),
    NotEqual("NotEqual");

    private static final Map<String, MappingRuleMatchType> enumMap;
    private String value;

    static {
        MappingRuleMatchType mappingRuleMatchType = Equals;
        MappingRuleMatchType mappingRuleMatchType2 = Contains;
        MappingRuleMatchType mappingRuleMatchType3 = StartsWith;
        MappingRuleMatchType mappingRuleMatchType4 = NotEqual;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("Equals", mappingRuleMatchType);
        hashMap.put("Contains", mappingRuleMatchType2);
        hashMap.put("StartsWith", mappingRuleMatchType3);
        hashMap.put("NotEqual", mappingRuleMatchType4);
    }

    MappingRuleMatchType(String str) {
        this.value = str;
    }

    public static MappingRuleMatchType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, MappingRuleMatchType> map = enumMap;
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
