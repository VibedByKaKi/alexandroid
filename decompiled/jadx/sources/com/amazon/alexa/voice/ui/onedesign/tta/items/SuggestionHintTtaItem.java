package com.amazon.alexa.voice.ui.onedesign.tta.items;

import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.onedesign.tta.items.AutoValue_SuggestionHintTtaItem;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaSuggestionHintViewHolder;
import com.amazon.alexa.voice.ui.suggestions.SuggestionItem;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = TtaSuggestionHintViewHolder.class)
/* loaded from: classes20.dex */
public abstract class SuggestionHintTtaItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract SuggestionHintTtaItem build();

        public abstract Builder itemType(String str);

        public abstract Builder suggestionId(String str);

        public abstract Builder suggestionTitle(CharSequence charSequence);
    }

    public static Builder builder() {
        return new AutoValue_SuggestionHintTtaItem.Builder();
    }

    public static SuggestionHintTtaItem fromSuggestionItem(SuggestionItem suggestionItem) {
        return builder().itemType(suggestionItem.getAction()).suggestionTitle(suggestionItem.getTitle()).suggestionId(suggestionItem.getId()).build();
    }

    public abstract String getItemType();

    public abstract String getSuggestionId();

    public abstract CharSequence getSuggestionTitle();
}
