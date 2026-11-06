package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.AutoValue_BottomSheetSuggestionItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetSuggestionsViewHolder;
import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.onedesign.util.BottomSheetPillsState;
import com.amazon.alexa.voice.ui.suggestions.SuggestionItem;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = BottomSheetSuggestionsViewHolder.class)
/* loaded from: classes20.dex */
public abstract class BottomSheetSuggestionItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder actionData(String str);

        public abstract BottomSheetSuggestionItem build();

        public abstract Builder itemType(String str);

        public abstract Builder pillsState(BottomSheetPillsState bottomSheetPillsState);

        public abstract Builder suggestionId(String str);

        public abstract Builder suggestionTitle(CharSequence charSequence);
    }

    public static Builder builder() {
        return new AutoValue_BottomSheetSuggestionItem.Builder();
    }

    public static BottomSheetSuggestionItem fromBottomSheetSuggestionItem(SuggestionItem suggestionItem, BottomSheetPillsState bottomSheetPillsState) {
        return builder().itemType(suggestionItem.getAction()).suggestionTitle(suggestionItem.getTitle()).suggestionId(suggestionItem.getId()).actionData(suggestionItem.getActionData()).pillsState(bottomSheetPillsState).build();
    }

    public abstract String getActionData();

    public abstract String getItemType();

    public abstract BottomSheetPillsState getPillsState();

    public abstract String getSuggestionId();

    public abstract CharSequence getSuggestionTitle();
}
