package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.CallHistoryRepository;
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
public final class GetCallHistoryUseCase_Factory implements Factory<GetCallHistoryUseCase> {
    private final Provider<CallHistoryRepository> callHistoryRepositoryProvider;
    private final Provider<CoroutineDispatcher> dispatcherProvider;

    public GetCallHistoryUseCase_Factory(Provider<CallHistoryRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.callHistoryRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static GetCallHistoryUseCase_Factory create(Provider<CallHistoryRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new GetCallHistoryUseCase_Factory(provider, provider2);
    }

    public static GetCallHistoryUseCase newInstance(CallHistoryRepository callHistoryRepository, CoroutineDispatcher coroutineDispatcher) {
        return new GetCallHistoryUseCase(callHistoryRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public GetCallHistoryUseCase get() {
        return newInstance(this.callHistoryRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
