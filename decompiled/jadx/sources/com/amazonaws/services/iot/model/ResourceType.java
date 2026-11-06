package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ResourceType {
    DEVICE_CERTIFICATE("DEVICE_CERTIFICATE"),
    CA_CERTIFICATE("CA_CERTIFICATE"),
    IOT_POLICY("IOT_POLICY"),
    COGNITO_IDENTITY_POOL("COGNITO_IDENTITY_POOL"),
    CLIENT_ID("CLIENT_ID"),
    ACCOUNT_SETTINGS("ACCOUNT_SETTINGS"),
    ROLE_ALIAS("ROLE_ALIAS"),
    IAM_ROLE("IAM_ROLE"),
    ISSUER_CERTIFICATE("ISSUER_CERTIFICATE");

    private static final Map<String, ResourceType> enumMap;
    private String value;

    static {
        ResourceType resourceType = DEVICE_CERTIFICATE;
        ResourceType resourceType2 = CA_CERTIFICATE;
        ResourceType resourceType3 = IOT_POLICY;
        ResourceType resourceType4 = COGNITO_IDENTITY_POOL;
        ResourceType resourceType5 = CLIENT_ID;
        ResourceType resourceType6 = ACCOUNT_SETTINGS;
        ResourceType resourceType7 = ROLE_ALIAS;
        ResourceType resourceType8 = IAM_ROLE;
        ResourceType resourceType9 = ISSUER_CERTIFICATE;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("DEVICE_CERTIFICATE", resourceType);
        hashMap.put("CA_CERTIFICATE", resourceType2);
        hashMap.put("IOT_POLICY", resourceType3);
        hashMap.put("COGNITO_IDENTITY_POOL", resourceType4);
        hashMap.put("CLIENT_ID", resourceType5);
        hashMap.put("ACCOUNT_SETTINGS", resourceType6);
        hashMap.put("ROLE_ALIAS", resourceType7);
        hashMap.put("IAM_ROLE", resourceType8);
        hashMap.put("ISSUER_CERTIFICATE", resourceType9);
    }

    ResourceType(String str) {
        this.value = str;
    }

    public static ResourceType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ResourceType> map = enumMap;
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
