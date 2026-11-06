package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum ConversationBubbleType {
    CONVERSATION_REQUEST_ITEM,
    CONVERSATION_RESPONSE_ITEM,
    BOTTOM_SHEET_CHAT_CARD_ITEM,
    BOTTOM_SHEET_HINT_CHAT_ITEM,
    BOTTOM_SHEET_IN_APP_LINK_CARD_ITEM,
    CONVERSATION_THINKING_ITEM,
    BOTTOM_SHEET_MINI_CARD_BACKGROUND_IMAGE_ITEM,
    BOTTOM_SHEET_MINI_CARD_CAROUSEL_ITEM,
    BOTTOM_SHEET_MINI_CARD_DETAIL_ITEM;

    public boolean aConversationRequest() {
        return equals(CONVERSATION_REQUEST_ITEM);
    }

    public boolean aConversationResponse() {
        return equals(CONVERSATION_RESPONSE_ITEM);
    }

    public boolean aHintChatItem() {
        return equals(BOTTOM_SHEET_HINT_CHAT_ITEM);
    }

    public boolean aInAppLinkCard() {
        return equals(BOTTOM_SHEET_IN_APP_LINK_CARD_ITEM);
    }

    public boolean aMiniCardBackgroundImageItem() {
        return equals(BOTTOM_SHEET_MINI_CARD_BACKGROUND_IMAGE_ITEM);
    }

    public boolean aMiniCardCarouselItem() {
        return equals(BOTTOM_SHEET_MINI_CARD_CAROUSEL_ITEM);
    }

    public boolean aMiniCardDetailItem() {
        return equals(BOTTOM_SHEET_MINI_CARD_DETAIL_ITEM);
    }
}
