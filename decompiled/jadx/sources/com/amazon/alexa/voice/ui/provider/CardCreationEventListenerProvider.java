package com.amazon.alexa.voice.ui.provider;

import com.amazon.alexa.voice.ui.cards.CardCreationEventListener;
import com.amazon.alexa.voice.ui.provider.vox.CardMode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface CardCreationEventListenerProvider {
    CardCreationEventListener getCreationEventListener(CardMode cardMode);
}
