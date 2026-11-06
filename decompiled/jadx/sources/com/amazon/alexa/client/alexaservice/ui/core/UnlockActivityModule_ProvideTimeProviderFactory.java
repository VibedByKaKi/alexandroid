package com.amazon.alexa.client.alexaservice.ui.core;

import com.amazon.alexa.utils.TimeProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class UnlockActivityModule_ProvideTimeProviderFactory implements Factory<TimeProvider> {
    private final UnlockActivityModule module;

    public UnlockActivityModule_ProvideTimeProviderFactory(UnlockActivityModule unlockActivityModule) {
        this.module = unlockActivityModule;
    }

    public static UnlockActivityModule_ProvideTimeProviderFactory create(UnlockActivityModule unlockActivityModule) {
        return new UnlockActivityModule_ProvideTimeProviderFactory(unlockActivityModule);
    }

    public static TimeProvider provideTimeProvider(UnlockActivityModule unlockActivityModule) {
        return (TimeProvider) Preconditions.checkNotNullFromProvides(unlockActivityModule.provideTimeProvider());
    }

    @Override // javax.inject.Provider
    public TimeProvider get() {
        return provideTimeProvider(this.module);
    }
}
