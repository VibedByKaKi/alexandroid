package com.amazon.alexa.client.alexaservice.features.offlineprompts;

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
public final class OfflinePromptDownloadInitiator_Factory implements Factory<OfflinePromptDownloadInitiator> {
    private final Provider<AlexaClientEventBus> alexaClientEventBusProvider;
    private final Provider<OfflinePromptsDownloadManager> offlinePromptsDownloadManagerProvider;

    public OfflinePromptDownloadInitiator_Factory(Provider<OfflinePromptsDownloadManager> provider, Provider<AlexaClientEventBus> provider2) {
        this.offlinePromptsDownloadManagerProvider = provider;
        this.alexaClientEventBusProvider = provider2;
    }

    public static OfflinePromptDownloadInitiator_Factory create(Provider<OfflinePromptsDownloadManager> provider, Provider<AlexaClientEventBus> provider2) {
        return new OfflinePromptDownloadInitiator_Factory(provider, provider2);
    }

    public static OfflinePromptDownloadInitiator newInstance(OfflinePromptsDownloadManager offlinePromptsDownloadManager, AlexaClientEventBus alexaClientEventBus) {
        return new OfflinePromptDownloadInitiator(offlinePromptsDownloadManager, alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public OfflinePromptDownloadInitiator get() {
        return newInstance(this.offlinePromptsDownloadManagerProvider.get(), this.alexaClientEventBusProvider.get());
    }
}
