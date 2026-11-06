package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.CallStateRepository;
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
public final class UpdateCallStateListenerUseCase_Factory implements Factory<UpdateCallStateListenerUseCase> {
    private final Provider<CallStateRepository> callStateRepositoryProvider;
    private final Provider<CoroutineDispatcher> dispatcherProvider;

    public UpdateCallStateListenerUseCase_Factory(Provider<CallStateRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.callStateRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static UpdateCallStateListenerUseCase_Factory create(Provider<CallStateRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new UpdateCallStateListenerUseCase_Factory(provider, provider2);
    }

    public static UpdateCallStateListenerUseCase newInstance(CallStateRepository callStateRepository, CoroutineDispatcher coroutineDispatcher) {
        return new UpdateCallStateListenerUseCase(callStateRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public UpdateCallStateListenerUseCase get() {
        return newInstance(this.callStateRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
