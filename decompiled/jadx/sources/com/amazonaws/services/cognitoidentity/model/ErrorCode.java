package com.amazonaws.services.cognitoidentity.model;

import com.amazon.alexa.configservice.metrics.MetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ErrorCode {
    AccessDenied("AccessDenied"),
    InternalServerError(MetricsConstants.Error.INTERNAL_SERVER_ERROR);

    private static final Map<String, ErrorCode> enumMap;
    private String value;

    static {
        ErrorCode errorCode = AccessDenied;
        ErrorCode errorCode2 = InternalServerError;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("AccessDenied", errorCode);
        hashMap.put(MetricsConstants.Error.INTERNAL_SERVER_ERROR, errorCode2);
    }

    ErrorCode(String str) {
        this.value = str;
    }

    public static ErrorCode fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ErrorCode> map = enumMap;
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
