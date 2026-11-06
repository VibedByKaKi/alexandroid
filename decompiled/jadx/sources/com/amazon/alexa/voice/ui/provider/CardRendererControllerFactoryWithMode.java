package com.amazon.alexa.voice.ui.provider;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.ui.cards.CardCreationEventListener;
import com.amazon.alexa.voice.ui.cards.CardFactory;
import com.amazon.alexa.voice.ui.cards.StandardModeCardRendererControllerFactory;
import com.amazon.alexa.voice.ui.provider.vox.CardMode;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CardRendererControllerFactoryWithMode implements CardFactoryWithMode {
    private CardCreationEventListenerProvider cardCreationEventListenerProvider;
    private StandardModeCardRendererControllerFactory standardModeFactory;

    @Deprecated
    public CardRendererControllerFactoryWithMode(final CardCreationEventListener cardCreationEventListener) {
        this(new CardCreationEventListenerProvider() { // from class: com.amazon.alexa.voice.ui.provider.CardRendererControllerFactoryWithMode$$ExternalSyntheticLambda0
            @Override // com.amazon.alexa.voice.ui.provider.CardCreationEventListenerProvider
            public final CardCreationEventListener getCreationEventListener(CardMode cardMode) {
                CardCreationEventListener lambda$new$0;
                lambda$new$0 = CardRendererControllerFactoryWithMode.lambda$new$0(CardCreationEventListener.this, cardMode);
                return lambda$new$0;
            }
        });
    }

    @Override // com.amazon.alexa.voice.ui.provider.CardFactoryWithMode
    public ViewController buildCard(@Nullable String str, CardMode cardMode, int i) {
        return getStandardModeFactory().buildCard(str);
    }

    @VisibleForTesting
    public CardFactory getStandardModeFactory() {
        if (this.standardModeFactory == null) {
            this.standardModeFactory = new StandardModeCardRendererControllerFactory(this.cardCreationEventListenerProvider.getCreationEventListener(CardMode.STANDARD));
        }
        return this.standardModeFactory;
    }

    public CardRendererControllerFactoryWithMode(CardCreationEventListenerProvider cardCreationEventListenerProvider) {
        this.cardCreationEventListenerProvider = cardCreationEventListenerProvider;
    }

    @Override // com.amazon.alexa.voice.ui.provider.CardFactoryWithMode
    @Deprecated
    public ViewController buildCard(@Nullable String str, CardMode cardMode) {
        return buildCard(str, cardMode, 0);
    }

    @VisibleForTesting
    public CardRendererControllerFactoryWithMode(CardCreationEventListenerProvider cardCreationEventListenerProvider, StandardModeCardRendererControllerFactory standardModeCardRendererControllerFactory) {
        this.cardCreationEventListenerProvider = cardCreationEventListenerProvider;
        this.standardModeFactory = standardModeCardRendererControllerFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CardCreationEventListener lambda$new$0(CardCreationEventListener cardCreationEventListener, CardMode cardMode) {
        return cardCreationEventListener;
    }
}
