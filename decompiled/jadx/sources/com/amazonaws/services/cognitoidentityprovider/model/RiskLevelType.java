package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazon.alexa.mobilytics.configuration.DCMEndpoint;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum RiskLevelType {
    Low("Low"),
    Medium("Medium"),
    High(DCMEndpoint.Priority.HIGH);

    private static final Map<String, RiskLevelType> enumMap;
    private String value;

    static {
        RiskLevelType riskLevelType = Low;
        RiskLevelType riskLevelType2 = Medium;
        RiskLevelType riskLevelType3 = High;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("Low", riskLevelType);
        hashMap.put("Medium", riskLevelType2);
        hashMap.put(DCMEndpoint.Priority.HIGH, riskLevelType3);
    }

    RiskLevelType(String str) {
        this.value = str;
    }

    public static RiskLevelType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, RiskLevelType> map = enumMap;
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
