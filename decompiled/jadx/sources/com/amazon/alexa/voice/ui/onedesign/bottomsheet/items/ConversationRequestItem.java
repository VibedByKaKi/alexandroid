package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.AutoValue_ConversationRequestItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetRequestViewHolder;
import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.tta.search.ItemPosition;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = BottomSheetRequestViewHolder.class)
/* loaded from: classes20.dex */
public abstract class ConversationRequestItem extends ConversationBubbleItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ConversationRequestItem build();

        public abstract Builder itemPosition(ItemPosition itemPosition);

        public abstract Builder itemText(CharSequence charSequence);

        public abstract Builder remarkableAlexaStyleEnabled(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_ConversationRequestItem.Builder().remarkableAlexaStyleEnabled(false);
    }

    public abstract ItemPosition getItemPosition();

    public abstract CharSequence getItemText();

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationBubbleItem
    public ConversationBubbleType getType() {
        return ConversationBubbleType.CONVERSATION_REQUEST_ITEM;
    }

    public abstract boolean isRemarkableAlexaStyleEnabled();
}
