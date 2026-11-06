package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazon.alexa.accessory.frames.media.MediaService;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum UserStatusType {
    UNCONFIRMED("UNCONFIRMED"),
    CONFIRMED(MediaService.DEVICE_RECEIPT_CONFIRMED),
    ARCHIVED("ARCHIVED"),
    COMPROMISED("COMPROMISED"),
    RESET_REQUIRED("RESET_REQUIRED"),
    FORCE_CHANGE_PASSWORD("FORCE_CHANGE_PASSWORD");

    private static final Map<String, UserStatusType> enumMap;
    private String value;

    static {
        UserStatusType userStatusType = UNCONFIRMED;
        UserStatusType userStatusType2 = CONFIRMED;
        UserStatusType userStatusType3 = ARCHIVED;
        UserStatusType userStatusType4 = COMPROMISED;
        UserStatusType userStatusType5 = RESET_REQUIRED;
        UserStatusType userStatusType6 = FORCE_CHANGE_PASSWORD;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("UNCONFIRMED", userStatusType);
        hashMap.put(MediaService.DEVICE_RECEIPT_CONFIRMED, userStatusType2);
        hashMap.put("ARCHIVED", userStatusType3);
        hashMap.put("COMPROMISED", userStatusType4);
        hashMap.put("RESET_REQUIRED", userStatusType5);
        hashMap.put("FORCE_CHANGE_PASSWORD", userStatusType6);
    }

    UserStatusType(String str) {
        this.value = str;
    }

    public static UserStatusType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, UserStatusType> map = enumMap;
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
