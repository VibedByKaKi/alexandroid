package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetBucketAccelerateConfigurationRequest extends AmazonWebServiceRequest implements S3AccelerateUnsupported {
    private BucketAccelerateConfiguration accelerateConfiguration;
    private String bucketName;

    public SetBucketAccelerateConfigurationRequest(String str, BucketAccelerateConfiguration bucketAccelerateConfiguration) {
        this.bucketName = str;
        this.accelerateConfiguration = bucketAccelerateConfiguration;
    }

    public BucketAccelerateConfiguration getAccelerateConfiguration() {
        return this.accelerateConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public void setAccelerateConfiguration(BucketAccelerateConfiguration bucketAccelerateConfiguration) {
        this.accelerateConfiguration = bucketAccelerateConfiguration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public SetBucketAccelerateConfigurationRequest withAccelerateConfiguration(BucketAccelerateConfiguration bucketAccelerateConfiguration) {
        setAccelerateConfiguration(bucketAccelerateConfiguration);
        return this;
    }

    public SetBucketAccelerateConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }
}
