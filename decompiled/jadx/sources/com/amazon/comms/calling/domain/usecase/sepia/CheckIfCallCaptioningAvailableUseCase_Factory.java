package com.amazon.comms.calling.domain.usecase.sepia;

import com.amazon.comms.calling.domain.repo.sepia.CallCaptioningRepository;
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
public final class CheckIfCallCaptioningAvailableUseCase_Factory implements Factory<CheckIfCallCaptioningAvailableUseCase> {
    private final Provider<CallCaptioningRepository> callCaptioningRepositoryProvider;

    public CheckIfCallCaptioningAvailableUseCase_Factory(Provider<CallCaptioningRepository> provider) {
        this.callCaptioningRepositoryProvider = provider;
    }

    public static CheckIfCallCaptioningAvailableUseCase_Factory create(Provider<CallCaptioningRepository> provider) {
        return new CheckIfCallCaptioningAvailableUseCase_Factory(provider);
    }

    public static CheckIfCallCaptioningAvailableUseCase newInstance(CallCaptioningRepository callCaptioningRepository) {
        return new CheckIfCallCaptioningAvailableUseCase(callCaptioningRepository);
    }

    @Override // javax.inject.Provider
    public CheckIfCallCaptioningAvailableUseCase get() {
        return newInstance(this.callCaptioningRepositoryProvider.get());
    }
}
