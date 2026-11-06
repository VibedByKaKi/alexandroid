package com.amazonaws.auth;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AWSCredentialsProviderChain implements AWSCredentialsProvider {
    private static final Log log = LogFactory.getLog((Class<?>) AWSCredentialsProviderChain.class);
    private AWSCredentialsProvider lastUsedProvider;
    private List<AWSCredentialsProvider> credentialsProviders = new LinkedList();
    private boolean reuseLastProvider = true;

    public AWSCredentialsProviderChain(AWSCredentialsProvider... aWSCredentialsProviderArr) {
        if (aWSCredentialsProviderArr == null || aWSCredentialsProviderArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("No credential providers specified");
            throw null;
        }
        for (AWSCredentialsProvider aWSCredentialsProvider : aWSCredentialsProviderArr) {
            this.credentialsProviders.add(aWSCredentialsProvider);
        }
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public AWSCredentials getCredentials() {
        AWSCredentialsProvider aWSCredentialsProvider;
        if (this.reuseLastProvider && (aWSCredentialsProvider = this.lastUsedProvider) != null) {
            return aWSCredentialsProvider.getCredentials();
        }
        for (AWSCredentialsProvider aWSCredentialsProvider2 : this.credentialsProviders) {
            try {
                AWSCredentials credentials = aWSCredentialsProvider2.getCredentials();
                if (credentials.getAWSAccessKeyId() != null && credentials.getAWSSecretKey() != null) {
                    log.debug("Loading credentials from " + aWSCredentialsProvider2.toString());
                    this.lastUsedProvider = aWSCredentialsProvider2;
                    return credentials;
                }
            } catch (Exception e) {
                log.debug("Unable to load credentials from " + aWSCredentialsProvider2.toString() + ": " + e.getMessage());
            }
        }
        Classes$$ExternalSyntheticBUOutline0.m$1("Unable to load AWS credentials from any provider in the chain");
        return null;
    }

    public boolean getReuseLastProvider() {
        return this.reuseLastProvider;
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public void refresh() {
        Iterator<AWSCredentialsProvider> it2 = this.credentialsProviders.iterator();
        while (it2.hasNext()) {
            it2.next().refresh();
        }
    }

    public void setReuseLastProvider(boolean z) {
        this.reuseLastProvider = z;
    }
}
