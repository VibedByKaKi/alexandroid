package com.amazonaws.services.kinesis.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum StreamStatus {
    CREATING("CREATING"),
    DELETING("DELETING"),
    ACTIVE("ACTIVE"),
    UPDATING("UPDATING");

    private static final Map<String, StreamStatus> enumMap;
    private String value;

    static {
        StreamStatus streamStatus = CREATING;
        StreamStatus streamStatus2 = DELETING;
        StreamStatus streamStatus3 = ACTIVE;
        StreamStatus streamStatus4 = UPDATING;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("CREATING", streamStatus);
        hashMap.put("DELETING", streamStatus2);
        hashMap.put("ACTIVE", streamStatus3);
        hashMap.put("UPDATING", streamStatus4);
    }

    StreamStatus(String str) {
        this.value = str;
    }

    public static StreamStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, StreamStatus> map = enumMap;
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
