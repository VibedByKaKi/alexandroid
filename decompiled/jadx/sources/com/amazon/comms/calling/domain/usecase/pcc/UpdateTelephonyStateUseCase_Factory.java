package com.amazon.comms.calling.domain.usecase.pcc;

import com.amazon.comms.calling.domain.repo.TelephonyRepository;
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
public final class UpdateTelephonyStateUseCase_Factory implements Factory<UpdateTelephonyStateUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<TelephonyRepository> telephonyRepositoryProvider;

    public UpdateTelephonyStateUseCase_Factory(Provider<TelephonyRepository> provider, Provider<CoroutineDispatcher> provider2) {
        this.telephonyRepositoryProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static UpdateTelephonyStateUseCase_Factory create(Provider<TelephonyRepository> provider, Provider<CoroutineDispatcher> provider2) {
        return new UpdateTelephonyStateUseCase_Factory(provider, provider2);
    }

    public static UpdateTelephonyStateUseCase newInstance(TelephonyRepository telephonyRepository, CoroutineDispatcher coroutineDispatcher) {
        return new UpdateTelephonyStateUseCase(telephonyRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public UpdateTelephonyStateUseCase get() {
        return newInstance(this.telephonyRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
