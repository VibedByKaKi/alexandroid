package com.amazonaws.services.cognitoidentityprovider.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum RecoveryOptionNameType {
    Verified_email("verified_email"),
    Verified_phone_number("verified_phone_number"),
    Admin_only("admin_only");

    private static final Map<String, RecoveryOptionNameType> enumMap;
    private String value;

    static {
        RecoveryOptionNameType recoveryOptionNameType = Verified_email;
        RecoveryOptionNameType recoveryOptionNameType2 = Verified_phone_number;
        RecoveryOptionNameType recoveryOptionNameType3 = Admin_only;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("verified_email", recoveryOptionNameType);
        hashMap.put("verified_phone_number", recoveryOptionNameType2);
        hashMap.put("admin_only", recoveryOptionNameType3);
    }

    RecoveryOptionNameType(String str) {
        this.value = str;
    }

    public static RecoveryOptionNameType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, RecoveryOptionNameType> map = enumMap;
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
