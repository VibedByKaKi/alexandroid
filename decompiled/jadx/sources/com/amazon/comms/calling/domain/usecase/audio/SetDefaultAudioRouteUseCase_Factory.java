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
@QualifierMetadata({"com.amazon.comms.calling.dependency.DefaultDispatcher"})
/* loaded from: classes20.dex */
public final class SetDefaultAudioRouteUseCase_Factory implements Factory<SetDefaultAudioRouteUseCase> {
    private final Provider<AudioManagementRepository> audioManagementRepositoryProvider;
    private final Provider<CoroutineDispatcher> dispatcherProvider;

    public SetDefaultAudioRouteUseCase_Factory(Provider<AudioManagementRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.audioManagementRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static SetDefaultAudioRouteUseCase_Factory create(Provider<AudioManagementRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new SetDefaultAudioRouteUseCase_Factory(provider, provider2);
    }

    public static SetDefaultAudioRouteUseCase newInstance(AudioManagementRepository audioManagementRepository, CoroutineDispatcher coroutineDispatcher) {
        return new SetDefaultAudioRouteUseCase(audioManagementRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public SetDefaultAudioRouteUseCase get() {
        return newInstance(this.audioManagementRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
