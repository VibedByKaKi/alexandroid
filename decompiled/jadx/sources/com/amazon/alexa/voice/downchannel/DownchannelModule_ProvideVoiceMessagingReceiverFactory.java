package com.amazon.alexa.voice.downchannel;

import com.amazon.alexa.protocols.messaging.MessagingReceiver;
import com.amazon.alexa.voice.metrics.service.MetricsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class DownchannelModule_ProvideVoiceMessagingReceiverFactory implements Factory<MessagingReceiver> {
    private final Provider<DownchannelController> downchannelControllerProvider;
    private final Provider<MetricsService> metricsServiceProvider;

    public DownchannelModule_ProvideVoiceMessagingReceiverFactory(Provider<DownchannelController> provider, Provider<MetricsService> provider2) {
        this.downchannelControllerProvider = provider;
        this.metricsServiceProvider = provider2;
    }

    public static DownchannelModule_ProvideVoiceMessagingReceiverFactory create(Provider<DownchannelController> provider, Provider<MetricsService> provider2) {
        return new DownchannelModule_ProvideVoiceMessagingReceiverFactory(provider, provider2);
    }

    public static MessagingReceiver provideVoiceMessagingReceiver(Object obj, MetricsService metricsService) {
        return (MessagingReceiver) Preconditions.checkNotNullFromProvides(DownchannelModule.provideVoiceMessagingReceiver((DownchannelController) obj, metricsService));
    }

    @Override // javax.inject.Provider
    public MessagingReceiver get() {
        return provideVoiceMessagingReceiver(this.downchannelControllerProvider.get(), this.metricsServiceProvider.get());
    }
}
