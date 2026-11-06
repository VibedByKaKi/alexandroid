package com.amazon.alexa.mobilytics.event.orchestrator;

import com.amazon.alexa.mobilytics.event.serializer.customdata.CustomDataStorage;
import com.amazon.alexa.mobilytics.event.serializer.longlived.LongLivedDataBuilder;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class LongLivedDataOrchestrator_Factory implements Factory<LongLivedDataOrchestrator> {
    private final Provider<CustomDataStorage> customDataStorageProvider;
    private final Provider<LongLivedDataBuilder> dataBuilderProvider;

    public LongLivedDataOrchestrator_Factory(Provider<LongLivedDataBuilder> provider, Provider<CustomDataStorage> provider2) {
        this.dataBuilderProvider = provider;
        this.customDataStorageProvider = provider2;
    }

    public static LongLivedDataOrchestrator_Factory create(Provider<LongLivedDataBuilder> provider, Provider<CustomDataStorage> provider2) {
        return new LongLivedDataOrchestrator_Factory(provider, provider2);
    }

    public static LongLivedDataOrchestrator newInstance(LongLivedDataBuilder longLivedDataBuilder, CustomDataStorage customDataStorage) {
        return new LongLivedDataOrchestrator(longLivedDataBuilder, customDataStorage);
    }

    @Override // javax.inject.Provider
    public LongLivedDataOrchestrator get() {
        return newInstance(this.dataBuilderProvider.get(), this.customDataStorageProvider.get());
    }
}
