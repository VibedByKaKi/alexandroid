package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.accessory.AccessoriesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.amazon.comms.calling.dependency.DefaultDispatcher"})
/* loaded from: classes20.dex */
public final class ShouldDowngradeToAudioUseCase_Factory implements Factory<ShouldDowngradeToAudioUseCase> {
    private final Provider<AccessoriesRepository> accessoriesRepositoryProvider;
    private final Provider<CoroutineDispatcher> dispatcherProvider;

    public ShouldDowngradeToAudioUseCase_Factory(Provider<AccessoriesRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.accessoriesRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static ShouldDowngradeToAudioUseCase_Factory create(Provider<AccessoriesRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new ShouldDowngradeToAudioUseCase_Factory(provider, provider2);
    }

    public static ShouldDowngradeToAudioUseCase newInstance(AccessoriesRepository accessoriesRepository, CoroutineDispatcher coroutineDispatcher) {
        return new ShouldDowngradeToAudioUseCase(accessoriesRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public ShouldDowngradeToAudioUseCase get() {
        return newInstance(this.accessoriesRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
