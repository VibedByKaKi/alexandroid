package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.MediaStreamsRepository;
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
public final class ToggleLocalVideoUseCase_Factory implements Factory<ToggleLocalVideoUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<MediaStreamsRepository> mediaStreamsRepositoryProvider;

    public ToggleLocalVideoUseCase_Factory(Provider<MediaStreamsRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.mediaStreamsRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static ToggleLocalVideoUseCase_Factory create(Provider<MediaStreamsRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new ToggleLocalVideoUseCase_Factory(provider, provider2);
    }

    public static ToggleLocalVideoUseCase newInstance(MediaStreamsRepository mediaStreamsRepository, CoroutineDispatcher coroutineDispatcher) {
        return new ToggleLocalVideoUseCase(mediaStreamsRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public ToggleLocalVideoUseCase get() {
        return newInstance(this.mediaStreamsRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
