package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.AutoValue_ConversationThinkingItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetThinkingStateViewHolder;
import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = BottomSheetThinkingStateViewHolder.class)
/* loaded from: classes20.dex */
public abstract class ConversationThinkingItem extends ConversationBubbleItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ConversationThinkingItem build();

        public abstract Builder remarkableAlexaStyleEnabled(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_ConversationThinkingItem.Builder().remarkableAlexaStyleEnabled(false);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationBubbleItem
    public ConversationBubbleType getType() {
        return ConversationBubbleType.CONVERSATION_THINKING_ITEM;
    }

    public abstract boolean isRemarkableAlexaStyleEnabled();
}
