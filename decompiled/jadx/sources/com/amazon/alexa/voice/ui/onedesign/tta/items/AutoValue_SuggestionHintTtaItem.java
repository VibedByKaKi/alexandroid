package com.amazon.alexa.voice.ui.onedesign.tta.items;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionHintTtaItem;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_SuggestionHintTtaItem extends SuggestionHintTtaItem {
    private final String itemType;
    private final String suggestionId;
    private final CharSequence suggestionTitle;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends SuggestionHintTtaItem.Builder {
        private String itemType;
        private String suggestionId;
        private CharSequence suggestionTitle;

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionHintTtaItem.Builder
        public SuggestionHintTtaItem build() {
            String str;
            String str2;
            CharSequence charSequence = this.suggestionTitle;
            if (charSequence != null && (str = this.itemType) != null && (str2 = this.suggestionId) != null) {
                return new AutoValue_SuggestionHintTtaItem(charSequence, str, 0, str2);
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
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionHintTtaItem.Builder
        public SuggestionHintTtaItem.Builder itemType(String str) {
            if (str != null) {
                this.itemType = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemType");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionHintTtaItem.Builder
        public SuggestionHintTtaItem.Builder suggestionId(String str) {
            if (str != null) {
                this.suggestionId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null suggestionId");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionHintTtaItem.Builder
        public SuggestionHintTtaItem.Builder suggestionTitle(CharSequence charSequence) {
            if (charSequence != null) {
                this.suggestionTitle = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null suggestionTitle");
            return null;
        }
    }

    private AutoValue_SuggestionHintTtaItem(CharSequence charSequence, String str, String str2) {
        this.suggestionTitle = charSequence;
        this.itemType = str;
        this.suggestionId = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SuggestionHintTtaItem) {
            SuggestionHintTtaItem suggestionHintTtaItem = (SuggestionHintTtaItem) obj;
            if (this.suggestionTitle.equals(suggestionHintTtaItem.getSuggestionTitle()) && this.itemType.equals(suggestionHintTtaItem.getItemType()) && this.suggestionId.equals(suggestionHintTtaItem.getSuggestionId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionHintTtaItem
    public String getItemType() {
        return this.itemType;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionHintTtaItem
    public String getSuggestionId() {
        return this.suggestionId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionHintTtaItem
    public CharSequence getSuggestionTitle() {
        return this.suggestionTitle;
    }

    public int hashCode() {
        return this.suggestionId.hashCode() ^ ((((this.suggestionTitle.hashCode() ^ 1000003) * 1000003) ^ this.itemType.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SuggestionHintTtaItem{suggestionTitle=");
        sb.append((Object) this.suggestionTitle);
        sb.append(", itemType=");
        sb.append(this.itemType);
        sb.append(", suggestionId=");
        return a$$ExternalSyntheticOutline0.m(sb, this.suggestionId, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_SuggestionHintTtaItem(CharSequence charSequence, String str, int i, String str2) {
        this(charSequence, str, str2);
    }
}
