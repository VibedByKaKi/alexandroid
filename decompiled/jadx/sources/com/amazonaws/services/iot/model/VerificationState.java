package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum VerificationState {
    FALSE_POSITIVE("FALSE_POSITIVE"),
    BENIGN_POSITIVE("BENIGN_POSITIVE"),
    TRUE_POSITIVE("TRUE_POSITIVE");

    private static final Map<String, VerificationState> enumMap;
    private String value;

    static {
        VerificationState verificationState = FALSE_POSITIVE;
        VerificationState verificationState2 = BENIGN_POSITIVE;
        VerificationState verificationState3 = TRUE_POSITIVE;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("FALSE_POSITIVE", verificationState);
        hashMap.put("BENIGN_POSITIVE", verificationState2);
        hashMap.put("TRUE_POSITIVE", verificationState3);
    }

    VerificationState(String str) {
        this.value = str;
    }

    public static VerificationState fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, VerificationState> map = enumMap;
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
