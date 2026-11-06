package com.amazonaws.internal;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class StaticCredentialsProvider implements AWSCredentialsProvider {
    private final AWSCredentials credentials;

    public StaticCredentialsProvider(AWSCredentials aWSCredentials) {
        this.credentials = aWSCredentials;
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public AWSCredentials getCredentials() {
        return this.credentials;
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public void refresh() {
    }
}
