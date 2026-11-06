package com.amazon.comms.calling.domain.usecase.sepia;

import com.amazon.comms.calling.domain.repo.sepia.SepiaRepository;
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
public final class GetEffectsEventFlowUseCase_Factory implements Factory<GetEffectsEventFlowUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<SepiaRepository> sepiaRepositoryProvider;

    public GetEffectsEventFlowUseCase_Factory(Provider<SepiaRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.sepiaRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static GetEffectsEventFlowUseCase_Factory create(Provider<SepiaRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new GetEffectsEventFlowUseCase_Factory(provider, provider2);
    }

    public static GetEffectsEventFlowUseCase newInstance(SepiaRepository sepiaRepository, CoroutineDispatcher coroutineDispatcher) {
        return new GetEffectsEventFlowUseCase(sepiaRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public GetEffectsEventFlowUseCase get() {
        return newInstance(this.sepiaRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
