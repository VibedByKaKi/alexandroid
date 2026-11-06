package com.amazon.alexa.client.alexaservice.features.offlineprompts;

import com.amazon.alexa.client.alexaservice.base.system.SettingsUpdateSentEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class OfflinePromptDownloadInitiator {
    private static final String TAG = "OfflinePromptDownloadInitiator";
    private final AlexaClientEventBus eventBus;
    private final OfflinePromptsDownloadManager offlinePromptsDownloadManager;

    @Inject
    public OfflinePromptDownloadInitiator(OfflinePromptsDownloadManager offlinePromptsDownloadManager, AlexaClientEventBus alexaClientEventBus) {
        this.offlinePromptsDownloadManager = offlinePromptsDownloadManager;
        this.eventBus = alexaClientEventBus;
    }

    public OfflinePromptsDownloadManager getManager() {
        return this.offlinePromptsDownloadManager;
    }

    public void initialize() {
        this.eventBus.register(this);
        this.offlinePromptsDownloadManager.init();
    }

    @Subscribe
    public void on(SettingsUpdateSentEvent settingsUpdateSentEvent) {
        if (settingsUpdateSentEvent.getSettingsUpdateType().equals(SettingsUpdateSentEvent.SettingsUpdateType.LOCALE) && settingsUpdateSentEvent.isSuccessful()) {
            this.offlinePromptsDownloadManager.init();
        }
    }

    public void teardown() {
        this.offlinePromptsDownloadManager.release();
        this.eventBus.unregister(this);
    }
}
