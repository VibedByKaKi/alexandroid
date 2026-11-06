package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.EndPointRepository;
import com.amazon.comms.calling.domain.repo.RemoteConfigRepository;
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
public final class GetLearnMoreUrlUseCase_Factory implements Factory<GetLearnMoreUrlUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<EndPointRepository> endPointRepositoryProvider;
    private final Provider<RemoteConfigRepository> remoteConfigRepositoryProvider;

    public GetLearnMoreUrlUseCase_Factory(Provider<RemoteConfigRepository> provider, Provider<EndPointRepository> provider2, Provider<CoroutineDispatcher> provider3) {
        this.remoteConfigRepositoryProvider = provider;
        this.endPointRepositoryProvider = provider2;
        this.dispatcherProvider = provider3;
    }

    public static GetLearnMoreUrlUseCase_Factory create(Provider<RemoteConfigRepository> provider, Provider<EndPointRepository> provider2, Provider<CoroutineDispatcher> provider3) {
        return new GetLearnMoreUrlUseCase_Factory(provider, provider2, provider3);
    }

    public static GetLearnMoreUrlUseCase newInstance(RemoteConfigRepository remoteConfigRepository, EndPointRepository endPointRepository, CoroutineDispatcher coroutineDispatcher) {
        return new GetLearnMoreUrlUseCase(remoteConfigRepository, endPointRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public GetLearnMoreUrlUseCase get() {
        return newInstance(this.remoteConfigRepositoryProvider.get(), this.endPointRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
