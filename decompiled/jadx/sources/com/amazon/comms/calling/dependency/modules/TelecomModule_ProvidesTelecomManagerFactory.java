package com.amazon.comms.calling.dependency.modules;

import android.content.Context;
import android.telecom.TelecomManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class TelecomModule_ProvidesTelecomManagerFactory implements Factory<TelecomManager> {
    private final Provider<Context> contextProvider;
    private final TelecomModule module;

    public TelecomModule_ProvidesTelecomManagerFactory(TelecomModule telecomModule, Provider<Context> provider) {
        this.module = telecomModule;
        this.contextProvider = provider;
    }

    public static TelecomModule_ProvidesTelecomManagerFactory create(TelecomModule telecomModule, Provider<Context> provider) {
        return new TelecomModule_ProvidesTelecomManagerFactory(telecomModule, provider);
    }

    public static TelecomManager providesTelecomManager(TelecomModule telecomModule, Context context) {
        return (TelecomManager) Preconditions.checkNotNullFromProvides(telecomModule.providesTelecomManager(context));
    }

    @Override // javax.inject.Provider
    public TelecomManager get() {
        return providesTelecomManager(this.module, this.contextProvider.get());
    }
}
