package com.amazonaws.services.kinesis.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ShardIteratorType {
    AT_SEQUENCE_NUMBER("AT_SEQUENCE_NUMBER"),
    AFTER_SEQUENCE_NUMBER("AFTER_SEQUENCE_NUMBER"),
    TRIM_HORIZON("TRIM_HORIZON"),
    LATEST("LATEST"),
    AT_TIMESTAMP("AT_TIMESTAMP");

    private static final Map<String, ShardIteratorType> enumMap;
    private String value;

    static {
        ShardIteratorType shardIteratorType = AT_SEQUENCE_NUMBER;
        ShardIteratorType shardIteratorType2 = AFTER_SEQUENCE_NUMBER;
        ShardIteratorType shardIteratorType3 = TRIM_HORIZON;
        ShardIteratorType shardIteratorType4 = LATEST;
        ShardIteratorType shardIteratorType5 = AT_TIMESTAMP;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("AT_SEQUENCE_NUMBER", shardIteratorType);
        hashMap.put("AFTER_SEQUENCE_NUMBER", shardIteratorType2);
        hashMap.put("TRIM_HORIZON", shardIteratorType3);
        hashMap.put("LATEST", shardIteratorType4);
        hashMap.put("AT_TIMESTAMP", shardIteratorType5);
    }

    ShardIteratorType(String str) {
        this.value = str;
    }

    public static ShardIteratorType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, ShardIteratorType> map = enumMap;
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
