package com.amazon.comms.calling.data.repo;

import com.amazon.comms.calling.infrastructure.telecom.TelephonyProvider;
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
public final class TelephonyRepositoryImpl_Factory implements Factory<TelephonyRepositoryImpl> {
    private final Provider<TelephonyProvider> telephonyProvider;

    public TelephonyRepositoryImpl_Factory(Provider<TelephonyProvider> provider) {
        this.telephonyProvider = provider;
    }

    public static TelephonyRepositoryImpl_Factory create(Provider<TelephonyProvider> provider) {
        return new TelephonyRepositoryImpl_Factory(provider);
    }

    public static TelephonyRepositoryImpl newInstance(TelephonyProvider telephonyProvider) {
        return new TelephonyRepositoryImpl(telephonyProvider);
    }

    @Override // javax.inject.Provider
    public TelephonyRepositoryImpl get() {
        return newInstance(this.telephonyProvider.get());
    }
}
