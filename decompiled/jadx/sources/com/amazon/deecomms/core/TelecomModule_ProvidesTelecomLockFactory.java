package com.amazon.deecomms.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class TelecomModule_ProvidesTelecomLockFactory implements Factory<Object> {
    private final TelecomModule module;

    public TelecomModule_ProvidesTelecomLockFactory(TelecomModule telecomModule) {
        this.module = telecomModule;
    }

    public static TelecomModule_ProvidesTelecomLockFactory create(TelecomModule telecomModule) {
        return new TelecomModule_ProvidesTelecomLockFactory(telecomModule);
    }

    public static Object providesTelecomLock(TelecomModule telecomModule) {
        return Preconditions.checkNotNullFromProvides(telecomModule.providesTelecomLock());
    }

    @Override // javax.inject.Provider
    public Object get() {
        return providesTelecomLock(this.module);
    }
}
