package com.amazon.comms.calling.domain.usecase.optin;

import com.amazon.comms.calling.domain.repo.CallStateRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CheckIfShouldShowOptInUseCase_Factory implements Factory<CheckIfShouldShowOptInUseCase> {
    private final Provider<CallStateRepository> callStateRepositoryProvider;

    public CheckIfShouldShowOptInUseCase_Factory(Provider<CallStateRepository> provider) {
        this.callStateRepositoryProvider = provider;
    }

    public static CheckIfShouldShowOptInUseCase_Factory create(Provider<CallStateRepository> provider) {
        return new CheckIfShouldShowOptInUseCase_Factory(provider);
    }

    public static CheckIfShouldShowOptInUseCase newInstance(CallStateRepository callStateRepository) {
        return new CheckIfShouldShowOptInUseCase(callStateRepository);
    }

    @Override // javax.inject.Provider
    public CheckIfShouldShowOptInUseCase get() {
        return newInstance(this.callStateRepositoryProvider.get());
    }
}
