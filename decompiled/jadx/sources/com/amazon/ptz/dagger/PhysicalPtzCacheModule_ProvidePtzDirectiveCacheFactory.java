package com.amazon.ptz.dagger;

import com.amazon.alexa.directive.AlexaDirective;
import com.google.common.cache.Cache;
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
public final class PhysicalPtzCacheModule_ProvidePtzDirectiveCacheFactory implements Factory<Cache<String, AlexaDirective>> {
    private final PhysicalPtzCacheModule module;

    public PhysicalPtzCacheModule_ProvidePtzDirectiveCacheFactory(PhysicalPtzCacheModule physicalPtzCacheModule) {
        this.module = physicalPtzCacheModule;
    }

    public static PhysicalPtzCacheModule_ProvidePtzDirectiveCacheFactory create(PhysicalPtzCacheModule physicalPtzCacheModule) {
        return new PhysicalPtzCacheModule_ProvidePtzDirectiveCacheFactory(physicalPtzCacheModule);
    }

    public static Cache<String, AlexaDirective> providePtzDirectiveCache(PhysicalPtzCacheModule physicalPtzCacheModule) {
        return (Cache) Preconditions.checkNotNullFromProvides(physicalPtzCacheModule.providePtzDirectiveCache());
    }

    @Override // javax.inject.Provider
    public Cache<String, AlexaDirective> get() {
        return providePtzDirectiveCache(this.module);
    }
}
