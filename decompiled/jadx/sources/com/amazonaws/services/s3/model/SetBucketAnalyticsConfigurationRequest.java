package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetBucketAnalyticsConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private AnalyticsConfiguration analyticsConfiguration;
    private String bucketName;

    public SetBucketAnalyticsConfigurationRequest(String str, AnalyticsConfiguration analyticsConfiguration) {
        this.bucketName = str;
        this.analyticsConfiguration = analyticsConfiguration;
    }

    public AnalyticsConfiguration getAnalyticsConfiguration() {
        return this.analyticsConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public void setAnalyticsConfiguration(AnalyticsConfiguration analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public SetBucketAnalyticsConfigurationRequest withAnalyticsConfiguration(AnalyticsConfiguration analyticsConfiguration) {
        setAnalyticsConfiguration(analyticsConfiguration);
        return this;
    }

    public SetBucketAnalyticsConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketAnalyticsConfigurationRequest() {
    }
}
