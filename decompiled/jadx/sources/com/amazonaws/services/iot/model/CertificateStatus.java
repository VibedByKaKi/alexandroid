package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum CertificateStatus {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    REVOKED("REVOKED"),
    PENDING_TRANSFER("PENDING_TRANSFER"),
    REGISTER_INACTIVE("REGISTER_INACTIVE"),
    PENDING_ACTIVATION("PENDING_ACTIVATION");

    private static final Map<String, CertificateStatus> enumMap;
    private String value;

    static {
        CertificateStatus certificateStatus = ACTIVE;
        CertificateStatus certificateStatus2 = INACTIVE;
        CertificateStatus certificateStatus3 = REVOKED;
        CertificateStatus certificateStatus4 = PENDING_TRANSFER;
        CertificateStatus certificateStatus5 = REGISTER_INACTIVE;
        CertificateStatus certificateStatus6 = PENDING_ACTIVATION;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ACTIVE", certificateStatus);
        hashMap.put("INACTIVE", certificateStatus2);
        hashMap.put("REVOKED", certificateStatus3);
        hashMap.put("PENDING_TRANSFER", certificateStatus4);
        hashMap.put("REGISTER_INACTIVE", certificateStatus5);
        hashMap.put("PENDING_ACTIVATION", certificateStatus6);
    }

    CertificateStatus(String str) {
        this.value = str;
    }

    public static CertificateStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, CertificateStatus> map = enumMap;
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
