package com.amazonaws.auth;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BasicSessionCredentials implements AWSSessionCredentials {
    private final String awsAccessKey;
    private final String awsSecretKey;
    private final String sessionToken;

    public BasicSessionCredentials(String str, String str2, String str3) {
        this.awsAccessKey = str;
        this.awsSecretKey = str2;
        this.sessionToken = str3;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String getAWSAccessKeyId() {
        return this.awsAccessKey;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String getAWSSecretKey() {
        return this.awsSecretKey;
    }

    @Override // com.amazonaws.auth.AWSSessionCredentials
    public String getSessionToken() {
        return this.sessionToken;
    }
}
