package com.amazonaws.services.cognitoidentityprovider.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum EventType {
    SignIn("SignIn"),
    SignUp("SignUp"),
    ForgotPassword("ForgotPassword"),
    PasswordChange("PasswordChange"),
    ResendCode("ResendCode");

    private static final Map<String, EventType> enumMap;
    private String value;

    static {
        EventType eventType = SignIn;
        EventType eventType2 = SignUp;
        EventType eventType3 = ForgotPassword;
        EventType eventType4 = PasswordChange;
        EventType eventType5 = ResendCode;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("SignIn", eventType);
        hashMap.put("SignUp", eventType2);
        hashMap.put("ForgotPassword", eventType3);
        hashMap.put("PasswordChange", eventType4);
        hashMap.put("ResendCode", eventType5);
    }

    EventType(String str) {
        this.value = str;
    }

    public static EventType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, EventType> map = enumMap;
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
