package com.amazon.comms.calling.domain.usecase.audio;

import com.amazon.comms.calling.domain.repo.AudioManagementRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.amazon.comms.calling.dependency.IoDispatcher"})
/* loaded from: classes20.dex */
public final class GetSupportedAudioRoutesUseCase_Factory implements Factory<GetSupportedAudioRoutesUseCase> {
    private final Provider<AudioManagementRepository> audioManagementRepositoryProvider;
    private final Provider<CoroutineDispatcher> dispatcherProvider;

    public GetSupportedAudioRoutesUseCase_Factory(Provider<AudioManagementRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.audioManagementRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static GetSupportedAudioRoutesUseCase_Factory create(Provider<AudioManagementRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new GetSupportedAudioRoutesUseCase_Factory(provider, provider2);
    }

    public static GetSupportedAudioRoutesUseCase newInstance(AudioManagementRepository audioManagementRepository, CoroutineDispatcher coroutineDispatcher) {
        return new GetSupportedAudioRoutesUseCase(audioManagementRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public GetSupportedAudioRoutesUseCase get() {
        return newInstance(this.audioManagementRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
