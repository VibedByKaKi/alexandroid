package com.amazonaws.services.cognitoidentityprovider.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum AccountTakeoverEventActionType {
    BLOCK("BLOCK"),
    MFA_IF_CONFIGURED("MFA_IF_CONFIGURED"),
    MFA_REQUIRED("MFA_REQUIRED"),
    NO_ACTION("NO_ACTION");

    private static final Map<String, AccountTakeoverEventActionType> enumMap;
    private String value;

    static {
        AccountTakeoverEventActionType accountTakeoverEventActionType = BLOCK;
        AccountTakeoverEventActionType accountTakeoverEventActionType2 = MFA_IF_CONFIGURED;
        AccountTakeoverEventActionType accountTakeoverEventActionType3 = MFA_REQUIRED;
        AccountTakeoverEventActionType accountTakeoverEventActionType4 = NO_ACTION;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("BLOCK", accountTakeoverEventActionType);
        hashMap.put("MFA_IF_CONFIGURED", accountTakeoverEventActionType2);
        hashMap.put("MFA_REQUIRED", accountTakeoverEventActionType3);
        hashMap.put("NO_ACTION", accountTakeoverEventActionType4);
    }

    AccountTakeoverEventActionType(String str) {
        this.value = str;
    }

    public static AccountTakeoverEventActionType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, AccountTakeoverEventActionType> map = enumMap;
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
