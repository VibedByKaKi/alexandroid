package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum FleetMetricUnit {
    Seconds("Seconds"),
    Microseconds("Microseconds"),
    Milliseconds("Milliseconds"),
    Bytes("Bytes"),
    Kilobytes("Kilobytes"),
    Megabytes("Megabytes"),
    Gigabytes("Gigabytes"),
    Terabytes("Terabytes"),
    Bits("Bits"),
    Kilobits("Kilobits"),
    Megabits("Megabits"),
    Gigabits("Gigabits"),
    Terabits("Terabits"),
    Percent("Percent"),
    Count("Count"),
    BytesSecond("Bytes/Second"),
    KilobytesSecond("Kilobytes/Second"),
    MegabytesSecond("Megabytes/Second"),
    GigabytesSecond("Gigabytes/Second"),
    TerabytesSecond("Terabytes/Second"),
    BitsSecond("Bits/Second"),
    KilobitsSecond("Kilobits/Second"),
    MegabitsSecond("Megabits/Second"),
    GigabitsSecond("Gigabits/Second"),
    TerabitsSecond("Terabits/Second"),
    CountSecond("Count/Second"),
    None("None");

    private static final Map<String, FleetMetricUnit> enumMap;
    private String value;

    static {
        FleetMetricUnit fleetMetricUnit = Seconds;
        FleetMetricUnit fleetMetricUnit2 = Microseconds;
        FleetMetricUnit fleetMetricUnit3 = Milliseconds;
        FleetMetricUnit fleetMetricUnit4 = Bytes;
        FleetMetricUnit fleetMetricUnit5 = Kilobytes;
        FleetMetricUnit fleetMetricUnit6 = Megabytes;
        FleetMetricUnit fleetMetricUnit7 = Gigabytes;
        FleetMetricUnit fleetMetricUnit8 = Terabytes;
        FleetMetricUnit fleetMetricUnit9 = Bits;
        FleetMetricUnit fleetMetricUnit10 = Kilobits;
        FleetMetricUnit fleetMetricUnit11 = Megabits;
        FleetMetricUnit fleetMetricUnit12 = Gigabits;
        FleetMetricUnit fleetMetricUnit13 = Terabits;
        FleetMetricUnit fleetMetricUnit14 = Percent;
        FleetMetricUnit fleetMetricUnit15 = Count;
        FleetMetricUnit fleetMetricUnit16 = BytesSecond;
        FleetMetricUnit fleetMetricUnit17 = KilobytesSecond;
        FleetMetricUnit fleetMetricUnit18 = MegabytesSecond;
        FleetMetricUnit fleetMetricUnit19 = GigabytesSecond;
        FleetMetricUnit fleetMetricUnit20 = TerabytesSecond;
        FleetMetricUnit fleetMetricUnit21 = BitsSecond;
        FleetMetricUnit fleetMetricUnit22 = KilobitsSecond;
        FleetMetricUnit fleetMetricUnit23 = MegabitsSecond;
        FleetMetricUnit fleetMetricUnit24 = GigabitsSecond;
        FleetMetricUnit fleetMetricUnit25 = TerabitsSecond;
        FleetMetricUnit fleetMetricUnit26 = CountSecond;
        FleetMetricUnit fleetMetricUnit27 = None;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("Seconds", fleetMetricUnit);
        hashMap.put("Microseconds", fleetMetricUnit2);
        hashMap.put("Milliseconds", fleetMetricUnit3);
        hashMap.put("Bytes", fleetMetricUnit4);
        hashMap.put("Kilobytes", fleetMetricUnit5);
        hashMap.put("Megabytes", fleetMetricUnit6);
        hashMap.put("Gigabytes", fleetMetricUnit7);
        hashMap.put("Terabytes", fleetMetricUnit8);
        hashMap.put("Bits", fleetMetricUnit9);
        hashMap.put("Kilobits", fleetMetricUnit10);
        hashMap.put("Megabits", fleetMetricUnit11);
        hashMap.put("Gigabits", fleetMetricUnit12);
        hashMap.put("Terabits", fleetMetricUnit13);
        hashMap.put("Percent", fleetMetricUnit14);
        hashMap.put("Count", fleetMetricUnit15);
        hashMap.put("Bytes/Second", fleetMetricUnit16);
        hashMap.put("Kilobytes/Second", fleetMetricUnit17);
        hashMap.put("Megabytes/Second", fleetMetricUnit18);
        hashMap.put("Gigabytes/Second", fleetMetricUnit19);
        hashMap.put("Terabytes/Second", fleetMetricUnit20);
        hashMap.put("Bits/Second", fleetMetricUnit21);
        hashMap.put("Kilobits/Second", fleetMetricUnit22);
        hashMap.put("Megabits/Second", fleetMetricUnit23);
        hashMap.put("Gigabits/Second", fleetMetricUnit24);
        hashMap.put("Terabits/Second", fleetMetricUnit25);
        hashMap.put("Count/Second", fleetMetricUnit26);
        hashMap.put("None", fleetMetricUnit27);
    }

    FleetMetricUnit(String str) {
        this.value = str;
    }

    public static FleetMetricUnit fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, FleetMetricUnit> map = enumMap;
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
