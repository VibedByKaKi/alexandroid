package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.preload.attribution.PreloadAttributionManager;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.dee.app.ui.preload.PreloadAttributionUIManager;
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
public final class PreloadAttributionModule_ProvidePreloadAttributionUIManagerFactory implements Factory<PreloadAttributionUIManager> {
    private final Provider<PreloadAttributionManager> attributionManagerProvider;
    private final Provider<Context> contextProvider;
    private final PreloadAttributionModule module;
    private final Provider<RoutingService> routingServiceProvider;

    public PreloadAttributionModule_ProvidePreloadAttributionUIManagerFactory(PreloadAttributionModule preloadAttributionModule, Provider<Context> provider, Provider<RoutingService> provider2, Provider<PreloadAttributionManager> provider3) {
        this.module = preloadAttributionModule;
        this.contextProvider = provider;
        this.routingServiceProvider = provider2;
        this.attributionManagerProvider = provider3;
    }

    public static PreloadAttributionModule_ProvidePreloadAttributionUIManagerFactory create(PreloadAttributionModule preloadAttributionModule, Provider<Context> provider, Provider<RoutingService> provider2, Provider<PreloadAttributionManager> provider3) {
        return new PreloadAttributionModule_ProvidePreloadAttributionUIManagerFactory(preloadAttributionModule, provider, provider2, provider3);
    }

    public static PreloadAttributionUIManager providePreloadAttributionUIManager(PreloadAttributionModule preloadAttributionModule, Context context, RoutingService routingService, PreloadAttributionManager preloadAttributionManager) {
        return (PreloadAttributionUIManager) Preconditions.checkNotNullFromProvides(preloadAttributionModule.providePreloadAttributionUIManager(context, routingService, preloadAttributionManager));
    }

    @Override // javax.inject.Provider
    public PreloadAttributionUIManager get() {
        return providePreloadAttributionUIManager(this.module, this.contextProvider.get(), this.routingServiceProvider.get(), this.attributionManagerProvider.get());
    }
}
