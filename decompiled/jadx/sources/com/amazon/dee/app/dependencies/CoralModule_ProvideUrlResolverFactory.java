package com.amazon.dee.app.dependencies;

import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.dee.app.http.UrlResolver;
import dagger.internal.DaggerGenerated;
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
public final class CoralModule_ProvideUrlResolverFactory implements Factory<UrlResolver> {
    private final Provider<EnvironmentService> environmentServiceProvider;
    private final CoralModule module;

    public CoralModule_ProvideUrlResolverFactory(CoralModule coralModule, Provider<EnvironmentService> provider) {
        this.module = coralModule;
        this.environmentServiceProvider = provider;
    }

    public static CoralModule_ProvideUrlResolverFactory create(CoralModule coralModule, Provider<EnvironmentService> provider) {
        return new CoralModule_ProvideUrlResolverFactory(coralModule, provider);
    }

    public static UrlResolver provideUrlResolver(CoralModule coralModule, EnvironmentService environmentService) {
        return (UrlResolver) Preconditions.checkNotNullFromProvides(coralModule.provideUrlResolver(environmentService));
    }

    @Override // javax.inject.Provider
    public UrlResolver get() {
        return provideUrlResolver(this.module, this.environmentServiceProvider.get());
    }
}
