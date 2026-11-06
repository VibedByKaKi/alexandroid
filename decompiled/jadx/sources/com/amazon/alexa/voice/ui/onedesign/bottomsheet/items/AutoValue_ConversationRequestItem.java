package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationRequestItem;
import com.amazon.alexa.voice.ui.tta.search.ItemPosition;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_ConversationRequestItem extends ConversationRequestItem {
    private final ItemPosition itemPosition;
    private final CharSequence itemText;
    private final boolean remarkableAlexaStyleEnabled;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ConversationRequestItem.Builder {
        private ItemPosition itemPosition;
        private CharSequence itemText;
        private Boolean remarkableAlexaStyleEnabled;

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationRequestItem.Builder
        public ConversationRequestItem build() {
            ItemPosition itemPosition;
            Boolean bool;
            CharSequence charSequence = this.itemText;
            if (charSequence != null && (itemPosition = this.itemPosition) != null && (bool = this.remarkableAlexaStyleEnabled) != null) {
                return new AutoValue_ConversationRequestItem(charSequence, itemPosition, bool.booleanValue(), 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.itemText == null) {
                sb.append(" itemText");
            }
            if (this.itemPosition == null) {
                sb.append(" itemPosition");
            }
            if (this.remarkableAlexaStyleEnabled == null) {
                sb.append(" remarkableAlexaStyleEnabled");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationRequestItem.Builder
        public ConversationRequestItem.Builder itemPosition(ItemPosition itemPosition) {
            if (itemPosition != null) {
                this.itemPosition = itemPosition;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemPosition");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationRequestItem.Builder
        public ConversationRequestItem.Builder itemText(CharSequence charSequence) {
            if (charSequence != null) {
                this.itemText = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemText");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationRequestItem.Builder
        public ConversationRequestItem.Builder remarkableAlexaStyleEnabled(boolean z) {
            this.remarkableAlexaStyleEnabled = Boolean.valueOf(z);
            return this;
        }
    }

    private AutoValue_ConversationRequestItem(CharSequence charSequence, ItemPosition itemPosition, boolean z) {
        this.itemText = charSequence;
        this.itemPosition = itemPosition;
        this.remarkableAlexaStyleEnabled = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationRequestItem) {
            ConversationRequestItem conversationRequestItem = (ConversationRequestItem) obj;
            if (this.itemText.equals(conversationRequestItem.getItemText()) && this.itemPosition.equals(conversationRequestItem.getItemPosition()) && this.remarkableAlexaStyleEnabled == conversationRequestItem.isRemarkableAlexaStyleEnabled()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationRequestItem
    public ItemPosition getItemPosition() {
        return this.itemPosition;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationRequestItem
    public CharSequence getItemText() {
        return this.itemText;
    }

    public int hashCode() {
        return (this.remarkableAlexaStyleEnabled ? 1231 : 1237) ^ ((((this.itemText.hashCode() ^ 1000003) * 1000003) ^ this.itemPosition.hashCode()) * 1000003);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationRequestItem
    public boolean isRemarkableAlexaStyleEnabled() {
        return this.remarkableAlexaStyleEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationRequestItem{itemText=");
        sb.append((Object) this.itemText);
        sb.append(", itemPosition=");
        sb.append(this.itemPosition);
        sb.append(", remarkableAlexaStyleEnabled=");
        return a$$ExternalSyntheticOutline0.m(sb, this.remarkableAlexaStyleEnabled, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_ConversationRequestItem(CharSequence charSequence, ItemPosition itemPosition, boolean z, int i) {
        this(charSequence, itemPosition, z);
    }
}
