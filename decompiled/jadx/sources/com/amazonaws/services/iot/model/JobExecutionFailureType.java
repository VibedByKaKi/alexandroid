package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum JobExecutionFailureType {
    FAILED("FAILED"),
    REJECTED("REJECTED"),
    TIMED_OUT("TIMED_OUT"),
    ALL("ALL");

    private static final Map<String, JobExecutionFailureType> enumMap;
    private String value;

    static {
        JobExecutionFailureType jobExecutionFailureType = FAILED;
        JobExecutionFailureType jobExecutionFailureType2 = REJECTED;
        JobExecutionFailureType jobExecutionFailureType3 = TIMED_OUT;
        JobExecutionFailureType jobExecutionFailureType4 = ALL;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("FAILED", jobExecutionFailureType);
        hashMap.put("REJECTED", jobExecutionFailureType2);
        hashMap.put("TIMED_OUT", jobExecutionFailureType3);
        hashMap.put("ALL", jobExecutionFailureType4);
    }

    JobExecutionFailureType(String str) {
        this.value = str;
    }

    public static JobExecutionFailureType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, JobExecutionFailureType> map = enumMap;
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
