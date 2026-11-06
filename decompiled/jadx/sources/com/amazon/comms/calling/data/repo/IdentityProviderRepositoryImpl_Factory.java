package com.amazon.comms.calling.data.repo;

import com.amazon.comms.calling.foundation.features.providers.IdentityServiceProvider;
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
public final class IdentityProviderRepositoryImpl_Factory implements Factory<IdentityProviderRepositoryImpl> {
    private final Provider<IdentityServiceProvider> identityServiceProvider;

    public IdentityProviderRepositoryImpl_Factory(Provider<IdentityServiceProvider> provider) {
        this.identityServiceProvider = provider;
    }

    public static IdentityProviderRepositoryImpl_Factory create(Provider<IdentityServiceProvider> provider) {
        return new IdentityProviderRepositoryImpl_Factory(provider);
    }

    public static IdentityProviderRepositoryImpl newInstance(IdentityServiceProvider identityServiceProvider) {
        return new IdentityProviderRepositoryImpl(identityServiceProvider);
    }

    @Override // javax.inject.Provider
    public IdentityProviderRepositoryImpl get() {
        return newInstance(this.identityServiceProvider.get());
    }
}
