package com.amazon.alexa.client.alexaservice.base.application.permissions;

import com.amazon.alexa.client.core.configuration.ClientConfiguration;
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
/* loaded from: classes17.dex */
public final class PermissionsModule_ProvidesPermissionCheckerFactory implements Factory<PermissionsChecker> {
    private final Provider<ClientConfiguration> clientConfigurationProvider;
    private final PermissionsModule module;

    public PermissionsModule_ProvidesPermissionCheckerFactory(PermissionsModule permissionsModule, Provider<ClientConfiguration> provider) {
        this.module = permissionsModule;
        this.clientConfigurationProvider = provider;
    }

    public static PermissionsModule_ProvidesPermissionCheckerFactory create(PermissionsModule permissionsModule, Provider<ClientConfiguration> provider) {
        return new PermissionsModule_ProvidesPermissionCheckerFactory(permissionsModule, provider);
    }

    public static PermissionsChecker providesPermissionChecker(PermissionsModule permissionsModule, ClientConfiguration clientConfiguration) {
        return (PermissionsChecker) Preconditions.checkNotNullFromProvides(permissionsModule.providesPermissionChecker(clientConfiguration));
    }

    @Override // javax.inject.Provider
    public PermissionsChecker get() {
        return providesPermissionChecker(this.module, this.clientConfigurationProvider.get());
    }
}
