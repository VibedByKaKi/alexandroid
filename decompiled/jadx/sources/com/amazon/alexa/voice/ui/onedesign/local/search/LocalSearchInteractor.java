package com.amazon.alexa.voice.ui.onedesign.local.search;

import com.amazon.alexa.voice.ui.onedesign.local.LocalCard;
import com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel;
import com.amazon.alexa.voice.ui.onedesign.local.LocalDelegate;
import com.amazon.alexa.voice.ui.onedesign.local.search.LocalSearchContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LocalSearchInteractor implements LocalSearchContract.Interactor {
    private final LocalCard card;
    private final LocalDelegate delegate;
    private final LocalSearchContract.Mediator mediator;

    public LocalSearchInteractor(LocalCard localCard, LocalSearchContract.Mediator mediator, LocalDelegate localDelegate) {
        this.card = localCard;
        this.mediator = mediator;
        this.delegate = localDelegate;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.search.LocalSearchContract.Interactor
    public void close() {
        this.delegate.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.search.LocalSearchContract.Interactor
    public LocalCard getCard() {
        return this.card;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.search.LocalSearchContract.Interactor
    public void showBusiness(LocalCardModel.BusinessModel businessModel) {
        this.mediator.openBusiness(businessModel);
    }
}
