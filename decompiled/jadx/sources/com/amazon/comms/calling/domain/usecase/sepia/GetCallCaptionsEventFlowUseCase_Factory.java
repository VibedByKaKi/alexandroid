package com.amazon.comms.calling.domain.usecase.sepia;

import com.amazon.comms.calling.domain.repo.sepia.CallCaptioningRepository;
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
public final class GetCallCaptionsEventFlowUseCase_Factory implements Factory<GetCallCaptionsEventFlowUseCase> {
    private final Provider<CallCaptioningRepository> callCaptioningRepositoryProvider;
    private final Provider<CoroutineDispatcher> dispatcherProvider;

    public GetCallCaptionsEventFlowUseCase_Factory(Provider<CallCaptioningRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.callCaptioningRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static GetCallCaptionsEventFlowUseCase_Factory create(Provider<CallCaptioningRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new GetCallCaptionsEventFlowUseCase_Factory(provider, provider2);
    }

    public static GetCallCaptionsEventFlowUseCase newInstance(CallCaptioningRepository callCaptioningRepository, CoroutineDispatcher coroutineDispatcher) {
        return new GetCallCaptionsEventFlowUseCase(callCaptioningRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public GetCallCaptionsEventFlowUseCase get() {
        return newInstance(this.callCaptioningRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
