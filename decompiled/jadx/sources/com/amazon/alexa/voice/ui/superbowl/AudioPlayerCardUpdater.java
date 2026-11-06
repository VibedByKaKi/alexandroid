package com.amazon.alexa.voice.ui.superbowl;

import com.amazon.alexa.voice.ui.player.PlayerCardModel;
import com.amazon.alexa.voice.ui.player.PlayerCardUpdater;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AudioPlayerCardUpdater implements PlayerCardUpdater {
    BehaviorSubject<PlayerCardModel> cardUpdaterBehaviorSubject = BehaviorSubject.create();

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardUpdater
    public Observable<PlayerCardModel> subscribeToCardUpdate() {
        return this.cardUpdaterBehaviorSubject;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardUpdater
    public void updateCard(PlayerCardModel playerCardModel) {
        this.cardUpdaterBehaviorSubject.onNext(playerCardModel);
    }
}
