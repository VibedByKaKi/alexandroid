package com.dee.app.contacts.common.dagger.modules;

import androidx.annotation.Nullable;
import com.amazon.commscore.api.remoteconfiguration.AlexaCommsCoreRemoteConfigurationService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class CommsCoreModule_ProvideAlexaCommsCoreRemoteConfigurationServiceFactory implements Factory<AlexaCommsCoreRemoteConfigurationService> {
    private final CommsCoreModule module;

    public CommsCoreModule_ProvideAlexaCommsCoreRemoteConfigurationServiceFactory(CommsCoreModule commsCoreModule) {
        this.module = commsCoreModule;
    }

    public static CommsCoreModule_ProvideAlexaCommsCoreRemoteConfigurationServiceFactory create(CommsCoreModule commsCoreModule) {
        return new CommsCoreModule_ProvideAlexaCommsCoreRemoteConfigurationServiceFactory(commsCoreModule);
    }

    @Nullable
    public static AlexaCommsCoreRemoteConfigurationService provideAlexaCommsCoreRemoteConfigurationService(CommsCoreModule commsCoreModule) {
        return commsCoreModule.provideAlexaCommsCoreRemoteConfigurationService();
    }

    @Override // javax.inject.Provider
    @Nullable
    public AlexaCommsCoreRemoteConfigurationService get() {
        return provideAlexaCommsCoreRemoteConfigurationService(this.module);
    }
}
