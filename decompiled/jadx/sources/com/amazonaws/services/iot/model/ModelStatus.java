package com.amazonaws.services.iot.model;

import com.amazon.devicesetupservice.reporting.State;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ModelStatus {
    PENDING_BUILD("PENDING_BUILD"),
    ACTIVE("ACTIVE"),
    EXPIRED(State.EXPIRED);

    private static final Map<String, ModelStatus> enumMap;
    private String value;

    static {
        ModelStatus modelStatus = PENDING_BUILD;
        ModelStatus modelStatus2 = ACTIVE;
        ModelStatus modelStatus3 = EXPIRED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("PENDING_BUILD", modelStatus);
        hashMap.put("ACTIVE", modelStatus2);
        hashMap.put(State.EXPIRED, modelStatus3);
    }

    ModelStatus(String str) {
        this.value = str;
    }

    public static ModelStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ModelStatus> map = enumMap;
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
