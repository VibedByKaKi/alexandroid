package com.amazonaws.services.s3.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BucketLoggingConfiguration implements Serializable {
    private String destinationBucketName = null;
    private String logFilePrefix = null;

    public BucketLoggingConfiguration(String str, String str2) {
        setLogFilePrefix(str2);
        setDestinationBucketName(str);
    }

    public String getDestinationBucketName() {
        return this.destinationBucketName;
    }

    public String getLogFilePrefix() {
        return this.logFilePrefix;
    }

    public boolean isLoggingEnabled() {
        return (this.destinationBucketName == null || this.logFilePrefix == null) ? false : true;
    }

    public void setDestinationBucketName(String str) {
        this.destinationBucketName = str;
    }

    public void setLogFilePrefix(String str) {
        if (str == null) {
            str = "";
        }
        this.logFilePrefix = str;
    }

    public String toString() {
        String str = "LoggingConfiguration enabled=" + isLoggingEnabled();
        if (!isLoggingEnabled()) {
            return str;
        }
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ", destinationBucketName=");
        m1m.append(getDestinationBucketName());
        m1m.append(", logFilePrefix=");
        m1m.append(getLogFilePrefix());
        return m1m.toString();
    }

    public BucketLoggingConfiguration() {
    }
}
