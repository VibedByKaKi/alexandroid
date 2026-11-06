package com.amazon.dee.app.ui.main.cardframework;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import com.amazon.alexa.cards.api.CardState;
import com.amazon.alexa.cards.api.CardStateListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CardStateListenerImpl implements CardStateListener {
    private final ObservableBoolean isCardExpanded;

    public CardStateListenerImpl(ObservableBoolean observableBoolean) {
        this.isCardExpanded = observableBoolean;
    }

    @Override // com.amazon.alexa.cards.api.CardStateListener
    public void onCardStateChanged(@NonNull CardState cardState) {
        this.isCardExpanded.set(cardState.isExpanded());
    }
}
