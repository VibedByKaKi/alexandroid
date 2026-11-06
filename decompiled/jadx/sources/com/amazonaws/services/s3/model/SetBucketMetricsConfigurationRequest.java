package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetBucketMetricsConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;
    private MetricsConfiguration metricsConfiguration;

    public SetBucketMetricsConfigurationRequest(String str, MetricsConfiguration metricsConfiguration) {
        this.bucketName = str;
        this.metricsConfiguration = metricsConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public MetricsConfiguration getMetricsConfiguration() {
        return this.metricsConfiguration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setMetricsConfiguration(MetricsConfiguration metricsConfiguration) {
        this.metricsConfiguration = metricsConfiguration;
    }

    public SetBucketMetricsConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketMetricsConfigurationRequest withMetricsConfiguration(MetricsConfiguration metricsConfiguration) {
        setMetricsConfiguration(metricsConfiguration);
        return this;
    }

    public SetBucketMetricsConfigurationRequest() {
    }
}
