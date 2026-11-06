package com.amazon.alexa.voice.ui.onedesign.shopping;

import com.amazon.alexa.voice.ui.onedesign.shopping.ShoppingContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ShoppingInteractor implements ShoppingContract.Interactor {
    private final ShoppingCard card;
    private final String marketplace;
    private final ShoppingContract.Mediator mediator;

    public ShoppingInteractor(ShoppingCard shoppingCard, String str, ShoppingContract.Mediator mediator) {
        this.card = shoppingCard;
        this.marketplace = str;
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.shopping.ShoppingContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.shopping.ShoppingContract.Interactor
    public void dismiss() {
        this.mediator.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.shopping.ShoppingContract.Interactor
    public ShoppingCard getCard() {
        return this.card;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.shopping.ShoppingContract.Interactor
    public String getUserMarketplace() {
        return this.marketplace;
    }
}
