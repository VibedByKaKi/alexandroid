package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetBucketNotificationConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private BucketNotificationConfiguration notificationConfiguration;

    @Deprecated
    public SetBucketNotificationConfigurationRequest(BucketNotificationConfiguration bucketNotificationConfiguration, String str) {
        this.notificationConfiguration = bucketNotificationConfiguration;
        this.bucketName = str;
    }

    @Deprecated
    public String getBucket() {
        return this.bucketName;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    @Deprecated
    public BucketNotificationConfiguration getBucketNotificationConfiguration() {
        return this.notificationConfiguration;
    }

    public BucketNotificationConfiguration getNotificationConfiguration() {
        return this.notificationConfiguration;
    }

    @Deprecated
    public void setBucket(String str) {
        this.bucketName = str;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    @Deprecated
    public void setBucketNotificationConfiguration(BucketNotificationConfiguration bucketNotificationConfiguration) {
        this.notificationConfiguration = bucketNotificationConfiguration;
    }

    public void setNotificationConfiguration(BucketNotificationConfiguration bucketNotificationConfiguration) {
        this.notificationConfiguration = bucketNotificationConfiguration;
    }

    public SetBucketNotificationConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketNotificationConfigurationRequest withNotificationConfiguration(BucketNotificationConfiguration bucketNotificationConfiguration) {
        setNotificationConfiguration(bucketNotificationConfiguration);
        return this;
    }

    public SetBucketNotificationConfigurationRequest(String str, BucketNotificationConfiguration bucketNotificationConfiguration) {
        this.bucketName = str;
        this.notificationConfiguration = bucketNotificationConfiguration;
    }
}
