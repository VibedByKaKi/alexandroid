package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.services.header.HeaderCacheService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class HeaderModule_ProvideHeaderCacheServiceFactory implements Factory<HeaderCacheService> {
    private final HeaderModule module;

    public HeaderModule_ProvideHeaderCacheServiceFactory(HeaderModule headerModule) {
        this.module = headerModule;
    }

    public static HeaderModule_ProvideHeaderCacheServiceFactory create(HeaderModule headerModule) {
        return new HeaderModule_ProvideHeaderCacheServiceFactory(headerModule);
    }

    public static HeaderCacheService provideHeaderCacheService(HeaderModule headerModule) {
        return (HeaderCacheService) Preconditions.checkNotNullFromProvides(headerModule.provideHeaderCacheService());
    }

    @Override // javax.inject.Provider
    public HeaderCacheService get() {
        return provideHeaderCacheService(this.module);
    }
}
