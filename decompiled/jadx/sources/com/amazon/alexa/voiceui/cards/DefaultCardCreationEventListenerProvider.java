package com.amazon.alexa.voiceui.cards;

import com.amazon.alexa.voice.ui.cards.CardCreationEventListener;
import com.amazon.alexa.voice.ui.provider.CardCreationEventListenerProvider;
import com.amazon.alexa.voice.ui.provider.vox.CardMode;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
public class DefaultCardCreationEventListenerProvider implements CardCreationEventListenerProvider {
    private StandardCardCreationEventListener standardCardCreationEventListener;

    public DefaultCardCreationEventListenerProvider(StandardCardCreationEventListener standardCardCreationEventListener) {
        this.standardCardCreationEventListener = standardCardCreationEventListener;
    }

    @Override // com.amazon.alexa.voice.ui.provider.CardCreationEventListenerProvider
    public CardCreationEventListener getCreationEventListener(CardMode cardMode) {
        return this.standardCardCreationEventListener;
    }
}
