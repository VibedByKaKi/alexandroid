package com.amazon.comms.calling.data.repo;

import com.amazon.comms.calling.data.network.CallHistoryProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CallHistoryRepositoryImpl_Factory implements Factory<CallHistoryRepositoryImpl> {
    private final Provider<CallHistoryProvider> callHistoryProvider;

    public CallHistoryRepositoryImpl_Factory(Provider<CallHistoryProvider> provider) {
        this.callHistoryProvider = provider;
    }

    public static CallHistoryRepositoryImpl_Factory create(Provider<CallHistoryProvider> provider) {
        return new CallHistoryRepositoryImpl_Factory(provider);
    }

    public static CallHistoryRepositoryImpl newInstance(CallHistoryProvider callHistoryProvider) {
        return new CallHistoryRepositoryImpl(callHistoryProvider);
    }

    @Override // javax.inject.Provider
    public CallHistoryRepositoryImpl get() {
        return newInstance(this.callHistoryProvider.get());
    }
}
