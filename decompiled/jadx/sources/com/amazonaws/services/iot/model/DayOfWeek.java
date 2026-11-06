package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum DayOfWeek {
    SUN("SUN"),
    MON("MON"),
    TUE("TUE"),
    WED("WED"),
    THU("THU"),
    FRI("FRI"),
    SAT("SAT");

    private static final Map<String, DayOfWeek> enumMap;
    private String value;

    static {
        DayOfWeek dayOfWeek = SUN;
        DayOfWeek dayOfWeek2 = MON;
        DayOfWeek dayOfWeek3 = TUE;
        DayOfWeek dayOfWeek4 = WED;
        DayOfWeek dayOfWeek5 = THU;
        DayOfWeek dayOfWeek6 = FRI;
        DayOfWeek dayOfWeek7 = SAT;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("SUN", dayOfWeek);
        hashMap.put("MON", dayOfWeek2);
        hashMap.put("TUE", dayOfWeek3);
        hashMap.put("WED", dayOfWeek4);
        hashMap.put("THU", dayOfWeek5);
        hashMap.put("FRI", dayOfWeek6);
        hashMap.put("SAT", dayOfWeek7);
    }

    DayOfWeek(String str) {
        this.value = str;
    }

    public static DayOfWeek fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, DayOfWeek> map = enumMap;
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
