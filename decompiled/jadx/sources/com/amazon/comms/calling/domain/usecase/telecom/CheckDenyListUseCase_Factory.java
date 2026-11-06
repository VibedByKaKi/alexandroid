package com.amazon.comms.calling.domain.usecase.telecom;

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
public final class CheckDenyListUseCase_Factory implements Factory<CheckDenyListUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;

    public CheckDenyListUseCase_Factory(Provider<CoroutineDispatcher> provider) {
        this.dispatcherProvider = provider;
    }

    public static CheckDenyListUseCase_Factory create(Provider<CoroutineDispatcher> provider) {
        return new CheckDenyListUseCase_Factory(provider);
    }

    public static CheckDenyListUseCase newInstance(CoroutineDispatcher coroutineDispatcher) {
        return new CheckDenyListUseCase(coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public CheckDenyListUseCase get() {
        return newInstance(this.dispatcherProvider.get());
    }
}
