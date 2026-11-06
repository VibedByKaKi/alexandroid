package com.amazon.alexa.voice.tta.permissions;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class PermissionsModule_ProvidesPermissionsUtilFactory implements Factory<PermissionsUtil> {
    private final PermissionsModule module;

    public PermissionsModule_ProvidesPermissionsUtilFactory(PermissionsModule permissionsModule) {
        this.module = permissionsModule;
    }

    public static PermissionsModule_ProvidesPermissionsUtilFactory create(PermissionsModule permissionsModule) {
        return new PermissionsModule_ProvidesPermissionsUtilFactory(permissionsModule);
    }

    public static PermissionsUtil providesPermissionsUtil(PermissionsModule permissionsModule) {
        return (PermissionsUtil) Preconditions.checkNotNullFromProvides(permissionsModule.providesPermissionsUtil());
    }

    @Override // javax.inject.Provider
    public PermissionsUtil get() {
        return providesPermissionsUtil(this.module);
    }
}
