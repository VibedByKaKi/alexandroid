package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum AuthDecision {
    ALLOWED("ALLOWED"),
    EXPLICIT_DENY("EXPLICIT_DENY"),
    IMPLICIT_DENY("IMPLICIT_DENY");

    private static final Map<String, AuthDecision> enumMap;
    private String value;

    static {
        AuthDecision authDecision = ALLOWED;
        AuthDecision authDecision2 = EXPLICIT_DENY;
        AuthDecision authDecision3 = IMPLICIT_DENY;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ALLOWED", authDecision);
        hashMap.put("EXPLICIT_DENY", authDecision2);
        hashMap.put("IMPLICIT_DENY", authDecision3);
    }

    AuthDecision(String str) {
        this.value = str;
    }

    public static AuthDecision fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, AuthDecision> map = enumMap;
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
