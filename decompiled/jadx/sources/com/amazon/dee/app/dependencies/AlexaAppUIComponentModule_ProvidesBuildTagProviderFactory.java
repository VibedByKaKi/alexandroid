package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.services.security.CertificateReaderService;
import com.amazon.dee.app.ui.main.appcomponent.BuildTagProvider;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AlexaAppUIComponentModule_ProvidesBuildTagProviderFactory implements Factory<BuildTagProvider> {
    private final Provider<CertificateReaderService> certificateReaderServiceProvider;
    private final AlexaAppUIComponentModule module;

    public AlexaAppUIComponentModule_ProvidesBuildTagProviderFactory(AlexaAppUIComponentModule alexaAppUIComponentModule, Provider<CertificateReaderService> provider) {
        this.module = alexaAppUIComponentModule;
        this.certificateReaderServiceProvider = provider;
    }

    public static AlexaAppUIComponentModule_ProvidesBuildTagProviderFactory create(AlexaAppUIComponentModule alexaAppUIComponentModule, Provider<CertificateReaderService> provider) {
        return new AlexaAppUIComponentModule_ProvidesBuildTagProviderFactory(alexaAppUIComponentModule, provider);
    }

    public static BuildTagProvider providesBuildTagProvider(AlexaAppUIComponentModule alexaAppUIComponentModule, Lazy<CertificateReaderService> lazy) {
        return (BuildTagProvider) Preconditions.checkNotNullFromProvides(alexaAppUIComponentModule.providesBuildTagProvider(lazy));
    }

    @Override // javax.inject.Provider
    public BuildTagProvider get() {
        return providesBuildTagProvider(this.module, DoubleCheck.lazy(this.certificateReaderServiceProvider));
    }
}
