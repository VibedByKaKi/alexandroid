package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetBucketCrossOriginConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private BucketCrossOriginConfiguration crossOriginConfiguration;

    public SetBucketCrossOriginConfigurationRequest(String str, BucketCrossOriginConfiguration bucketCrossOriginConfiguration) {
        this.bucketName = str;
        this.crossOriginConfiguration = bucketCrossOriginConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public BucketCrossOriginConfiguration getCrossOriginConfiguration() {
        return this.crossOriginConfiguration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setCrossOriginConfiguration(BucketCrossOriginConfiguration bucketCrossOriginConfiguration) {
        this.crossOriginConfiguration = bucketCrossOriginConfiguration;
    }

    public SetBucketCrossOriginConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketCrossOriginConfigurationRequest withCrossOriginConfiguration(BucketCrossOriginConfiguration bucketCrossOriginConfiguration) {
        setCrossOriginConfiguration(bucketCrossOriginConfiguration);
        return this;
    }
}
