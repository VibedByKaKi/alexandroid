package com.amazonaws.services.s3.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class HeadBucketResult {
    private String bucketRegion;

    public String getBucketRegion() {
        return this.bucketRegion;
    }

    public void setBucketRegion(String str) {
        this.bucketRegion = str;
    }

    public HeadBucketResult withBucketRegion(String str) {
        setBucketRegion(str);
        return this;
    }
}
