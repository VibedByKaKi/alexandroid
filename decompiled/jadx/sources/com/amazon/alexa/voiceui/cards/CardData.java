package com.amazon.alexa.voiceui.cards;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CardData<T> {
    private final T cardData;
    private final CardDataType type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CardDataType {
        DEFAULT,
        APL
    }

    public CardData(CardDataType cardDataType, T t) {
        this.type = cardDataType;
        this.cardData = t;
    }

    public T getCardData() {
        return this.cardData;
    }

    public CardDataType getType() {
        return this.type;
    }
}
