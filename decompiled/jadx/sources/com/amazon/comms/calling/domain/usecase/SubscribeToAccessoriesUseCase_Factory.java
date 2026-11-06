package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.accessory.AccessoriesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class SubscribeToAccessoriesUseCase_Factory implements Factory<SubscribeToAccessoriesUseCase> {
    private final Provider<AccessoriesRepository> accessoriesRepositoryProvider;

    public SubscribeToAccessoriesUseCase_Factory(Provider<AccessoriesRepository> provider) {
        this.accessoriesRepositoryProvider = provider;
    }

    public static SubscribeToAccessoriesUseCase_Factory create(Provider<AccessoriesRepository> provider) {
        return new SubscribeToAccessoriesUseCase_Factory(provider);
    }

    public static SubscribeToAccessoriesUseCase newInstance(AccessoriesRepository accessoriesRepository) {
        return new SubscribeToAccessoriesUseCase(accessoriesRepository);
    }

    @Override // javax.inject.Provider
    public SubscribeToAccessoriesUseCase get() {
        return newInstance(this.accessoriesRepositoryProvider.get());
    }
}
