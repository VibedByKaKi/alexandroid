package com.amazon.alexa.voice.ui.onedesign.sports.update;

import com.amazon.alexa.voice.ui.onedesign.sports.update.SportsUpdateContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SportsUpdateInteractor implements SportsUpdateContract.Interactor {
    private final SportsUpdateCard card;
    private final SportsUpdateContract.Mediator mediator;

    public SportsUpdateInteractor(SportsUpdateCard sportsUpdateCard, SportsUpdateContract.Mediator mediator) {
        this.card = sportsUpdateCard;
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.update.SportsUpdateContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.update.SportsUpdateContract.Interactor
    public void dismiss() {
        this.mediator.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.update.SportsUpdateContract.Interactor
    public SportsUpdateCard getCard() {
        return this.card;
    }
}
