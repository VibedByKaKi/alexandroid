package com.amazon.alexa.voice.ui.onedesign.tta.items;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.onedesign.tta.items.AutoValue_SuggestionLinkTtaItem;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaSuggestionLinkViewHolder;
import com.amazon.alexa.voice.ui.suggestions.SuggestionItem;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = TtaSuggestionLinkViewHolder.class)
/* loaded from: classes20.dex */
public abstract class SuggestionLinkTtaItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder actionData(String str);

        public abstract SuggestionLinkTtaItem build();

        public abstract Builder itemType(String str);

        public abstract Builder suggestionDescription(CharSequence charSequence);

        public abstract Builder suggestionId(String str);

        public abstract Builder suggestionTitle(CharSequence charSequence);
    }

    public static Builder builder() {
        return new AutoValue_SuggestionLinkTtaItem.Builder();
    }

    public static SuggestionLinkTtaItem fromSuggestionItem(SuggestionItem suggestionItem) {
        return builder().itemType(suggestionItem.getAction()).suggestionTitle(suggestionItem.getTitle()).suggestionDescription(suggestionItem.getDescription()).actionData(suggestionItem.getActionData()).suggestionId(suggestionItem.getId()).build();
    }

    public abstract String getActionData();

    public abstract String getItemType();

    @Nullable
    public abstract CharSequence getSuggestionDescription();

    public abstract String getSuggestionId();

    public abstract CharSequence getSuggestionTitle();
}
