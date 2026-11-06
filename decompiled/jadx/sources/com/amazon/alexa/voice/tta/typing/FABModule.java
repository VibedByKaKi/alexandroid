package com.amazon.alexa.voice.tta.typing;

import android.content.Context;
import com.amazon.alexa.voice.tta.cards.CardInteractor;
import com.amazon.alexa.voice.tta.metrics.EventClock;
import com.amazon.alexa.voice.tta.metrics.MetricEventProcessingService;
import com.amazon.alexa.voice.tta.sdk.AlexaAplCommandReceiver;
import com.amazon.alexa.voice.tta.sdk.AlexaRenderedCardReceiver;
import com.amazon.alexa.voice.tta.sdk.UiEventReporter;
import com.amazon.alexa.voice.tta.search.SearchInteractor;
import com.amazon.alexa.voice.tta.suggestions.TtaSuggestionsInteractor;
import com.amazon.alexa.voice.tta.typing.IngressParameters;
import com.amazon.alexa.voice.tta.typing.bottomsheet.BottomSheetTtaInteractor;
import com.amazon.alexa.voice.ui.tta.TtaMessageHandler;
import com.amazon.alexa.voice.ui.tta.TtaNavigator;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class FABModule {
    @Provides
    @Singleton
    public BottomSheetTtaInteractor provideBottomSheetInteractor(SearchInteractor searchInteractor, TypingInteractor typingInteractor, TtaSuggestionsInteractor ttaSuggestionsInteractor) {
        return new BottomSheetTtaInteractor(searchInteractor, typingInteractor, ttaSuggestionsInteractor);
    }

    @Provides
    @Singleton
    public AlexaAplCommandReceiver providesAlexaAplCommandReceiver() {
        return new AlexaAplCommandReceiver();
    }

    @Provides
    public AlexaRenderedCardReceiver providesAlexaRenderedCardReceiver(Context context) {
        return new AlexaRenderedCardReceiver(context);
    }

    @Provides
    @Singleton
    public ConversationSessionTimer providesConversationSessionTimer() {
        return new ConversationSessionTimer();
    }

    @Provides
    @Singleton
    public DefaultTtaMessageHandler providesDefaultTtaMessageHandler(TtaMessageSanitizer ttaMessageSanitizer, UiEventReporter uiEventReporter) {
        return new DefaultTtaMessageHandler(ttaMessageSanitizer, BottomSheetTtaInteractor.CLASSIC_INVOCATION_TYPE, uiEventReporter);
    }

    @Provides
    @Singleton
    public IngressParameters.Provider providesIngressParametersProvider(EventClock eventClock) {
        return new DefaultIngressParametersProvider(eventClock);
    }

    @Provides
    @Singleton
    public MessageHistoryManager providesMessageHistoryManager(Context context, PersistentStorage persistentStorage, ConversationSessionTimer conversationSessionTimer, MetricEventProcessingService metricEventProcessingService) {
        return new MessageHistoryManager(context, persistentStorage, conversationSessionTimer, metricEventProcessingService);
    }

    @Provides
    @Singleton
    public PersistentStorage providesPersistentStorage(Context context) {
        return new PersistentStorage(context);
    }

    @Provides
    @Singleton
    public TtaInteractorProvider providesTtaInteractorProvider(TypingInteractor typingInteractor, SearchInteractor searchInteractor, TtaSuggestionsInteractor ttaSuggestionsInteractor, CardInteractor cardInteractor) {
        return new TtaInteractorProvider(typingInteractor, searchInteractor, ttaSuggestionsInteractor, cardInteractor);
    }

    @Provides
    @Singleton
    public TtaMessageSanitizer providesTtaMessageSanitizer() {
        return new TtaMessageSanitizer();
    }

    @Provides
    @Singleton
    public TtaNavigator providesTtaNavigator() {
        return new DefaultTtaNavigator();
    }

    @Provides
    @Singleton
    public TtaMessageHandler providesTtaMessageHandler(DefaultTtaMessageHandler defaultTtaMessageHandler) {
        return defaultTtaMessageHandler;
    }
}
