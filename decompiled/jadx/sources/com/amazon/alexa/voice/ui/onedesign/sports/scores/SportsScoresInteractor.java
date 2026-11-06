package com.amazon.alexa.voice.ui.onedesign.sports.scores;

import com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SportsScoresInteractor implements SportsScoresContract.Interactor {
    private final SportsScoresCard card;
    private final SportsScoresContract.Mediator mediator;

    public SportsScoresInteractor(SportsScoresCard sportsScoresCard, SportsScoresContract.Mediator mediator) {
        this.card = sportsScoresCard;
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresContract.Interactor
    public void dismiss() {
        this.mediator.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresContract.Interactor
    public SportsScoresCard getCard() {
        return this.card;
    }
}
