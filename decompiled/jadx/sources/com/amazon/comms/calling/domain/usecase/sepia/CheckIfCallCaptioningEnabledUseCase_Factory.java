package com.amazon.comms.calling.domain.usecase.sepia;

import com.amazon.comms.calling.domain.repo.CallStateRepository;
import com.amazon.comms.calling.foundation.features.FeatureCheck;
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
public final class CheckIfCallCaptioningEnabledUseCase_Factory implements Factory<CheckIfCallCaptioningEnabledUseCase> {
    private final Provider<CallStateRepository> callStateRepositoryProvider;
    private final Provider<FeatureCheck> featureCheckProvider;

    public CheckIfCallCaptioningEnabledUseCase_Factory(Provider<CallStateRepository> provider, Provider<FeatureCheck> provider2) {
        this.callStateRepositoryProvider = provider;
        this.featureCheckProvider = provider2;
    }

    public static CheckIfCallCaptioningEnabledUseCase_Factory create(Provider<CallStateRepository> provider, Provider<FeatureCheck> provider2) {
        return new CheckIfCallCaptioningEnabledUseCase_Factory(provider, provider2);
    }

    public static CheckIfCallCaptioningEnabledUseCase newInstance(CallStateRepository callStateRepository, FeatureCheck featureCheck) {
        return new CheckIfCallCaptioningEnabledUseCase(callStateRepository, featureCheck);
    }

    @Override // javax.inject.Provider
    public CheckIfCallCaptioningEnabledUseCase get() {
        return newInstance(this.callStateRepositoryProvider.get(), this.featureCheckProvider.get());
    }
}
