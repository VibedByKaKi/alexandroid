package com.amazonaws.services.iot.model;

import com.amazon.clouddrive.model.ResumeState;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum JobStatus {
    IN_PROGRESS("IN_PROGRESS"),
    CANCELED("CANCELED"),
    COMPLETED(ResumeState.COMPLETED),
    DELETION_IN_PROGRESS("DELETION_IN_PROGRESS");

    private static final Map<String, JobStatus> enumMap;
    private String value;

    static {
        JobStatus jobStatus = IN_PROGRESS;
        JobStatus jobStatus2 = CANCELED;
        JobStatus jobStatus3 = COMPLETED;
        JobStatus jobStatus4 = DELETION_IN_PROGRESS;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("IN_PROGRESS", jobStatus);
        hashMap.put("CANCELED", jobStatus2);
        hashMap.put(ResumeState.COMPLETED, jobStatus3);
        hashMap.put("DELETION_IN_PROGRESS", jobStatus4);
    }

    JobStatus(String str) {
        this.value = str;
    }

    public static JobStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, JobStatus> map = enumMap;
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
