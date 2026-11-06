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
public final class UserInfoRepositoryImpl_Factory implements Factory<UserInfoRepositoryImpl> {
    private final Provider<IdentityServiceProvider> identityProvider;

    public UserInfoRepositoryImpl_Factory(Provider<IdentityServiceProvider> provider) {
        this.identityProvider = provider;
    }

    public static UserInfoRepositoryImpl_Factory create(Provider<IdentityServiceProvider> provider) {
        return new UserInfoRepositoryImpl_Factory(provider);
    }

    public static UserInfoRepositoryImpl newInstance(IdentityServiceProvider identityServiceProvider) {
        return new UserInfoRepositoryImpl(identityServiceProvider);
    }

    @Override // javax.inject.Provider
    public UserInfoRepositoryImpl get() {
        return newInstance(this.identityProvider.get());
    }
}
