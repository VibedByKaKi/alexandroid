package com.amazon.deecomms.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Queue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class TelecomModule_ProvidesTelecomCallIdsFactory implements Factory<Queue<String>> {
    private final TelecomModule module;

    public TelecomModule_ProvidesTelecomCallIdsFactory(TelecomModule telecomModule) {
        this.module = telecomModule;
    }

    public static TelecomModule_ProvidesTelecomCallIdsFactory create(TelecomModule telecomModule) {
        return new TelecomModule_ProvidesTelecomCallIdsFactory(telecomModule);
    }

    public static Queue<String> providesTelecomCallIds(TelecomModule telecomModule) {
        return (Queue) Preconditions.checkNotNullFromProvides(telecomModule.providesTelecomCallIds());
    }

    @Override // javax.inject.Provider
    public Queue<String> get() {
        return providesTelecomCallIds(this.module);
    }
}
