package com.amazon.alexa.biloba.model.cardV2;

import com.amazon.alexa.biloba.model.cardV2.customAdapter.CardAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CardsResponseV2 {

    @SerializedName("cards")
    @JsonAdapter(CardAdapter.class)
    private List<CardV2> cards = new ArrayList();

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public CardsResponseV2 addCardsItem(CardV2 cardV2) {
        this.cards.add(cardV2);
        return this;
    }

    public CardsResponseV2 cards(List<CardV2> list) {
        this.cards = list;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.cards, ((CardsResponseV2) obj).cards);
    }

    public List<CardV2> getCards() {
        return this.cards;
    }

    public int hashCode() {
        return Objects.hash(this.cards);
    }

    public void setCards(List<CardV2> list) {
        this.cards = list;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("class CardsResponseV2 {\n    cards: "), toIndentedString(this.cards), "\n}");
    }
}
