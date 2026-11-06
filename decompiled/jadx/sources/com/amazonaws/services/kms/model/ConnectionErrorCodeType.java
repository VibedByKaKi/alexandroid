package com.amazonaws.services.kms.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ConnectionErrorCodeType {
    INVALID_CREDENTIALS("INVALID_CREDENTIALS"),
    CLUSTER_NOT_FOUND("CLUSTER_NOT_FOUND"),
    NETWORK_ERRORS("NETWORK_ERRORS"),
    INTERNAL_ERROR("INTERNAL_ERROR"),
    INSUFFICIENT_CLOUDHSM_HSMS("INSUFFICIENT_CLOUDHSM_HSMS"),
    USER_LOCKED_OUT("USER_LOCKED_OUT"),
    USER_NOT_FOUND("USER_NOT_FOUND"),
    USER_LOGGED_IN("USER_LOGGED_IN"),
    SUBNET_NOT_FOUND("SUBNET_NOT_FOUND"),
    INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET("INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET");

    private static final Map<String, ConnectionErrorCodeType> enumMap;
    private String value;

    static {
        ConnectionErrorCodeType connectionErrorCodeType = INVALID_CREDENTIALS;
        ConnectionErrorCodeType connectionErrorCodeType2 = CLUSTER_NOT_FOUND;
        ConnectionErrorCodeType connectionErrorCodeType3 = NETWORK_ERRORS;
        ConnectionErrorCodeType connectionErrorCodeType4 = INTERNAL_ERROR;
        ConnectionErrorCodeType connectionErrorCodeType5 = INSUFFICIENT_CLOUDHSM_HSMS;
        ConnectionErrorCodeType connectionErrorCodeType6 = USER_LOCKED_OUT;
        ConnectionErrorCodeType connectionErrorCodeType7 = USER_NOT_FOUND;
        ConnectionErrorCodeType connectionErrorCodeType8 = USER_LOGGED_IN;
        ConnectionErrorCodeType connectionErrorCodeType9 = SUBNET_NOT_FOUND;
        ConnectionErrorCodeType connectionErrorCodeType10 = INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("INVALID_CREDENTIALS", connectionErrorCodeType);
        hashMap.put("CLUSTER_NOT_FOUND", connectionErrorCodeType2);
        hashMap.put("NETWORK_ERRORS", connectionErrorCodeType3);
        hashMap.put("INTERNAL_ERROR", connectionErrorCodeType4);
        hashMap.put("INSUFFICIENT_CLOUDHSM_HSMS", connectionErrorCodeType5);
        hashMap.put("USER_LOCKED_OUT", connectionErrorCodeType6);
        hashMap.put("USER_NOT_FOUND", connectionErrorCodeType7);
        hashMap.put("USER_LOGGED_IN", connectionErrorCodeType8);
        hashMap.put("SUBNET_NOT_FOUND", connectionErrorCodeType9);
        hashMap.put("INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET", connectionErrorCodeType10);
    }

    ConnectionErrorCodeType(String str) {
        this.value = str;
    }

    public static ConnectionErrorCodeType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ConnectionErrorCodeType> map = enumMap;
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
