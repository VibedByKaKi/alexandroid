package com.amazon.commscore.commsidentity.repo.mapper;

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
public final class IdentityV2Mapper_Factory implements Factory<IdentityV2Mapper> {
    private final Provider<NameMapper> nameMapperProvider;

    public IdentityV2Mapper_Factory(Provider<NameMapper> provider) {
        this.nameMapperProvider = provider;
    }

    public static IdentityV2Mapper_Factory create(Provider<NameMapper> provider) {
        return new IdentityV2Mapper_Factory(provider);
    }

    public static IdentityV2Mapper newInstance(NameMapper nameMapper) {
        return new IdentityV2Mapper(nameMapper);
    }

    @Override // javax.inject.Provider
    public IdentityV2Mapper get() {
        return newInstance(this.nameMapperProvider.get());
    }
}
