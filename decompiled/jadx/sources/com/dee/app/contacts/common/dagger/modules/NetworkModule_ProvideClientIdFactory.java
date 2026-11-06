package com.dee.app.contacts.common.dagger.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes6.dex */
public final class NetworkModule_ProvideClientIdFactory implements Factory<String> {
    private final NetworkModule module;

    public NetworkModule_ProvideClientIdFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvideClientIdFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvideClientIdFactory(networkModule);
    }

    public static String provideClientId(NetworkModule networkModule) {
        return (String) Preconditions.checkNotNullFromProvides(networkModule.provideClientId());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideClientId(this.module);
    }
}
