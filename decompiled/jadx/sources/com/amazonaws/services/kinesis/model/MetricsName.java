package com.amazonaws.services.kinesis.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum MetricsName {
    IncomingBytes("IncomingBytes"),
    IncomingRecords("IncomingRecords"),
    OutgoingBytes("OutgoingBytes"),
    OutgoingRecords("OutgoingRecords"),
    WriteProvisionedThroughputExceeded("WriteProvisionedThroughputExceeded"),
    ReadProvisionedThroughputExceeded("ReadProvisionedThroughputExceeded"),
    IteratorAgeMilliseconds("IteratorAgeMilliseconds"),
    ALL("ALL");

    private static final Map<String, MetricsName> enumMap;
    private String value;

    static {
        MetricsName metricsName = IncomingBytes;
        MetricsName metricsName2 = IncomingRecords;
        MetricsName metricsName3 = OutgoingBytes;
        MetricsName metricsName4 = OutgoingRecords;
        MetricsName metricsName5 = WriteProvisionedThroughputExceeded;
        MetricsName metricsName6 = ReadProvisionedThroughputExceeded;
        MetricsName metricsName7 = IteratorAgeMilliseconds;
        MetricsName metricsName8 = ALL;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("IncomingBytes", metricsName);
        hashMap.put("IncomingRecords", metricsName2);
        hashMap.put("OutgoingBytes", metricsName3);
        hashMap.put("OutgoingRecords", metricsName4);
        hashMap.put("WriteProvisionedThroughputExceeded", metricsName5);
        hashMap.put("ReadProvisionedThroughputExceeded", metricsName6);
        hashMap.put("IteratorAgeMilliseconds", metricsName7);
        hashMap.put("ALL", metricsName8);
    }

    MetricsName(String str) {
        this.value = str;
    }

    public static MetricsName fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, MetricsName> map = enumMap;
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
