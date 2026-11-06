package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.AutoValue_BottomSheetChatCardItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetChatNavCardViewHolder;
import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem;
import com.amazon.alexa.voice.ui.tta.TtaResponseCard;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = BottomSheetChatNavCardViewHolder.class)
/* loaded from: classes20.dex */
public abstract class BottomSheetChatCardItem extends ConversationBubbleItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract BottomSheetChatCardItem build();

        public abstract Builder cardType(String str);

        public abstract Builder itemDescription(String str);

        public abstract Builder itemId(String str);

        public abstract Builder itemText(CharSequence charSequence);

        public abstract Builder linkUrl(String str);
    }

    public static Builder builder() {
        return new AutoValue_BottomSheetChatCardItem.Builder();
    }

    public static BottomSheetChatCardItem fromTtaResponseCard(TtaResponseCard ttaResponseCard) {
        return builder().itemId(ttaResponseCard.getId()).itemText(ttaResponseCard.getMessage()).itemDescription(ttaResponseCard.getDescription()).linkUrl(ttaResponseCard.getLinkUrl()).cardType(ttaResponseCard.getCardType()).build();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CardTtaItem) {
            return getItemId().equals(((CardTtaItem) obj).getItemId());
        }
        return false;
    }

    public abstract String getCardType();

    public abstract String getItemDescription();

    public abstract String getItemId();

    public abstract CharSequence getItemText();

    public abstract String getLinkUrl();

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationBubbleItem
    public ConversationBubbleType getType() {
        return ConversationBubbleType.BOTTOM_SHEET_CHAT_CARD_ITEM;
    }

    public int hashCode() {
        return getItemId().hashCode();
    }
}
