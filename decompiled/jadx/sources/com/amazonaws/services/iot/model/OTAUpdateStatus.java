package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum OTAUpdateStatus {
    CREATE_PENDING("CREATE_PENDING"),
    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    CREATE_COMPLETE("CREATE_COMPLETE"),
    CREATE_FAILED("CREATE_FAILED");

    private static final Map<String, OTAUpdateStatus> enumMap;
    private String value;

    static {
        OTAUpdateStatus oTAUpdateStatus = CREATE_PENDING;
        OTAUpdateStatus oTAUpdateStatus2 = CREATE_IN_PROGRESS;
        OTAUpdateStatus oTAUpdateStatus3 = CREATE_COMPLETE;
        OTAUpdateStatus oTAUpdateStatus4 = CREATE_FAILED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("CREATE_PENDING", oTAUpdateStatus);
        hashMap.put("CREATE_IN_PROGRESS", oTAUpdateStatus2);
        hashMap.put("CREATE_COMPLETE", oTAUpdateStatus3);
        hashMap.put("CREATE_FAILED", oTAUpdateStatus4);
    }

    OTAUpdateStatus(String str) {
        this.value = str;
    }

    public static OTAUpdateStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, OTAUpdateStatus> map = enumMap;
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
