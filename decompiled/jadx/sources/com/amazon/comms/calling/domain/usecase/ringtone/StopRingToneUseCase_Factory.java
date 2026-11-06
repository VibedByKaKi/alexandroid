package com.amazon.comms.calling.domain.usecase.ringtone;

import com.amazon.comms.calling.domain.repo.RingtoneRepository;
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
public final class StopRingToneUseCase_Factory implements Factory<StopRingToneUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<RingtoneRepository> ringtoneRepositoryProvider;

    public StopRingToneUseCase_Factory(Provider<RingtoneRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.ringtoneRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static StopRingToneUseCase_Factory create(Provider<RingtoneRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new StopRingToneUseCase_Factory(provider, provider2);
    }

    public static StopRingToneUseCase newInstance(RingtoneRepository ringtoneRepository, CoroutineDispatcher coroutineDispatcher) {
        return new StopRingToneUseCase(ringtoneRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public StopRingToneUseCase get() {
        return newInstance(this.ringtoneRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
