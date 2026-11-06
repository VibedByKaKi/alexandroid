package com.amazon.comms.calling.dependency;

import androidx.annotation.Nullable;
import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import com.amazon.commscore.api.identity.CommsCoreIdentity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CommsCoreModule_ProvidesIdentityFactory implements Factory<CommsCoreIdentity> {
    private final Provider<AlexaCommsCoreIdentityService> identityServiceProvider;
    private final CommsCoreModule module;

    public CommsCoreModule_ProvidesIdentityFactory(CommsCoreModule commsCoreModule, Provider<AlexaCommsCoreIdentityService> provider) {
        this.module = commsCoreModule;
        this.identityServiceProvider = provider;
    }

    public static CommsCoreModule_ProvidesIdentityFactory create(CommsCoreModule commsCoreModule, Provider<AlexaCommsCoreIdentityService> provider) {
        return new CommsCoreModule_ProvidesIdentityFactory(commsCoreModule, provider);
    }

    @Nullable
    public static CommsCoreIdentity providesIdentity(CommsCoreModule commsCoreModule, AlexaCommsCoreIdentityService alexaCommsCoreIdentityService) {
        return commsCoreModule.providesIdentity(alexaCommsCoreIdentityService);
    }

    @Override // javax.inject.Provider
    @Nullable
    public CommsCoreIdentity get() {
        return providesIdentity(this.module, this.identityServiceProvider.get());
    }
}
