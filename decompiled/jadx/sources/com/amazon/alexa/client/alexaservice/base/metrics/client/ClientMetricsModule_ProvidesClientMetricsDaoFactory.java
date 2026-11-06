package com.amazon.alexa.client.alexaservice.base.metrics.client;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ClientMetricsModule_ProvidesClientMetricsDaoFactory implements Factory<ClientMetricsDao> {
    private final Provider<ClientMetricDatabase> databaseProvider;
    private final ClientMetricsModule module;

    public ClientMetricsModule_ProvidesClientMetricsDaoFactory(ClientMetricsModule clientMetricsModule, Provider<ClientMetricDatabase> provider) {
        this.module = clientMetricsModule;
        this.databaseProvider = provider;
    }

    public static ClientMetricsModule_ProvidesClientMetricsDaoFactory create(ClientMetricsModule clientMetricsModule, Provider<ClientMetricDatabase> provider) {
        return new ClientMetricsModule_ProvidesClientMetricsDaoFactory(clientMetricsModule, provider);
    }

    public static ClientMetricsDao providesClientMetricsDao(ClientMetricsModule clientMetricsModule, ClientMetricDatabase clientMetricDatabase) {
        return (ClientMetricsDao) Preconditions.checkNotNullFromProvides(clientMetricsModule.providesClientMetricsDao(clientMetricDatabase));
    }

    @Override // javax.inject.Provider
    public ClientMetricsDao get() {
        return providesClientMetricsDao(this.module, this.databaseProvider.get());
    }
}
