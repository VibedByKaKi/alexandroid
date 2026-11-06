package com.amazon.alexa.voiceui.cards;

import com.amazon.alexa.voice.ui.tta.MiniCardHandler;
import com.amazon.alexa.voiceui.cards.CardData;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
public class MiniCardSelectionHandler implements MiniCardHandler {
    private final BehaviorSubject<CardData> isCardSelectedObservable = BehaviorSubject.create();

    @Inject
    public MiniCardSelectionHandler() {
    }

    @Override // com.amazon.alexa.voice.ui.tta.MiniCardHandler
    public void onCardSelected(String str) {
        this.isCardSelectedObservable.onNext(new CardData(CardData.CardDataType.DEFAULT, str));
    }

    public Observable<CardData> onMiniCardSelected() {
        return this.isCardSelectedObservable;
    }
}
