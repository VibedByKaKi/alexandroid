package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetRequestPaymentConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private RequestPaymentConfiguration configuration;

    public SetRequestPaymentConfigurationRequest(String str, RequestPaymentConfiguration requestPaymentConfiguration) {
        setBucketName(str);
        this.configuration = requestPaymentConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public RequestPaymentConfiguration getConfiguration() {
        return this.configuration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setConfiguration(RequestPaymentConfiguration requestPaymentConfiguration) {
        this.configuration = requestPaymentConfiguration;
    }
}
