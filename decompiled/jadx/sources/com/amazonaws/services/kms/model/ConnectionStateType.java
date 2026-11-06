package com.amazonaws.services.kms.model;

import com.amazon.devicesetupservice.reporting.NetworkState;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ConnectionStateType {
    CONNECTED("CONNECTED"),
    CONNECTING(NetworkState.CONNECTING),
    FAILED("FAILED"),
    DISCONNECTED("DISCONNECTED"),
    DISCONNECTING("DISCONNECTING");

    private static final Map<String, ConnectionStateType> enumMap;
    private String value;

    static {
        ConnectionStateType connectionStateType = CONNECTED;
        ConnectionStateType connectionStateType2 = CONNECTING;
        ConnectionStateType connectionStateType3 = FAILED;
        ConnectionStateType connectionStateType4 = DISCONNECTED;
        ConnectionStateType connectionStateType5 = DISCONNECTING;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("CONNECTED", connectionStateType);
        hashMap.put(NetworkState.CONNECTING, connectionStateType2);
        hashMap.put("FAILED", connectionStateType3);
        hashMap.put("DISCONNECTED", connectionStateType4);
        hashMap.put("DISCONNECTING", connectionStateType5);
    }

    ConnectionStateType(String str) {
        this.value = str;
    }

    public static ConnectionStateType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ConnectionStateType> map = enumMap;
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
