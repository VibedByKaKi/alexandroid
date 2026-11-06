package com.amazonaws.services.cognitoidentityprovider.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum DefaultEmailOptionType {
    CONFIRM_WITH_LINK("CONFIRM_WITH_LINK"),
    CONFIRM_WITH_CODE("CONFIRM_WITH_CODE");

    private static final Map<String, DefaultEmailOptionType> enumMap;
    private String value;

    static {
        DefaultEmailOptionType defaultEmailOptionType = CONFIRM_WITH_LINK;
        DefaultEmailOptionType defaultEmailOptionType2 = CONFIRM_WITH_CODE;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("CONFIRM_WITH_LINK", defaultEmailOptionType);
        hashMap.put("CONFIRM_WITH_CODE", defaultEmailOptionType2);
    }

    DefaultEmailOptionType(String str) {
        this.value = str;
    }

    public static DefaultEmailOptionType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, DefaultEmailOptionType> map = enumMap;
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
