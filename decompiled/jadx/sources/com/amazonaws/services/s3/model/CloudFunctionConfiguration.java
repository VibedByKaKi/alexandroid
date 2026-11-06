package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public class CloudFunctionConfiguration extends NotificationConfiguration implements Serializable {
    private final String cloudFunctionARN;
    private final String invocationRoleARN;

    public CloudFunctionConfiguration(String str, String str2, EnumSet<S3Event> enumSet) {
        super(enumSet);
        this.invocationRoleARN = str;
        this.cloudFunctionARN = str2;
    }

    public String getCloudFunctionARN() {
        return this.cloudFunctionARN;
    }

    public String getInvocationRoleARN() {
        return this.invocationRoleARN;
    }

    public CloudFunctionConfiguration(String str, String str2, String... strArr) {
        super(strArr);
        this.invocationRoleARN = str;
        this.cloudFunctionARN = str2;
    }
}
