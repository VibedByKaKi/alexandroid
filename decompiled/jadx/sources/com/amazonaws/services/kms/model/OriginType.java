package com.amazonaws.services.kms.model;

import com.amazon.alexa.voice.ui.suggestions.SuggestionAction;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum OriginType {
    AWS_KMS("AWS_KMS"),
    EXTERNAL(SuggestionAction.EXTERNAL),
    AWS_CLOUDHSM("AWS_CLOUDHSM");

    private static final Map<String, OriginType> enumMap;
    private String value;

    static {
        OriginType originType = AWS_KMS;
        OriginType originType2 = EXTERNAL;
        OriginType originType3 = AWS_CLOUDHSM;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("AWS_KMS", originType);
        hashMap.put(SuggestionAction.EXTERNAL, originType2);
        hashMap.put("AWS_CLOUDHSM", originType3);
    }

    OriginType(String str) {
        this.value = str;
    }

    public static OriginType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, OriginType> map = enumMap;
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
