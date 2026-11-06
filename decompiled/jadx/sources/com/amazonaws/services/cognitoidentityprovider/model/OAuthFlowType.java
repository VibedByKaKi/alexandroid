package com.amazonaws.services.cognitoidentityprovider.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum OAuthFlowType {
    Code("code"),
    Implicit("implicit"),
    Client_credentials("client_credentials");

    private static final Map<String, OAuthFlowType> enumMap;
    private String value;

    static {
        OAuthFlowType oAuthFlowType = Code;
        OAuthFlowType oAuthFlowType2 = Implicit;
        OAuthFlowType oAuthFlowType3 = Client_credentials;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("code", oAuthFlowType);
        hashMap.put("implicit", oAuthFlowType2);
        hashMap.put("client_credentials", oAuthFlowType3);
    }

    OAuthFlowType(String str) {
        this.value = str;
    }

    public static OAuthFlowType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, OAuthFlowType> map = enumMap;
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
