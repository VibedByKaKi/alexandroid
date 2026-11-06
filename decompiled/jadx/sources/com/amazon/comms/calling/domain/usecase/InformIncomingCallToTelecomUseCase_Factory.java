package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.TelecomRepository;
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
public final class InformIncomingCallToTelecomUseCase_Factory implements Factory<InformIncomingCallToTelecomUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<TelecomRepository> telecomRepositoryProvider;

    public InformIncomingCallToTelecomUseCase_Factory(Provider<TelecomRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.telecomRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static InformIncomingCallToTelecomUseCase_Factory create(Provider<TelecomRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new InformIncomingCallToTelecomUseCase_Factory(provider, provider2);
    }

    public static InformIncomingCallToTelecomUseCase newInstance(TelecomRepository telecomRepository, CoroutineDispatcher coroutineDispatcher) {
        return new InformIncomingCallToTelecomUseCase(telecomRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public InformIncomingCallToTelecomUseCase get() {
        return newInstance(this.telecomRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
