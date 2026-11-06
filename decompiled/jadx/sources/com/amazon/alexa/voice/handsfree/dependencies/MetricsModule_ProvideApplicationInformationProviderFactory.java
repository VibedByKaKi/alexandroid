package com.amazon.alexa.voice.handsfree.dependencies;

import android.content.Context;
import com.amazon.alexa.handsfree.protocols.utils.ApplicationInformationProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class MetricsModule_ProvideApplicationInformationProviderFactory implements Factory<ApplicationInformationProvider> {
    private final Provider<Context> contextProvider;
    private final MetricsModule module;

    public MetricsModule_ProvideApplicationInformationProviderFactory(MetricsModule metricsModule, Provider<Context> provider) {
        this.module = metricsModule;
        this.contextProvider = provider;
    }

    public static MetricsModule_ProvideApplicationInformationProviderFactory create(MetricsModule metricsModule, Provider<Context> provider) {
        return new MetricsModule_ProvideApplicationInformationProviderFactory(metricsModule, provider);
    }

    public static ApplicationInformationProvider provideApplicationInformationProvider(MetricsModule metricsModule, Context context) {
        return (ApplicationInformationProvider) Preconditions.checkNotNull(metricsModule.provideApplicationInformationProvider(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ApplicationInformationProvider get() {
        return provideApplicationInformationProvider(this.module, this.contextProvider.get());
    }
}
