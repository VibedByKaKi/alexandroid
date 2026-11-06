package com.amazon.alexa.voice.ui.onedesign.tta.items;

import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.onedesign.tta.items.AutoValue_InChatHintTtaItem;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaInChatHintViewHolder;
import com.amazon.alexa.voice.ui.tta.search.ItemPosition;
import com.amazon.alexa.voice.ui.tta.search.TtaInChatResultCard;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = TtaInChatHintViewHolder.class)
/* loaded from: classes20.dex */
public abstract class InChatHintTtaItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract InChatHintTtaItem build();

        public abstract Builder itemId(String str);

        public abstract Builder itemPosition(ItemPosition itemPosition);

        public abstract Builder itemText(CharSequence charSequence);
    }

    public static Builder builder() {
        return new AutoValue_InChatHintTtaItem.Builder();
    }

    public static InChatHintTtaItem fromTtaInChatResultCard(TtaInChatResultCard ttaInChatResultCard) {
        return builder().itemId(ttaInChatResultCard.getId()).itemText(ttaInChatResultCard.getMessage()).itemPosition(ttaInChatResultCard.getItemPosition()).build();
    }

    public abstract String getItemId();

    public abstract ItemPosition getItemPosition();

    public abstract CharSequence getItemText();
}
