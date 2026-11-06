package com.amazon.alexa.metis.client;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes14.dex */
public final class MetisServiceClient_MembersInjector implements MembersInjector<MetisServiceClient> {
    private final Provider<MetisClient> metisClientProvider;

    public MetisServiceClient_MembersInjector(Provider<MetisClient> provider) {
        this.metisClientProvider = provider;
    }

    public static MembersInjector<MetisServiceClient> create(Provider<MetisClient> provider) {
        return new MetisServiceClient_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.metis.client.MetisServiceClient.metisClient")
    public static void injectMetisClient(MetisServiceClient metisServiceClient, MetisClient metisClient) {
        metisServiceClient.metisClient = metisClient;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MetisServiceClient metisServiceClient) {
        injectMetisClient(metisServiceClient, this.metisClientProvider.get());
    }
}
