package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.preload.attribution.PreloadAttributionManager;
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
public final class PreloadAttributionModule_ProvidePreloadAttributionManagerFactory implements Factory<PreloadAttributionManager> {
    private final Provider<Context> contextProvider;
    private final Provider<FeatureServiceV2> featureServiceV2Provider;
    private final PreloadAttributionModule module;

    public PreloadAttributionModule_ProvidePreloadAttributionManagerFactory(PreloadAttributionModule preloadAttributionModule, Provider<Context> provider, Provider<FeatureServiceV2> provider2) {
        this.module = preloadAttributionModule;
        this.contextProvider = provider;
        this.featureServiceV2Provider = provider2;
    }

    public static PreloadAttributionModule_ProvidePreloadAttributionManagerFactory create(PreloadAttributionModule preloadAttributionModule, Provider<Context> provider, Provider<FeatureServiceV2> provider2) {
        return new PreloadAttributionModule_ProvidePreloadAttributionManagerFactory(preloadAttributionModule, provider, provider2);
    }

    public static PreloadAttributionManager providePreloadAttributionManager(PreloadAttributionModule preloadAttributionModule, Context context, FeatureServiceV2 featureServiceV2) {
        return (PreloadAttributionManager) Preconditions.checkNotNullFromProvides(preloadAttributionModule.providePreloadAttributionManager(context, featureServiceV2));
    }

    @Override // javax.inject.Provider
    public PreloadAttributionManager get() {
        return providePreloadAttributionManager(this.module, this.contextProvider.get(), this.featureServiceV2Provider.get());
    }
}
