package com.amazonaws.auth;

import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public class SystemPropertiesCredentialsProvider implements AWSCredentialsProvider {
    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public AWSCredentials getCredentials() {
        if (System.getProperty(SDKGlobalConfiguration.ACCESS_KEY_SYSTEM_PROPERTY) != null && System.getProperty(SDKGlobalConfiguration.SECRET_KEY_SYSTEM_PROPERTY) != null) {
            return new BasicAWSCredentials(System.getProperty(SDKGlobalConfiguration.ACCESS_KEY_SYSTEM_PROPERTY), System.getProperty(SDKGlobalConfiguration.SECRET_KEY_SYSTEM_PROPERTY));
        }
        Classes$$ExternalSyntheticBUOutline0.m$1("Unable to load AWS credentials from Java system properties (aws.accessKeyId and aws.secretKey)");
        return null;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public void refresh() {
    }
}
