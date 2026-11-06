package com.amazon.alexa.voice.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.api.compat.model.AlexaConnectingFailedReason;
import com.amazon.alexa.api.compat.model.AlexaConnectionListener;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService;
import com.amazon.alexa.voice.enablement.VoiceEnablement;
import com.amazon.alexa.voice.metrics.VoxMetricEvent;
import com.amazon.alexa.voice.metrics.VoxMetricEventName;
import com.amazon.alexa.voice.metrics.VoxMetricEventProcessingService;
import com.amazon.alexa.voice.ui.onedesign.util.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class DefaultAlexaConnectionManager implements AlexaConnectionManager {
    private final AppForegroundChecker appForegroundChecker;
    private final AlexaConnectionListener connectionListener = new AlexaConnectionListener() { // from class: com.amazon.alexa.voice.sdk.DefaultAlexaConnectionManager.1
        @Override // com.amazon.alexa.api.compat.model.AlexaConnectionListener
        public void onConnected() {
            Logger.debug("Connected to Alexa Service");
            DefaultAlexaConnectionManager.this.voxMetricEventProcessingService.process(VoxMetricEvent.occurNow(VoxMetricEventName.SDK_CONNECTION_ESTABLISHED));
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaConnectionListener
        public void onConnectingFailed(AlexaConnectingFailedReason alexaConnectingFailedReason, String str) {
            Logger.debug("Failed to connect to Alexa Service. Reason: " + alexaConnectingFailedReason + ". Message:" + str);
            if (AlexaConnectingFailedReason.UNAUTHORIZED.equals(alexaConnectingFailedReason)) {
                Logger.error("This app was signed incorrectly. Voice features will not work", null);
                DefaultAlexaConnectionManager.this.invalidSigningReporter.showToast("This app was signed incorrectly. Voice features will not work");
            }
            DefaultAlexaConnectionManager.this.voxMetricEventProcessingService.process(VoxMetricEvent.occurNow(VoxMetricEventName.SDK_CONNECTION_FAILED));
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaConnectionListener
        public void onDisconnected() {
            Logger.debug("Disconnected from Alexa Service");
            if (DefaultAlexaConnectionManager.this.appForegroundChecker.isAppInForeground()) {
                Logger.debug("Reconnecting to AlexaService because app is still in foreground");
                DefaultAlexaConnectionManager.this.connect();
            }
        }
    };
    private final AlexaMobileFrameworkApisV2 frameworkApis;
    private final InvalidSigningReporter invalidSigningReporter;
    private final VoiceEnablement voiceEnablement;
    private final VoxMetricEventProcessingService voxMetricEventProcessingService;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AppForegroundChecker implements ApplicationLifecycleObserver {
        private boolean isAppInForeground;

        public boolean isAppInForeground() {
            return this.isAppInForeground;
        }

        @Override // com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver
        public void onStart() {
            this.isAppInForeground = true;
        }

        @Override // com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver
        public void onStop() {
            this.isAppInForeground = false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface InvalidSigningReporter {
        void showToast(String str);
    }

    public DefaultAlexaConnectionManager(@NonNull InvalidSigningReporter invalidSigningReporter, @NonNull AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2, @NonNull ApplicationLifecycleService applicationLifecycleService, @NonNull VoiceEnablement voiceEnablement, @NonNull VoxMetricEventProcessingService voxMetricEventProcessingService) {
        this.frameworkApis = alexaMobileFrameworkApisV2;
        this.voiceEnablement = voiceEnablement;
        this.invalidSigningReporter = invalidSigningReporter;
        this.voxMetricEventProcessingService = voxMetricEventProcessingService;
        AppForegroundChecker appForegroundChecker = new AppForegroundChecker();
        this.appForegroundChecker = appForegroundChecker;
        applicationLifecycleService.addObserver(appForegroundChecker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connect() {
        if (!this.voiceEnablement.isVoicePossible()) {
            Logger.debug("Voice is not possible");
            return;
        }
        Logger.debug("try to connect to Alexa Service");
        this.frameworkApis.start();
        this.voxMetricEventProcessingService.process(VoxMetricEvent.occurNow(VoxMetricEventName.SDK_CONNECTION_ATTEMPTED));
    }

    private void disconnect() {
        if (this.appForegroundChecker.isAppInForeground()) {
            return;
        }
        Logger.debug("try to disconnect from Alexa Service");
        this.frameworkApis.stop();
    }

    @VisibleForTesting
    public AppForegroundChecker getAppForegroundChecker() {
        return this.appForegroundChecker;
    }

    public void initialize() {
        this.frameworkApis.getReadinessApi().registerListener(this.connectionListener);
    }

    @Override // com.amazon.alexa.voice.sdk.AlexaConnectionManager
    public void onBackground() {
        disconnect();
    }

    @Override // com.amazon.alexa.voice.sdk.AlexaConnectionManager
    public void onForeground() {
        connect();
    }

    public void release() {
        this.frameworkApis.stop();
        this.frameworkApis.getReadinessApi().deregisterListener(this.connectionListener);
    }
}
