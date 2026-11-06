package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.WarmupMediaStackRepository;
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
public final class WarmupMediaStackUseCase_Factory implements Factory<WarmupMediaStackUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<WarmupMediaStackRepository> warmupMediaStackRepositoryProvider;

    public WarmupMediaStackUseCase_Factory(Provider<WarmupMediaStackRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.warmupMediaStackRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static WarmupMediaStackUseCase_Factory create(Provider<WarmupMediaStackRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new WarmupMediaStackUseCase_Factory(provider, provider2);
    }

    public static WarmupMediaStackUseCase newInstance(WarmupMediaStackRepository warmupMediaStackRepository, CoroutineDispatcher coroutineDispatcher) {
        return new WarmupMediaStackUseCase(warmupMediaStackRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public WarmupMediaStackUseCase get() {
        return newInstance(this.warmupMediaStackRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
