package com.amazon.alexa.client.alexaservice.ui.conversations;

import com.amazon.alexa.client.alexaservice.base.metrics.MetricsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ConversationsMetricsAuthority_Factory implements Factory<ConversationsMetricsAuthority> {
    private final Provider<MetricsService> metricsServiceProvider;

    public ConversationsMetricsAuthority_Factory(Provider<MetricsService> provider) {
        this.metricsServiceProvider = provider;
    }

    public static ConversationsMetricsAuthority_Factory create(Provider<MetricsService> provider) {
        return new ConversationsMetricsAuthority_Factory(provider);
    }

    public static ConversationsMetricsAuthority newInstance(MetricsService metricsService) {
        return new ConversationsMetricsAuthority(metricsService);
    }

    @Override // javax.inject.Provider
    public ConversationsMetricsAuthority get() {
        return newInstance(this.metricsServiceProvider.get());
    }
}
