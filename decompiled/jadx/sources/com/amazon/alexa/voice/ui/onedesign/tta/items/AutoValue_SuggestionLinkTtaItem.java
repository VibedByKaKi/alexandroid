package com.amazon.alexa.voice.ui.onedesign.tta.items;

import androidx.annotation.Nullable;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_SuggestionLinkTtaItem extends SuggestionLinkTtaItem {
    private final String actionData;
    private final String itemType;
    private final CharSequence suggestionDescription;
    private final String suggestionId;
    private final CharSequence suggestionTitle;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends SuggestionLinkTtaItem.Builder {
        private String actionData;
        private String itemType;
        private CharSequence suggestionDescription;
        private String suggestionId;
        private CharSequence suggestionTitle;

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem.Builder
        public SuggestionLinkTtaItem.Builder actionData(String str) {
            if (str != null) {
                this.actionData = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null actionData");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem.Builder
        public SuggestionLinkTtaItem build() {
            String str;
            String str2;
            String str3;
            CharSequence charSequence = this.suggestionTitle;
            if (charSequence != null && (str = this.itemType) != null && (str2 = this.actionData) != null && (str3 = this.suggestionId) != null) {
                return new AutoValue_SuggestionLinkTtaItem(charSequence, this.suggestionDescription, str, str2, str3, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.suggestionTitle == null) {
                sb.append(" suggestionTitle");
            }
            if (this.itemType == null) {
                sb.append(" itemType");
            }
            if (this.actionData == null) {
                sb.append(" actionData");
            }
            if (this.suggestionId == null) {
                sb.append(" suggestionId");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem.Builder
        public SuggestionLinkTtaItem.Builder itemType(String str) {
            if (str != null) {
                this.itemType = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemType");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem.Builder
        public SuggestionLinkTtaItem.Builder suggestionDescription(CharSequence charSequence) {
            this.suggestionDescription = charSequence;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem.Builder
        public SuggestionLinkTtaItem.Builder suggestionId(String str) {
            if (str != null) {
                this.suggestionId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null suggestionId");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem.Builder
        public SuggestionLinkTtaItem.Builder suggestionTitle(CharSequence charSequence) {
            if (charSequence != null) {
                this.suggestionTitle = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null suggestionTitle");
            return null;
        }
    }

    private AutoValue_SuggestionLinkTtaItem(CharSequence charSequence, @Nullable CharSequence charSequence2, String str, String str2, String str3) {
        this.suggestionTitle = charSequence;
        this.suggestionDescription = charSequence2;
        this.itemType = str;
        this.actionData = str2;
        this.suggestionId = str3;
    }

    public boolean equals(Object obj) {
        CharSequence charSequence;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SuggestionLinkTtaItem) {
            SuggestionLinkTtaItem suggestionLinkTtaItem = (SuggestionLinkTtaItem) obj;
            if (this.suggestionTitle.equals(suggestionLinkTtaItem.getSuggestionTitle()) && ((charSequence = this.suggestionDescription) != null ? charSequence.equals(suggestionLinkTtaItem.getSuggestionDescription()) : suggestionLinkTtaItem.getSuggestionDescription() == null) && this.itemType.equals(suggestionLinkTtaItem.getItemType()) && this.actionData.equals(suggestionLinkTtaItem.getActionData()) && this.suggestionId.equals(suggestionLinkTtaItem.getSuggestionId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem
    public String getActionData() {
        return this.actionData;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem
    public String getItemType() {
        return this.itemType;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem
    @Nullable
    public CharSequence getSuggestionDescription() {
        return this.suggestionDescription;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem
    public String getSuggestionId() {
        return this.suggestionId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.SuggestionLinkTtaItem
    public CharSequence getSuggestionTitle() {
        return this.suggestionTitle;
    }

    public int hashCode() {
        int hashCode = (this.suggestionTitle.hashCode() ^ 1000003) * 1000003;
        CharSequence charSequence = this.suggestionDescription;
        return this.suggestionId.hashCode() ^ ((((((hashCode ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003) ^ this.itemType.hashCode()) * 1000003) ^ this.actionData.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SuggestionLinkTtaItem{suggestionTitle=");
        sb.append((Object) this.suggestionTitle);
        sb.append(", suggestionDescription=");
        sb.append((Object) this.suggestionDescription);
        sb.append(", itemType=");
        sb.append(this.itemType);
        sb.append(", actionData=");
        sb.append(this.actionData);
        sb.append(", suggestionId=");
        return a$$ExternalSyntheticOutline0.m(sb, this.suggestionId, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_SuggestionLinkTtaItem(CharSequence charSequence, CharSequence charSequence2, String str, String str2, String str3, int i) {
        this(charSequence, charSequence2, str, str2, str3);
    }
}
