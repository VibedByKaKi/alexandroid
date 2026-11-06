package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ViolationEventType {
    InAlarm("in-alarm"),
    AlarmCleared("alarm-cleared"),
    AlarmInvalidated("alarm-invalidated");

    private static final Map<String, ViolationEventType> enumMap;
    private String value;

    static {
        ViolationEventType violationEventType = InAlarm;
        ViolationEventType violationEventType2 = AlarmCleared;
        ViolationEventType violationEventType3 = AlarmInvalidated;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("in-alarm", violationEventType);
        hashMap.put("alarm-cleared", violationEventType2);
        hashMap.put("alarm-invalidated", violationEventType3);
    }

    ViolationEventType(String str) {
        this.value = str;
    }

    public static ViolationEventType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ViolationEventType> map = enumMap;
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
