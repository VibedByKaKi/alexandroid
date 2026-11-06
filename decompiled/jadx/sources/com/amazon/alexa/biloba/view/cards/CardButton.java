package com.amazon.alexa.biloba.view.cards;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CardButton {
    private final String buttonText;
    private final View.OnClickListener clickListener;

    public CardButton(String str, View.OnClickListener onClickListener) {
        this.buttonText = str;
        this.clickListener = onClickListener;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public View.OnClickListener getClickListener() {
        return this.clickListener;
    }
}
