package com.amazonaws.services.machinelearning.model;

import com.amazon.clouddrive.model.ResumeState;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum EntityStatus {
    PENDING("PENDING"),
    INPROGRESS("INPROGRESS"),
    FAILED("FAILED"),
    COMPLETED(ResumeState.COMPLETED),
    DELETED("DELETED");

    private static final Map<String, EntityStatus> enumMap;
    private String value;

    static {
        EntityStatus entityStatus = PENDING;
        EntityStatus entityStatus2 = INPROGRESS;
        EntityStatus entityStatus3 = FAILED;
        EntityStatus entityStatus4 = COMPLETED;
        EntityStatus entityStatus5 = DELETED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("PENDING", entityStatus);
        hashMap.put("INPROGRESS", entityStatus2);
        hashMap.put("FAILED", entityStatus3);
        hashMap.put(ResumeState.COMPLETED, entityStatus4);
        hashMap.put("DELETED", entityStatus5);
    }

    EntityStatus(String str) {
        this.value = str;
    }

    public static EntityStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, EntityStatus> map = enumMap;
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
