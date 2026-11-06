package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.InCallExperienceRepository;
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
public final class GetInCallExperienceUseCase_Factory implements Factory<GetInCallExperienceUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<InCallExperienceRepository> inCallExperienceRepositoryProvider;

    public GetInCallExperienceUseCase_Factory(Provider<InCallExperienceRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.inCallExperienceRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static GetInCallExperienceUseCase_Factory create(Provider<InCallExperienceRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new GetInCallExperienceUseCase_Factory(provider, provider2);
    }

    public static GetInCallExperienceUseCase newInstance(InCallExperienceRepository inCallExperienceRepository, CoroutineDispatcher coroutineDispatcher) {
        return new GetInCallExperienceUseCase(inCallExperienceRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public GetInCallExperienceUseCase get() {
        return newInstance(this.inCallExperienceRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
