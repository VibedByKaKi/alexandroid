package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.AutoValue_BottomSheetInAppLinkCardItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetInAppLinkCardViewHolder;
import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.tta.search.ItemPosition;
import com.amazon.alexa.voice.ui.tta.search.ItemRoute;
import com.amazon.alexa.voice.ui.tta.search.TtaInChatResultCard;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = BottomSheetInAppLinkCardViewHolder.class)
/* loaded from: classes20.dex */
public abstract class BottomSheetInAppLinkCardItem extends ConversationBubbleItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract BottomSheetInAppLinkCardItem build();

        public abstract Builder itemId(String str);

        public abstract Builder itemPosition(ItemPosition itemPosition);

        public abstract Builder itemRoute(ItemRoute itemRoute);

        public abstract Builder primaryText(CharSequence charSequence);

        public abstract Builder secondText(CharSequence charSequence);
    }

    public static Builder builder() {
        return new AutoValue_BottomSheetInAppLinkCardItem.Builder();
    }

    public static BottomSheetInAppLinkCardItem fromTtaInChatResultCard(TtaInChatResultCard ttaInChatResultCard) {
        return builder().itemId(ttaInChatResultCard.getId()).primaryText(ttaInChatResultCard.getMessage()).secondText(ttaInChatResultCard.getSecondMessage()).itemRoute(ttaInChatResultCard.getItemRoute()).itemPosition(ttaInChatResultCard.getItemPosition()).build();
    }

    public abstract String getItemId();

    public abstract ItemPosition getItemPosition();

    public abstract ItemRoute getItemRoute();

    public abstract CharSequence getPrimaryText();

    @Nullable
    public abstract CharSequence getSecondText();

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationBubbleItem
    public ConversationBubbleType getType() {
        return ConversationBubbleType.BOTTOM_SHEET_IN_APP_LINK_CARD_ITEM;
    }
}
