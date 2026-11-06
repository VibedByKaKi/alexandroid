package com.amazon.alexa.client.alexaservice.base.metrics.tasks;

import com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricsDao;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class LoadGenericMetricsFromPersistentStorageTask_Factory implements Factory<LoadGenericMetricsFromPersistentStorageTask> {
    private final Provider<ClientMetricsDao> clientMetricsDaoProvider;
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public LoadGenericMetricsFromPersistentStorageTask_Factory(Provider<AlexaClientEventBus> provider, Provider<ClientMetricsDao> provider2) {
        this.eventBusProvider = provider;
        this.clientMetricsDaoProvider = provider2;
    }

    public static LoadGenericMetricsFromPersistentStorageTask_Factory create(Provider<AlexaClientEventBus> provider, Provider<ClientMetricsDao> provider2) {
        return new LoadGenericMetricsFromPersistentStorageTask_Factory(provider, provider2);
    }

    public static LoadGenericMetricsFromPersistentStorageTask newInstance(AlexaClientEventBus alexaClientEventBus, ClientMetricsDao clientMetricsDao) {
        return new LoadGenericMetricsFromPersistentStorageTask(alexaClientEventBus, clientMetricsDao);
    }

    @Override // javax.inject.Provider
    public LoadGenericMetricsFromPersistentStorageTask get() {
        return newInstance(this.eventBusProvider.get(), this.clientMetricsDaoProvider.get());
    }
}
