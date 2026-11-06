package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ComparisonOperator {
    LessThan("less-than"),
    LessThanEquals("less-than-equals"),
    GreaterThan("greater-than"),
    GreaterThanEquals("greater-than-equals"),
    InCidrSet("in-cidr-set"),
    NotInCidrSet("not-in-cidr-set"),
    InPortSet("in-port-set"),
    NotInPortSet("not-in-port-set"),
    InSet("in-set"),
    NotInSet("not-in-set");

    private static final Map<String, ComparisonOperator> enumMap;
    private String value;

    static {
        ComparisonOperator comparisonOperator = LessThan;
        ComparisonOperator comparisonOperator2 = LessThanEquals;
        ComparisonOperator comparisonOperator3 = GreaterThan;
        ComparisonOperator comparisonOperator4 = GreaterThanEquals;
        ComparisonOperator comparisonOperator5 = InCidrSet;
        ComparisonOperator comparisonOperator6 = NotInCidrSet;
        ComparisonOperator comparisonOperator7 = InPortSet;
        ComparisonOperator comparisonOperator8 = NotInPortSet;
        ComparisonOperator comparisonOperator9 = InSet;
        ComparisonOperator comparisonOperator10 = NotInSet;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("less-than", comparisonOperator);
        hashMap.put("less-than-equals", comparisonOperator2);
        hashMap.put("greater-than", comparisonOperator3);
        hashMap.put("greater-than-equals", comparisonOperator4);
        hashMap.put("in-cidr-set", comparisonOperator5);
        hashMap.put("not-in-cidr-set", comparisonOperator6);
        hashMap.put("in-port-set", comparisonOperator7);
        hashMap.put("not-in-port-set", comparisonOperator8);
        hashMap.put("in-set", comparisonOperator9);
        hashMap.put("not-in-set", comparisonOperator10);
    }

    ComparisonOperator(String str) {
        this.value = str;
    }

    public static ComparisonOperator fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ComparisonOperator> map = enumMap;
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
