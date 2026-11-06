package com.amazon.alexa.voiceui.ra;

import android.content.Context;
import com.amazon.alexa.mosaic.components.apl.AplViewsManager;
import com.amazon.alexa.voice.tta.metrics.MetricEventProcessingService;
import com.amazon.alexa.voice.tta.typing.TtaMessageSanitizer;
import com.amazon.alexa.voice.ui.ra.AlexaMessageHandler;
import com.amazon.alexa.voice.ui.ra.AppUpdatePromptHandler;
import com.amazon.alexa.voice.ui.ra.RemarkableAlexaBackButtonHandler;
import com.amazon.alexa.voiceui.AlexaServicesApis;
import com.amazon.alexa.voiceui.events.UiEventReporter;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class RaModule {
    @Provides
    @Singleton
    public static RaPreferenceStorage provideRaSharedPrefsManager(Context context) {
        return new RaPreferenceStorage(context);
    }

    @Provides
    @Singleton
    public ConversationSessionTimer provConversationSessionTimer() {
        return new ConversationSessionTimer();
    }

    @Provides
    @Singleton
    public DefaultAlexaMessageHandler provideDefaultAlexaMessageHandler(AlexaMessageHandler alexaMessageHandler) {
        return (DefaultAlexaMessageHandler) alexaMessageHandler;
    }

    @Provides
    @Singleton
    public HintsProvider provideHintsProvider() {
        return new HintsProvider();
    }

    @Provides
    @Singleton
    public MessageHistoryManager provideMessageHistoryManager(ConversationSessionTimer conversationSessionTimer, MetricEventProcessingService metricEventProcessingService) {
        return new MessageHistoryManager(conversationSessionTimer, metricEventProcessingService);
    }

    @Provides
    @Singleton
    public RaInteractor provideRaInteractor(AlexaServicesApis alexaServicesApis, DefaultAlexaMessageHandler defaultAlexaMessageHandler, MessageHistoryManager messageHistoryManager, HintsProvider hintsProvider, AppUpdatePromptProvider appUpdatePromptProvider, RemarkableAlexaBackButtonProvider remarkableAlexaBackButtonProvider, RaPreferenceStorage raPreferenceStorage, UiEventReporter uiEventReporter, AplViewsManager aplViewsManager) {
        return new RaInteractor(alexaServicesApis, defaultAlexaMessageHandler, messageHistoryManager, hintsProvider, appUpdatePromptProvider, remarkableAlexaBackButtonProvider, raPreferenceStorage, uiEventReporter, aplViewsManager);
    }

    @Provides
    @Singleton
    public AppUpdatePromptProvider provideRequestedUpdateHandler() {
        return new AppUpdatePromptProvider();
    }

    @Provides
    @Singleton
    public AlexaMessageHandler providesMessageHandler(TtaMessageSanitizer ttaMessageSanitizer) {
        return new DefaultAlexaMessageHandler(ttaMessageSanitizer);
    }

    @Provides
    @Singleton
    public RemarkableAlexaBackButtonProvider providesRemarkableAlexaBackButtonProvider() {
        return new RemarkableAlexaBackButtonProvider();
    }

    @Provides
    @Singleton
    public AppUpdatePromptHandler provides(AppUpdatePromptProvider appUpdatePromptProvider) {
        return appUpdatePromptProvider;
    }

    @Provides
    @Singleton
    public RemarkableAlexaBackButtonHandler providesRemarkableAlexaBackButtonHandler(RemarkableAlexaBackButtonProvider remarkableAlexaBackButtonProvider) {
        return remarkableAlexaBackButtonProvider;
    }
}
