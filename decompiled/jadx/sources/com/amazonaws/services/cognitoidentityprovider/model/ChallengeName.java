package com.amazonaws.services.cognitoidentityprovider.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ChallengeName {
    Password("Password"),
    Mfa("Mfa");

    private static final Map<String, ChallengeName> enumMap;
    private String value;

    static {
        ChallengeName challengeName = Password;
        ChallengeName challengeName2 = Mfa;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("Password", challengeName);
        hashMap.put("Mfa", challengeName2);
    }

    ChallengeName(String str) {
        this.value = str;
    }

    public static ChallengeName fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ChallengeName> map = enumMap;
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
