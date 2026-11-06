package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.client.utils.CacheControl;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum CannedAccessControlList {
    Private(CacheControl.PRIVATE),
    PublicRead("public-read"),
    PublicReadWrite("public-read-write"),
    AwsExecRead("aws-exec-read"),
    AuthenticatedRead("authenticated-read"),
    BucketOwnerRead("bucket-owner-read"),
    BucketOwnerFullControl("bucket-owner-full-control"),
    LogDeliveryWrite("log-delivery-write");

    private static final Map<String, CannedAccessControlList> enumMap;
    private String value;

    static {
        CannedAccessControlList cannedAccessControlList = Private;
        CannedAccessControlList cannedAccessControlList2 = PublicRead;
        CannedAccessControlList cannedAccessControlList3 = PublicReadWrite;
        CannedAccessControlList cannedAccessControlList4 = AwsExecRead;
        CannedAccessControlList cannedAccessControlList5 = AuthenticatedRead;
        CannedAccessControlList cannedAccessControlList6 = BucketOwnerRead;
        CannedAccessControlList cannedAccessControlList7 = BucketOwnerFullControl;
        CannedAccessControlList cannedAccessControlList8 = LogDeliveryWrite;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put(CacheControl.PRIVATE, cannedAccessControlList);
        hashMap.put("public-read", cannedAccessControlList2);
        hashMap.put("public-read-write", cannedAccessControlList3);
        hashMap.put("aws-exec-read", cannedAccessControlList4);
        hashMap.put("authenticated-read", cannedAccessControlList5);
        hashMap.put("bucket-owner-read", cannedAccessControlList6);
        hashMap.put("bucket-owner-full-control", cannedAccessControlList7);
        hashMap.put("log-delivery-write", cannedAccessControlList8);
    }

    CannedAccessControlList(String str) {
        this.value = str;
    }

    public static CannedAccessControlList fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, CannedAccessControlList> map = enumMap;
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
