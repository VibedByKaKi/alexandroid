package com.amazon.alexa.voice.ui.onedesign.shopping.item;

import com.amazon.alexa.voice.ui.onedesign.shopping.item.ShoppingItemContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ShoppingItemInteractor implements ShoppingItemContract.Interactor {
    private final ShoppingItemModel item;
    private final ShoppingItemContract.Mediator mediator;

    public ShoppingItemInteractor(ShoppingItemModel shoppingItemModel, ShoppingItemContract.Mediator mediator) {
        this.item = shoppingItemModel;
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.shopping.item.ShoppingItemContract.Interactor
    public ShoppingItemModel getShoppingItem() {
        return this.item;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.shopping.item.ShoppingItemContract.Interactor
    public void openLink() {
        this.mediator.openLinkUrl(this.item.getProduct().getLinkUrl());
    }
}
