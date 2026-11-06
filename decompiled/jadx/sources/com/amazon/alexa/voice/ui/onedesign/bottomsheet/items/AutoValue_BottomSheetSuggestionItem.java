package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem;
import com.amazon.alexa.voice.ui.onedesign.util.BottomSheetPillsState;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_BottomSheetSuggestionItem extends BottomSheetSuggestionItem {
    private final String actionData;
    private final String itemType;
    private final BottomSheetPillsState pillsState;
    private final String suggestionId;
    private final CharSequence suggestionTitle;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends BottomSheetSuggestionItem.Builder {
        private String actionData;
        private String itemType;
        private BottomSheetPillsState pillsState;
        private String suggestionId;
        private CharSequence suggestionTitle;

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem.Builder
        public BottomSheetSuggestionItem.Builder actionData(String str) {
            if (str != null) {
                this.actionData = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null actionData");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem.Builder
        public BottomSheetSuggestionItem build() {
            String str;
            String str2;
            String str3;
            BottomSheetPillsState bottomSheetPillsState;
            CharSequence charSequence = this.suggestionTitle;
            if (charSequence != null && (str = this.itemType) != null && (str2 = this.suggestionId) != null && (str3 = this.actionData) != null && (bottomSheetPillsState = this.pillsState) != null) {
                return new AutoValue_BottomSheetSuggestionItem(charSequence, str, str2, str3, bottomSheetPillsState, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.suggestionTitle == null) {
                sb.append(" suggestionTitle");
            }
            if (this.itemType == null) {
                sb.append(" itemType");
            }
            if (this.suggestionId == null) {
                sb.append(" suggestionId");
            }
            if (this.actionData == null) {
                sb.append(" actionData");
            }
            if (this.pillsState == null) {
                sb.append(" pillsState");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem.Builder
        public BottomSheetSuggestionItem.Builder itemType(String str) {
            if (str != null) {
                this.itemType = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemType");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem.Builder
        public BottomSheetSuggestionItem.Builder pillsState(BottomSheetPillsState bottomSheetPillsState) {
            if (bottomSheetPillsState != null) {
                this.pillsState = bottomSheetPillsState;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null pillsState");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem.Builder
        public BottomSheetSuggestionItem.Builder suggestionId(String str) {
            if (str != null) {
                this.suggestionId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null suggestionId");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem.Builder
        public BottomSheetSuggestionItem.Builder suggestionTitle(CharSequence charSequence) {
            if (charSequence != null) {
                this.suggestionTitle = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null suggestionTitle");
            return null;
        }
    }

    private AutoValue_BottomSheetSuggestionItem(CharSequence charSequence, String str, String str2, String str3, BottomSheetPillsState bottomSheetPillsState) {
        this.suggestionTitle = charSequence;
        this.itemType = str;
        this.suggestionId = str2;
        this.actionData = str3;
        this.pillsState = bottomSheetPillsState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BottomSheetSuggestionItem) {
            BottomSheetSuggestionItem bottomSheetSuggestionItem = (BottomSheetSuggestionItem) obj;
            if (this.suggestionTitle.equals(bottomSheetSuggestionItem.getSuggestionTitle()) && this.itemType.equals(bottomSheetSuggestionItem.getItemType()) && this.suggestionId.equals(bottomSheetSuggestionItem.getSuggestionId()) && this.actionData.equals(bottomSheetSuggestionItem.getActionData()) && this.pillsState.equals(bottomSheetSuggestionItem.getPillsState())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem
    public String getActionData() {
        return this.actionData;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem
    public String getItemType() {
        return this.itemType;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem
    public BottomSheetPillsState getPillsState() {
        return this.pillsState;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem
    public String getSuggestionId() {
        return this.suggestionId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetSuggestionItem
    public CharSequence getSuggestionTitle() {
        return this.suggestionTitle;
    }

    public int hashCode() {
        return this.pillsState.hashCode() ^ ((((((((this.suggestionTitle.hashCode() ^ 1000003) * 1000003) ^ this.itemType.hashCode()) * 1000003) ^ this.suggestionId.hashCode()) * 1000003) ^ this.actionData.hashCode()) * 1000003);
    }

    public String toString() {
        return "BottomSheetSuggestionItem{suggestionTitle=" + ((Object) this.suggestionTitle) + ", itemType=" + this.itemType + ", suggestionId=" + this.suggestionId + ", actionData=" + this.actionData + ", pillsState=" + this.pillsState + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_BottomSheetSuggestionItem(CharSequence charSequence, String str, String str2, String str3, BottomSheetPillsState bottomSheetPillsState, int i) {
        this(charSequence, str, str2, str3, bottomSheetPillsState);
    }
}
