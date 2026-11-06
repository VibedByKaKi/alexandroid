package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AnalyticsExportDestination implements Serializable {
    private AnalyticsS3BucketDestination s3BucketDestination;

    public AnalyticsS3BucketDestination getS3BucketDestination() {
        return this.s3BucketDestination;
    }

    public void setS3BucketDestination(AnalyticsS3BucketDestination analyticsS3BucketDestination) {
        this.s3BucketDestination = analyticsS3BucketDestination;
    }

    public AnalyticsExportDestination withS3BucketDestination(AnalyticsS3BucketDestination analyticsS3BucketDestination) {
        setS3BucketDestination(analyticsS3BucketDestination);
        return this;
    }
}
