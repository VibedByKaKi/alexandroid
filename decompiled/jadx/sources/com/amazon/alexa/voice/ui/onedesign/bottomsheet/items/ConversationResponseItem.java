package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.AutoValue_ConversationResponseItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetResponseViewHolder;
import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.tta.search.ItemPosition;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = BottomSheetResponseViewHolder.class)
/* loaded from: classes20.dex */
public abstract class ConversationResponseItem extends ConversationBubbleItem {
    private static final String EMPTY_DIALOG_REQUEST_ID = "";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ConversationResponseItem build();

        public abstract Builder itemDialogRequestId(String str);

        public abstract Builder itemId(String str);

        public abstract Builder itemPosition(ItemPosition itemPosition);

        public abstract Builder itemText(CharSequence charSequence);

        public abstract Builder longPressAction(int i);

        public abstract Builder remarkableAlexaStyleEnabled(boolean z);

        public abstract Builder streamingEnabled(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_ConversationResponseItem.Builder().longPressAction(0).remarkableAlexaStyleEnabled(false).streamingEnabled(false);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationResponseItem) {
            return getItemId().equals(((ConversationResponseItem) obj).getItemId());
        }
        return false;
    }

    public abstract String getItemDialogRequestId();

    public abstract String getItemId();

    public abstract ItemPosition getItemPosition();

    public abstract CharSequence getItemText();

    public abstract int getLongPressAction();

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationBubbleItem
    public ConversationBubbleType getType() {
        return ConversationBubbleType.CONVERSATION_RESPONSE_ITEM;
    }

    public boolean hasSameDialogRequestId(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ConversationResponseItem) && getItemDialogRequestId().equals(((ConversationResponseItem) obj).getItemDialogRequestId()) && !getItemDialogRequestId().equals("");
    }

    public int hashCode() {
        return getItemId().hashCode();
    }

    public abstract boolean isRemarkableAlexaStyleEnabled();

    public abstract boolean isStreamingEnabled();
}
