package com.amazon.alexa.voice.ui.onedesign.standard;

import com.amazon.alexa.voice.ui.onedesign.standard.StandardContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class StandardInteractor implements StandardContract.Interactor {
    private final StandardCardModel card;
    private final StandardContract.Mediator mediator;

    public StandardInteractor(StandardCardModel standardCardModel, StandardContract.Mediator mediator) {
        this.card = standardCardModel;
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardContract.Interactor
    public void dismiss() {
        this.mediator.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardContract.Interactor
    public StandardCardModel getCard() {
        return this.card;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardContract.Interactor
    public void openLink() {
        this.mediator.openLinkUrl(this.card.getLinkUrl());
    }
}
