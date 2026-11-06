package com.dee.app.contacts.common.dagger.modules;

import androidx.annotation.Nullable;
import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class CommsCoreModule_ProvideAlexaCommsCoreIdentityServiceFactory implements Factory<AlexaCommsCoreIdentityService> {
    private final CommsCoreModule module;

    public CommsCoreModule_ProvideAlexaCommsCoreIdentityServiceFactory(CommsCoreModule commsCoreModule) {
        this.module = commsCoreModule;
    }

    public static CommsCoreModule_ProvideAlexaCommsCoreIdentityServiceFactory create(CommsCoreModule commsCoreModule) {
        return new CommsCoreModule_ProvideAlexaCommsCoreIdentityServiceFactory(commsCoreModule);
    }

    @Nullable
    public static AlexaCommsCoreIdentityService provideAlexaCommsCoreIdentityService(CommsCoreModule commsCoreModule) {
        return commsCoreModule.provideAlexaCommsCoreIdentityService();
    }

    @Override // javax.inject.Provider
    @Nullable
    public AlexaCommsCoreIdentityService get() {
        return provideAlexaCommsCoreIdentityService(this.module);
    }
}
