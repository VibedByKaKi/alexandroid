package com.dee.app.contacts.common.dagger.modules;

import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import com.amazon.commscore.api.remoteconfiguration.AlexaCommsCoreRemoteConfigurationService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes6.dex */
public final class NetworkModule_ProvideACMSHostFactory implements Factory<String> {
    private final Provider<AlexaCommsCoreIdentityService> identityServiceProvider;
    private final NetworkModule module;
    private final Provider<AlexaCommsCoreRemoteConfigurationService> remoteConfigurationServiceProvider;

    public NetworkModule_ProvideACMSHostFactory(NetworkModule networkModule, Provider<AlexaCommsCoreRemoteConfigurationService> provider, Provider<AlexaCommsCoreIdentityService> provider2) {
        this.module = networkModule;
        this.remoteConfigurationServiceProvider = provider;
        this.identityServiceProvider = provider2;
    }

    public static NetworkModule_ProvideACMSHostFactory create(NetworkModule networkModule, Provider<AlexaCommsCoreRemoteConfigurationService> provider, Provider<AlexaCommsCoreIdentityService> provider2) {
        return new NetworkModule_ProvideACMSHostFactory(networkModule, provider, provider2);
    }

    public static String provideACMSHost(NetworkModule networkModule, AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService, AlexaCommsCoreIdentityService alexaCommsCoreIdentityService) {
        return (String) Preconditions.checkNotNullFromProvides(networkModule.provideACMSHost(alexaCommsCoreRemoteConfigurationService, alexaCommsCoreIdentityService));
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideACMSHost(this.module, this.remoteConfigurationServiceProvider.get(), this.identityServiceProvider.get());
    }
}
