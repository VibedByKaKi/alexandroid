package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetBucketLifecycleConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private BucketLifecycleConfiguration lifecycleConfiguration;

    public SetBucketLifecycleConfigurationRequest(String str, BucketLifecycleConfiguration bucketLifecycleConfiguration) {
        this.bucketName = str;
        this.lifecycleConfiguration = bucketLifecycleConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public BucketLifecycleConfiguration getLifecycleConfiguration() {
        return this.lifecycleConfiguration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setLifecycleConfiguration(BucketLifecycleConfiguration bucketLifecycleConfiguration) {
        this.lifecycleConfiguration = bucketLifecycleConfiguration;
    }

    public SetBucketLifecycleConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketLifecycleConfigurationRequest withLifecycleConfiguration(BucketLifecycleConfiguration bucketLifecycleConfiguration) {
        setLifecycleConfiguration(bucketLifecycleConfiguration);
        return this;
    }
}
