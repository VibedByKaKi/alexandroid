package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.AutoValue_BottomSheetHintChatItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetHintViewHolder;
import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.tta.search.ItemPosition;
import com.amazon.alexa.voice.ui.tta.search.TtaInChatResultCard;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = BottomSheetHintViewHolder.class)
/* loaded from: classes20.dex */
public abstract class BottomSheetHintChatItem extends ConversationBubbleItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract BottomSheetHintChatItem build();

        public abstract Builder itemId(String str);

        public abstract Builder itemPosition(ItemPosition itemPosition);

        public abstract Builder itemText(CharSequence charSequence);
    }

    public static Builder builder() {
        return new AutoValue_BottomSheetHintChatItem.Builder();
    }

    public static BottomSheetHintChatItem fromTtaInChatResultCard(TtaInChatResultCard ttaInChatResultCard) {
        return builder().itemId(ttaInChatResultCard.getId()).itemText(ttaInChatResultCard.getMessage()).itemPosition(ttaInChatResultCard.getItemPosition()).build();
    }

    public abstract String getItemId();

    public abstract ItemPosition getItemPosition();

    public abstract CharSequence getItemText();

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationBubbleItem
    public ConversationBubbleType getType() {
        return ConversationBubbleType.BOTTOM_SHEET_HINT_CHAT_ITEM;
    }
}
