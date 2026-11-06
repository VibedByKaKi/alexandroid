package com.amazonaws.services.s3.model;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum BucketAccelerateStatus {
    Enabled("Enabled"),
    Suspended(BucketVersioningConfiguration.SUSPENDED);

    private final String accelerateStatus;

    BucketAccelerateStatus(String str) {
        this.accelerateStatus = str;
    }

    public static BucketAccelerateStatus fromValue(String str) throws IllegalArgumentException {
        for (BucketAccelerateStatus bucketAccelerateStatus : values()) {
            if (bucketAccelerateStatus.toString().equals(str)) {
                return bucketAccelerateStatus;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Cannot create enum from ", str, " value!"));
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.accelerateStatus;
    }
}
