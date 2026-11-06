package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ExplicitAuthFlowsType {
    ADMIN_NO_SRP_AUTH("ADMIN_NO_SRP_AUTH"),
    CUSTOM_AUTH_FLOW_ONLY("CUSTOM_AUTH_FLOW_ONLY"),
    USER_PASSWORD_AUTH(CognitoServiceConstants.AUTH_TYPE_INIT_USER_PASSWORD),
    ALLOW_ADMIN_USER_PASSWORD_AUTH("ALLOW_ADMIN_USER_PASSWORD_AUTH"),
    ALLOW_CUSTOM_AUTH("ALLOW_CUSTOM_AUTH"),
    ALLOW_USER_PASSWORD_AUTH("ALLOW_USER_PASSWORD_AUTH"),
    ALLOW_USER_SRP_AUTH("ALLOW_USER_SRP_AUTH"),
    ALLOW_REFRESH_TOKEN_AUTH("ALLOW_REFRESH_TOKEN_AUTH");

    private static final Map<String, ExplicitAuthFlowsType> enumMap;
    private String value;

    static {
        ExplicitAuthFlowsType explicitAuthFlowsType = ADMIN_NO_SRP_AUTH;
        ExplicitAuthFlowsType explicitAuthFlowsType2 = CUSTOM_AUTH_FLOW_ONLY;
        ExplicitAuthFlowsType explicitAuthFlowsType3 = USER_PASSWORD_AUTH;
        ExplicitAuthFlowsType explicitAuthFlowsType4 = ALLOW_ADMIN_USER_PASSWORD_AUTH;
        ExplicitAuthFlowsType explicitAuthFlowsType5 = ALLOW_CUSTOM_AUTH;
        ExplicitAuthFlowsType explicitAuthFlowsType6 = ALLOW_USER_PASSWORD_AUTH;
        ExplicitAuthFlowsType explicitAuthFlowsType7 = ALLOW_USER_SRP_AUTH;
        ExplicitAuthFlowsType explicitAuthFlowsType8 = ALLOW_REFRESH_TOKEN_AUTH;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ADMIN_NO_SRP_AUTH", explicitAuthFlowsType);
        hashMap.put("CUSTOM_AUTH_FLOW_ONLY", explicitAuthFlowsType2);
        hashMap.put(CognitoServiceConstants.AUTH_TYPE_INIT_USER_PASSWORD, explicitAuthFlowsType3);
        hashMap.put("ALLOW_ADMIN_USER_PASSWORD_AUTH", explicitAuthFlowsType4);
        hashMap.put("ALLOW_CUSTOM_AUTH", explicitAuthFlowsType5);
        hashMap.put("ALLOW_USER_PASSWORD_AUTH", explicitAuthFlowsType6);
        hashMap.put("ALLOW_USER_SRP_AUTH", explicitAuthFlowsType7);
        hashMap.put("ALLOW_REFRESH_TOKEN_AUTH", explicitAuthFlowsType8);
    }

    ExplicitAuthFlowsType(String str) {
        this.value = str;
    }

    public static ExplicitAuthFlowsType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ExplicitAuthFlowsType> map = enumMap;
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
