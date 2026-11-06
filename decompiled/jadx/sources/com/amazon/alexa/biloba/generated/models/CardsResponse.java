package com.amazon.alexa.biloba.generated.models;

import com.amazon.alexa.biloba.model.Card;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CardsResponse {

    @SerializedName("cards")
    private List<Card> cards = new ArrayList();

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public CardsResponse addCardsItem(Card card) {
        this.cards.add(card);
        return this;
    }

    public CardsResponse cards(List<Card> list) {
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
        return Objects.equals(this.cards, ((CardsResponse) obj).cards);
    }

    public List<Card> getCards() {
        return this.cards;
    }

    public int hashCode() {
        return Objects.hash(this.cards);
    }

    public void setCards(List<Card> list) {
        this.cards = list;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("class CardsResponse {\n    cards: "), toIndentedString(this.cards), "\n}");
    }
}
