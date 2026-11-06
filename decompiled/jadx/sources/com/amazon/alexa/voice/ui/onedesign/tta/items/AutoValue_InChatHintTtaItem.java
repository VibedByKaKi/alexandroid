package com.amazon.alexa.voice.ui.onedesign.tta.items;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.tta.items.InChatHintTtaItem;
import com.amazon.alexa.voice.ui.tta.search.ItemPosition;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_InChatHintTtaItem extends InChatHintTtaItem {
    private final String itemId;
    private final ItemPosition itemPosition;
    private final CharSequence itemText;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends InChatHintTtaItem.Builder {
        private String itemId;
        private ItemPosition itemPosition;
        private CharSequence itemText;

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.InChatHintTtaItem.Builder
        public InChatHintTtaItem build() {
            CharSequence charSequence;
            ItemPosition itemPosition;
            String str = this.itemId;
            if (str != null && (charSequence = this.itemText) != null && (itemPosition = this.itemPosition) != null) {
                return new AutoValue_InChatHintTtaItem(str, charSequence, itemPosition, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.itemId == null) {
                sb.append(" itemId");
            }
            if (this.itemText == null) {
                sb.append(" itemText");
            }
            if (this.itemPosition == null) {
                sb.append(" itemPosition");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.InChatHintTtaItem.Builder
        public InChatHintTtaItem.Builder itemId(String str) {
            if (str != null) {
                this.itemId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemId");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.InChatHintTtaItem.Builder
        public InChatHintTtaItem.Builder itemPosition(ItemPosition itemPosition) {
            if (itemPosition != null) {
                this.itemPosition = itemPosition;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemPosition");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.InChatHintTtaItem.Builder
        public InChatHintTtaItem.Builder itemText(CharSequence charSequence) {
            if (charSequence != null) {
                this.itemText = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemText");
            return null;
        }
    }

    private AutoValue_InChatHintTtaItem(String str, CharSequence charSequence, ItemPosition itemPosition) {
        this.itemId = str;
        this.itemText = charSequence;
        this.itemPosition = itemPosition;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InChatHintTtaItem) {
            InChatHintTtaItem inChatHintTtaItem = (InChatHintTtaItem) obj;
            if (this.itemId.equals(inChatHintTtaItem.getItemId()) && this.itemText.equals(inChatHintTtaItem.getItemText()) && this.itemPosition.equals(inChatHintTtaItem.getItemPosition())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.InChatHintTtaItem
    public String getItemId() {
        return this.itemId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.InChatHintTtaItem
    public ItemPosition getItemPosition() {
        return this.itemPosition;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.InChatHintTtaItem
    public CharSequence getItemText() {
        return this.itemText;
    }

    public int hashCode() {
        return this.itemPosition.hashCode() ^ ((((this.itemId.hashCode() ^ 1000003) * 1000003) ^ this.itemText.hashCode()) * 1000003);
    }

    public String toString() {
        return "InChatHintTtaItem{itemId=" + this.itemId + ", itemText=" + ((Object) this.itemText) + ", itemPosition=" + this.itemPosition + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_InChatHintTtaItem(String str, CharSequence charSequence, ItemPosition itemPosition, int i) {
        this(str, charSequence, itemPosition);
    }
}
