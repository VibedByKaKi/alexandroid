package com.amazon.comms.calling.domain.usecase.pcc;

import com.amazon.comms.calling.domain.repo.TelephonyRepository;
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
public final class ObserveTelephonyStateUseCase_Factory implements Factory<ObserveTelephonyStateUseCase> {
    private final Provider<TelephonyRepository> telephonyRepositoryProvider;

    public ObserveTelephonyStateUseCase_Factory(Provider<TelephonyRepository> provider) {
        this.telephonyRepositoryProvider = provider;
    }

    public static ObserveTelephonyStateUseCase_Factory create(Provider<TelephonyRepository> provider) {
        return new ObserveTelephonyStateUseCase_Factory(provider);
    }

    public static ObserveTelephonyStateUseCase newInstance(TelephonyRepository telephonyRepository) {
        return new ObserveTelephonyStateUseCase(telephonyRepository);
    }

    @Override // javax.inject.Provider
    public ObserveTelephonyStateUseCase get() {
        return newInstance(this.telephonyRepositoryProvider.get());
    }
}
