package com.amazonaws.auth;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BasicAWSCredentials implements AWSCredentials {
    private final String accessKey;
    private final String secretKey;

    public BasicAWSCredentials(String str, String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Access key cannot be null.");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Secret key cannot be null.");
            throw null;
        }
        this.accessKey = str;
        this.secretKey = str2;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String getAWSAccessKeyId() {
        return this.accessKey;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String getAWSSecretKey() {
        return this.secretKey;
    }
}
