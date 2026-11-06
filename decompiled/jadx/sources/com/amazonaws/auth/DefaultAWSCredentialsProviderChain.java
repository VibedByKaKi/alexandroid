package com.amazonaws.auth;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public class DefaultAWSCredentialsProviderChain extends AWSCredentialsProviderChain {
    public DefaultAWSCredentialsProviderChain() {
        super(new SystemPropertiesCredentialsProvider(), new ClasspathPropertiesFileCredentialsProvider());
    }
}
