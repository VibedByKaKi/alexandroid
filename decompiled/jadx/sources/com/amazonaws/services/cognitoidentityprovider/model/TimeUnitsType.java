package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazon.tarazed.metrics.BizMetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum TimeUnitsType {
    Seconds(BizMetricsConstants.DURATION_METADATA_NAME),
    Minutes("minutes"),
    Hours("hours"),
    Days("days");

    private static final Map<String, TimeUnitsType> enumMap;
    private String value;

    static {
        TimeUnitsType timeUnitsType = Seconds;
        TimeUnitsType timeUnitsType2 = Minutes;
        TimeUnitsType timeUnitsType3 = Hours;
        TimeUnitsType timeUnitsType4 = Days;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put(BizMetricsConstants.DURATION_METADATA_NAME, timeUnitsType);
        hashMap.put("minutes", timeUnitsType2);
        hashMap.put("hours", timeUnitsType3);
        hashMap.put("days", timeUnitsType4);
    }

    TimeUnitsType(String str) {
        this.value = str;
    }

    public static TimeUnitsType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, TimeUnitsType> map = enumMap;
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
