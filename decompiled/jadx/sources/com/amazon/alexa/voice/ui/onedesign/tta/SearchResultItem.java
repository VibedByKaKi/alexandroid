package com.amazon.alexa.voice.ui.onedesign.tta;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetHintChatItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem;
import com.amazon.alexa.voice.ui.onedesign.tta.items.InChatHintTtaItem;
import com.amazon.alexa.voice.ui.onedesign.tta.items.InChatLinkTtaItem;
import com.amazon.alexa.voice.ui.tta.search.ItemRoute;
import com.amazon.alexa.voice.ui.tta.search.ResultItem;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class SearchResultItem implements ResultItem {
    public static SearchResultItem create(InChatLinkTtaItem inChatLinkTtaItem) {
        return new AutoValue_SearchResultItem(inChatLinkTtaItem.getItemId(), 1, inChatLinkTtaItem.getPrimaryText().toString(), inChatLinkTtaItem.getItemRoute());
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.ResultItem
    public abstract String getId();

    @Nullable
    public abstract ItemRoute getItemRoute();

    public abstract String getItemText();

    @Override // com.amazon.alexa.voice.ui.tta.search.ResultItem
    public abstract int getType();

    public static SearchResultItem create(BottomSheetHintChatItem bottomSheetHintChatItem) {
        return new AutoValue_SearchResultItem(bottomSheetHintChatItem.getItemId(), 2, bottomSheetHintChatItem.getItemText().toString(), null);
    }

    public static SearchResultItem create(InChatHintTtaItem inChatHintTtaItem) {
        return new AutoValue_SearchResultItem(inChatHintTtaItem.getItemId(), 2, inChatHintTtaItem.getItemText().toString(), null);
    }

    public static SearchResultItem create(BottomSheetInAppLinkCardItem bottomSheetInAppLinkCardItem) {
        return new AutoValue_SearchResultItem(bottomSheetInAppLinkCardItem.getItemId(), 1, bottomSheetInAppLinkCardItem.getPrimaryText().toString(), bottomSheetInAppLinkCardItem.getItemRoute());
    }

    public static SearchResultItem create(String str, String str2, ItemRoute itemRoute) {
        return new AutoValue_SearchResultItem(str, 1, str2, itemRoute);
    }
}
