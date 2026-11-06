package com.amazon.alexa.biloba.view.cards;

import android.view.View;
import androidx.annotation.NonNull;
import com.amazon.alexa.biloba.model.Action;
import com.amazon.alexa.biloba.model.Card;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CardData {
    private final Card card;
    private final Map<Action, View.OnClickListener> clickListeners;
    private final View.OnClickListener dismissListener;

    public CardData(Card card, Map<Action, View.OnClickListener> map, View.OnClickListener onClickListener) {
        this.card = card;
        this.clickListeners = map;
        this.dismissListener = onClickListener;
    }

    @NonNull
    public Card getCard() {
        return this.card;
    }

    public Map<Action, View.OnClickListener> getClickListeners() {
        return this.clickListeners;
    }

    public View.OnClickListener getDismissListener() {
        return this.dismissListener;
    }
}
