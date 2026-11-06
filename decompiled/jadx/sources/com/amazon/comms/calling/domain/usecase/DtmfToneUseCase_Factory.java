package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.DtmfRepository;
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
public final class DtmfToneUseCase_Factory implements Factory<DtmfToneUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<DtmfRepository> dtmfRepositoryProvider;

    public DtmfToneUseCase_Factory(Provider<CoroutineDispatcher> provider, Provider<DtmfRepository> provider2) {
        this.dispatcherProvider = provider;
        this.dtmfRepositoryProvider = provider2;
    }

    public static DtmfToneUseCase_Factory create(Provider<CoroutineDispatcher> provider, Provider<DtmfRepository> provider2) {
        return new DtmfToneUseCase_Factory(provider, provider2);
    }

    public static DtmfToneUseCase newInstance(CoroutineDispatcher coroutineDispatcher, DtmfRepository dtmfRepository) {
        return new DtmfToneUseCase(coroutineDispatcher, dtmfRepository);
    }

    @Override // javax.inject.Provider
    public DtmfToneUseCase get() {
        return newInstance(this.dispatcherProvider.get(), this.dtmfRepositoryProvider.get());
    }
}
