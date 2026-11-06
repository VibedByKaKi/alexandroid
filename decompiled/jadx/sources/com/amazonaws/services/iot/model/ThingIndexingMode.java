package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ThingIndexingMode {
    OFF("OFF"),
    REGISTRY("REGISTRY"),
    REGISTRY_AND_SHADOW("REGISTRY_AND_SHADOW");

    private static final Map<String, ThingIndexingMode> enumMap;
    private String value;

    static {
        ThingIndexingMode thingIndexingMode = OFF;
        ThingIndexingMode thingIndexingMode2 = REGISTRY;
        ThingIndexingMode thingIndexingMode3 = REGISTRY_AND_SHADOW;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("OFF", thingIndexingMode);
        hashMap.put("REGISTRY", thingIndexingMode2);
        hashMap.put("REGISTRY_AND_SHADOW", thingIndexingMode3);
    }

    ThingIndexingMode(String str) {
        this.value = str;
    }

    public static ThingIndexingMode fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ThingIndexingMode> map = enumMap;
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
