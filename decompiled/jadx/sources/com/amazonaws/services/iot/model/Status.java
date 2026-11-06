package com.amazonaws.services.iot.model;

import com.amazon.photos.uploader.internal.workers.UploadWorker;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum Status {
    InProgress("InProgress"),
    Completed("Completed"),
    Failed(UploadWorker.FAILED_PREFIX),
    Cancelled("Cancelled"),
    Cancelling("Cancelling");

    private static final Map<String, Status> enumMap;
    private String value;

    static {
        Status status = InProgress;
        Status status2 = Completed;
        Status status3 = Failed;
        Status status4 = Cancelled;
        Status status5 = Cancelling;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("InProgress", status);
        hashMap.put("Completed", status2);
        hashMap.put(UploadWorker.FAILED_PREFIX, status3);
        hashMap.put("Cancelled", status4);
        hashMap.put("Cancelling", status5);
    }

    Status(String str) {
        this.value = str;
    }

    public static Status fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, Status> map = enumMap;
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
