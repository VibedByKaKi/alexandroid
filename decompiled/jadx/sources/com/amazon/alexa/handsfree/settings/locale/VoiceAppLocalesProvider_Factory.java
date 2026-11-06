package com.amazon.alexa.handsfree.settings.locale;

import android.content.Context;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class VoiceAppLocalesProvider_Factory implements Factory<VoiceAppLocalesProvider> {
    private final Provider<Context> contextProvider;
    private final Provider<MetricsBuilderProvider> metricsBuilderProvider;

    public VoiceAppLocalesProvider_Factory(Provider<Context> provider, Provider<MetricsBuilderProvider> provider2) {
        this.contextProvider = provider;
        this.metricsBuilderProvider = provider2;
    }

    public static VoiceAppLocalesProvider_Factory create(Provider<Context> provider, Provider<MetricsBuilderProvider> provider2) {
        return new VoiceAppLocalesProvider_Factory(provider, provider2);
    }

    public static VoiceAppLocalesProvider newInstance(Context context, MetricsBuilderProvider metricsBuilderProvider) {
        return new VoiceAppLocalesProvider(context, metricsBuilderProvider);
    }

    @Override // javax.inject.Provider
    public VoiceAppLocalesProvider get() {
        return newInstance(this.contextProvider.get(), this.metricsBuilderProvider.get());
    }
}
