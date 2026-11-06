package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.CallInfoRepository;
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
public final class UpdateBeginCallUseCase_Factory implements Factory<UpdateBeginCallUseCase> {
    private final Provider<CallInfoRepository> callInfoRepositoryProvider;
    private final Provider<CoroutineDispatcher> dispatcherProvider;

    public UpdateBeginCallUseCase_Factory(Provider<CallInfoRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.callInfoRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static UpdateBeginCallUseCase_Factory create(Provider<CallInfoRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new UpdateBeginCallUseCase_Factory(provider, provider2);
    }

    public static UpdateBeginCallUseCase newInstance(CallInfoRepository callInfoRepository, CoroutineDispatcher coroutineDispatcher) {
        return new UpdateBeginCallUseCase(callInfoRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public UpdateBeginCallUseCase get() {
        return newInstance(this.callInfoRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
