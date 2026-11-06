package com.amazon.comms.calling.domain.usecase;

import android.content.Context;
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
public final class HideIncomingCallNotificationUseCase_Factory implements Factory<HideIncomingCallNotificationUseCase> {
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineDispatcher> dispatcherProvider;

    public HideIncomingCallNotificationUseCase_Factory(Provider<Context> provider, Provider<CoroutineDispatcher> provider2) {
        this.contextProvider = provider;
        this.dispatcherProvider = provider2;
    }

    public static HideIncomingCallNotificationUseCase_Factory create(Provider<Context> provider, Provider<CoroutineDispatcher> provider2) {
        return new HideIncomingCallNotificationUseCase_Factory(provider, provider2);
    }

    public static HideIncomingCallNotificationUseCase newInstance(Context context, CoroutineDispatcher coroutineDispatcher) {
        return new HideIncomingCallNotificationUseCase(context, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public HideIncomingCallNotificationUseCase get() {
        return newInstance(this.contextProvider.get(), this.dispatcherProvider.get());
    }
}
