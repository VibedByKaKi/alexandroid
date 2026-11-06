package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MediaSuppressionMetricListener_Factory implements Factory<MediaSuppressionMetricListener> {
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public MediaSuppressionMetricListener_Factory(Provider<AlexaClientEventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static MediaSuppressionMetricListener_Factory create(Provider<AlexaClientEventBus> provider) {
        return new MediaSuppressionMetricListener_Factory(provider);
    }

    public static MediaSuppressionMetricListener newInstance(AlexaClientEventBus alexaClientEventBus) {
        return new MediaSuppressionMetricListener(alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public MediaSuppressionMetricListener get() {
        return newInstance(this.eventBusProvider.get());
    }
}
