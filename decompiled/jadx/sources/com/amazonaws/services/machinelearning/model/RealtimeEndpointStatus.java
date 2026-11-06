package com.amazonaws.services.machinelearning.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum RealtimeEndpointStatus {
    NONE("NONE"),
    READY("READY"),
    UPDATING("UPDATING"),
    FAILED("FAILED");

    private static final Map<String, RealtimeEndpointStatus> enumMap;
    private String value;

    static {
        RealtimeEndpointStatus realtimeEndpointStatus = NONE;
        RealtimeEndpointStatus realtimeEndpointStatus2 = READY;
        RealtimeEndpointStatus realtimeEndpointStatus3 = UPDATING;
        RealtimeEndpointStatus realtimeEndpointStatus4 = FAILED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("NONE", realtimeEndpointStatus);
        hashMap.put("READY", realtimeEndpointStatus2);
        hashMap.put("UPDATING", realtimeEndpointStatus3);
        hashMap.put("FAILED", realtimeEndpointStatus4);
    }

    RealtimeEndpointStatus(String str) {
        this.value = str;
    }

    public static RealtimeEndpointStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, RealtimeEndpointStatus> map = enumMap;
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
