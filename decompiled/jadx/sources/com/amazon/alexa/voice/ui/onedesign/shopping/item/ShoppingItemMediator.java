package com.amazon.alexa.voice.ui.onedesign.shopping.item;

import android.content.Context;
import com.amazon.alexa.voice.ui.onedesign.shopping.item.ShoppingItemContract;
import com.amazon.alexa.voice.ui.onedesign.util.IntentUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ShoppingItemMediator implements ShoppingItemContract.Mediator {
    private Context context;

    public ShoppingItemMediator(Context context) {
        this.context = context;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.shopping.item.ShoppingItemContract.Mediator
    public void openLinkUrl(String str) {
        IntentUtils.openLinkUrl(this.context, str);
    }
}
