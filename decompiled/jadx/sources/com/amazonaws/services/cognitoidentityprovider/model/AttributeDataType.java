package com.amazonaws.services.cognitoidentityprovider.model;

import androidx.exifinterface.media.ExifInterface;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum AttributeDataType {
    String("String"),
    Number("Number"),
    DateTime(ExifInterface.TAG_DATETIME),
    Boolean("Boolean");

    private static final Map<String, AttributeDataType> enumMap;
    private String value;

    static {
        AttributeDataType attributeDataType = String;
        AttributeDataType attributeDataType2 = Number;
        AttributeDataType attributeDataType3 = DateTime;
        AttributeDataType attributeDataType4 = Boolean;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("String", attributeDataType);
        hashMap.put("Number", attributeDataType2);
        hashMap.put(ExifInterface.TAG_DATETIME, attributeDataType3);
        hashMap.put("Boolean", attributeDataType4);
    }

    AttributeDataType(String str) {
        this.value = str;
    }

    public static AttributeDataType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, AttributeDataType> map = enumMap;
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
