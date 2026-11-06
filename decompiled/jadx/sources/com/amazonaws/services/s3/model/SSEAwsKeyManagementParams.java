package com.amazonaws.services.s3.model;

import java.io.Serializable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SSEAwsKeyManagementParams implements Serializable {
    private final String awsKmsKeyId;

    public SSEAwsKeyManagementParams(String str) {
        if (str == null || str.trim().isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("AWS Key Management System Key id cannot be null");
            throw null;
        }
        this.awsKmsKeyId = str;
    }

    public String getAwsKmsKeyId() {
        return this.awsKmsKeyId;
    }

    public String getEncryption() {
        return SSEAlgorithm.KMS.getAlgorithm();
    }

    public SSEAwsKeyManagementParams() {
        this.awsKmsKeyId = null;
    }
}
