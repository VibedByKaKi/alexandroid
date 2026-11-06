package com.amazonaws.services.s3.model;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ReplicationDestinationConfig {
    private String bucketARN;
    private String storageClass;

    public String getBucketARN() {
        return this.bucketARN;
    }

    public String getStorageClass() {
        return this.storageClass;
    }

    public void setBucketARN(String str) {
        if (str != null) {
            this.bucketARN = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Bucket name cannot be null");
        }
    }

    public void setStorageClass(StorageClass storageClass) {
        setStorageClass(storageClass == null ? null : storageClass.toString());
    }

    public ReplicationDestinationConfig withBucketARN(String str) {
        setBucketARN(str);
        return this;
    }

    public ReplicationDestinationConfig withStorageClass(StorageClass storageClass) {
        setStorageClass(storageClass == null ? null : storageClass.toString());
        return this;
    }

    public void setStorageClass(String str) {
        this.storageClass = str;
    }

    public ReplicationDestinationConfig withStorageClass(String str) {
        setStorageClass(str);
        return this;
    }
}
