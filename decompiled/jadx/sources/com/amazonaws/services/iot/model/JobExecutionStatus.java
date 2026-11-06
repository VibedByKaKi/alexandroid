package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum JobExecutionStatus {
    QUEUED("QUEUED"),
    IN_PROGRESS("IN_PROGRESS"),
    SUCCEEDED("SUCCEEDED"),
    FAILED("FAILED"),
    TIMED_OUT("TIMED_OUT"),
    REJECTED("REJECTED"),
    REMOVED("REMOVED"),
    CANCELED("CANCELED");

    private static final Map<String, JobExecutionStatus> enumMap;
    private String value;

    static {
        JobExecutionStatus jobExecutionStatus = QUEUED;
        JobExecutionStatus jobExecutionStatus2 = IN_PROGRESS;
        JobExecutionStatus jobExecutionStatus3 = SUCCEEDED;
        JobExecutionStatus jobExecutionStatus4 = FAILED;
        JobExecutionStatus jobExecutionStatus5 = TIMED_OUT;
        JobExecutionStatus jobExecutionStatus6 = REJECTED;
        JobExecutionStatus jobExecutionStatus7 = REMOVED;
        JobExecutionStatus jobExecutionStatus8 = CANCELED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("QUEUED", jobExecutionStatus);
        hashMap.put("IN_PROGRESS", jobExecutionStatus2);
        hashMap.put("SUCCEEDED", jobExecutionStatus3);
        hashMap.put("FAILED", jobExecutionStatus4);
        hashMap.put("TIMED_OUT", jobExecutionStatus5);
        hashMap.put("REJECTED", jobExecutionStatus6);
        hashMap.put("REMOVED", jobExecutionStatus7);
        hashMap.put("CANCELED", jobExecutionStatus8);
    }

    JobExecutionStatus(String str) {
        this.value = str;
    }

    public static JobExecutionStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, JobExecutionStatus> map = enumMap;
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
