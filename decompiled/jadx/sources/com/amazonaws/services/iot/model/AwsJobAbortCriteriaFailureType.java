package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum AwsJobAbortCriteriaFailureType {
    FAILED("FAILED"),
    REJECTED("REJECTED"),
    TIMED_OUT("TIMED_OUT"),
    ALL("ALL");

    private static final Map<String, AwsJobAbortCriteriaFailureType> enumMap;
    private String value;

    static {
        AwsJobAbortCriteriaFailureType awsJobAbortCriteriaFailureType = FAILED;
        AwsJobAbortCriteriaFailureType awsJobAbortCriteriaFailureType2 = REJECTED;
        AwsJobAbortCriteriaFailureType awsJobAbortCriteriaFailureType3 = TIMED_OUT;
        AwsJobAbortCriteriaFailureType awsJobAbortCriteriaFailureType4 = ALL;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("FAILED", awsJobAbortCriteriaFailureType);
        hashMap.put("REJECTED", awsJobAbortCriteriaFailureType2);
        hashMap.put("TIMED_OUT", awsJobAbortCriteriaFailureType3);
        hashMap.put("ALL", awsJobAbortCriteriaFailureType4);
    }

    AwsJobAbortCriteriaFailureType(String str) {
        this.value = str;
    }

    public static AwsJobAbortCriteriaFailureType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, AwsJobAbortCriteriaFailureType> map = enumMap;
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
