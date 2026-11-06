package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetBucketReplicationConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private BucketReplicationConfiguration replicationConfiguration;

    public SetBucketReplicationConfigurationRequest(String str, BucketReplicationConfiguration bucketReplicationConfiguration) {
        this.bucketName = str;
        this.replicationConfiguration = bucketReplicationConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public BucketReplicationConfiguration getReplicationConfiguration() {
        return this.replicationConfiguration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setReplicationConfiguration(BucketReplicationConfiguration bucketReplicationConfiguration) {
        this.replicationConfiguration = bucketReplicationConfiguration;
    }

    public SetBucketReplicationConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketReplicationConfigurationRequest withReplicationConfiguration(BucketReplicationConfiguration bucketReplicationConfiguration) {
        setReplicationConfiguration(bucketReplicationConfiguration);
        return this;
    }

    public SetBucketReplicationConfigurationRequest() {
    }
}
